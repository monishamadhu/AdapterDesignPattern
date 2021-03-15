package CoffeeMachine;

public class CoffeeApp {

	public static void main(String[] args) {
		OldCoffeeMachine old = new OldCoffeeMachine();
		CoffeeTouchscreenAdapter touchScreenObj = new CoffeeTouchscreenAdapter(old);
		touchScreenObj.chooseFirstSelection();
		touchScreenObj.chooseSecondSelection();
	}
	
}
