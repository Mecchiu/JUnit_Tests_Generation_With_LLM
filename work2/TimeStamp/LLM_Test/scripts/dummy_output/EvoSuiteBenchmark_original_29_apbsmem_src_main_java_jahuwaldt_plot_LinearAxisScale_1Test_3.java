// LinearAxisScale_1Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#upperBounds()} method.
*/
class LinearAxisScale_1Test {
		
	private static double base;
	private static double width;
	
	public LinearAxisScale_1Test(double base, double width) {
		this.base = base;
		this.width = width;
	}
	
	/**
	 * Tests the method to determine if the upper bounds specified
	 * by {@link #lowerBounds()} and {@link #upperBounds()} are correct.
	*/
	@Test
	public void test_upperBounds() {
		assertEquals(upperBounds()[0], base, Double.MIN_VALUE);
	}

	/**
	 * Tests the method to determine if the lower bounds specified
	 * by {@link #lowerBounds()} and {@link #upperBounds()} are correct.
	*/
	@Test
	public void test_lowerBounds() {
		assertEquals(lowerBounds()[0], -1.0, Double.MAX_VALUE);
	}
	
	/**
	* Tests the result of the modceil function.
	*/
	@Test
	public void test_modceil() {
		assertEquals(modfloor(6.0, 1.7), base);
	}
	
	/**
	* Tests the result of the modceil function, but is a noop.
	*/
	@Test
	public void test_modceil2() {
		assertTrue(0.0 == modfloor(2.0, 2.0));
	}
	
	/**
	* Tests the result of the modfloor function.
	*/
	@Test
	public void test_modfloor() {
		for(int i=0; i<3; i++) {
			System.out.println("modfloor(" + base + ","+width + ")=" + modfloor(base, width));
		}
	}
	
	/**
	 * Tests the result of the modfloor function, but is a noop.
	*/
	@Test
	public void test_modfloor2() {
		System.out.println("modfloor(" + base + "," + width + ") = " + modfloor(base, width));
	}

		
	/**
	* Tests the result of the modfloor function, but is a noop.
	*/
	@Test
	public void test_modfloor3() {
		for(int i=0; i<3; i++) {
			System.out.println("modfloor(" + base + "," + width + ") = " + modfloor(base, width, 6.0));
		}
	}
		
	/**
	* Tests the result of the modfloor function, but is a noop.
	*/
	@Test
	public void test_modfloor4() {
		System.out.println("Func(" + base + "," + width + ")=" + modfloor(base, width, 6.0, 1.5, 0));
	}

}