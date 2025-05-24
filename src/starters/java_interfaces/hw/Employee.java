package starters.java_interfaces.hw;

public class Employee {
    private String name;
    private final int age;
    private final double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    
    public void setName(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name + "," + age + ", " + salary;
	}

	// TODO implement your code
}
