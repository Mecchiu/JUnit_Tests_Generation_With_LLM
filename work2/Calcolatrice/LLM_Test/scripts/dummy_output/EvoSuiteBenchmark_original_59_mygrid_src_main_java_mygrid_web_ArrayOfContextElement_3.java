// ArrayOfContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains one unit test case for the {@link ArrayOfContextElement#getTypeDesc()} method.
*/
class ArrayOfContextElementTest {
		
	@Test
	public void testGetTypeDesc() {
		ArrayOfContextElement obj = new ArrayOfContextElement();
		obj.add(new ContextElement());
		obj.setTypeDesc(new TypeDesc());
		assertEquals(obj.getTypeDesc().getValue(), 1);
	}
}