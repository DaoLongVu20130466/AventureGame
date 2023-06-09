package mob;

public class Zombie extends Mob {

	public Zombie() {
		setName("Zombie");
		maxheal = 10;
		healPoint = 10;
		dame = 3;
		armor = 2;
		lv = 3;
		goldDrop = 5;
		expgain = getLv() * 5;
	}
}
