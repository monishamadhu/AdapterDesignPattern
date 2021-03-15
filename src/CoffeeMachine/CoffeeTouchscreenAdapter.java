package CoffeeMachine;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
		
	OldCoffeeMachine oldObj;
	
	public CoffeeTouchscreenAdapter(OldCoffeeMachine oldMachineObject) {
		oldObj=oldMachineObject;
	}
	public void chooseFirstSelection() {
		System.out.println(oldObj.selectA());
	}
	public void chooseSecondSelection() {
		System.out.println(oldObj.selectB());
	}
}
