// LinearAxisScale_1Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#upperBounds()} method.
*/
class LinearAxisScale_1Test {
		
	public LinearAxisScale_1Test() {
	}

   /**
    * Check the result before the {@link LinearAxisScale#upperBounds()} method is called.
    */
	@Test
	public void test() {
		assertEquals(0.0d, LinearAxisScale.upperBounds().doubleValue(), 0.01d);
	}
	
	public static void test(double x, double t) {
		LinearAxisScale scale = new LinearAxisScale(modceil(1d / x + 0.5d, 0.0d), 0.0d, modceil(1d / x + 0.5d, 0.0d), 0.0d);
		
		assertEquals(x, scale.upperBounds().doubleValue(), 0.01d);
	}
	
	public static void test(double x) {
		LinearAxisScale scale = new LinearAxisScale(1.0d, 0.0d, 1.0d, 0.0d);
		
		assertEquals(x, scale.upperBounds().doubleValue(), 0.01d);
	}
}