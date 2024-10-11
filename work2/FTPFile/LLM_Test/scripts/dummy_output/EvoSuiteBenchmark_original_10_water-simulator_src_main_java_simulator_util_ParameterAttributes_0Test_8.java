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
         * Unit test that tests if the input parameter has the right value for the value method.
         * Here we are interested in
         *   1.  When the input parameter is social
         *   2.  When the input value is a float number
         *   3.  When the input value is the sum of weights
         *   4.  When it is the sum of weights of the social values
         * @see <a
         * href=https://github.com/p-bouyazir/P-Bouyaz-Sim/blob/master/Tester/P-Bouyaz-Sim-Utilities/ParameterSources/P-ParameterSources/P-Parameters/ParameterSources.test">ParameterSource.setToValue<a/>
         */
    private static int id = 0;

        /**
         * @see Serializable
         */
	@Test
    public void test() {
        ParameterAttributes object = new ParameterAttributes();

        object.setName("Step"+id);
        assertEquals("Step"+id, object.getName());
        object.setElasticity(new Float(8));
        assertEquals("[8]"+id, object.getElasticity().toString());

        object.setLn(Boolean.TRUE);
        assertTrue(object.getLn() == Boolean.TRUE);

        object.setSocial(Boolean.TRUE);
        boolean b_SocialValue = (object.getSocial() == Boolean.TRUE);
        //assertTrue("[b_SocialValue] "+b_SocialValue, b_SocialValue);
        
        object.setSocial(false);
        boolean b_SocialValue = (object.getSocial() == Boolean.FALSE);
        //assertTrue("[b_SocialValue] "+b_SocialValue, b_SocialValue);

        String value = object.valueFor(0);
        float expected = (float) -10;
        assertEquals("Incorrect value!", expected, value);
        
        value = object.valueFor(5);
        assertEquals("Incorrect result!", new Float(5), value);

        value = object.valueFor(10);
        assertEquals("Incorrect result!", new Float(5.7), value);

        object.setStepId(id);
        value = object.valueFor(0);
        expected = (float) -10;
        assertEquals("Incorrect value", expected, value);
        
        value = object.valueFor(5);
        expected = (float) -5;
        assertEquals("Incorrect value", expected, value);
        
        value = object.valueFor(10);
        expected = new Float(5.7);
        assertEquals("Incorrect result", expected, value);
        
        assertFalse(Double.isNaN(expected));
 
        value = object.valueFor(12);
        expected = new Float(12);
        expected = object.valueFor(12);
        assertEquals("Incorrect result!", expected, value);
    }
}