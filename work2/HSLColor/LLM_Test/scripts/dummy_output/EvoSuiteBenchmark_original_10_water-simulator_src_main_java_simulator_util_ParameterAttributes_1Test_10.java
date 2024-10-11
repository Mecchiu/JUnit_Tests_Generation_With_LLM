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
		/**Test to perform on the parameters which need to be tested*/
    private final Boolean s = Boolean.FALSE;

	/**
	 * Initialize the test object with a name and a value to test
	 * Calculates the average of the initial values of the parameter using the
	 * function that the paramter is created from
	 * @param aTest
	 */
    public ParameterAttributes_1Test(String aTest) {
            name = aTest;
	    value = new Float(0);
        }

    /**
	 * Performs the function which represents a sample for the last iteration of each
	 * paramter. It calculates average of the initial values of the parameter using
	 * the function that the paramter is created from
     */
	public void initialValues() {
		if(name == "s") {
			value = 1;
        }
	}

    /**
       Calculates the average of a single parameter.
       Uses the function that we have initalValues()
	 * @return the average of this parameter
	 */
	public double valueForSample() {
		if(name == "s") {
			value = 0;
        }
		return value.intValue();

	}
}
