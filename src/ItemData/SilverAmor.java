package ItemData;

import Item.Equipment;
import Item.Raility;
import Item.WeaponType;

public class SilverAmor extends Equipment{

	public SilverAmor() {
		bonus = 5;
		raility = Raility.RARE;
		decriptions = "this is armor";
		name = "Silver amor";
		value = 17;
		type = WeaponType.AMMOR;
	}
}
