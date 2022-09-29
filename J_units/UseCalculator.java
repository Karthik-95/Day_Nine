import org.junit.Test;

public class UseCalculator {
	Calculator cal=new Calculator();
	@Test
	public void testAdd() {
		cal.add(10,15);
	}
	@Test
	public void testSub() {
		cal.sub(50,25);
	}
	@Test
	public void testMul() {
		cal.mul(5, 20);
	}
	@Test
	public void testDiv() {
		cal.div(5, 1);
	}

}
