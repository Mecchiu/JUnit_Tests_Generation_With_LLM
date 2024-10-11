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
		public void testLowerBounds(){

				double l = Double.MAX_VALUE;

				// test valid case -- lower bounds is given and valid
				System.out.println("testing the lower bounds of a LinearAxisScale" + " with a lower bound " + l);

				// the lower bound is defined, but there is an error in the bounds definition
				TickMarkData data = this.findGoodLimits(10, 0, 2.0, 3.0, l);

				assertNotNull("The lower bound of a LinearAxisScale defined by a lower bound (0.0) should have been calculated.", data.getLowerBounds());

				// the lower bound is defined, but the number of errors on the lower bound is 0 (the minimum is 10, and maximum is 2.0)
				assertFalse("The lower bound of a LinearAxisScale defined by a lower bound (0.0) should not have occurred for an error band " +
						    "greater than 1.0 (the number of errors that are considered valid for an axis is 0)",
				            data.getLowerBounds().size() > 0);

				// the maximum bound is not defined
				assertNull("The maximum bound of a LinearAxisScale defined by a maximum bound (1.0) should have been calculated.", data.getMaximumBounds());

				// the maximum bound of either of the cases the above should have occurred because of an error band
				assertEquals("The maximum bound of a LinearAxisScale defined by a maximum bound (1.0) should have been calculated.",
				            data.getMaximumBounds().get(0).getValue(), l, 0.001);

				// the maximum bound of the case for an error band defined with a value less than 1.0
				assertEquals("The value of the maximum bound of a LinearAxisScale defined by a maximum bound (1.0) should have occurred.",
				            data.getMaximumBounds().get(1).getValue(), 1, 0.001);

				// the maximum bound of the case for an error band defined with an other defined value
				assertEquals("The value of the maximum bound of a LinearAxisScale defined by a maximum bound (1.0) should have occurred.",
				            data.getMaximumBounds().get(2).getValue(), l, 0.001);

				// the upper bound is undefined
				assertNull("The upper bound of a LinearAxisScale undefined, but returned as null as the maximum bound, since 0.0 is an invalid value.", data.getUpperBounds());

				// the upper bound of the case for an error band defined with a value less than 1.0
				assertEquals("The upper bound of a LinearAxisScale undefined, but returned as null as the maximum bound, since 0.0 is an invalid value.",
				            data.getUpperBounds().get(0).getValue(), 1, 0.001);

				// the upper bound of the case for an error band defined with an other defined value
				assertEquals("The upper bound of a LinearAxisScale undefined, but returned as null as the maximum bound, since 1.0 is an invalid value.",
				            data.getUpperBounds().get(1).getValue(), l, 0.001);

				// the upper bound of the case for an error band defined with an end value greater than 1.0
				assertEquals("The upper bound of a LinearAxisScale undefined, but returned as null as the maximum bound, since 1.0 is an invalid value.",
				            data.getUpperBounds().get(2).getValue(), 1, 0.001);
				assertNull("The upper bound of a LinearAxisScale undefined, but returned as null as the maximum bound, since 1.0 is an invalid value.", data.getUpperBounds().get(3));

				// the upper bound of the case for an error band defined with a end value less than 1.0
				assertEquals("The upper bound of a LinearAxisScale undefined, but returned as null as the maximum bound, since 1.0 is an invalid value.",
				            data.getUpperBounds().get(4).getValue(), 1, 0.001);

				assertNull("The upper bound of a LinearAxisScale undefined, but returned as null as the maximum bound, since 1.0 is an invalid value.", data.getUpperBounds().get(5));

				// the upper bound of the case for an error band defined with a end value greater than 1.0
				assertEquals("The upper bound of a LinearAxisScale undefined, but returned as null as the maximum bound, since 2.0 is an invalid value.",
				            data.getUpperBounds().get(6).getValue(), 1, 0.001);

				// the upper bound of the case for an error band defined with a end value less than 1.0, but with the value 2.5
				assertEquals("The upper bound of a LinearAxisScale undefined, but returned as null as the maximum bound, since 2.0 is an invalid value.",
				            data.getUpperBounds().get(7).getValue(), 2.5, 0.001);

				double t1 = 1;
				double t2 = 4;
