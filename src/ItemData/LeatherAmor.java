package ItemData;

import Item.Equipment;
import Item.Raility;
import Item.WeaponType;

public class LeatherAmor extends Equipment {

	public LeatherAmor() {
		bonus = 2;
		raility = Raility.NORMAL;
		decriptions = "this is armor";
		name = "Leather amor";
		value = 7;
		type = WeaponType.AMMOR;
	}
}
