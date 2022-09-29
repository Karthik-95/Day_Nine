import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Using_J_unit {
	@Before
	public void beforeCase() {
		System.out.println("Welcome");
	}
	@Test
	public void testCase() {
		System.out.println("This is Test");
	}
	@After
	public void afterCase() {
		System.out.println("Thank you");
	}

}
