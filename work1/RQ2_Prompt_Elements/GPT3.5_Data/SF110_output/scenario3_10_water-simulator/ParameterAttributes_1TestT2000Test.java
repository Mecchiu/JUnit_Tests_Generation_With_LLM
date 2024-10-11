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
    void testValueFor() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        float result = parameterAttributes.valueFor(0.5f);
        assertEquals(0.0f, result, 0.001f);
    }

    @Test
    void testValueForWithPositiveElasticity() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        float elasticity = 0.5f;
        float[] weights = {1.0f, 2.0f, 3.0f};
        float result = parameterAttributes.valueFor(elasticity, weights);
        assertEquals(0.346f, result, 0.001f);
    }

    @Test
    void testValueForWithNegativeElasticity() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        float elasticity = -0.5f;
        float[] weights = {1.0f, 2.0f, 3.0f};
        float result = parameterAttributes.valueFor(elasticity, weights);
        assertEquals(-0.346f, result, 0.001f);
    }

    @Test
    void testValueForWithZeroElasticity() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        float elasticity = 0.0f;
        float[] weights = {1.0f, 2.0f, 3.0f};
        float result = parameterAttributes.valueFor(elasticity, weights);
        assertEquals(0.0f, result, 0.001f);
    }

    @Test
    void testValueForWithEmptyWeights() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        float elasticity = 0.5f;
        float[] weights = {};
        assertThrows(IllegalArgumentException.class, () -> parameterAttributes.valueFor(elasticity, weights));
    }

    @Test
    void testValueForWithNullWeights() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        float elasticity = 0.5f;
        float[] weights = null;
        assertThrows(NullPointerException.class, () -> parameterAttributes.valueFor(elasticity, weights));
    }

    @Test
    void testValueForWithNegativeWeights() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        float elasticity = 0.5f;
        float[] weights = {-1.0f, -2.0f, -3.0f};
        assertThrows(IllegalArgumentException.class, () -> parameterAttributes.valueFor(elasticity, weights));
    }

    @Test
    void testValueForWithZeroWeights() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        float elasticity = 0.5f;
        float[] weights = {0.0f, 0.0f, 0.0f};
        assertThrows(IllegalArgumentException.class, () -> parameterAttributes.valueFor(elasticity, weights));
    }

    @Test
    void testValueForWithPositiveWeights() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        float elasticity = 0.5f;
        float[] weights = {1.0f, 2.0f, 3.0f};
        float result = parameterAttributes.valueFor(elasticity, weights);
        assertEquals(0.346f, result, 0.001f);
    }

    @Test
    void testValueForWithOneWeight() {
        ParameterAttributes parameterAttributes = new ParameterAttributes();
        float elasticity = 0.5f;
        float[] weights = {1.0f};
        float result = parameterAttributes.valueFor(elasticity, weights);
        assertEquals(0.0f, result, 0.001f);
    }
}