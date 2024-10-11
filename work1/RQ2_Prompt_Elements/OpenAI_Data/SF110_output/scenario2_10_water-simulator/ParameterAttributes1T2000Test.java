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
		* Test case for {@link ParameterAttributes#valueFor(float)} method.
		* It tests the case where the input is a float number.
		* It tests the case where the parameter is social and the input value is the sum of weights.
		* It tests the case where the parameter's value is calculated as :
		* elasticity * [ ln ] (demandCurveFunction(weights) )
		*/
		@Test
		void testValueFor() {
				log.info("Testing valueFor method");
				
				// Create a new ParameterAttributes object
				ParameterAttributes parameterAttributes = new ParameterAttributes();
				
				// Set the parameter's elasticity
				parameterAttributes.setElasticity(new Float(0.5));
				
				// Set the parameter's demand curve function
				parameterAttributes.setDemandCurveFunction(new DemandCurveFunction());
				
				// Set the parameter's ln
				parameterAttributes.setLn(new Boolean(true));
				
				// Set the parameter's value
				parameterAttributes.setValue(new Float(0.0));
				
				// Calculate the parameter's value
				float value = parameterAttributes.valueFor(new Float(0.5));
				
				// Check if the parameter's value is correct
				assertEquals(0.5, value);
		}
}

// ParameterAttributes.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;

public class ParameterAttributes implements Serializable {

    /**
     * Overrides the previous method if the input is a float number. Mostly used when the parameter is
     * social and the input value is the sum of weights.
     * Calculates parameter's value for the Demand Curve as :
     * elasticity * [ ln ] (demandCurveFunction(weights) )
     *
     * @param x The step for which to calculate parameters value
     * @return Parameter's value that will be summed for calculating total consumer's consumption
     */
    public float valueFor(float x) {
        float temp = demandCurveFunction.valueFor(x);
        if (temp > 0) {
            if (ln.booleanValue()) {
                this.value = new Float(elasticity.floatValue() * ((float) Math.log(temp)));
            } else {
                this.value = new Float(elasticity.floatValue() * temp);
            }
        } else {
            log.error("FATAL ERROR: Parameter was zero");
        }
        return value.floatValue();
    }
}

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
		* Test case for {@link ParameterAttributes#valueFor(float)} method.
		* It tests the case where the input is a float number.
		* It tests the case where the parameter is social and the input value is the sum of weights.
		* It tests the case where the parameter's value is calculated as :
		* elasticity * [ ln ] (demandCurveFunction(weights) )
		*/
		@Test
		void testValueFor() {
				log.info("Testing valueFor method");
				
				// Create a new ParameterAttributes object
				ParameterAttributes parameterAttributes = new ParameterAttributes();
				
				// Set the parameter's elasticity
				parameterAttributes.setElasticity(new Float(0.5));
				
				// Set the parameter's demand curve function
				parameterAttributes.setDemandCurveFunction(new DemandCurveFunction());
				
				// Set the parameter's ln
				parameterAttributes.setLn(new Boolean(true));
				
				// Set the parameter's value
				parameterAttributes.setValue(new Float(0.0));
				
				// Calculate the parameter's value
				float value = parameterAttributes.valueFor(new Float(0.5));
				
				// Check if the parameter's value is correct
				assertEquals(0.5, value);
		}
}

// ParameterAttributes.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;

public class ParameterAttributes implements Serializable {

    /**
     * Overrides the previous method if the input is a float number. Mostly used when the parameter is
     * social and the input value is the sum of weights.
     * Calculates parameter's value for the Demand Curve as :
     * elasticity * [ ln ] (demandCurveFunction(weights) )
     *
     * @param x The step for which to calculate parameters value
     * @return Parameter's value that will be summed for calculating total consumer's consumption
     */
    public float valueFor(float x) {
        float temp = demandCurveFunction.valueFor(x);
        if (temp > 0) {
            if (ln.booleanValue()) {
                this.value = new Float(elasticity.floatValue() * ((float) Math.log(temp)));
            } else {
                this.value = new Float(elasticity.floatValue() * temp);
            }
        } else {
            log.error("FATAL ERROR: Parameter was zero");
        }
        return value.floatValue();
    }
}

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
		* Test case for {@link ParameterAttributes#valueFor(float)} method.
		* It tests the case where the input is a float number.
		* It tests the case where the parameter is social and the input value is the sum of weights.
		* It tests the case where the parameter's value is calculated as :
		* elasticity * [ ln ] (demandCurveFunction(weights) )
		*/
		@Test
		void testValueFor() {
				log.info("Testing valueFor method");
				
				// Create a new ParameterAttributes object
				ParameterAttributes parameterAttributes = new ParameterAttributes();
				
				// Set the parameter's elasticity
				parameterAttributes.setElasticity(new Float(0.5));
				
				// Set the parameter's demand curve function
				parameterAttributes.setDemandCurveFunction(new DemandCurveFunction());
				
				// Set the parameter's ln
				parameterAttributes.setLn(new Boolean(true));
				
				// Set the parameter's value
				parameterAttributes.set