// LinearAxisScale_1Test.java
package jahuwaldt.plot;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LinearAxisScale}.
* It contains one unit test case for the {@link LinearAxisScale#upperBounds()} method.
*/
class LinearAxisScale_1Test {
private LinearAxisScale obj;
		
		/**
         *  Create a new objet to test.
         *  @throws Exception
         */
        public LinearAxisScale_1Test(){
                obj = new LinearAxisScale();
        }


		@Test(expected = UnsupportedOperationException.class)
		public void testNotImplemented(){
                obj.convertToUnit(Double.NEGATIVE_INFINITY);
        }
}
