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
    public void test() {
        ContextElement e = new ContextElement();
        assertNotNull("", e.getName());
        assertTrue("isEmpty()",!e.isEmpty());
        assertTrue("equals()", e.equals(new ContextElement(e)));
        
    }
}