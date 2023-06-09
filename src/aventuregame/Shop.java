package aventuregame;

import Inventory.Inventory;
import Inventory.InventoryVer2;
import Inventory.ShopInventory;
import Item.Healing;
import mecanich.Mecanich;

public class Shop implements IShop{

	ShopInventory inventory ;

	public Shop() {
		inventory = Mecanich.createIventory();
	}


	public ShopInventory getInventory() {
		return inventory;
	}

	public void setInventory(ShopInventory inventory) {
		this.inventory = inventory;
	}

}
