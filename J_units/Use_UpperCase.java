import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Use_UpperCase {
	UpperCase u=new UpperCase();
	String[] x={"Karthik","Sathya","Mani"};
	String name="KARTHIK";
	@Test
	public void testCase() {
		assertEquals(u.upperCase(x),name);
	}
	@Test
	public void testCase1() {
		assertNotNull(u.upperCase(x));
	}

}
