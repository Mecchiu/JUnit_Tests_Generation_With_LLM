// LinearAxisScale_0Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#lowerBounds()} method.
*/
class LinearAxisScale_0Test {
		/**
		 * Basic unit test for {@link LinearAxisScale#lowerBounds()}.
		 *
		 */
    @Test
    public void testReturnLowerBounds() {
        LinearAxisScale s = null;
        try {
            s = new LinearAxisScale();
            s.lowerBounds();
        } // end try
        catch(NullPointerException e) {
            fail("Null pointer throws null exception");
        }
        catch(IllegalArgumentException e) { /* expected */ }
        catch(Exception e) {
            e.printStackTrace();
            fail("One exception thrown should not throw here: " + e);
        }

		//
		// The unit test for this.
		//
		double b = s.lowerBounds();
        assertEquals("Double returned from lowerBounds() in case of a null input.",
			Double.NEGATIVE_INFINITY, b, 1.0e-15);
        assertEquals(
                "Double returned from lowerBounds() in case of a double input.",
                Double.POSITIVE_INFINITY, b, 1.0e-15);
        assertEquals(
                "Double returned from lowerBounds() in case of a double input which has no effect on the data.",
                Double.POSITIVE_INFINITY, modfloor(s.lowerBounds(), 30.0), 1.0e-15);
        assertEquals(
                "Double returned from lowerBounds() in case of a double input which has no effect on the data.",
                Double.NEGATIVE_INFINITY, modceil(s.lowerBounds(), 30.0), 1.0e-15);
    } // end test
}