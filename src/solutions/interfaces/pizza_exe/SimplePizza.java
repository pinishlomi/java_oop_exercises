package solutions.interfaces.pizza_exe;

public class SimplePizza implements PreparePizzable{

	@Override
	public void makeDough() {
		System.out.println("Take pitta");
		
	}

	@Override
	public void makeSouce() {
		System.out.println("Put ketcup");
	}

	@Override
	public void putCheese() {
		System.out.println("Put slice of yellow cheese");
	}
}
