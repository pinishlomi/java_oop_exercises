package solutions.java_interfaces.exe;

import java.util.Comparator;

public class ComparePersonByFirstname implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return p1.getFirstname().compareTo(p2.getFirstname());
	}

}
