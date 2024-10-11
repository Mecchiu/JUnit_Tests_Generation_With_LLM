// ParameterAttributes_1Test.java
package simulator.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ParameterAttributes}.
 * It contains ten unit test cases for the {@link ParameterAttributes#valueFor(float)} method.
 */
class ParameterAttributes_1Test {

    @Test
    void testValueForPositive() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        parameterAttributes.elasticity = 2.0f;
        parameterAttributes.demandCurveFunction = new DemandCurveFunction();
        parameterAttributes.demandCurveFunction.weights = new float[]{1.0f, 2.0f, 3.0f};
        parameterAttributes.ln = false;
        float result = parameterAttributes.valueFor(1.0f);
        assertEquals(12.0f, result);
    }

    @Test
    void testValueForZero() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        parameterAttributes.elasticity = 2.0f;
        parameterAttributes.demandCurveFunction = new DemandCurveFunction();
        parameterAttributes.demandCurveFunction.weights = new float[]{0.0f, 0.0f, 0.0f};
        parameterAttributes.ln = false;
        assertThrows(IllegalArgumentException.class, () -> parameterAttributes.valueFor(1.0f));
    }

    @Test
    void testValueForNegative() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        parameterAttributes.elasticity = 2.0f;
        parameterAttributes.demandCurveFunction = new DemandCurveFunction();
        parameterAttributes.demandCurveFunction.weights = new float[]{-1.0f, -2.0f, -3.0f};
        parameterAttributes.ln = false;
        float result = parameterAttributes.valueFor(1.0f);
        assertEquals(-12.0f, result);
    }

    @Test
    void testValueForLnPositive() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        parameterAttributes.elasticity = 2.0f;
        parameterAttributes.demandCurveFunction = new DemandCurveFunction();
        parameterAttributes.demandCurveFunction.weights = new float[]{1.0f, 2.0f, 3.0f};
        parameterAttributes.ln = true;
        float result = parameterAttributes.valueFor(1.0f);
        assertEquals(4.158883f, result, 0.0001f);
    }

    @Test
    void testValueForLnZero() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        parameterAttributes.elasticity = 2.0f;
        parameterAttributes.demandCurveFunction = new DemandCurveFunction();
        parameterAttributes.demandCurveFunction.weights = new float[]{0.0f, 0.0f, 0.0f};
        parameterAttributes.ln = true;
        assertThrows(IllegalArgumentException.class, () -> parameterAttributes.valueFor(1.0f));
    }

    @Test
    void testValueForLnNegative() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        parameterAttributes.elasticity = 2.0f;
        parameterAttributes.demandCurveFunction = new DemandCurveFunction();
        parameterAttributes.demandCurveFunction.weights = new float[]{-1.0f, -2.0f, -3.0f};
        parameterAttributes.ln = true;
        assertThrows(IllegalArgumentException.class, () -> parameterAttributes.valueFor(1.0f));
    }

    @Test
    void testValueForNullDemandCurveFunction() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        parameterAttributes.elasticity = 2.0f;
        parameterAttributes.demandCurveFunction = null;
        parameterAttributes.ln = false;
        assertThrows(NullPointerException.class, () -> parameterAttributes.valueFor(1.0f));
    }

    @Test
    void testValueForNullElasticity() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        parameterAttributes.elasticity = null;
        parameterAttributes.demandCurveFunction = new DemandCurveFunction();
        parameterAttributes.demandCurveFunction.weights = new float[]{1.0f, 2.0f, 3.0f};
        parameterAttributes.ln = false;
        assertThrows(NullPointerException.class, () -> parameterAttributes.valueFor(1.0f));
    }

    @Test
    void testValueForNullLn() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        parameterAttributes.elasticity = 2.0f;
        parameterAttributes.demandCurveFunction = new DemandCurveFunction();
        parameterAttributes.demandCurveFunction.weights = new float[]{1.0f, 2.0f, 3.0f};
        parameterAttributes.ln = null;
        assertThrows(NullPointerException.class, () -> parameterAttributes.valueFor(1.0f));
    }

    @Test
    void testValueForNaN() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        parameterAttributes.elasticity = 2.0f;
        parameterAttributes.demandCurveFunction = new DemandCurveFunction();
        parameterAttributes.demandCurveFunction.weights = new float[]{Float.NaN, Float.NaN, Float.NaN};
        parameterAttributes.ln = false;
        assertThrows(IllegalArgumentException.class, () -> parameterAttributes.valueFor(1.0f));
    }
}