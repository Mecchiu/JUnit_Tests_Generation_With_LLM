// ParameterAttributes_0Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(int)} method.
*/
class ParameterAttributes_0Test {

	private Logger log = Logger.getLogger(ParameterAttributes_0Test.class);
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)} method.
	 * It tests the case where the parameter is not social and the demand curve function is a linear function.
	 * The expected result is the elasticity multiplied by the value of the linear function.
	 */
	@Test
	void testValueFor_0() {
		log.info("Test case for valueFor(int) method. It tests the case where the parameter is not social and the demand curve function is a linear function. The expected result is the elasticity multiplied by the value of the linear function.");
		
		// Create a new parameter
		ParameterAttributes parameter = new ParameterAttributes();
		
		// Set the parameter's name
		parameter.setName("parameter");
		
		// Set the parameter's elasticity
		parameter.setElasticity(2.0f);
		
		// Set the parameter's demand curve function
		parameter.setDemandCurveFunction(new LinearFunction(1.0f, 1.0f));
		
		// Set the parameter's social function
		parameter.setSocialFunction(new LinearFunction(1.0f, 1.0f));
		
		// Set the parameter to be social
		parameter.setSocial(false);
		
		// Calculate the parameter's value
		float value = parameter.valueFor(1);
		
		// Check if the value is correct
		assertEquals(2.0f, value);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)} method.
	 * It tests the case where the parameter is not social and the demand curve function is a linear function.
	 * The expected result is the elasticity multiplied by the value of the linear function.
	 */
	@Test
	void testValueFor_1() {
		log.info("Test case for valueFor(int) method. It tests the case where the parameter is not social and the demand curve function is a linear function. The expected result is the elasticity multiplied by the value of the linear function.");
		
		// Create a new parameter
		ParameterAttributes parameter = new ParameterAttributes();
		
		// Set the parameter's name
		parameter.setName("parameter");
		
		// Set the parameter's elasticity
		parameter.setElasticity(2.0f);
		
		// Set the parameter's demand curve function
		parameter.setDemandCurveFunction(new LinearFunction(1.0f, 1.0f));
		
		// Set the parameter's social function
		parameter.setSocialFunction(new LinearFunction(1.0f, 1.0f));
		
		// Set the parameter to be social
		parameter.setSocial(false);
		
		// Calculate the parameter's value
		float value = parameter.valueFor(2);
		
		// Check if the value is correct
		assertEquals(4.0f, value);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)} method.
	 * It tests the case where the parameter is not social and the demand curve function is a linear function.
	 * The expected result is the elasticity multiplied by the value of the linear function.
	 */
	@Test
	void testValueFor_2() {
		log.info("Test case for valueFor(int) method. It tests the case where the parameter is not social and the demand curve function is a linear function. The expected result is the elasticity multiplied by the value of the linear function.");
		
		// Create a new parameter
		ParameterAttributes parameter = new ParameterAttributes();
		
		// Set the parameter's name
		parameter.setName("parameter");
		
		// Set the parameter's elasticity
		parameter.setElasticity(2.0f);
		
		// Set the parameter's demand curve function
		parameter.setDemandCurveFunction(new LinearFunction(1.0f, 1.0f));
		
		// Set the parameter's social function
		parameter.setSocialFunction(new LinearFunction(1.0f, 1.0f));
		
		// Set the parameter to be social
		parameter.setSocial(false);
		
		// Calculate the parameter's value
		float value = parameter.valueFor(3);
		
		// Check if the value is correct
		assertEquals(6.0f, value);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)} method.
	 * It tests the case where the parameter is not social and the demand curve function is a linear function.
	 * The expected result is the elasticity multiplied by the value of the linear function.
	 */
	@Test
	void testValueFor_3() {
		log.info("Test case for valueFor(int) method. It tests the case where the parameter is not social and the demand curve function is a linear function. The expected result is the elasticity multiplied by the value of the linear function.");
		
		// Create a new parameter
		ParameterAttributes parameter = new ParameterAttributes();
		
		// Set the parameter's name
		parameter.setName("parameter");
		
		// Set the parameter's elasticity
		parameter.setElasticity(2.0f);
		
		// Set the parameter's demand curve function
		parameter.setDemandCurveFunction(new LinearFunction(1.0f, 1.0f));
		
		// Set the parameter's social function
		parameter.setSocialFunction(new LinearFunction(1.0f, 1.0f));
		
		// Set the parameter to be social
		parameter.setSocial(false);
		
		// Calculate the parameter's value
		float value = parameter.valueFor(4);
		
		// Check if the value is correct
		assertEquals(8.0f, value);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)} method.
	 * It tests the case where the parameter is not social and the demand curve function is a linear function.
	 * The expected result is the elasticity multiplied by the value of the linear function.
	 */
	@Test
	void testValueFor_4() {
		log.info("Test case for valueFor(int) method. It tests the case where the parameter is not social and the demand curve function is a linear function. The expected result is the elasticity multiplied by the value of the linear function.");
		
		// Create a new parameter
		ParameterAttributes parameter = new ParameterAttributes();
		
		// Set the parameter's name
		parameter.setName("parameter");
		
		// Set the parameter's elasticity
		parameter.setElasticity(2.0f);
		
		// Set the parameter's demand curve function
		parameter.setDemandCurveFunction(new LinearFunction(1.0f, 1.0f));
		
		// Set the parameter's social function
		parameter.setSocialFunction(new LinearFunction(1.0f, 1.0f));
		
		// Set the parameter to be social
		parameter.setSocial(false);
		
		// Calculate the parameter's value
		float value = parameter.valueFor(5);
		
		// Check if the value is correct
		assertEquals(10.0f, value);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)} method.
	 * It tests the case where the parameter is not social and the demand curve function is a linear function.
	 * The expected result is the elasticity multiplied by the value of the linear function.
	 */
	@Test
	void testValueFor_5() {
		log.info("Test case for valueFor(int) method. It tests the case where the parameter is not social and the demand curve function is a linear function. The expected