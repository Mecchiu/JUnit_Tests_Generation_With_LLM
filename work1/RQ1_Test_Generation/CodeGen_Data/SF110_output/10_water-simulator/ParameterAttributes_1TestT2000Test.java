// ParameterAttributes_1Test.java
package simulator.util;

import java.io.Serializable;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterAttributes}.
* It contains one unit test case for the {@link ParameterAttributes#valueFor(float)} method.
*/
class ParameterAttributes_1Test {

	private static final int DEFAULT_TEST_STEP = 3;
	//Constructor private
	public static final String PARAMETER_NAME = "Parameter" + 
			" Type : " + 
			"Logarithm : " + 
			"Function : " + 
			"Social : ";
	
	//Class private
	private static final String DEFAULT_LOG = "UNKNOWN";

	//Private Members
	private String name;
	private String function;
    
	private Integer step;
        
	/**
	 * Generates constructor of ParameterAttributes. 
	 *
	 */
	public ParameterAttributes_1Test() {
		name = DEFAULT_PARAM_NAME;
		function = null;
        step = DEFAULT_TEST_STEP;

	}
	
	/**
	 * Sets parameters' values. 
	 *
	 * @exception
	 *                  NullPointerException : name is empty.
	 * @exception
	 *                  NoSuchFieldException : Function does not yet exists.
	 * @exception
	 *                  SecurityException : The class won't be accessible.
	 */
	private void set_values() throws SecurityException,
	NoSuchFieldException, NoSuchMethodException {
    	  
		//Private Members
		ParameterAttributes.name = new String();
    	  
		//Private Fields
		ParameterAttributes.function  = new String();
    	  
		//Initial Step
		ParameterAttributes.step = null;
     
    	//Initialize Parameter's name field
    	ParameterAttributes.name = ParameterAttributes_1Test.PARAMETER_NAME;
     
    	//Initialize Parameter's function field
    	ParameterAttributes.function = ParameterAttributes_1Test.function;
     
		checkFunctionDeclaredProperty();               
	}
	
	/**
	 * Test method of ParameterAttributes#valueFor(int).
	 *
	 * This method checks the Parameter's declared property and calls 
	 * <code>parameter.valueFor(int)</code> for input <code>int</code>.
	 *
	 */
	@Test
    public void testIsSocialInteger(){
        assertEquals("The return is always  " + (parameter.valueFor(step).intValue()),
                new Integer(1.),
                new Integer(parameter.valueFor(step).intValue()));
    }
	
	/**
	 * Tests the method with invalid parameters
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testConstructorParams() {
        
        new ParameterAttributes(null, null, 5);
        
    	  
	}
	
	/**
	 * Tests the method with null reference
	 */
	@Test