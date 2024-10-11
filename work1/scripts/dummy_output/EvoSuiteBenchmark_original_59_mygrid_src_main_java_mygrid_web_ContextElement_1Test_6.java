// ContextElement_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains one unit test case for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElement_1Test {
		
	private ContextElement testObject;
	
	/**
	 * set testObject to a non-null value
	 * If you are only interested in the type desc, return "this.getTypeDesc()"
	 */
	@Test
	public void testGetTypeDesc() {
			testObject = new ContextElement_1Test();
			assertEquals("getTypeDesc() returns TypeDesc.", ContextElement.class, testObject.getTypeDesc());
	}
	
	
	/**
	 * Set the testObject field to a value other then the object initialized in the test
	 * If you are only interested in the type desc, return null
	 */
	@Test
	public void testInvalidConstructor() {
		assertNull("setTestObject to null ", testObject);
	}
}