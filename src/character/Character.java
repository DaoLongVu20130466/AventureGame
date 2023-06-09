package character;

import aventuregame.Things;
import aventuregame.combat;
import mecanich.LevelUp;
import mob.Mob;
import skill.Skill;

import java.util.ArrayList;
import java.util.Base64;

import Inventory.*;
import Item.Equipment;
import Item.Healing;
import Item.Item;
import Item.WeaponType;

public abstract class Character extends Things  {

	InventoryVer2 inventory;
	
	int exp = 0;
	int maxManaPoint;
	int manaPoint;
	

	public boolean critticalhit() {
		return mecanich.Mecanich.checkCritical(5);
	}

	public Character() {
		inventory =new InventoryVer2();
	}
	 public int getGold() {
		return inventory.getGold();
	}

	 public int getThisMaxHeal() {
		 return this.maxheal;
	 }
	 public void setGold(int goldIncome) {
		inventory.goldIncrese(goldIncome);
	}
	 public void decreaseGold(int goldDecrease) {
		inventory.decreaseGold(goldDecrease);
	}
	public void setInventory(InventoryVer2 inventory) {
		this.inventory = inventory;
	}

	public InventoryVer2 getInventory() {
		return inventory;
	}

	public int getMaxManaPoint() {
		return maxManaPoint;
	}

	public void setMaxManaPoint(int maxManaPoint) {
		this.maxManaPoint = maxManaPoint;
	}

	public int getManaPoint() {
		return manaPoint;
	}

	public void setManaPoint(int manaPoint) {
		this.manaPoint = manaPoint;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void gainExp(Mob c) {
		this.setExp(this.getExp() + c.getExpgain());
		System.out.println("ban nhan dc " + c.getExpgain() + " exp");
	}

	public boolean checklvUp() {
		if ((this.getExp()) >= LevelUp.levelMap.get(this.getLv()))
			return true;
		else
			return false;
	}

	public void levelUp() {
		if (checklvUp()) {
			this.setExp(this.exp - LevelUp.levelMap.get(this.getLv()));
			this.setLv(this.getLv() + 1);
			this.addAtt();
			this.addHP();
			super.setHealPoint(this.getMaxheal());
		}
	}

	@Override
	public void normalAttack(Things c, int dame) {
		if (!c.checkalive()) {
				int rs = c.getHealPoint() - dame;
				c.setHealPoint(rs);
			} 

	}

	public void addAtt() {
		super.setDame(super.getDame() + 1);
	}
	public void addHP() {
		super.setMaxheal(super.getMaxheal() + 2);
	}

	public Skill takeSkill(int idskill) {
		for (Skill s : listSkill) {
			if (s.getId() == idskill) {
				return s;
			}
		}
		return null;
	}

	@Override
	public int getThingsDame(Things c , boolean isCrit ) {
		int rs=0;
		if (isCrit== true) {
			rs= this.getDame() * 2;
		}else
		{
			rs= this.getDame() - c.getArmor();
		}
		return rs;
	}
	
	@Override
	public void specialAttack(Things c, Skill s) {
		if (!c.checkalive()) {
			if (this.getManaPoint() >= s.getManacost()) {
				if (mecanich.Mecanich.checkCritical(20)) {
					int dame = s.getDame() * 2;
					int rs = c.getHealPoint() - dame;
					c.setHealPoint(rs);
					this.setManaPoint(this.getManaPoint() - s.getManacost());
					System.out.println("ban da dung skill " + s.getName() + " chi mang gay " + dame + " dame");
					if (c.checkalive())
						this.gainExp((Mob) c);
				} else {
					int dame = s.getDame() - c.getArmor();
					int rs = c.getHealPoint() - (dame);
					c.setHealPoint(rs);
					this.setManaPoint(this.getManaPoint() - s.getManacost());
					System.out.println("ban da dung skill " + s.getName() + " gay " + dame + " dame");
					if (c.checkalive())
						this.gainExp((Mob) c);
				}
			} else
				System.out.println("ban khong du mana");
		} else
			System.out.println("quai vat da chet");

	}

	public void useItem(Item i) {
		System.out.println("co chay");
		if (i instanceof Healing && inventory.checkItem(i)) {
			this.setHealPoint(this.getHealPoint() + ((Healing) i).getEffect());
			if (this.getMaxheal() <= this.getHealPoint())
				this.setHealPoint(this.getMaxheal());
			System.out.println("da hoi mau");
			inventory.removeAmount(i);
		} else if (i instanceof Equipment && inventory.checkItem(i)) {
			inventory.equip(i);
			System.out.println("co chay");
			//equipItem();
		}

	}
	
	@Override
	public int getArmor()
	{
		return super.getArmor()+ GetBonus(WeaponType.AMMOR);
	}
	@Override
	public int getDame()
	{
		return super.getDame()+ GetBonus(WeaponType.WEAPON);
	}
	@Override
	public int getMaxheal()
	{
		return super.getMaxheal()+ GetBonus(WeaponType.SHOES);
	}
	
	public int getMaxheanowl() {
		return this.maxheal + GetBonus(WeaponType.SHOES) ;
	}
	public int GetBonus(WeaponType wb)
	{
		
		ArrayList<Equipment> Equipment = inventory.getEquipment();
		if(Equipment==null)
			return 0;
		for (Equipment e : Equipment) {
		if(e.getType() == wb)
			return e.getBonus();
		}
		return 0;
	}
	 public void addItem(Item i) {
		 this.getInventory().addItem(i);
		
	}

//	public void equipItem() {
//		ArrayList<Equipment> Equipment = inventory.getEquipment();
//		for (Equipment e : Equipment) {
//			switch (e.getType()) {
//			case WEAPON:
//				this.setDame(this.getDame() + e.getBonus());
//				break;
//			case AMMOR:
//				this.setArmor(this.getArmor() + e.getBonus());
//				break;
//			case SHOES:
//				this.setMaxheal(this.getMaxheal() + e.getBonus());
//				break;
//			default:
//				break;
//
//			}
//
//		}
//	}
}
