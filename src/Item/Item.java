package Item;

public abstract class Item {
	protected String name;
	protected String decriptions;
	protected WeaponType type;
	protected int value;

	public String getName() {
		return name;
	}

	public WeaponType getType() {
		return type;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDecriptions() {
		return decriptions;
	}

	public void setDecriptions(String decriptions) {
		this.decriptions = decriptions;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
