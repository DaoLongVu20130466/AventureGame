package mob;

public class Karma extends Mob {
	public Karma() {
		setName("Bắc Kiếm Thần Karma");
		maxheal = 30;
		healPoint = 30;
		dame = 10;
		armor = 7;
		lv = 15;
		goldDrop = 16;
		expgain = getLv() * 5;
	}

}
