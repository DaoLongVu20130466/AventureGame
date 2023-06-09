package ItemData;

import Item.Equipment;
import Item.Raility;
import Item.WeaponType;

public class Excalibur extends Equipment {

	public Excalibur() {
		bonus = 30;
		raility = Raility.LEGEND;
		decriptions = "Sword of King Athur";
		name = "Excalibur";
		value = 100;
		type = WeaponType.WEAPON;
	}
}
