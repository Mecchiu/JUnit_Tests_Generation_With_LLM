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
   
    private static final Logger log = Logger.getLogger(ParameterAttributes_1Test.class.getName());
		   
    /*
              <parameter value-for="3.141592653589793">
              3.141592653589793
                 </parameter> 
    */
    @Test
    public void when_valueForParameter_then_result() {
        ParameterAttributes.valueFor(0.23f);
    }

}
// ParameterAttributes_1Test.java