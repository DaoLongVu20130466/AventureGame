package ItemData;

import Item.Equipment;
import Item.Raility;
import Item.WeaponType;

public class IronSword extends Equipment {
	public IronSword() {
		bonus = 3;
		raility = Raility.RARE;
		decriptions = "this is sword";
		name = "Iron Sword";
		value = 12;
		type = WeaponType.WEAPON;
	}

}
