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
    public void valueForTestCase() {
        assertNotNull(ValueFunc.value);
        float x = ValueFunc.value().getX();
        float test1 = ValueFunc.value().getValue();
        assertEquals(x, test1, 0);
    }

	
    float test2(float x) {
        float test1 = ValueFunc.value().getValue();
        assertEquals(test1, ValueFunc.value().getX(), 0);
        return test1;
    }
}
