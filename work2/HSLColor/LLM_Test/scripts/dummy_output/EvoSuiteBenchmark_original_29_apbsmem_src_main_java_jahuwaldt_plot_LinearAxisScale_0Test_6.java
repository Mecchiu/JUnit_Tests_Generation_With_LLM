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
     * Tests lower bounds.
     */ 
	@Test
    public void lowerBounds() {
		// Construct array to return values
		double[][] d = { {1.0}, {-1.0} };

		// Get a linear axis-scale
		LinearAxisScale s = new LinearAxisScale(1.0, 1.0, d);

		// Compare values
		assertEquals("Lower bounds expected: 'lowerBounds' ",
				d[0], s.lowerBounds());
		assertEquals("Lower bounds expected: 'lowerBounds' ",
				d[1], s.lowerBounds());

		// Set the upper bounds
		s.upperBounds();
		assertEquals("Lower bounds expected: 'upperBounds' ",
				d[3], s.upperBounds());

		// Set the upper bounds in other units
		s.upperBounds(null);
		assertEquals("Lower bounds expected: 'lowerBounds' ",
				d[4], s.upperBounds());
	}
	
    /**
     * Tests modfloor() and modceil() when an axis limit data is not found
     */
    @Test
    public void testModfloorModceil() {
		// Construct array to return values
		double[][] d = { {1.0}, {-1.0} };
		// Get a linear axis-scale
		LinearAxisScale s = new LinearAxisScale(1.0, 1.0, d);

		// Modify the axis scale
		s.lowerBounds(0.0);

		// Get new lower bounds
		double newLB = s.lowerBounds();

		// Modify the axis scale
		s.lowerBounds((double) (newLB - 0.5 * newLB) / 2);

		// Get new lower bounds
		double newLB2 = s.lowerBounds();

		// Compare the two values
		assertSame("Lower bounds expected:'modfloor' ",
				newLB, newLB2);

		// Set the upper bounds
		s.upperBounds();
		assertEquals("Lower bounds expected: 'upperBounds' ",
				d[3], s.upperBounds());

		// Set the upper bounds in other units
		s.upperBounds(null);
		assertThrows("Lower bounds expected:'modfloor' ",
				IllegalArgumentException.class);

        // Test new lower bounds
    	s.lowerBounds((double) ((newLB2 - 2.5) / 2.0));
		assertEquals("Lower bounds expected:'modfloor' ",
				((double) (newLB2 - 0.5) / 2.0), s.lowerBounds());

		// Tests that values can be changed in other units
		s.lowerBounds(0.0);
		assertEquals("Lower bounds expected: 'lowerBounds', 'val3' ",
				d[3], s.lowerBounds());

		// Testing that modfloor() returns the expected value
		s.adjustForErrorBars((double) (newLB - 2.5) / 2.0, 1.0);
		assertEquals("Lower bounds expected: 'lowerBounds' ",
				newLB, s.lowerBounds());

		// Testing modceil()
		s.upperBounds();
		assertEquals("Lower bounds expected: 'upperBounds' ",
				d[3], s.upperBounds());
		
    }
}