package Item;

public abstract class Equipment extends Item {

	protected int bonus;
	protected Raility raility;
	
	public Raility getRaility() {
		return raility;
	}
	public void setRaility(Raility raility) {
		this.raility = raility;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
