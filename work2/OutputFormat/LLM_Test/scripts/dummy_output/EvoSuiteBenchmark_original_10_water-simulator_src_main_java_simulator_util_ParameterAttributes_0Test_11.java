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
		Logger traceLog = Logger.getLogger("trace");
	
    @Test
    void test01() {
    	ParameterAttributes p = new ParameterAttributes();
        p.setElasticity(5.0f);
        p.setLn(true);
        assertTrue(p.valueFor(0) == 100.0f);
    }
	
    @Test
    void test02() {
    	ParameterAttributes p = new ParameterAttributes();
        p.setElasticity(5f);
        p.setLn(true);
        assertEquals(100.0f, p.valueFor(0));
    }

    @Test
    void test03() {
    	ParameterAttributes p = new ParameterAttributes();
        p.setLn(false);
        assertEquals(Double.valueOf(100.0), p.valueFor(0));
    }

    @Test
    void test04() {
    	ParameterAttributes p = new ParameterAttributes();
        p.setLn(true);
        assertEquals(Double.valueOf(100.0), p.valueFor(0));
    }
}