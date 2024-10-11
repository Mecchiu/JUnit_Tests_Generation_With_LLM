// ParameterAttributes.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;

public class ParameterAttributes implements Serializable {

    /**
     * Returns the value of the parameter for a given step.
     * @param step the step for which the value is requested
     * @return the value of the parameter for the given step
     */
    public float valueFor(int step) {
        return valueFor((float) step);
    }
}

// ParameterAttributes_0Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains ten unit test cases for the {@link ParameterAttributes#valueFor(int)} method.
*/
class ParameterAttributes_0Test {
    
    /**
     * Tests that the value for step 0 is 0.
     */
    @Test
    void testValueForStep0() {
        ParameterAttributes pa = new ParameterAttributes();
        assertEquals(0, pa.valueFor(0));
    }
    
    /**
     * Tests that the value for a negative step is 0.
     */
    @Test
    void testValueForNegativeStep() {
        ParameterAttributes pa = new ParameterAttributes();
        assertEquals(0, pa.valueFor(-1));
    }
    
    /**
     * Tests that the value for step 1 is 1.
     */
    @Test
    void testValueForStep1() {
        ParameterAttributes pa = new ParameterAttributes();
        assertEquals(1, pa.valueFor(1));
    }
    
    /**
     * Tests that the value for a large step is the same as for a smaller step.
     */
    @Test
    void testValueForLargeStep() {
        ParameterAttributes pa = new ParameterAttributes();
        assertEquals(pa.valueFor(100), pa.valueFor(1));
    }
    
    /**
     * Tests that the value for a non-integer step is the same as for the nearest integer step.
     */
    @Test
    void testValueForNonIntegerStep() {
        ParameterAttributes pa = new ParameterAttributes();
        assertEquals(pa.valueFor(1.5f), pa.valueFor(2));
    }
    
    /**
     * Tests that the value for a step larger than the maximum integer value is the same as for the maximum integer value.
     */
    @Test
    void testValueForMaxIntegerStep() {
        ParameterAttributes pa = new ParameterAttributes();
        assertEquals(pa.valueFor(Integer.MAX_VALUE + 1L), pa.valueFor(Integer.MAX_VALUE));
    }
    
    /**
     * Tests that the value for a step smaller than the minimum integer value is 0.
     */
    @Test
    void testValueForMinIntegerStep() {
        ParameterAttributes pa = new ParameterAttributes();
        assertEquals(0, pa.valueFor(Integer.MIN_VALUE));
    }
    
    /**
     * Tests that the value for a step that causes an overflow is 0.
     */
    @Test
    void testValueForOverflowStep() {
        ParameterAttributes pa = new ParameterAttributes();
        assertEquals(0, pa.valueFor(Integer.MAX_VALUE * 2L));
    }
    
    /**
     * Tests that the value for a step that causes an underflow is 0.
     */
    @Test
    void testValueForUnderflowStep() {
        ParameterAttributes pa = new ParameterAttributes();
        assertEquals(0, pa.valueFor(Integer.MIN_VALUE * 2L));
    }
    
    /**
     * Tests that the value for a step that is NaN is 0.
     */
    @Test
    void testValueForNaNStep() {
        ParameterAttributes pa = new ParameterAttributes();
        assertEquals(0, pa.valueFor(Float.NaN));
    }
}