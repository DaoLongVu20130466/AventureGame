package ItemData;

import Item.Equipment;
import Item.Raility;
import Item.WeaponType;

public class ClothShoes extends Equipment {

	public ClothShoes() {
		bonus = 5;
		raility = Raility.NORMAL;
		decriptions = "Shoes";
		name = "Cloth Shoes";
		value = 7;
		type = WeaponType.SHOES;
	}
	
}
