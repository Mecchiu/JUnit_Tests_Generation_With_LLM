// LinearAxisScale_0Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#lowerBounds()} method.
*/
class LinearAxisScale_0Test {
		private double f;

		private static final double TOLERANCE = 1;

		
	@Test
	public void test_lowerBounds() {
		
		assertEquals(2.0, LinearAxisScale.lowerBounds(), TOLERANCE);
	}

	@Test
	public void test_upperBounds() {
		
		assertEquals(1.0, LinearAxisScale.upperBounds(), TOLERANCE);
	}

	@Test
	public void test_stepSize() {
		
		assertEquals(10.0, LinearAxisScale.unitStepSize(), TOLERANCE);
	}


	@Test
	public void test_calcTickMarkPositions() {
		
	        double A1, A2;
	        A1 = modfloor(-2.5, 1.0);
	        A2 = modfloor(-7.5, 3.0);
	        double tStep = modfloor(-1.0, 1.0);
	        double tLB = modfloor(2.0, 1.0);
	        double tUB = modfloor(8.5, 2.0);

	        assertEquals(-4.5, LinearAxisScale.calcTickMarks(tStep, tLB, tUB, A1, A2).getLength(), TOLERANCE);
	}


	@Test
	public void test_calcTickMarksPositions() {
		
	        double A1, A2;
	        A1 = modfloor(-2.5, 1.0);
	        A2 = modfloor(-7.5, 3.0);
	        double tStep = modfloor(-1.0, 1.0);
	        double tLB = modfloor(2.0, 1.0);
	        double tUB = modfloor(8.5, 2.0);
	        double tLBMin = modfloor(-1.0, 2.0);
	        double tUBMin = modfloor(8.5, 3.0);
	        
	        TickMarkData output = LinearAxisScale.calcTickMarks(tStep, tLB, tUB, A1, A2);		
		assertTrue(output.contains(tLBMin, tUBMin));
		
	}

}