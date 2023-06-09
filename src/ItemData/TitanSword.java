package ItemData;

import Item.Equipment;
import Item.Raility;
import Item.WeaponType;

public class TitanSword extends Equipment {
	public TitanSword() {
		bonus = 4;
		raility = Raility.RARE;
		decriptions = "this is sword";
		name = "Titan Sword";
		value = 15;
		type = WeaponType.WEAPON;
	}

}
