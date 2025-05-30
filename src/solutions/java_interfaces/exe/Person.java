package solutions.java_interfaces.exe;

public abstract class Person implements Comparable<Person>, Cloneable {
	
	private String id;
	private String firstname;
	private String lastname;
	private int age;
	
	public Person(String id, String firstname, String lastname, int age) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	public Person(Person other) {
		this.id = other.id;
		this.firstname = other.firstname;
		this.lastname = other.lastname;
		this.age = other.age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ": " + id 
				+ ", "+ firstname + ", "+ lastname + ", "+ age;
	}

	@Override
	public int compareTo(Person other) {
		return this.age - other.age;
	}

	@Override
	protected Person clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}

}
