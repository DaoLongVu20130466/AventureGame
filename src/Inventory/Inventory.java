package Inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import Item.Equipment;
import Item.Healing;
import Item.Item;
import mecanich.TakeClass;

public class Inventory {
	int gold = 100;
	ArrayList<Equipment> Equipment = TakeClass.StarterEquipment(); ;
	HashMap<Item, Integer> iventory = TakeClass.StarterItem();;

	public ArrayList<Equipment> getEquipment() {
		return Equipment;
	}

	public void setEquipment(ArrayList<Equipment> cars) {
		this.Equipment = cars;
	}

	public HashMap<Item, Integer> getIventory() {
		return iventory;
	}

	public void setIventory(HashMap<Item, Integer> iventory) {
		this.iventory = iventory;
	}
	public void equip(Item newEquip) {
		for (Equipment oldEquip : Equipment) {
			if(newEquip instanceof Equipment && newEquip.getType() == oldEquip.getType()) {
				Equipment.add((Equipment)newEquip);
				Equipment.remove(oldEquip);
				addItem(oldEquip, 1);
				removeItem(newEquip);
				break;
			}
		}

	}

	public void addItem(Item e, int amout) {
		iventory.put(e, amout);
	}

	public void removeItem(Item e) {
		iventory.remove(e);
//		HashMap<Item, Integer> rs = new HashMap<>();
//		for (Entry<Item, Integer> equipment2 : iventory.entrySet()) {
//			if(equipment2.getKey().getName() != e.getName()) {
//				rs.put(e,1);
//			}
//		}
//		this.iventory = rs;
	}

	
	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public boolean checkAmount(Item e) {
		return false;
	}
	public boolean checkItem(Item e) {
		for (Entry<Item, Integer> entry : iventory.entrySet()) {
			if (entry.getKey().getName() == e.getName()){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {

        // Creating an empty HashMap
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        // Mapping string values to int keys
        hash_map.put(1, "share");
        hash_map.put(4, "programming");
        hash_map.put(5, "net");
        hash_map.remove(5);
        for (Map.Entry<Integer, String> item : hash_map.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
	}
	public void removeAmount(Item e) {
		for (Entry<Item, Integer> entry : iventory.entrySet()) {
			if (entry.getKey().getName() == e.getName()) {
				if (entry.getValue() - 1 <= 0) {
					iventory.put(entry.getKey(), entry.getValue() - 1);
					removeItem(e);
					System.out.println("item da xoa");
					break;
				} else
					iventory.put(entry.getKey(), entry.getValue() - 1);
			break;
			} else
				System.out.println("Ban khong co item nay !");
		}
	}


	public void totext() {
		for (Entry<Item, Integer> entry : iventory.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
	}
	
}
