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
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the input is a float number.
	 * Mostly used when the parameter is social and the input value is the sum of weights.
	 * Calculates parameter's value for the Demand Curve as :
	 * elasticity * [ ln ] (demandCurveFunction(weights) )
	 * @param x The step for which to calculate parameters value
	 * @return Parameter's value that will be summed for calculating total consumer's consumption
	 */
	@Test
	void testValueFor_1() {
		log.info("Testing valueFor(float) - Case 1");
		
		//Create a new ParameterAttributes object
		ParameterAttributes pa = new ParameterAttributes();
		
		//Set the elasticity
		pa.setElasticity(0.5f);
		
		//Set the demand curve function
		pa.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the social function
		pa.setSocialFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the parameter to be social
		pa.setSocial(true);
		
		//Set the parameter's name
		pa.setName("Test");
		
		//Set the parameter's value
		pa.setValue(0.5f);
		
		//Set the parameter's ln
		pa.setLn(true);
		
		//Calculate the parameter's value
		float result = pa.valueFor(0.5f);
		
		//Check if the result is correct
		assertEquals(0.5f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the input is a float number.
	 * Mostly used when the parameter is social and the input value is the sum of weights.
	 * Calculates parameter's value for the Demand Curve as :
	 * elasticity * [ ln ] (demandCurveFunction(weights) )
	 * @param x The step for which to calculate parameters value
	 * @return Parameter's value that will be summed for calculating total consumer's consumption
	 */
	@Test
	void testValueFor_2() {
		log.info("Testing valueFor(float) - Case 2");
		
		//Create a new ParameterAttributes object
		ParameterAttributes pa = new ParameterAttributes();
		
		//Set the elasticity
		pa.setElasticity(0.5f);
		
		//Set the demand curve function
		pa.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the social function
		pa.setSocialFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the parameter to be social
		pa.setSocial(true);
		
		//Set the parameter's name
		pa.setName("Test");
		
		//Set the parameter's value
		pa.setValue(0.5f);
		
		//Set the parameter's ln
		pa.setLn(true);
		
		//Calculate the parameter's value
		float result = pa.valueFor(0.5f);
		
		//Check if the result is correct
		assertEquals(0.5f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the input is a float number.
	 * Mostly used when the parameter is social and the input value is the sum of weights.
	 * Calculates parameter's value for the Demand Curve as :
	 * elasticity * [ ln ] (demandCurveFunction(weights) )
	 * @param x The step for which to calculate parameters value
	 * @return Parameter's value that will be summed for calculating total consumer's consumption
	 */
	@Test
	void testValueFor_3() {
		log.info("Testing valueFor(float) - Case 3");
		
		//Create a new ParameterAttributes object
		ParameterAttributes pa = new ParameterAttributes();
		
		//Set the elasticity
		pa.setElasticity(0.5f);
		
		//Set the demand curve function
		pa.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the social function
		pa.setSocialFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the parameter to be social
		pa.setSocial(true);
		
		//Set the parameter's name
		pa.setName("Test");
		
		//Set the parameter's value
		pa.setValue(0.5f);
		
		//Set the parameter's ln
		pa.setLn(true);
		
		//Calculate the parameter's value
		float result = pa.valueFor(0.5f);
		
		//Check if the result is correct
		assertEquals(0.5f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the input is a float number.
	 * Mostly used when the parameter is social and the input value is the sum of weights.
	 * Calculates parameter's value for the Demand Curve as :
	 * elasticity * [ ln ] (demandCurveFunction(weights) )
	 * @param x The step for which to calculate parameters value
	 * @return Parameter's value that will be summed for calculating total consumer's consumption
	 */
	@Test
	void testValueFor_4() {
		log.info("Testing valueFor(float) - Case 4");
		
		//Create a new ParameterAttributes object
		ParameterAttributes pa = new ParameterAttributes();
		
		//Set the elasticity
		pa.setElasticity(0.5f);
		
		//Set the demand curve function
		pa.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the social function
		pa.setSocialFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the parameter to be social
		pa.setSocial(true);
		
		//Set the parameter's name
		pa.setName("Test");
		
		//Set the parameter's value
		pa.setValue(0.5f);
		
		//Set the parameter's ln
		pa.setLn(true);
		
		//Calculate the parameter's value
		float result = pa.valueFor(0.5f);
		
		//Check if the result is correct
		assertEquals(0.5f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the input is a float number.
	 * Mostly used when the parameter is social and the input value is the sum of weights.
	 * Calculates parameter's value for the Demand Curve as :
	 * elasticity * [ ln ] (demandCurveFunction(weights) )
	 * @param x The step for which to calculate parameters value
	 * @return Parameter's value that will be summed for calculating total consumer's consumption
	 */
	@Test
	void testValueFor_5() {
		log.info("Testing valueFor(float) - Case 5");
		
		//Create a new ParameterAttributes object
		ParameterAttributes pa = new ParameterAttributes();
		
		//Set the elasticity
		pa.setElasticity(0.5f);
		
		//Set the demand curve function
		pa.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the social function
		pa.setSocialFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the parameter to be social
		pa.setSocial(true);
		
		//Set the parameter's name
		pa.setName("Test");
		
		//Set the parameter's value
		pa.setValue(0.5f);
		
		//Set the parameter's ln
		pa.setLn(true);
		
		//Calculate the parameter's value
		float result = pa.valueFor(0.5f);
		
		//Check if the result is correct
		assertEquals(0.5f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the input is a float number.
	 * Mostly used when the parameter is social and the input value is the sum of weights.
	 * Calculates parameter's value for the Demand Curve as :
	 * elasticity * [ ln ] (demandCurveFunction(weights) )
	 * @param x The step for which to calculate parameters value
	 * @return Parameter's value that will be summed for calculating total consumer's consumption
	 */
	@Test
	void testValueFor_6() {
		log.info("Testing valueFor(float) - Case 6");
		
		//Create a new ParameterAttributes object
		ParameterAttributes pa = new ParameterAttributes();
		
		//Set the elasticity
		pa.setElasticity(0.5f);
		
		//Set the demand curve function
		pa.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the social function
		pa.setSocialFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the parameter to be social
		pa.setSocial(true);
		
		//Set the parameter's name
		pa.setName("Test");
		
		//Set the parameter's value
		pa.setValue(0.5f);
		
		//Set the parameter's ln
		pa.setLn(true);
		
		//Calculate the parameter's value
		float result = pa.valueFor(0.5f);
		
		//Check if the result is correct
		assertEquals(0.5f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the input is a float number.
	 * Mostly used when the parameter is social and the input value is the sum of weights.
	 * Calculates parameter's value for the Demand Curve as :
	 * elasticity * [ ln ] (demandCurveFunction(weights) )
	 * @param x The step for which to calculate parameters value
	 * @return Parameter's value that will be summed for calculating total consumer's consumption
	 */
	@Test
	void testValueFor_7() {
		log.info("Testing valueFor(float) - Case 7");
		
		//Create a new ParameterAttributes object
		ParameterAttributes pa = new ParameterAttributes();
		
		//Set the elasticity
		pa.setElasticity(0.5f);
		
		//Set the demand curve function
		pa.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the social function
		pa.setSocialFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the parameter to be social
		pa.setSocial(true);
		
		//Set the parameter's name
		pa.setName("Test");
		
		//Set the parameter's value
		pa.setValue(0.5f);
		
		//Set the parameter's ln
		pa.setLn(true);
		
		//Calculate the parameter's value
		float result = pa.valueFor(0.5f);
		
		//Check if the result is correct
		assertEquals(0.5f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the input is a float number.
	 * Mostly used when the parameter is social and the input value is the sum of weights.
	 * Calculates parameter's value for the Demand Curve as :
	 * elasticity * [ ln ] (demandCurveFunction(weights) )
	 * @param x The step for which to calculate parameters value
	 * @return Parameter's value that will be summed for calculating total consumer's consumption
	 */
	@Test
	void testValueFor_8() {
		log.info("Testing valueFor(float) - Case 8");
		
		//Create a new ParameterAttributes object
		ParameterAttributes pa = new ParameterAttributes();
		
		//Set the elasticity
		pa.setElasticity(0.5f);
		
		//Set the demand curve function
		pa.setDemandCurveFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the social function
		pa.setSocialFunction(new Function() {
			public float valueFor(float x) {
				return x;
			}
		});
		
		//Set the parameter to be social
		pa.setSocial(true);
		
		//Set the parameter's name
		pa.setName("Test");
		
		//Set the parameter's value
		pa.setValue(0.5f);
		
		//Set the parameter's ln
		pa.setLn(true);
		
		//Calculate the parameter's value
		float result = pa.valueFor(0.5f);
		
		//Check if the result is correct
		assertEquals(0.5f, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * It tests the case where the input is a float number.
	 * Mostly used when the parameter is social and the input value is the sum of weights.
	 * Calculates parameter's value for the Demand Curve as :
	 * elasticity * [ ln ] (demandCurveFunction(weights) )
	 * @param x The step for which to calculate parameters value
	 * @return Parameter's value that will be summed for calculating total consumer's consumption
	 */
	@Test
	void testValueFor_9() {
		log.info("Testing valueFor(float) - Case 9");
	