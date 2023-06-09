package character;

import java.util.ArrayList;
import java.util.HashMap;

import Inventory.Inventory;
import Inventory.InventoryVer2;
import Item.Equipment;
import Item.Item;
import aventuregame.Things;
import mob.Mob;

public class AdapterCharacter implements IAdapterCharacter {
	Character hero ;

	@Override
	public int getManaPoint() {
		return hero.getManaPoint();
	}

	@Override
	public void createHero(Character c) {
		this.hero = c;
	}

	@Override
	public int getHealPoint() {
		return hero.getHealPoint();
	}

	@Override
	public int getAttack() {
		return hero.getDame();
	}

	@Override
	public int getAmmor() {
		return hero.getArmor();
	}

	@Override
	public int getPlayerLevel() {
		return hero.getLv();
	}

	@Override
	public void heroAttack(Mob c, int dame) {
		hero.normalAttack(c , dame);
	}

	@Override
	public int getHeroLv() {
		return hero.getLv();
	}

	@Override
	public int getHeroExp() {
		return hero.getExp();
	}

	@Override
	public void LvUp() {
		hero.levelUp();
		
	}

	@Override
	public boolean CheckLvUp() {
		return hero.checklvUp();
	}

	@Override
	public void gainExp(Mob c) {
		hero.gainExp(c);
		
	}

	@Override
	public InventoryVer2 getInventory() {
		return hero.getInventory();
	}

	@Override
	public ArrayList<Equipment> takeIventory() {
		return hero.getInventory().getEquipment();
	}

	@Override
	public Character getchar() {
		return this.hero;
	}

	@Override
	public ArrayList<Item> takeItem() {
		return hero.getInventory().getItem();
	}

	@Override
	public void useItem(Item i) {
		hero.useItem(i);
		
	}

	@Override
	public void setInventory(InventoryVer2 i) {
		hero.setInventory(i);
		
	}

	@Override
	public void heroTakeDame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkheroisdead() {
		return hero.checkalive();
	}

	@Override
	public int getHeroGold() {
		return hero.getGold();
	}

	@Override
	public void setHeroGold(int income) {
		hero.setGold(income);
		
	}

	@Override
	public void herobyItem(Item e) {
		hero.addItem(e);
		
	}

	@Override
	public void setgold(int valuedecrease) {
		hero.decreaseGold(valuedecrease);;
	}

	@Override
	public int getHeroDame(Things c , boolean iscrit) {
		return hero.getThingsDame(c ,iscrit );
	}

	@Override
	public boolean isCrit() {
		return hero.critticalhit();
	}

	@Override
	public int showMaxhealnow() {
		return hero.getMaxheanowl();
	}





}
