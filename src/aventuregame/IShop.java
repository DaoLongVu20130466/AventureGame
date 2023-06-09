package aventuregame;

import Inventory.ShopInventory;

public interface IShop {

	public ShopInventory getInventory();
	public void setInventory(ShopInventory inventory);
}
