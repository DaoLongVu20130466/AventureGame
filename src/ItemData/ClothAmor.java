package ItemData;

import Item.Equipment;
import Item.Raility;
import Item.WeaponType;

public class ClothAmor extends Equipment {

	public ClothAmor() {
	bonus = 1;
	raility = Raility.NORMAL;
	decriptions = "this is armor";
	name = "Cloth amor";
	value = 2;
	type = WeaponType.AMMOR;
	}
}
