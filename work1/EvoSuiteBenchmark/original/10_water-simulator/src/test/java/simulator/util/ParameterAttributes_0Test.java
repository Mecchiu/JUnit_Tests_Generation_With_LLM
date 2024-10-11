package simulator.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParameterAttributes_0Test {

    @Test
    void testValueForStep() {
        ParameterAttributes param = new ParameterAttributes();
        param.setElasticity(2.0f);
        param.setLn(true);
        param.setDemandCurveFunction(new Function() {
            @Override
            public float valueFor(float x) {
                return x * 2;
            }

            @Override
            public String getFunctionName() {
                return "Linear";
            }
        });

        float result = param.valueFor(5);
        assertEquals(2.0f * (float) Math.log(10), result);
    }

    @Test
    void testValueForFloat() {
        ParameterAttributes param = new ParameterAttributes();
        param.setElasticity(1.5f);
        param.setLn(false);
        param.setDemandCurveFunction(new Function() {
            @Override
            public float valueFor(float x) {
                return x * 3;
            }

            @Override
            public String getFunctionName() {
                return "Linear";
            }
        });

        float result = param.valueFor(3.0f);
        assertEquals(1.5f * 9.0f, result);
    }

    @Test
    void testValueForZero() {
        ParameterAttributes param = new ParameterAttributes();
        param.setElasticity(1.0f);
        param.setLn(true);
        param.setDemandCurveFunction(new Function() {
            @Override
            public float valueFor(float x) {
                return 0;
            }

            @Override
            public String getFunctionName() {
                return "Zero";
            }
        });

        assertThrows(Exception.class, () -> param.valueFor(5));
    }
}
