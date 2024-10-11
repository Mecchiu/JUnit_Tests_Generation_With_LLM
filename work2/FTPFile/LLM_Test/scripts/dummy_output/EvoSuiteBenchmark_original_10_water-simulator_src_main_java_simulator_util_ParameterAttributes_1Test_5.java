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
		* Constructor.
		*/
    public ParameterAttributes_1Test() {
    }

	@Test
	public void test1() {

		assertEquals(6, ParameterAttributes.valueFor(6.0f));
		assertEquals(4, ParameterAttributes.valueFor(4.0f));
		assertEquals(9, ParameterAttributes.valueFor(5.0f));
	}
}