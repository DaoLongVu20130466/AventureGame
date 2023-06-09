package Item;

public enum Raility {
	NORMAL(100), RARE(30), SUPER_RARE(15), LEGEND(5);

	private int value;

	private Raility(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
