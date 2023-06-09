package Inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Item.Equipment;
import Item.Healing;
import Item.Item;
import ItemData.SilverAmor;
import ItemData.Sword;
import mecanich.TakeClass;

public class InventoryVer2 {

	int gold = 5;
	ArrayList<Equipment> Equipment = TakeClass.StarterEquipment(); 
	ArrayList<Item> Item = TakeClass.StarterItemver2(); 
	public ArrayList<Equipment> getEquipment() {
		return Equipment;
	}

	
	public int getGold() {
		return gold;
	}


	public void setGold(int gold) {
		this.gold = gold;
	}


	public void goldIncrese(int gold) {
		this.gold = getGold()+ gold;
	}
	public void decreaseGold(int goldDecrease) {
		this.setGold(this.getGold() - goldDecrease);
	}
	


	public void setEquipment(ArrayList<Equipment> cars) {
		this.Equipment = cars;
	}


	public ArrayList<Item> getItem() {
		return Item;
	}

	public void setItem(ArrayList<Item> item) {
		Item = item;
	}

	public static void main(String[] args) {
		
//		ArrayList<Item> arr = new ArrayList<Item>();
//		arr.add(new Healing());
//		arr.add(new SilverAmor());
//		arr.add(new Sword());
//		Item a = new Sword();
		System.out.println();
        }

	public void addItem(Item i) {
		Item.add(i);
	}
	
	public boolean checkItem(Item i) {
		boolean rs = false;
		for (Item item : Item) {	
			if(i.getName() == item.getName()) {
				rs = true;
				break;
			}
			else rs = false;
		}
		return rs;
	}

	public void equip(Item newEquip) {
		for (Equipment oldEquip : Equipment) {
			if(newEquip instanceof Equipment && newEquip.getType() == oldEquip.getType()) {
				Equipment.add((Equipment)newEquip);
				Equipment.remove(oldEquip);
				Item.add(oldEquip);
				removeAmount(newEquip);
				break;
			}
		}

		
	}

	public void removeAmount(Item i) {
		for (int j = 0; j < Item.size(); j++) {
			if(Item.get(j).getName() == i.getName()) {
				Item.remove(j);
			break;
			}
		}

	}



}
