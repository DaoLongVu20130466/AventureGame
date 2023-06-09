package mob;

public class Skeleton extends Mob {

	public Skeleton() {
		setName("Skeleton");
		maxheal = 5;
		healPoint = 5;
		dame = 7;
		armor = 1;
		lv = 3;
		goldDrop = 4;
		expgain = getLv()*5;
	}
}
