// LinearAxisScale_2Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#findGoodLimits(double, double)} method.
*/
class LinearAxisScale_2Test {
		private static final String DUMMY_TRUE = "<TRUE>";
		private static final String DUMMY_FALSE = "</TRUE>";
	private LinearAxisScale scale = new LinearAxisScale();
		private static final int TEST_PRECISION = 8;
	private String data = "<X><Y>a</Y><Z/><Y/><Z/></X>";
	{
	//	System.out.println(System.getProperty("java.class.path"));
	}

    @Test
    public void testFindGoodLimits_Data() {
        assertEquals("output.lowerBounds", -1.0, scale.findGoodLimits(0.0, 1.0, 0.1, 0.2, 0.5, 0.5, 0.5, 0.0, data));
        assertEquals("output.upperBounds", 1.0, scale.findGoodLimits(2.0, 2.0, 0.1, 0.9, 1.0, 1.0, 0.1, 0.0, 0.2, 4.0, data));
        assertEquals("output.lowerBounds", 1.0, scale.findGoodLimits(2.0, 2.0, 0.5, 1.5, 1.0, 1.0, 0.5, 0.5, 3.0, 2.0, data));
        assertEquals("output.upperBounds", 2.0, scale.findGoodLimits(2.0, 2.0, 0.5, 1.5, 1.0, 1.0, 0.5, 0.5, 3.0, 2.0, data));
    }
    @Test
    public void testFindGoodLimits_Data_Error() {
        scale.findGoodLimits(1.0, 2.0, 0.1, 1.5, 2.0, 2.0, 0.1, 0.0, 0.1, 4.0, data);
        final String exceptionMessage = "Exception: {0}";

        assertNull("data", scale.findGoodLimits(3.0, 4.0, 0.001, 0.1, 4.0, 2.0, 0.1, 0.0, 0.01, 0.2, 3.0, data));

        final String[] messages = {exceptionMessage};
        assertEquals("Exceeded tolerance toleranceValue: 3", message,
                     Arrays.toString(messages));
    }

    @Test
    public void testCalcTickMarkLengths() {
        assertEquals(10., scale.calcTickLength(1., 10., false), 0.);
        assertEquals(10., scale.calcTickLength(1., 10., false), 1E-7);
        assertEquals(10., scale.calcTickLength(1., 10., true), 0.);
        assertEquals(10., scale.calcTickLength(1., 10., true), 1E-7);
    }

    @Test
    public void testAdjustForErrorBars() {
        assertNull("output.lowerBounds", scale.adjustForErrorBars(""));
        assertNull("output.upperBounds", scale.adjustForErrorBars("A"));

        // First of all, test that calcTickLength(1., 10., true) gives 0.
        //
        {
            assertEquals(0., scale.calcTickLength(1., 10., true), 0.);
        }

        // Then firstly, test that adjustForErrorBars(false) gives an output
        // of 2.
        //
        {
            final AxisLimitData lowerBounds = calcTickMarks(TEST_PRECISION, -1.0, 1.0, data, 0.);
            final AxisLimitData upperBounds = calcTickMarks(0, 100.0, 1.0, data, 0.);

            // now test that calcTickLength(1.,10.,false) gives 3.
            //
            assertEquals(3., scale.calcTickLength(1.,10.,false), 0.);
            assertEquals(3., scale.calcTickLength(1.,10.,false), 0.001);

            // now test that adjustForErrorBars(false) gives a lowerB and upperBounds.
            //
            assertEquals(0., scale.adjustForErrorBars("A"), 0.);
            assertEquals(calcTickMarks(0, 1.0, 1.0, upperBounds, DUMMY_FALSE).length, 0);
            assertEquals(calcTickMarks(0, 1.0, 1.0, lowerBounds, DUMMY_FALSE).length, 3);
        }
    }
}