package ItemData;

import Item.Equipment;
import Item.Raility;
import Item.WeaponType;

public class TitanAmor extends Equipment {

	public TitanAmor() {
		bonus = 6;
		raility = Raility.SUPER_RARE;
		decriptions = "this is armor";
		name = "Titan amor";
		value = 20;
		type = WeaponType.AMMOR;
	}
}
