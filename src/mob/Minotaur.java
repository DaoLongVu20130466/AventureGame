package mob;

public class Minotaur extends Mob {

	public Minotaur() {
		setName("Orce");
		maxheal = 50;
		healPoint = 50;
		dame = 30;
		armor = 13;
		lv = 50;
		goldDrop = 40;
		expgain = getLv() * 5;
	}

}
