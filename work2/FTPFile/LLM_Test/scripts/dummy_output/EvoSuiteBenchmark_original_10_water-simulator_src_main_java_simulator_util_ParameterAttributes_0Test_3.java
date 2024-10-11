// ParameterAttributes_0Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains one unit test case for the {@link ParameterAttributes#valueFor(int)} method.
*/
class ParameterAttributes_0Test {
		/**
		 * Run the valueFor(int) method test.
		 * @throws java.lang.Exception
		 */
    @Test
    public void valueForInt_test() throws Exception {
        new ParameterAttributes().valueFor(100001);
    }
      /**
        * Run the valueFor(float) method test.
        * @throws java.lang.Exception
        */
        @Test
        public void valueForFloat_test() throws Exception {
            float expected = 3.4F;
            float actual =  ParameterAttributes_0Test.valueFor(4.9);
            assertTrue("is not a float but a " +actual, actual == expected);

        }
}

// Parameter_test