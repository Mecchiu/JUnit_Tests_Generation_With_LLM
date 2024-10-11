// ContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains one unit test case for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElementTest {
		
        @Test
        public void testGetTypeDesc() {
		String _content = "My Content";
		ContextElement _expected = new ContextElement();
		ContextElement _actual;
		_expected.setName("My Content");
		String _content = _expected.getContent();
        
}
}