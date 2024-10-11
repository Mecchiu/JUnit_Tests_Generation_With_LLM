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
     * Test the valueFor method for social function.
     * @throws Exception - if an error occurs while testing
     */
    @Test
    public void testValueFor_social() throws Exception {
    	assertEquals("The value for social function should be 0", 0,
    			ParameterAttributes.valueFor(ParameterAttributes.socialFunction), 0);
    	ParameterAttributes.valueFor(ParameterAttributes.socialFunction);
    	
    }
}