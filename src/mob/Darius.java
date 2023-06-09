package mob;

public class Darius extends Mob {
	public Darius() {
		setName("Darius The Slayer");
		maxheal = 100;
		healPoint = 100;
		dame = 17;
		armor = 7;
		lv = 30;
		goldDrop = 10000;
		expgain = getLv()*5;
	
	}

}
