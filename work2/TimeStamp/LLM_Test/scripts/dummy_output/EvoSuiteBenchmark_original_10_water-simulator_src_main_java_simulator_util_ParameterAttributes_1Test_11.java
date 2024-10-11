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
	 * The default step number of parameter. This can be any value, however
	 * you can force the step of a parameter by using this parameter attribute.
	 * @param step
	 */
	@Test
	public void defaultValuesAreUsedByTheParameter() {
		ParameterAttributes param = new ParameterAttributes();
		float value = (float) 2.5;
		for (float i = 0.1f; i < 1.25f; i *= 2) {
					
			log.debug(value + " = " + i);
			assertTrue(value + " = " + i + " does not equal " + value);
		}
	}
	
	/**
	 * This test is more interesting than the previous test because
	 * the default parametr value for a social parameter is 2.5 (value of the
	 * 0-1 relationship between the parametr and its
	 * consumers) but it can be used also to set the value of a non-social
	 * parametr for a social parameter.
	 * @param x The step for which to calculate the parameter value
	 * @param aWeight The weight of the social parameter
	 * @return the value of the parametr associated to the step.
	 */
	private float valueFor(float x, int aWeight) {
		Float weight = new Float(aWeight);
		ParameterAttributes param = new ParameterAttributes();
		return (float) 2 * aWeight / weight.floatValue();
	}

	/**
	 * This test is more interesting than the previous test because
	 * the default parametr value for a social parameter is 2.5 (value of the
	 * 0-1 relationship between the parametr and its
	 * consumers) but it can be used also to set the value of a non-social
	 * parametr for a social parameter.
	 * @param x The step for which to calculate the parameter value
	 * @param aWeight The weight of the social parameter
	 */
	private float valueFor(float x) {
		return (float) 2 * (1.0f - x);
	}
	
}