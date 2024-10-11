// LinearAxisScale_0Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#lowerBounds()} method.
*/
class LinearAxisScale_0Test {
		
	    @Test
	    public void testLowerBounds() {
	    
	        LinearAxisScale a = new LinearAxisScale();
	        assertFalse("lowerBounds() should not return null", a.lowerBounds() == null);
	        assertTrue("lowerBounds() should return a non-null value", a.lowerBounds().size() > 0);
	        assertFalse("upperBounds() should not return null", a.upperBounds() == null);
	        assertTrue("upperBounds() should return a non-null value", a.upperBounds().size() > 0);
	        assertEquals("lowerBounds() should return the same for a scaling mode of NO_ERROR_BARS", 0.0, a.lowerBounds().get(0), 0.0);
	        assertEquals("upperBounds() should return new bounds for ALL_ERROR_BARS", a.upperBounds().get(0), a.upperBounds().get(1));
	}
	
	private static final double UPPER_DEFAULT_LOW = 0.0;
	
	@Test
	public void testUpperBounds_UpperDefaultLow() {
	
	
		LinearAxisScale a = new LinearAxisScale();

	
	    // set the upper bounds to ALL_LOWER_BADS
	  		a.setUpperBounds(new double[] {UPPER_DEFAULT_LOW, -10.0, 0});
	
	  		assertEquals("upperBounds() should return the right", UPPER_DEFAULT_LOW, a.upperBounds().get(0), 0.01);
	  		assertEquals("upperBounds() should return the right", -10.0, a.upperBounds().get(1), 0.01);
	
	} 
	
	@Test
	public void testUpperBounds_DefaultLow() {
	
	
		LinearAxisScale a = new LinearAxisScale();

		// set the upper bounds to ALL_LOWER_BADS
}
}