package Item;

public class Cosume extends Item {
	int effect;
	public Cosume() {
		type = WeaponType.HEALING;
	}

	public int getEffect() {
		return effect;
	}

	public void setEffect(int effect) {
		this.effect = effect;
	}
	
}
