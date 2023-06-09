package character;

import java.util.ArrayList;
import java.util.HashMap;

import Inventory.Inventory;
import Inventory.InventoryVer2;
import Item.Equipment;
import Item.Item;
import aventuregame.Things;
import mob.Mob;

public interface IAdapterCharacter {
	public ArrayList<Equipment> takeIventory();
	public int getHeroGold();
	public void setgold(int valuedecrease);
	public void herobyItem(Item e);
	public void setHeroGold(int income);
	public ArrayList<Item> takeItem();
	public void createHero( Character c);
	public int getManaPoint();
	public Character getchar();
	public boolean checkheroisdead();
	public int getHealPoint();
	public void heroTakeDame();
	public int getAttack();
	public int getAmmor();
	public int getPlayerLevel();
	public void heroAttack(Mob c ,int dame);
	public void LvUp();
	public void setInventory(InventoryVer2 i);
	public int getHeroLv();
	public int getHeroExp();
	public boolean CheckLvUp();
	public void gainExp(Mob c);
	public void useItem(Item i);
	public InventoryVer2 getInventory();
	public boolean isCrit();
	public int showMaxhealnow();
	public int getHeroDame(Things c, boolean iscrit);
}
