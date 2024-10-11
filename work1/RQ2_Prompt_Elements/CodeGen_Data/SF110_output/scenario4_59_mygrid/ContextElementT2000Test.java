// ContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains one unit test case for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElementTest {

	@javax.xml.ws.Holder
	public ContextElementHolder holder = new ContextElementHolder();

	@Test
	public void testGetTypeDesc() {
		assertNotNull(ContextElement.getTypeDesc());
	}
	
}
