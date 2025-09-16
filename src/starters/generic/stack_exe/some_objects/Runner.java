package starters.generic.stack_exe.some_objects;

public class Runner extends Person {
	private double avergaeSpeed;

	public Runner(int id, String name, double avergaeSpeed) {
		super(id, name);
		this.avergaeSpeed = avergaeSpeed;
	}

	@Override
	public String toString() {
		return super.toString() + "\t avergaeSpeed=" + avergaeSpeed + "\n";
	}

}
