package solutions.interfaces.pizza_exe;

public class RegularPizza implements PreparePizzable{

	@Override
	public void makeDough() {
		System.out.println("Prepare dough of Eshel");
		
	}

	@Override
	public void makeSouce() {
		System.out.println("Put OSEM souce");
	}

	@Override
	public void putCheese() {
		System.out.println("Put flakes of yellow cheese");
	}
}
