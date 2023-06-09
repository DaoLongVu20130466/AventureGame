package Inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import Item.Item;

public class ShopInventory {
	ArrayList<Item> Item = new ArrayList<Item>();

	
	public ArrayList<Item> getItem() {
		return Item;
	}

	public void setItem(ArrayList<Item> item) {
		Item = item;
	}

	public void addItem(Item e) {
		Item.add(e);
	}

	public void removeItem(Item i) {
		for (int j = 0; j < Item.size(); j++) {
			if(Item.get(j).getName() == i.getName()) {
				Item.remove(j);
			break;
			}
		}

	}
	


	public boolean checkItem(Item e) {
		boolean rs = false;
		for (Item item : Item) {	
			if(e.getName() == item.getName()) {
				rs = true;
				break;
			}
			else rs = false;
		}
		return rs;
	}
	
}
