package ItemData;

import Item.Equipment;
import Item.Raility;
import Item.WeaponType;

public class NamelessSword extends Equipment {

	public NamelessSword() {
		bonus = 5;
		raility = Raility.SUPER_RARE;
		decriptions = "this is sword";
		name = "Nameless Sword";
		value = 25;
		type = WeaponType.WEAPON;
	}
}
