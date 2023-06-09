package character;

public class Warrior extends Character {

	public Warrior() {
		maxheal = 10;
		maxManaPoint = 5;
		dame = 5;
		armor = 1;
		exp = 0;
		lv = 1;
		this.setManaPoint(this.getMaxManaPoint());
		this.setHealPoint(this.getMaxheal());
	}


	
}
