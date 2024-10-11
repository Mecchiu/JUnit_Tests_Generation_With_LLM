// ProcessorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Processor}.
* It contains one unit test case for the {@link Processor#getTypeDesc()} method.
*/
class ProcessorTest {

    /* Class field used by the processor. */
    private Processor processor;
	 
	/**
	 * Constructor Tests. 
	 */
	public ProcessorTest() {
	}
	
	/**
	 * Setter for an instance field.
	 * 
	 * @param processor The processor class from which the processor will be created
	 */
	public void createNew()
	{
		this.processor = new Processor();		
	}
	
	/**
	 * Setter for an instance field.
	 * 
	 * @param newValue The new value of the instance field
	 */
	public void setValue(Object newValue)
	{
		this.processor.setValue(newValue);
	}
	
	/**
	 * Getter to return the processor class.
	 * 
	 * @return The object implementing the {@link Processor} interface.
	 */
	public Object getValue()
	{
		return processor;  
	}
	
	/**
	 * Test the getTypeDesc() method.
	 */
	@Test
	public void testGetTypeDesc()
	{
		processor.setValue("test");
		assertEquals("test", processor.getTypeDesc().getJavaType());  
	}
}
                                               

