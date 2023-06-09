package mob;

public class Scorpion extends Mob {

	public Scorpion() {
		setName("Scorpion");
		maxheal = 12;
		healPoint = 12;
		dame = 3;
		armor = 1;
		lv = 2;
		goldDrop =3;
		expgain = getLv() * 5;
	}
}
