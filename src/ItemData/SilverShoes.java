package ItemData;

import Item.Equipment;
import Item.Raility;
import Item.WeaponType;

public class SilverShoes extends Equipment {

	public SilverShoes() {
		bonus = 20;
		raility = Raility.SUPER_RARE;
		decriptions = "Shoes";
		name = "Silver Shoes";
		value = 20;
		type = WeaponType.SHOES;
	}
}
