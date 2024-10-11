// ParameterAttributes_0Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains one unit test case for the {@link ParameterAttributes#valueFor(int)} method.
*/
class ParameterAttributes_0Test {
		private Logger logger = Logger.getLogger(ParameterAttributes_0Test.class.getName());

    /**
     * Gets the value for the parameter.
     * @param step Number of the step
     * @return Parameter's value as a string
     */
    public String valueFor(int step) {
        return "Parameter's value for " + step;
    }

    /**
     * Gets the value for the parameter.
     * @return Value for the parameter
     */
    public float valueFor() {
      return value.floatValue();
    }

  /**
   * This function calculates ln from the value input.
   */
  @Test
  public void ln() {
	    float valueToBeChecked = 0;
	    float lnAsObject = 0;
	    float ln = 0;
	    for (int i = 0; i < 10; ++i ) {
	      valueToBeChecked += lnAsObject;
	    }

	    if (valueToBeChecked > 0) {
		logger.warn( "Testing the function for ln : " + lnAsObject );
	      ln = java.lang.Math.log(valueToBeChecked);
	    } else {
	      logger.warn("Value's value was 0.");
	    }
    }

	@Test
	public void calc1() {
		float valueToBeChecked = 0;
		float calceOfLnAsObject = 0;
		float lnAsObject = 0;
		float value = value.floatValue();
		float value2 = 0;
		float value3 = 0;

		//if input value is greater than or equal to 0 then valueToBeChecked should be greater than 0
		if (value <= 0) {
			value2 = value;
			lnAsObject = 0;
		} else {
			//in this case valueToBeChecked can be greater than 0 but value must be greater than 1
			value3 = value;
			lnAsObject = value;
		}

		for (float x = 0; x < 5; ++x) {
			lnAsObject += calc1(value);
			value3 = calculate1(valueToBeChecked);
			assertTrue ("Testing ln for value ==> '" + valueToBeChecked
				+ "', ln is '" + calc1(valueToBeChecked) + "'", (calc1(valueToBeChecked).floatValue() <= value3));
			value2 = value;
			value3 = value;
		}

	}

	private float calc1(float value) {
	    //if input value equals ln, it is equal to 1
	    //if input value equals value + ln(1) or (0 + value), it is the log of 1
	    if (java.lang.Math.exp(value) == 1.0f) {
		return 1;
	    } else {
		return java.lang.Math.log(value) + java.lang.Math.exp(value) * 1.0f;
	    }

	}

	private float calculate1(float valueToBeChecked) {
	    float calc = valueToBeChecked;
	    java.lang.Math.sqrt(calc);
	    return calc;
	}




}