// ContextElement_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains one unit test case for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElement_1Test {
		/**
		* Creating a new instance of {@link ContextElement_1Test}.
		*/
	@Test
	public void test_0() {
	ContextElement_1Test result = new ContextElement_1Test();
	result.set_name(null);
	assertNull(result.getName());
	assertEquals(0, result.getTypeDesc().getIndex());
	}
	
}