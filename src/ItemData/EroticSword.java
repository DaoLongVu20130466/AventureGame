package ItemData;

import Item.Equipment;
import Item.Raility;
import Item.WeaponType;

public class EroticSword extends Equipment {

	public EroticSword() {
		bonus = 7;
		raility = Raility.SUPER_RARE;
		decriptions = "this is sword";
		name = "Erotic Sword";
		value = 25;
		type = WeaponType.WEAPON;
	}
}
