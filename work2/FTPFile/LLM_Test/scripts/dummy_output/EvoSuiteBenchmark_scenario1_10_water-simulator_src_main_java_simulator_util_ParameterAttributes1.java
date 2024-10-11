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
		
		private static final Logger log = Logger.getLogger(ParameterAttributesTest.class);
		
		/**
		* Test case 1 for {@link ParameterAttributes#valueFor(float)} method.
		* This test case checks the value of the parameter when the demand curve function is a linear function.
		*/
		@Test
		void testValueFor1() {
				log.info("Test case 1 for ParameterAttributes#valueFor(float) method.");
				ParameterAttributes parameterAttributes = new ParameterAttributes();
				parameterAttributes.demandCurveFunction = new LinearFunction(1, 0);
				parameterAttributes.elasticity = new Float(1);
				parameterAttributes.ln = new Boolean(false);
				assertEquals(1, parameterAttributes.valueFor(1));
		}
		
		/**
		* Test case 2 for {@link ParameterAttributes#valueFor(float)} method.
		* This test case checks the value of the parameter when the demand curve function is a linear function.
		*/
		@Test
		void testValueFor2() {
				log.info("Test case 2 for ParameterAttributes#valueFor(float) method.");
				ParameterAttributes parameterAttributes = new ParameterAttributes();
				parameterAttributes.demandCurveFunction = new LinearFunction(1, 0);
				parameterAttributes.elasticity = new Float(1);
				parameterAttributes.ln = new Boolean(false);
				assertEquals(2, parameterAttributes.valueFor(2));
		}
		
		/**
		* Test case 3 for {@link ParameterAttributes#valueFor(float)} method.
		* This test case checks the value of the parameter when the demand curve function is a linear function.
		*/
		@Test
		void testValueFor3() {
				log.info("Test case 3 for ParameterAttributes#valueFor(float) method.");
				ParameterAttributes parameterAttributes = new ParameterAttributes();
				parameterAttributes.demandCurveFunction = new LinearFunction(1, 0);
				parameterAttributes.elasticity = new Float(1);
				parameterAttributes.ln = new Boolean(false);
				assertEquals(3, parameterAttributes.valueFor(3));
		}
		
		/**
		* Test case 4 for {@link ParameterAttributes#valueFor(float)} method.
		* This test case checks the value of the parameter when the demand curve function is a linear function.
		*/
		@Test
		void testValueFor4() {
				log.info("Test case 4 for ParameterAttributes#valueFor(float) method.");
				ParameterAttributes parameterAttributes = new ParameterAttributes();
				parameterAttributes.demandCurveFunction = new LinearFunction(1, 0);
				parameterAttributes.elasticity = new Float(1);
				parameterAttributes.ln = new Boolean(false);
				assertEquals(4, parameterAttributes.valueFor(4));
		}
		
		/**
		* Test case 5 for {@link ParameterAttributes#valueFor(float)} method.
		* This test case checks the value of the parameter when the demand curve function is a linear function.
		*/
		@Test
		void testValueFor5() {
				log.info("Test case 5 for ParameterAttributes#valueFor(float) method.");
				ParameterAttributes parameterAttributes = new ParameterAttributes();
				parameterAttributes.demandCurveFunction = new LinearFunction(1, 0);
				parameterAttributes.elasticity = new Float(1);
				parameterAttributes.ln = new Boolean(false);
				assertEquals(5, parameterAttributes.valueFor(5));
		}
		
		/**
		* Test case 6 for {@link ParameterAttributes#valueFor(float)} method.
		* This test case checks the value of the parameter when the demand curve function is a linear function.
		*/
		@Test
		void testValueFor6() {
				log.info("Test case 6 for ParameterAttributes#valueFor(float) method.");
				ParameterAttributes parameterAttributes = new ParameterAttributes();
				parameterAttributes.demandCurveFunction = new LinearFunction(1, 0);
				parameterAttributes.elasticity = new Float(1);
				parameterAttributes.ln = new Boolean(false);
				assertEquals(6, parameterAttributes.valueFor(6));
		}
		
		/**
		* Test case 7 for {@link ParameterAttributes#valueFor(float)} method.
		* This test case checks the value of the parameter when the demand curve function is a linear function.
		*/
		@Test
		void testValueFor7() {
				log.info("Test case 7 for ParameterAttributes#valueFor(float) method.");
				ParameterAttributes parameterAttributes = new ParameterAttributes();
				parameterAttributes.demandCurveFunction = new LinearFunction(1, 0);
				parameterAttributes.elasticity = new Float(1);
				parameterAttributes.ln = new Boolean(false);
				assertEquals(7, parameterAttributes.valueFor(7));
		}
		
		/**
		* Test case 8 for {@link ParameterAttributes#valueFor(float)} method.
		* This test case checks the value of the parameter when the demand curve function is a linear function.
		*/
		@Test
		void testValueFor8() {
				log.info("Test case 8 for ParameterAttributes#valueFor(float) method.");
				ParameterAttributes parameterAttributes = new ParameterAttributes();
				parameterAttributes.demandCurveFunction = new LinearFunction(1, 0);
				parameterAttributes.elasticity = new Float(1);
				parameterAttributes.ln = new Boolean(false);
				assertEquals(8, parameterAttributes.valueFor(8));
		}
		
		/**
		* Test case 9 for {@link ParameterAttributes#valueFor(float)} method.
		* This test case checks the value of the parameter when the demand curve function is a linear function.
		*/
		@Test
		void testValueFor9() {
				log.info("Test case 9 for ParameterAttributes#valueFor(float) method.");
				ParameterAttributes parameterAttributes = new ParameterAttributes();
				parameterAttributes.demandCurveFunction = new LinearFunction(1, 0);
				parameterAttributes.elasticity = new Float(1);
				parameterAttributes.ln = new Boolean(false);
				assertEquals(9, parameterAttributes.valueFor(9));
		}
		
		/**
		* Test case 10 for {@link ParameterAttributes#valueFor(float)} method.
		* This test case checks the value of the parameter when the demand curve function is a linear function.
		*/
		@Test
		void testValueFor10() {
				log.info("Test case 10 for ParameterAttributes#valueFor(float) method.");
				ParameterAttributes parameterAttributes = new ParameterAttributes();
				parameterAttributes.demandCurveFunction = new LinearFunction(1, 0);
				parameterAttributes.elasticity = new Float(1);
				parameterAttributes.ln = new Boolean(false);
				assertEquals(10, parameterAttributes.valueFor(10));
		}
}