package mob;

public class IceSpirits extends Mob {

	public IceSpirits() {
		setName("Ice Spirits");
		maxheal = 20;
		healPoint = 20;
		dame = 4;
		armor = 2;
		lv = 5;
		goldDrop = 5;
		expgain = getLv()*5;
	}
}
