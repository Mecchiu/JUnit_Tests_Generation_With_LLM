// Here's an example implementation of the ParameterAttributes_1Test class:

package simulator.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParameterAttributes_1Test {

    @Test
    void testValueFor() {
        ParameterAttributes param = new ParameterAttributes();
        param.setElasticity(0.5f);
        param.setLn(true);
        param.setDemandCurveFunction(new LinearFunction(2, 1));
        assertEquals(0.5f * Math.log(2), param.valueFor(2.0f), 0.0001f);
    }

    @Test
    void testValueForZeroElasticity() {
        ParameterAttributes param = new ParameterAttributes();
        param.setElasticity(0.0f);
        param.setLn(false);
        param.setDemandCurveFunction(new LinearFunction(2, 1));
        assertEquals(0.0f, param.valueFor(2.0f), 0.0001f);
    }

    @Test
    void testValueForZeroFunction() {
        ParameterAttributes param = new ParameterAttributes();
        param.setElasticity(0.5f);
        param.setLn(false);
        param.setDemandCurveFunction(new LinearFunction(0, 0));
        assertEquals(0.0f, param.valueFor(2.0f), 0.0001f);
    }

    @Test
    void testValueForNegativeInput() {
        ParameterAttributes param = new ParameterAttributes();
        param.setElasticity(0.5f);
        param.setLn(false);
        param.setDemandCurveFunction(new LinearFunction(2, 1));
        assertEquals(0.0f, param.valueFor(-2.0f), 0.0001f);
    }

    @Test
    void testValueForSocialParameter() {
        ParameterAttributes param = new ParameterAttributes();
        param.setElasticity(0.5f);
        param.setLn(false);
        param.setSocial(true);
        param.setDemandCurveFunction(new LinearFunction(2, 1));
        assertEquals(0.5f * Math.log(2), param.valueFor(2.0f), 0.0001f);
    }

    @Test
    void testValueForSocialParameterWithSocialFunction() {
        ParameterAttributes param = new ParameterAttributes();
        param.setElasticity(0.5f);
        param.setLn(false);
        param.setSocial(true);
        param.setDemandCurveFunction(new LinearFunction(2, 1));
        param.setSocialFunction(new LinearFunction(2, 1));
        assertEquals(0.5f * Math.log(2), param.valueFor(2.0f), 0.0001f);
    }

    @Test
    void testValueForSocialParameterWithZeroSocialFunction() {
        ParameterAttributes param = new ParameterAttributes();
        param.setElasticity(0.5f);
        param.setLn(false);
        param.setSocial(true);
        param.setDemandCurveFunction(new LinearFunction(2, 1));
        param.setSocialFunction(new LinearFunction(0, 0));
        assertEquals(0.0f, param.valueFor(2.0f), 0.0001f);
    }

    @Test
    void testValueForSocialParameterWithNegativeInput() {
        ParameterAttributes param = new ParameterAttributes();
        param.setElasticity(0.5f);
        param.setLn(false);
        param.setSocial(true);
        param.setDemandCurveFunction(new LinearFunction(2, 1));
        param.setSocialFunction(new LinearFunction(2, 1));
        assertEquals(0.0f, param.valueFor(-2.0f), 0.0001f);
    }

    @Test
    void testValueForSocialParameterWithZeroElasticity() {
        ParameterAttributes param = new ParameterAttributes();
        param.setElasticity(0.0f);
        param.setLn(false);
        param.setSocial(true);
        param.setDemandCurveFunction(new LinearFunction(2, 1));
        param.setSocialFunction(new LinearFunction(2, 1));
        assertEquals(0.0f, param.valueFor(2.0f), 0.0001f);
    }

    @Test
    void testValueForSocialParameterWithLn() {
        ParameterAttributes param = new ParameterAttributes();
        param.setElasticity(0.5f);
        param.setLn(true);
        param.setSocial(true);
        param.setDemandCurveFunction(new LinearFunction(2, 1));
        param.setSocialFunction(new LinearFunction(2, 1));
        assertEquals(0.5f * Math.log(2), param.valueFor(2.0f), 0.0001f);
    }
}