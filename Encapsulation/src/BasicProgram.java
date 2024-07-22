class Basic_Program {
	/*
	 * Data will be private bcoz encapsalution is a combination of data hiding and
	 * abstraction.
	 */
	// data hiding.
	private int value;

	// data abstraction
	public void setValue(int value_varaible) {
		value = value_varaible;
	}

	// the value from set_value method will be return.
	public int getValue() {
		return value;

	}

}

class abc {
	public static void main(String[] args) {
		Basic_Program classobject = new Basic_Program();
		classobject.setValue(100);
		System.out.print(classobject.getValue());
	}
}
