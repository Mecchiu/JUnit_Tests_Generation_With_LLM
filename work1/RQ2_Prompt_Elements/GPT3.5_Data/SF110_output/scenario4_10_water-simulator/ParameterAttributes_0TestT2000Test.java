// Here's a sample test class for the ParameterAttributes class

package simulator.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParameterAttributesTest {

    @Test
    void testValueFor() {
        // Create a ParameterAttributes object with some values
        ParameterAttributes param = new ParameterAttributes();
        param.setElasticity(0.5f);
        param.setLn(true);
        param.setDemandCurveFunction(new LinearFunction(0, 1));
        param.setValue(10f);

        // Test the valueFor method for different steps
        assertEquals(0f, param.valueFor(0));
        assertEquals(5f, param.valueFor(1));
        assertEquals(7.5f, param.valueFor(2));
        assertEquals(8.75f, param.valueFor(3));
        assertEquals(9.375f, param.valueFor(4));
    }

    @Test
    void testValueForWithFloatInput() {
        // Create a ParameterAttributes object with some values
        ParameterAttributes param = new ParameterAttributes();
        param.setElasticity(0.5f);
        param.setLn(true);
        param.setDemandCurveFunction(new LinearFunction(0, 1));
        param.setValue(10f);

        // Test the valueFor method with a float input
        assertEquals(0f, param.valueFor(0f));
        assertEquals(5f, param.valueFor(1.5f));
        assertEquals(7.5f, param.valueFor(2.5f));
        assertEquals(8.75f, param.valueFor(3.75f));
        assertEquals(9.375f, param.valueFor(4.375f));
    }

    @Test
    void testToString() {
        // Create a ParameterAttributes object with some values
        ParameterAttributes param = new ParameterAttributes();
        param.setName("TestParam");
        param.setElasticity(0.5f);
        param.setLn(true);
        param.setDemandCurveFunction(new LinearFunction(0, 1));
        param.setValue(10f);

        // Test the toString method
        assertEquals("ParameterAttributes{name='TestParam', elasticity=0.5, ln=true, demandCurveFunction=LinearFunction{a=0.0, b=1.0}, socialFunction=null, social=false, value=10.0}", param.toString());
    }
}