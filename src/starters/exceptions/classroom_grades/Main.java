package starters.exceptions.classroom_grades;

public class Main {

	public static void main(String[] args) {
		System.out.println("#1 create Classroom");
		Classroom c = new Classroom("Mor", 10);
		System.out.println(c);
		
		System.out.println("#2 add 3 grades [87, 89, 91]");
		int[] grades = new int[] {87, 89, 91};
		// TODO implement #2
		System.out.println(c);
		
		System.out.println("#3: get grade in index 5");
		// TODO implement #3

		System.out.println("#4: add grades with negative value [87, -4, 91]");
		grades = new int[] {87, -4, 91};
		// TODO implement #4

		System.out.println("#5: add 7 grades [87, 40, 91, 88, 69, 70, 82]");
		grades = new int[] {87, 40, 91, 88, 69, 70, 82};
		// TODO implement #5

		System.out.println("#6: get grade in index 2");
		// TODO implement #6

		System.out.println("#7: get grade in index 12");
		// TODO implement #7

		System.out.println("#8: add grades with a value greater than 100 [102, 82]");
		// TODO implement #8
		System.out.println(c);
	}

}
