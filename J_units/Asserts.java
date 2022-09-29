import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class Asserts {
	int a=25;
	int a1=25;
	int a2=10;
	int a3=11;
	String b="Karthik";
	String b1="Karthik";
	String b2="Keerthi";
	String b3="Keerthi";
	String b4=null;
	@Test
	public void testEquals() {
		assertEquals(a, a1);
	}
	@Test
	public void testNotEquals() {
		assertNotEquals(a2, a3);
	}
	@Test
	public void testSame() {
		assertSame(b1, b);
	}
	@Test
	public void testNotSame() {
		assertNotSame(b2,b1);
	}
	@Test
	public void testNull() {
		assertNull(b4);
	}
	@Test
	public void testNotNul() {
		assertNotNull(b1);
	}
	@Test
	public void testTrue() {
		assertTrue(b.equalsIgnoreCase(b1));
	}
	@Test
	public void testFalse() {
		assertFalse(b.equalsIgnoreCase(b2));
	}
	@Test
	public void testArrayEquals() {
		assertArrayEquals(b.toCharArray(), b1.toCharArray());
	}
}
