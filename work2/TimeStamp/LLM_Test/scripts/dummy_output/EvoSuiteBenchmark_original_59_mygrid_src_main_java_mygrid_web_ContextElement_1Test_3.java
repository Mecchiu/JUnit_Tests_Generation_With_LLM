// ContextElement_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains one unit test case for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElement_1Test {
		
	@Test
	public void testGetTypeDesc() {
		assertNotNull(new ContextElement().getTypeDesc());
	}
}