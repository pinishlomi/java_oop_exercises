package solutions.java_interfaces.hw;

public class Employee implements Comparable<Employee>, Cloneable {
    private String name;
    private int age;
    private double salary;

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
    public int compareTo(Employee other) {
        return (int) (salary - other.salary);
    }

	@Override
	public String toString() {
		return name + "," + age + ", " + salary;
	}


	@Override
	protected Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}
    
}
