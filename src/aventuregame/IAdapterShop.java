package aventuregame;

import java.util.ArrayList;
import java.util.HashMap;

import Item.Item;

public interface IAdapterShop {

	public ArrayList<Item> getItem();
	public void createShop(Shop s);

}
