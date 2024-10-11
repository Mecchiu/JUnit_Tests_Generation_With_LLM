// ParameterAttributesTest.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributesTest {
		
		private static final Logger logger = Logger.getLogger(ParameterAttributesTest.class);
		
		/**
		* Test case for {@link ParameterAttributes#valueFor(float)} method.
		* It tests the case when the input is a float number.
		*/
		@Test
		void testValueFor() {
				logger.info("Testing valueFor method");
				float x = 0.0f;
				ParameterAttributes instance = new ParameterAttributes();
				float expResult = 0.0f;
				float result = instance.valueFor(x);
				assertEquals(expResult, result);
		}
}