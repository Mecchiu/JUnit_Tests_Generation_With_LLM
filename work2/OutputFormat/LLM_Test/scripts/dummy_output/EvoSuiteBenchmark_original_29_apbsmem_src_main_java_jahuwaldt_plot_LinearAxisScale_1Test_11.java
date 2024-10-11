// LinearAxisScale_1Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#upperBounds()} method.
*/
class LinearAxisScale_1Test {
		
	@Test
	public void test() {
	
		// get a linear scaling object to use to construct the axis scale.
		final LinearAxisScale scales = new LinearAxisScale();
		
		// get upper bounds.
		double aUB = scales.upperBounds();
		
		// get lower bounds.
		double aLB = scales.lowerBounds();
		
		// make some trivial data here.
		double xA = 0.1;
		double xB = 0.6;

		// construct data using the various scale parameters.
		double f = 0.4;
		AxisLimitData limits = new AxisLimitData();

		// check the upper bounds against the data.
		assertEquals(aUB, scales.upperBounds());
	
		// assert the number of units returned.
		assertEquals(2, scales.size());
		
		// return the data as a list of lists
		Object objectOutput = new Object();
		// get a list of lists.
		List list = (List) objectOutput;
		
		assertEquals(2, list.size());  
		
		// check the elements, the number of elements returned is equal to 2.
		assertElements(list, aUB, aLB, xA, xB);
		
		// create a Data object to output the list.
		Data d = new Data();
		
		// create the axis scale array.
		double[] s = d.axis(true, aUB, scales);
		
		// make our axis an array and set the array with the specified values.
		s[0] = xA;
		s[1] = xB;
		
		// check that we have a list of lists.
		assertElements(list, ranges, f, limits);
	
	}
	
}