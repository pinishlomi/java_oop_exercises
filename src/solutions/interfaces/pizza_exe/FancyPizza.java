package solutions.interfaces.pizza_exe;

public class FancyPizza implements PreparePizzable{

	@Override
	public void makeDough() {
		System.out.println("Prepare yeast pastry");
		
	}

	@Override
	public void makeSouce() {
		System.out.println("Prepare souce of fresh tomatoes");
	}

	@Override
	public void putCheese() {
		System.out.println("Put a lot of Muzarella");
	}
}
