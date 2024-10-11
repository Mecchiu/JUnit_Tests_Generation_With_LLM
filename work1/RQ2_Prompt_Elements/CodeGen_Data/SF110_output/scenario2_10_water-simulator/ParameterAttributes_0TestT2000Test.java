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

	@Test
    public void testValueFor() {
        
        // 1st test case : valueFor(valueFunction);
        // The value expected was calculated using the parameters for the ln(2).
        // Here it is 1.2
        Logger.getLogger("jUnit").setLevel(Logger.LEVEL_FINEST);
        try {
            Logger.getLogger("jUnit").setLevel(Logger.LEVEL_FINER);
        } catch(Exception e) {
        }
        String s = valueFor((float) 1.2);
        Logger.getLogger("jUnit").setLevel(0);
        String errString = String.format("Parameters for ln(%s) have to have the same value.", (float) 1.2);
        assertEquals(errString, s);
        
		
        // 2nd test case : valueFor(valueFunction);
        // The value expected was calculated using the parameters for the ln(3).
        // Here it is 2.14
        Logger.getLogger("jUnit").setLevel(Logger.LEVEL_FINEST);
        try {
            Logger.getLogger("jUnit").setLevel(Logger.LEVEL_FINER);
        } catch(Exception e) {
        }
        s = valueFor((float) 2.14);
        Logger.getLogger("jUnit").setLevel(0);
        errString = String.format("Parameters for ln(%s) have to have the same value.", (float) 2.14);
        assertEquals(errString, s);
        
    }
}
