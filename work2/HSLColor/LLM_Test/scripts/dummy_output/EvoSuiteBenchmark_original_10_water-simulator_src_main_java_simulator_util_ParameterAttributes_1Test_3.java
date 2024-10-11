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
		
        private Logger log = Logger.getLogger(ParameterAttributes_1Test.class);
        
        /**
         * Tests if the step the user selected in the dialog is activated.
         */
        @Test
        public void testCurrentStep() {
            // Default case
            assertEquals(false, ParameterAttributes.this.valueFor(1F), 1.0e-9F);
        }

}