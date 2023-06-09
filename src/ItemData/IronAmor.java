package ItemData;

import Item.Equipment;
import Item.Raility;
import Item.WeaponType;

public class IronAmor extends Equipment{

	public IronAmor() {
	bonus = 4;
	raility = Raility.RARE;
	decriptions = "this is armor";
	name = "Iron amor";
	value = 15;
	type = WeaponType.AMMOR;
	}
}
