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
    public void getTypeDesc() {
        assertEquals(true,
                     ContextElement.class.isAssignableFrom(ContextElement.class));
    }
}