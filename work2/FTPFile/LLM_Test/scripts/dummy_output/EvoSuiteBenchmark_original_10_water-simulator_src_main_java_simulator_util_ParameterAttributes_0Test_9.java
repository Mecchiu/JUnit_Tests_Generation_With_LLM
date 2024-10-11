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
     * @throws Exception
     */
    @Test
    public void valueFor_1Float() throws Exception {
        ParameterAttributes_0 value = new ParameterAttributes_0();
        value.setName("name_0");
        value.setElasticity(new Float(1.0));
        value.setLn(Boolean.FALSE);
        Float f = valueFor(1);
        assertFalse(Float.isNaN(f));
        assertTrue(f.compareTo(new Float(0.0)) == 0);
    }
	/**
* @throws Exception
*/
    @Test
    public void valueFor_2Float() throws Exception {
        ParameterAttributes_0 value = new ParameterAttributes_0();
        value.setName("name_0");
        value.setElasticity(new Float(1.0));
        value.setLn(Boolean.FALSE);
        Float f = valueFor(2);
        assertFalse(Float.isNaN(f));
        assertTrue(f.compareTo(new Float(0.0)) == 0);
    }
	/**
* @throws Exception
*/
    @Test
    public void valueFor_3Float() throws Exception {
        ParameterAttributes_0 value = new ParameterAttributes_0();
        value.setName("name_0");
        value.setElasticity(new Float(1.0));
        value.setLn(Boolean.FALSE);
        Float f = valueFor(3);
        assertFalse(Float.isNaN(f));
        assertTrue(f.compareTo(new Float(0.0)) == 0);
    }
	/**
* @throws Exception
*/
    @Test
    public void valueFor_5Float() throws Exception {
        ParameterAttributes_0 value = new ParameterAttributes_0();
        value.setName("name_0");
        value.setElasticity(new Float(11.11));
        value.setLn(Boolean.FALSE);
        Float f = valueFor(5f);
        assertFalse(Float.isNaN(f));
        assertTrue(f.compareTo(new Float(11.1)) == 0);
    }
	/**
* @throws Exception
*/
    @Test
    public void valueFor_6Float() throws Exception {
        ParameterAttributes_0 value = new ParameterAttributes_0();
        value.setName("name_0");
        value.setElasticity(new Float(11.11));
        value.setLn(Boolean.FALSE);
        Float f = valueFor(6f);
        assertFalse(Float.isNaN(f));
        assertTrue(f.compareTo(new Float(11.1)) == 0);
    }
	/**
* @throws Exception
*/
    @Test
    public void valueFor_9Float() throws Exception {
        ParameterAttributes_0 value = new ParameterAttributes_0();
        value.setName("name_0");
        value.setElasticity(new Float(11.11));
        value.setLn(Boolean.FALSE);
        Float f = valueFor(9f);
        assertFalse(Float.isNaN(f));
        assertTrue(f.compareTo(new Float(11.1)) == 0);
    }
	/**
* @throws Exception
*/
    @Test
    public void valueFor_11Float() throws Exception {
        ParameterAttributes_0 value = new ParameterAttributes_0();
        value.setName("name_0");
        value.setElasticity(new Float(0.0));
        value.setLn(Boolean.FALSE);
        Float f = valueFor(11f);
        assertFalse(Float.isNaN(f));
        assertTrue(f.compareTo(new Float(0.0)) == 0);
    }
	/**
* @throws Exception
*/
    @Test
    public void valueFor_21Float() throws Exception {
        ParameterAttributes_0 value = new ParameterAttributes_0();
        value.setName("name_0");
        value.setElasticity(new Float(0.0));
        value.setLn(Boolean.FALSE);
        Float f = valueFor(21f);
        assertFalse(Float.isNaN(f));
        assertTrue(f.compareTo(new Float(0.0)) == 0);
    }
	/**
* @throws Exception
*/
    @Test
    public void valueFor_22Float() throws Exception {
        ParameterAttributes_0 value = new ParameterAttributes_0();
        value.setName("name_0");
        value.setElasticity(new Float(0.0));
        value.setLn(Boolean.FALSE);
}
}