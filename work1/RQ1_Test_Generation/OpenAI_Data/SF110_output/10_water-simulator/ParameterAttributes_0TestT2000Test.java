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

	private static final Logger log = Logger.getLogger(ParameterAttributes_0Test.class);
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * 
	 * Test case for the valueFor method of the ParameterAttributes class.
	 * The method is tested with a parameter that has a linear demand curve function.
	 * The parameter's elasticity is 1.0 and the parameter's value is not the logarithm of the function.
	 * The input value is 1.
	 * The expected result is 1.0.
	 */
	@Test
	void testValueFor_0() {
		log.info("Test case for valueFor method of the ParameterAttributes class.");
		log.info("The method is tested with a parameter that has a linear demand curve function.");
		log.info("The parameter's elasticity is 1.0 and the parameter's value is not the logarithm of the function.");
		log.info("The input value is 1.");
		log.info("The expected result is 1.0.");
		
		ParameterAttributes parameterAttributes0 = new ParameterAttributes();
		LinearFunction linearFunction0 = new LinearFunction();
		linearFunction0.setA(1.0);
		linearFunction0.setB(0.0);
		parameterAttributes0.setDemandCurveFunction(linearFunction0);
		parameterAttributes0.setElasticity(1.0F);
		parameterAttributes0.setLn(false);
		float float0 = parameterAttributes0.valueFor(1);
		assertEquals(1.0F, float0, 0.01F);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * 
	 * Test case for the valueFor method of the ParameterAttributes class.
	 * The method is tested with a parameter that has a linear demand curve function.
	 * The parameter's elasticity is 1.0 and the parameter's value is not the logarithm of the function.
	 * The input value is 0.
	 * The expected result is 0.0.
	 */
	@Test
	void testValueFor_1() {
		log.info("Test case for valueFor method of the ParameterAttributes class.");
		log.info("The method is tested with a parameter that has a linear demand curve function.");
		log.info("The parameter's elasticity is 1.0 and the parameter's value is not the logarithm of the function.");
		log.info("The input value is 0.");
		log.info("The expected result is 0.0.");
		
		ParameterAttributes parameterAttributes0 = new ParameterAttributes();
		LinearFunction linearFunction0 = new LinearFunction();
		linearFunction0.setA(1.0);
		linearFunction0.setB(0.0);
		parameterAttributes0.setDemandCurveFunction(linearFunction0);
		parameterAttributes0.setElasticity(1.0F);
		parameterAttributes0.setLn(false);
		float float0 = parameterAttributes0.valueFor(0);
		assertEquals(0.0F, float0, 0.01F);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * 
	 * Test case for the valueFor method of the ParameterAttributes class.
	 * The method is tested with a parameter that has a linear demand curve function.
	 * The parameter's elasticity is 1.0 and the parameter's value is not the logarithm of the function.
	 * The input value is -1.
	 * The expected result is -1.0.
	 */
	@Test
	void testValueFor_2() {
		log.info("Test case for valueFor method of the ParameterAttributes class.");
		log.info("The method is tested with a parameter that has a linear demand curve function.");
		log.info("The parameter's elasticity is 1.0 and the parameter's value is not the logarithm of the function.");
		log.info("The input value is -1.");
		log.info("The expected result is -1.0.");
		
		ParameterAttributes parameterAttributes0 = new ParameterAttributes();
		LinearFunction linearFunction0 = new LinearFunction();
		linearFunction0.setA(1.0);
		linearFunction0.setB(0.0);
		parameterAttributes0.setDemandCurveFunction(linearFunction0);
		parameterAttributes0.setElasticity(1.0F);
		parameterAttributes0.setLn(false);
		float float0 = parameterAttributes0.valueFor(-1);
		assertEquals(-1.0F, float0, 0.01F);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * 
	 * Test case for the valueFor method of the ParameterAttributes class.
	 * The method is tested with a parameter that has a linear demand curve function.
	 * The parameter's elasticity is 1.0 and the parameter's value is the logarithm of the function.
	 * The input value is 1.
	 * The expected result is 0.0.
	 */
	@Test
	void testValueFor_3() {
		log.info("Test case for valueFor method of the ParameterAttributes class.");
		log.info("The method is tested with a parameter that has a linear demand curve function.");
		log.info("The parameter's elasticity is 1.0 and the parameter's value is the logarithm of the function.");
		log.info("The input value is 1.");
		log.info("The expected result is 0.0.");
		
		ParameterAttributes parameterAttributes0 = new ParameterAttributes();
		LinearFunction linearFunction0 = new LinearFunction();
		linearFunction0.setA(1.0);
		linearFunction0.setB(0.0);
		parameterAttributes0.setDemandCurveFunction(linearFunction0);
		parameterAttributes0.setElasticity(1.0F);
		parameterAttributes0.setLn(true);
		float float0 = parameterAttributes0.valueFor(1);
		assertEquals(0.0F, float0, 0.01F);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * 
	 * Test case for the valueFor method of the ParameterAttributes class.
	 * The method is tested with a parameter that has a linear demand curve function.
	 * The parameter's elasticity is 1.0 and the parameter's value is the logarithm of the function.
	 * The input value is 0.
	 * The expected result is 0.0.
	 */
	@Test
	void testValueFor_4() {
		log.info("Test case for valueFor method of the ParameterAttributes class.");
		log.info("The method is tested with a parameter that has a linear demand curve function.");
		log.info("The parameter's elasticity is 1.0 and the parameter's value is the logarithm of the function.");
		log.info("The input value is 0.");
		log.info("The expected result is 0.0.");
		
		ParameterAttributes parameterAttributes0 = new ParameterAttributes();
		LinearFunction linearFunction0 = new LinearFunction();
		linearFunction0.setA(1.0);
		linearFunction0.setB(0.0);
		parameterAttributes0.setDemandCurveFunction(linearFunction0);
		parameterAttributes0.setElasticity(1.0F);
		parameterAttributes0.setLn(true);
		float float0 = parameterAttributes0.valueFor(0);
		assertEquals(0.0F, float0, 0.01F);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(int)}
	 * 
	 * Test case for the valueFor method of the ParameterAttributes class.
	 * The method is tested with a parameter that has a linear demand curve function.
	 * The