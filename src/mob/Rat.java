package mob;

public class Rat extends Mob {

	public Rat() {
		setName("Normal Rat");
		maxheal = 10;
		healPoint = 10;
		dame = 2;
		armor = 0;
		lv = 1;
		goldDrop = 2;
		expgain = getLv()*5;
	}
	
}
