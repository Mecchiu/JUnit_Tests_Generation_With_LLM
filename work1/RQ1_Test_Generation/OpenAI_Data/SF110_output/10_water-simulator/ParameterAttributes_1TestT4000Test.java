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

	private static final Logger log = Logger.getLogger(ParameterAttributes_1Test.class);
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 1
	 * Expected result: 1
	 */
	@Test
	void testValueFor_1() {
		log.info("Test 1");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 1;
		float expResult = 1;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 2
	 * Expected result: 2
	 */
	@Test
	void testValueFor_2() {
		log.info("Test 2");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 2;
		float expResult = 2;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 3
	 * Expected result: 3
	 */
	@Test
	void testValueFor_3() {
		log.info("Test 3");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 3;
		float expResult = 3;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 4
	 * Expected result: 4
	 */
	@Test
	void testValueFor_4() {
		log.info("Test 4");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 4;
		float expResult = 4;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 5
	 * Expected result: 5
	 */
	@Test
	void testValueFor_5() {
		log.info("Test 5");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 5;
		float expResult = 5;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 6
	 * Expected result: 6
	 */
	@Test
	void testValueFor_6() {
		log.info("Test 6");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 6;
		float expResult = 6;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 7
	 * Expected result: 7
	 */
	@Test
	void testValueFor_7() {
		log.info("Test 7");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 7;
		float expResult = 7;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 8
	 * Expected result: 8
	 */
	@Test
	void testValueFor_8() {
		log.info("Test 8");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 8;
		float expResult = 8;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 9
	 * Expected result: 9
	 */
	@Test
	void testValueFor_9() {
		log.info("Test 9");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 9;
		float expResult = 9;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 10
	 * Expected result: 10
	 */
	@Test
	void testValueFor_10() {
		log.info("Test 10");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 10;
		float expResult = 10;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
}

// ParameterAttributes_2Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributes_2Test {
		
	private static final Logger log = Logger.getLogger(ParameterAttributes_2Test.class);
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 1
	 * Expected result: 1
	 */
	@Test
	void testValueFor_1() {
		log.info("Test 1");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 1;
		float expResult = 1;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 2
	 * Expected result: 2
	 */
	@Test
	void testValueFor_2() {
		log.info("Test 2");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 2;
		float expResult = 2;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 3
	 * Expected result: 3
	 */
	@Test
	void testValueFor_3() {
		log.info("Test 3");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 3;
		float expResult = 3;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 4
	 * Expected result: 4
	 */
	@Test
	void testValueFor_4() {
		log.info("Test 4");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 4;
		float expResult = 4;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 5
	 * Expected result: 5
	 */
	@Test
	void testValueFor_5() {
		log.info("Test 5");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 5;
		float expResult = 5;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 6
	 * Expected result: 6
	 */
	@Test
	void testValueFor_6() {
		log.info("Test 6");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 6;
		float expResult = 6;
		float result = pa.valueFor(x);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link ParameterAttributes#valueFor(float)} method.
	 * Test data:
	 * 		- Demand Curve Function: Linear
	 * 		- Elasticity: 1
	 * 		- Logarithm: false
	 * 		- Social: false
	 * 		- Input: 7
	 * Expected result: 7
	 */
	@Test
	void testValueFor_7() {
		log.info("Test 7");
		ParameterAttributes pa = new ParameterAttributes();
		pa.setDemandCurveFunction(new LinearFunction());
		pa.setElasticity(1);
		pa.setLn(false);
		pa.setSocial(false);
		float x = 7;
		