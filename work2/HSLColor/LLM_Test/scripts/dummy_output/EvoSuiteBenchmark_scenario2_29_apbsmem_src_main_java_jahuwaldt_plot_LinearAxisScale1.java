// LinearAxisScaleTest.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains ten unit test cases for the {@link LinearAxisScale#upperBounds()} method.
*/
class LinearAxisScaleTest {
		
	/**
	* Test method for {@link LinearAxisScale#upperBounds()}.
	*/
	@Test
	void testUpperBounds() {
		LinearAxisScale scale = new LinearAxisScale();
		assertEquals(1.0, scale.upperBounds(), "Upper bounds should be 1.0.");
	}
}