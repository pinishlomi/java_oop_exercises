package starters.generic.stack_exe.some_objects;

public class Student  extends Person    {
	  private double average;

	  public Student(int id, String name, double average)  { 
		  super(id, name);
		  this.average = average;
	  }

	@Override
	public String toString() {
		return super.toString() + "\t average=" + average + "\n";
	}
}

	
