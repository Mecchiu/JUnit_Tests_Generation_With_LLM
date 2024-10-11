// ParameterAttributes_1Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains one unit test case for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributes_1Test {
/**
		 * The default value for {@link ParameterAttributes#valueFor(float)}.
		 */
    @Test
    void defaultValue() {
		ParameterAttributes a = new ParameterAttributes();
		//Default values only accept float parameters, not the other ways (string, integer, etc.).
		Float aFloat = a.getElasticity();
		assertEquals(0f, aFloat.floatValue());
    }
}
