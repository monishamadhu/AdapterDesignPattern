package CoffeeMachine;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdapter {
	private  OldCoffeeMachine object = null;
	@Test
	public void test() {

		CoffeeTouchscreenAdapter adapter= new CoffeeTouchscreenAdapter(new OldCoffeeMachine());

		object=new OldCoffeeMachine();
		String output = object.selectA();
		assertEquals("Selected A flavor: Vanilla",output);
	}
}

