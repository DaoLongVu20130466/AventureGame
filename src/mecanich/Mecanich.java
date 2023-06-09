package mecanich;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

import Inventory.Inventory;
import Inventory.InventoryVer2;
import Inventory.ShopInventory;
import Item.*;
import Story.Story;

public class Mecanich {

	public static int gatccha(int value) {
		Random rand = new Random();
		int ranNum = rand.nextInt(value) + 1;
		return ranNum;
	}

	public static HashMap<Integer, Integer> levelMap() {
		int levelPool = 10;
		HashMap<Integer, Integer> rs = new HashMap<Integer, Integer>();
		for (int i = 1; i <= 50; i++) {
			rs.put(i, levelPool);
			levelPool += levelPool / 4;
		}
		return rs;
	}

	public static boolean checkCritical(int critPercent) {
		if (gatccha(100) <= critPercent)
			return true;
		else
			return false;
	}

	public static int dameCaculation(Object o) {
		return 0;
	}

	public static Raility randomRailyty() {
		int randum = gatccha(100);
		Raility r = null;
		if (randum <= Raility.LEGEND.getValue())
			r = Raility.LEGEND;
		else if (randum <= Raility.SUPER_RARE.getValue())
			r = Raility.SUPER_RARE;
		else if (randum <= Raility.RARE.getValue())
			r = Raility.RARE;
		else if (randum <= Raility.NORMAL.getValue())
			r = Raility.NORMAL;
		return r;
	}
	public static Inventory randomShopItem() {
		Inventory shopIven = new Inventory();
		shopIven.addItem(new Healing(), 10);
		shopIven.addItem(new Mana(), 10);
		for (int i = 0; i < 5; i++) {
			shopIven.addItem(randomEquipment(), 1);
		}
		return shopIven;
	}
	public static Equipment randomEquipment() { // lay mon do trong hashmap da duyet theo gia tri raility
		Equipment rs = null;
		Raility itemRaility = randomRailyty();
		HashMap<Equipment, Integer> listbyRaility = takelistByRailyty(itemRaility);
		int vl = gatccha(listbyRaility.size());
		int check = 1;
		for (Map.Entry<Equipment, Integer> entry : listbyRaility.entrySet()) {
			if(check == vl) {
				rs=entry.getKey();
			}
			else check++;
		}
//		Equipment[] rs1 = (Equipment[]) listbyRaility.keySet().toArray();
//		rs = rs1[gatccha(rs1.length)];
		return rs;
	}
	public static HashMap<Equipment, Integer> takelistByRailyty(Raility r) {
		HashMap<Equipment, Integer> rs = TakeClass.takeEquipment();
		HashMap<Equipment, Integer> rs1 = new HashMap<Equipment, Integer>();
		for (Map.Entry<Equipment, Integer> entry : rs.entrySet()) {
			if(entry.getKey().getRaility() == r) {
				rs1.put(entry.getKey(), entry.getValue());
			}
		}
		return rs1;
	}
	public static ShopInventory createIventory() {
		ShopInventory shopIven = new ShopInventory();
		shopIven.addItem(new Healing());
		for (int i = 0; i < 10; i++) 
			shopIven.addItem(Mecanich.randomEquipment());
		return shopIven;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 150; i++) {
			System.out.println(randomEquipment().getName());
		}
	}

}
