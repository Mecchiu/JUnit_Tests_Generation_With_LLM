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
		
        @Test
        void testGetValueForStringFloat() {
        	ParameterAttributes param = new ParameterAttributes();
    	   param.setName("bogusName");
    	   assertEquals(null, param.getValueFor(12));
    	   assertEquals(null, param.getValueFor(Float.parseFloat("12")));
        }
    
}
//------------------------------------------------------------------------------------------------