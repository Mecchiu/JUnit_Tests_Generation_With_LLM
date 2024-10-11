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
     *  Test method for {@link LinearAxisScale#getLowerBounds()}.
     *  Here we are testing if that method returns -1.0
     *  for valid input, which corresponds to the defaults for the default
     *  {@link LinearAxisScale#setBounds(double, double)} (below the
     *  one-argument constructor).
     */
    @Test
    public void testGetLowerBounds() {
        LinearAxisScale a = new LinearAxisScale(15,-15);

		assertEquals(100.0, a.getLowerBounds(), 1E-3);
    }
    
    /**
     *  Here we are testing if setBounds returns
     * -1.0 if lowerBounds() returns -1.0 for invalid input.
     * -1.0 if lowerBounds returns valid values.
     */
    @Test
    public void testSetBounds() {
        LinearAxisScale a = new LinearAxisScale(15,15);

        assertEquals(15,  a.getLowerBounds(), 1E-3);
        a.setBounds(20,-20);

        assertEquals(20,a.getLowerBounds(), 1E-3);

    }
}