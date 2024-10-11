// _Progress_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains one unit test case for the {@link _Progress#getTypeDesc()} method.
*/
class _Progress_1Test {
		private static final double __value = 0.0;
		private static final double __expected = 0.0;
	
	/**
	 * Calls the {@link _Progress#getTypeDesc()} method on this object.
	 *
	 * @return the typeDesc
	 */	
	java.lang.String __getTypeDesc() {
		return __this.getTypeDesc();
	}
	

	/**
	 * Class constructor
	 */	
	_Progress_1Test(char[] value, java.lang.String name, java.lang.String sType) {
		this.__class__ = value;
		this.__name__ = name;
		this.__sType__ = sType;	
	}
	
	/**
	 * Tests the class's attributes
	 * @throws java.lang.Exception
	*/
	@Test
	void testClassAttributes() throws java.lang.Exception {
		
		assertNotNull("__class__ field", this.__class__);
		assertNotNull("__value field", this.__value);
		assertEquals("__typeDesc field", this.getTypeDesc(), this.__class__);
		
	} 
	/**
	 * Runs the getTypeDesc method of this object.
	 */
	public void testGetTypeDesc() throws Exception {
		
		assertEquals("Not the class", this.__sType__, this.__class__);
		
	}





	private java.lang.String __class__;
	private java.lang.String __name__;
	private java.lang.String __sType__;
}