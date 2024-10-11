// LinearAxisScale_2Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_2Test {
		
	@Test
	void test() {
		assertNotNull(new LinearAxisScale());
		
		LinearAxisScale scale;
		
		double lower = -1;
		double upper = 1;
		
		// This call should fail without a lower bound.
		try {
			lower = scale = new LinearAxisScale().findGoodLimits(-1.0,  1.0);
			fail();
		} catch (NumberFormatException e) { }
		
		// Same call with lower and upper.
		try {
			lower = scale = new LinearAxisScale().findGoodLimits(1.0, 1.0);
			fail();
		} catch (NumberFormatException e) { }
		
		// This call should succeed.
		LowerAxisScale ls = new LowerAxisScale(lower, upper);
		try {
			ls.findGoodLimits(1.0,  1.0);
		} catch (NumberFormatException e) {
			fail("Couldn't find range.");
		} 
		
		// This call should succeed, with lower bound.
		scale = new LinearAxisScale().findGoodLimits(-1.0,  2.0);
		LowerAxisScale ls2 = new LowerAxisScale(lower, 2.0);
		try {
			ls2.findGoodLimits(1.0,  2.0);
		} catch (NumberFormatException e) {
			fail("Couldn't find range.");
		} 
		
		// This call should succeed, with upper bound.
		scale = new LinearAxisScale().findGoodLimits(1.0,  2.0);
		try {
			if (!(scale instanceof LinearAxisScale))
				fail("Couldn't find range.");
			// This call should succeed, with lower bound.
			ls2 = new LowerAxisScale (lower, 2.0);
			ls2.findGoodLimits(1.0,  1.0);
			assertEquals(lower, ls2.lowerBounds(), 0.0);
			// This call should succeed, with upper bound.
			ls2 = new LowerAxisScale (2.0,  1.0);
			ls2.findGoodLimits(1.0,  1.0);
			assertEquals(upper, ls2.upperBounds(), 0.0);
		} catch (NumberFormatException e) { }
	}
	
	@Test
	void unmodulatedLbs() {
		LowerAxisScale ls = new LowerAxisScale(-50, 50);
		assertFalse(ls.useModulatedLbs());
		// Test with lower bound.
		assertEquals(new Double(50).toString(), ls.lowerBounds().toString());
		ls = new LowerAxisScale(50,50);
		assertTrue(ls.useModulatedLbs());
		assertEquals(new Double(50.5).toString(), ls.lowerBounds().toString());
		
		// Test with higher bound.
		ls = new LowerAxisScale(200, 200);
		assertFalse(ls.useModulatedLbs());
		assertEquals(new Double(200).toString(), ls.lowerBounds().toString());
		// TODO (maybe) test with a lower bound and upper bound.
		// TODO (maybe) test with x-axis labels.
	}

	@Test
	void modulatedLbsAndUnmodulated() {
		LowerAxisScale ls1 = new LowerAxisScale(-7, 7);
		LowerAxisScale ls2 = new LowerAxisScale(7, 7);
		assertTrue(ls1.useModulatedLbs());
		assertFalse(ls2.useModulatedLbs());
		
		// Test with lower bounds.
		assertEquals(new Double(7).toString(), ls1.lowerBounds().toString());
		ls1 = new LowerAxisScale(7, 7);
		assertFalse(ls1.useModulatedLbs());
		assertEquals(new Double(7.5).toString(), ls1.lowerBounds().toString());
		
		// Test with upper bounds.
		assertEquals(new Double(5.5).toString(), ls2.upperBounds().toString());
		ls2 = new LowerAxisScale(7, 5.5);
		assertTrue(ls2.useModulatedLbs());
		assertEquals(new Double(1.0 - 7.5 / 2.0).toString(), ls2.upperBounds().toString());
	}
}