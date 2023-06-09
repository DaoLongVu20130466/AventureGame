package ItemData;

import Item.Equipment;
import Item.Raility;
import Item.WeaponType;

public class IronShoes extends Equipment {

	public IronShoes(){
		bonus = 15;
		raility = Raility.RARE;
		decriptions = "Shoes";
		name = "Iron Shoes";
		value = 20;
		type = WeaponType.SHOES;
	}
}
