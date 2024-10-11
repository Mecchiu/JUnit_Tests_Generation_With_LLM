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
	 * Test method for {@link model.utils.Parameter#getName()}.
	 *
	 * <p>Test if the name equals the default name ("ELASTICITY") or the standard name ("ELS").</p>
	 */
	@Test
    public void getName() {
		assertEquals("ELASTICITY", ParameterAttributes.ELASTICITY.getName());
		assertEquals("ELS", ParameterAttributes.ELS.getName());
		assertEquals("ELASTICITY_0", ParameterAttributes.ELASTICITY.getName()+"0");

		assertEquals(new Float(-1.0f / 0.5f * 0.5f), ParameterAttributes.ELASTICITY.getParameter(0));

    }


}
