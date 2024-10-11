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

    /**
     * Test the valueFor method for ParameterAttributes
     */
    @Test
    public void testValueFor() {
        ParameterAttributes_0 instance = new ParameterAttributes_0();
        instance.valueFor(0); //The first parameter is the logarithm of the function
        instance.setElasticity(new Float(0.55f));
        assertEquals(new Float(1), instance.valueFor(0)); //The first parameter is the logarithm of the function
        instance.setElasticity(new Float(0));
        assertEquals(new Float(1), instance.valueFor(0)); //The first parameter is the logarithm of the function
        instance.setLn(Boolean.TRUE);
        assertEquals(new Float(1), instance.valueFor(0)); //The first parameter is the logarithm of the function
        instance.setLn(Boolean.FALSE);
        assertEquals(new Float(0), instance.valueFor(0)); //The first parameter is the logarithm of the function
    }
}
