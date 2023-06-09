package aventuregame;

import java.util.ArrayList;
import java.util.HashMap;

import Item.Item;

public class AdapterShop implements IAdapterShop {

	IShop shop = new Shop();
	
	@Override
	public ArrayList<Item> getItem() {
		return shop.getInventory().getItem();
	}

	@Override
	public void createShop(Shop s) {
		this.shop = s;
		
	}

}
