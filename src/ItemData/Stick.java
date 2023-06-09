package ItemData;

import Item.Equipment;
import Item.Raility;
import Item.WeaponType;

public class Stick extends Equipment {

	public Stick() {
		bonus = 1;
		raility = Raility.NORMAL;
		decriptions = " cây gậy này sợ hum";
		name = "Stick";
		value = 5;
		type = WeaponType.WEAPON;
	}
}
