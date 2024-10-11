// LinearAxisScale_1Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#upperBounds()} method.
*/
class LinearAxisScale_1Test {

	/**
	 *  It tests the getUpperBounds method of {@link LinearAxisScale}.
	 */
	@Test
	public void testGetUpperBounds() {
		//
		final LinearAxisScale lo = new LinearAxisScale();
		
		//
		double resultHi = (Double) lo.upperBounds();
		
		//
		assertTrue(resultHi > 0);
		//
		double resultLo = (Double) lo.lowerBounds();
		
		assertTrue(resultLo < 0);
	}
		
	/**
	* Test constructor of {@link LinearAxisScale}.
	* It first sets up the test object.
	*/
    @Test
    void testCreate() {
        //
        LinearAxisScale lo = new LinearAxisScale();
        
        //
        assertNotNull("new LinearAxisScale cannot be null", lo);
    }

}
