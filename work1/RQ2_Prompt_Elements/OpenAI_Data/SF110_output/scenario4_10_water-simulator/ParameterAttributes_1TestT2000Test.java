// ParameterAttributes_1Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributes_1Test {

	private Logger log = Logger.getLogger(ParameterAttributes_1Test.class);
	
	/**
	 * Test case 1 for method {@link ParameterAttributes#valueFor(float)}.
	 * Test case 1 for method {@link ParameterAttributes#valueFor(float)}.
	 * The parameter is not social and the demand curve function is a linear function.
	 * The elasticity is 1.
	 * The input value is 1.
	 * The expected result is 1.
	 */
	@Test
	void testValueFor_1() {
		log.info("Test case 1 for method valueFor(float)");
		
		//Create a new parameter
		ParameterAttributes parameter = new ParameterAttributes();
		
		//Set the parameter's name
		parameter.setName("parameter");
		
		//Set the parameter's elasticity
		parameter.setElasticity(1);
		
		//Set the parameter's demand curve function
		parameter.setDemandCurveFunction(new LinearFunction(1, 0));
		
		//Set the parameter's social function
		parameter.setSocialFunction(new LinearFunction(1, 0));
		
		//Set the parameter to be social
		parameter.setSocial(false);
		
		//Calculate the parameter's value
		float result = parameter.valueFor(1);
		
		//Check if the result is the expected
		assertEquals(1, result);
	}
	
	/**
	 * Test case 2 for method {@link ParameterAttributes#valueFor(float)}.
	 * The parameter is not social and the demand curve function is a linear function.
	 * The elasticity is 1.
	 * The input value is 2.
	 * The expected result is 2.
	 */
	@Test
	void testValueFor_2() {
		log.info("Test case 2 for method valueFor(float)");
		
		//Create a new parameter
		ParameterAttributes parameter = new ParameterAttributes();
		
		//Set the parameter's name
		parameter.setName("parameter");
		
		//Set the parameter's elasticity
		parameter.setElasticity(1);
		
		//Set the parameter's demand curve function
		parameter.setDemandCurveFunction(new LinearFunction(1, 0));
		
		//Set the parameter's social function
		parameter.setSocialFunction(new LinearFunction(1, 0));
		
		//Set the parameter to be social
		parameter.setSocial(false);
		
		//Calculate the parameter's value
		float result = parameter.valueFor(2);
		
		//Check if the result is the expected
		assertEquals(2, result);
	}
	
	/**
	 * Test case 3 for method {@link ParameterAttributes#valueFor(float)}.
	 * The parameter is not social and the demand curve function is a linear function.
	 * The elasticity is 1.
	 * The input value is 3.
	 * The expected result is 3.
	 */
	@Test
	void testValueFor_3() {
		log.info("Test case 3 for method valueFor(float)");
		
		//Create a new parameter
		ParameterAttributes parameter = new ParameterAttributes();
		
		//Set the parameter's name
		parameter.setName("parameter");
		
		//Set the parameter's elasticity
		parameter.setElasticity(1);
		
		//Set the parameter's demand curve function
		parameter.setDemandCurveFunction(new LinearFunction(1, 0));
		
		//Set the parameter's social function
		parameter.setSocialFunction(new LinearFunction(1, 0));
		
		//Set the parameter to be social
		parameter.setSocial(false);
		
		//Calculate the parameter's value
		float result = parameter.valueFor(3);
		
		//Check if the result is the expected
		assertEquals(3, result);
	}
	
	/**
	 * Test case 4 for method {@link ParameterAttributes#valueFor(float)}.
	 * The parameter is not social and the demand curve function is a linear function.
	 * The elasticity is 1.
	 * The input value is 4.
	 * The expected result is 4.
	 */
	@Test
	void testValueFor_4() {
		log.info("Test case 4 for method valueFor(float)");
		
		//Create a new parameter
		ParameterAttributes parameter = new ParameterAttributes();
		
		//Set the parameter's name
		parameter.setName("parameter");
		
		//Set the parameter's elasticity
		parameter.setElasticity(1);
		
		//Set the parameter's demand curve function
		parameter.setDemandCurveFunction(new LinearFunction(1, 0));
		
		//Set the parameter's social function
		parameter.setSocialFunction(new LinearFunction(1, 0));
		
		//Set the parameter to be social
		parameter.setSocial(false);
		
		//Calculate the parameter's value
		float result = parameter.valueFor(4);
		
		//Check if the result is the expected
		assertEquals(4, result);
	}
	
	/**
	 * Test case 5 for method {@link ParameterAttributes#valueFor(float)}.
	 * The parameter is not social and the demand curve function is a linear function.
	 * The elasticity is 1.
	 * The input value is 5.
	 * The expected result is 5.
	 */
	@Test
	void testValueFor_5() {
		log.info("Test case 5 for method valueFor(float)");
		
		//Create a new parameter
		ParameterAttributes parameter = new ParameterAttributes();
		
		//Set the parameter's name
		parameter.setName("parameter");
		
		//Set the parameter's elasticity
		parameter.setElasticity(1);
		
		//Set the parameter's demand curve function
		parameter.setDemandCurveFunction(new LinearFunction(1, 0));
		
		//Set the parameter's social function
		parameter.setSocialFunction(new LinearFunction(1, 0));
		
		//Set the parameter to be social
		parameter.setSocial(false);
		
		//Calculate the parameter's value
		float result = parameter.valueFor(5);
		
		//Check if the result is the expected
		assertEquals(5, result);
	}
	
	/**
	 * Test case 6 for method {@link ParameterAttributes#valueFor(float)}.
	 * The parameter is not social and the demand curve function is a linear function.
	 * The elasticity is 1.
	 * The input value is 6.
	 * The expected result is 6.
	 */
	@Test
	void testValueFor_6() {
		log.info("Test case 6 for method valueFor(float)");
		
		//Create a new parameter
		ParameterAttributes parameter = new ParameterAttributes();
		
		//Set the parameter's name
		parameter.setName("parameter");
		
		//Set the parameter's elasticity
		parameter.setElasticity(1);
		
		//Set the parameter's demand curve function
		parameter.setDemandCurveFunction(new LinearFunction(1, 0));
		
		//Set the parameter's social function
		parameter.setSocialFunction(new LinearFunction(1, 0));
		
		//Set the parameter to be social
		parameter.setSocial(false);
		
		//Calculate the parameter's value
		float result = parameter.valueFor(6);
		
		//Check if the result is the expected
		assertEquals(6, result);
	}
	
	/**
	 * Test case 7 for method {@link ParameterAttributes