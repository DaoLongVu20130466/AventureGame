package mob;

public class Slime extends Mob {

	public Slime() {
		setName("Slime");
		maxheal = 13;
		healPoint = 13;
		dame = 3;
		armor = 1;
		lv = 2;
		goldDrop = 4;
		expgain = getLv()*5;
	}
}
