// LinearAxisScale_0Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#lowerBounds()} method.
*/
class LinearAxisScale_0Test {
		private LinearAxisScale axis;   // reference to this object

	@Test
	public void testLowerBounds() throws Exception {
		assertTrue(axis.lowerBounds() == 0.);
	}
	@Test
	public void testGetUpperBounds() throws Exception {
		// System.out.println(axis.upperBounds() + " = " + axis.getUpperBounds());
		assertTrue(axis.upperBounds() == 0.);
	}
	@Test
	public void testCalcTickMarks() throws Exception {
		assertTrue(axis.calcTickMarks(0.01, 0.99, 0.99) == null);
	}
	@Test
	public void testCalcTickMarks2() throws Exception {
		axis = new LinearAxisScale("",null,1.,5.,15.,3.,1.);
		assertTrue(axis.calcTickMarks(0.001,-0.001,0.001) == null);
	}
	@Test
	public void testGetTickMarkPos() throws Exception {
		int actual = axis.getTickMarkPos(0.1, 0.01, 0.997);
    	assertTrue(Double.valueOf(actual ) instanceof Double);
	}
	 
	private static String print(Object x) {
		if(x == null)
            return "null";
        return x.toString();
	}
	

	private static double modceil(double f, double t) {
		double result = f + (t / 100.) * 100; 
		if(f == 0)
			assertTrue(result == 0.0); // a small step should produce a zero result.
		else if(f > 0.0)
            assertTrue(result >= t);  
		else
            assertTrue(result < t); // a step above 0 or below 0 should produce an error.
		return (result) / (100); // this step is scaled by 100 to produce the original result.
	}
	private static double modfloor(double f, double t) {
		double result = f + (t / 100.) * 100; 
		if(f == 0.0)
			assertTrue(result == 0.0); // A small step should produce a zero result.
		else if(f < 0.0)
            assertTrue(result >= t);  
		else
            assertTrue(result < t); // A step above 0 or below 0 should produce an error.
		return (result) / (100);  // this step is scaled by 100 to produce the original result.
	}
	
	public static LinearAxisScale getObject(String name) {
	  	AxisScale obj = new LinearAxisScale(name,null,1./2.,5./15.,3./1., 1.);
	  	//obj.lowerBounds() is undefined.
	  	return obj;
		 
	}

	@Test
	public void testModFloor() throws Exception {
		double t = 0.1;
		double x = 1.0;
		LinearAxisScale axis = getObject("");
		double f = axis.modfloor(0.1, t);
		assertTrue(f == 9);
		AxisLimitData limit = axis.findGoodLimits(0.00, 3.0, 0.99, 0.99, 200, 300);
		assertTrue(f == ((100.0 - 2.5 ) - (limit.x0 - 2.5)));
	 
	}

	@Test
	public void testModCeil() throws Exception {
		double t = 1.001;
		double x = 1.0;
		LinearAxisScale axis = getObject("");
		double f = axis.modceil(0.1, t);
		assertTrue(f == 9);
		AxisLimitData limit = axis.findGoodLimits(0.00, 3.0, 0.99, 0.99, 200, 300);
		assertTrue(f == (9.000000 + 3.5));
	 
	}	

	@Test
	public void testGetTickMarkPos() throws Exception {
		double t = 0.1;
		int actual = axis.getTickMarkPos(0.1, 0.01, 0.997);
		assertTrue(actual == 1 + t * 3/5); // should produce a 0,4,5 on 0.01
	}
	@Test
	public void testGetTickMarkPos2() throws Exception {
		assertTrue(axis.getTickMarkPos(0.1, 0.01, 0.997) == 1 + t * 3/5); // it should produce a 4,5
		double t = 0.01;
		int actual = axis.getTickMarkPos(0.1, 0.01, 0.997);
		assertTrue(actual == 2 + t * 3/5);
	}
	
	
}