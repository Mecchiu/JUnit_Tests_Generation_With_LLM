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
		
    /** Class Log. */
    private static final Logger log =Logger.getLogger(ParameterAttributes_0Test.class);
	/** Instance. */
    private ParameterAttributes instance;

    /**
     * @return
     * @throws Exception
     */
    @Test
    public void testValueFor() throws Exception {
    	fail("Not yet implemented");
    }
    
    /**
     * @throws Exception
     * @return
     */
	public void setUpInstance() throws Exception {
		instance = new ParameterAttributes();
	}

	/**
	 * Test the valueFor() method of ParameterAttributes.
	 */
	public void testValueFor() {
		fail("Not used");
	}
	
    /**
     * Instantiates a new ParameterAttributes_0Test.
     */
	public ParameterAttributes_0Test() {
        setUpInstance();
	}

	/**
	 * Sets up a test instance.
	 * Set up a ParameterAttributes_0 that has a Parameter attribute called value.
	 * The test values are -1,0.5,1, which are the parameters value for the Demand Curve.
	 */
	public void setUpInstance() {
    }

	/**
	 * Tests the valueFor() method of ParameterAttributes_0 having -1,0.5,1, which are the values in the vector.
	 * Also tests that the valueFor() method of ParameterAttributes_0 returning the -1,0.5,1 values is the expected value for the
	 * function "value".
	 * @throws Exception
	 */
	public void testValueForVec() {
        float expectedValue = -1;
		instance = createInstance("value");
		assertEquals(expectedValue, instance.valueFor(0));
		
		expectedValue = 0;
		assertEquals(expectedValue, instance.valueFor(1));
		
		expectedValue = 0.5f;
		assertEquals(expectedValue, instance.valueFor(2));
        
        expectedValue = 1f;
        assertEquals(expectedValue, instance.valueFor(3));
	}

	/**
	 * Tests the valueFor(int) method of ParameterAttributes_0 returning the -1,0.5,1 values.
	 * Test the valueFor(double) method of ParameterAttributes_0 returning the -1.5,4.99,6 values.
	 * Test the valueFor(float) method of ParameterAttributes_0 returning the -1.5f,4.99f,6 values.
	 * @throws Exception
	 */
	public void testValueForIntDouble() {
        float expectedValue = -1;
		instance = createInstance(4);
		assertEquals(expectedValue, instance.valueFor(0));
		
		expectedValue = 0;
		assertEquals(expectedValue, instance.valueFor(1));
		
		expectedValue = 0.5f;
		assertEquals(expectedValue, instance.valueFor(2));
        
        expectedValue = 1f;
        assertEquals(expectedValue, instance.valueFor(3));
	}

	/**
	 * Tests the valueFor(int, float) method of ParameterAttributes_0 returning the -1.5f,4.99f,6 values.
	 * @throws Exception
	 */
	public void testValueForIntFloat() {
        float expectedValue = -1;
		instance = createInstance(4, 2, 5, 9.99f);
		assertEquals(expectedValue, instance.valueFor(0, 0.5f));
		
		expectedValue = 0.5f;
		assertEquals(expectedValue, instance.valueFor(1, 0.5f));
		
		expectedValue = 1f;
		assertEquals(expectedValue, instance.valueFor(2, 0.5f));
        
        expectedValue = 2f;
        assertEquals(expectedValue, instance.valueFor(3, 0.5f));
	}

	/**
	 * Test method createInstance
	 * @throws Exception
	 */
	public ParameterAttributes_0 createInstance(int valueIndex) {
		instance = new ParameterAttributes(valueIndex);
		return instance;
	}

}