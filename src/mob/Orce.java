package mob;

public class Orce extends Mob {

	public Orce() {
		setName("Orce");
		maxheal = 30;
		healPoint = 30;
		dame = 20;
		armor = 10;
		lv = 15;
		goldDrop = 18;
		expgain = getLv() * 5;
	}

}
