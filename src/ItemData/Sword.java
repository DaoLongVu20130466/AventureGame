package ItemData;

import Item.Equipment;
import Item.Raility;
import Item.WeaponType;

public class Sword extends Equipment {

	public Sword () {
		bonus = 2;
		raility = Raility.NORMAL;
		decriptions = "this is sword";
		name = "normal Sword";
		value = 10;
		type = WeaponType.WEAPON;
	}
	
}
