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
		 * Test the {@link LinearAxisScale#lowerBounds()} method.
		 *
		 */
    @Test
    public void testLowerBounds() {
        final LinearAxisScale testObject = new LinearAxisScale(0);
        assertEquals(-2,testObject.lowerBounds(),0);
    }

    /**
     *  Test to find the smallest x coordinate.
     */
    @Test
    public void testFindNearestX() {
        final LinearAxisScale testObject = new LinearAxisScale(0);
        final Integer nearestValue = testObject.findNearestValue(-1);
        assertEquals( Integer.valueOf(0),nearestValue );
    }

    /**
     *  Test to find the greatest x coordinate.
     */
    @Test
    public void testFindNearestX2() {
        final LinearAxisScale testObject = new LinearAxisScale();
        assertEquals( Integer.valueOf(100),testObject.findNearestValue(-1) );
    }

   /**
    *  Test to find the least x coordinate.
    */
    @Test
    public void testFindNearestY() {
        final LinearAxisScale testObject = new LinearAxisScale();
        final Integer nearestValue = testObject.findNearestValue(Integer.valueOf(100));
        assertEquals( Integer.valueOf(0),nearestValue );
    }

    /**
     * Test to find the smallest y coordinate.
     */
    @Test
    public void testFindNearestY() {
        final LinearAxisScale testObject = new LinearAxisScale();
        assertEquals( Integer.valueOf(0),testObject.findNearestValue(Integer.valueOf(100)));
    }
}

// LinearAxisScale_1Test.java
