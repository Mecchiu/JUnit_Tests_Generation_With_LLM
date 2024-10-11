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
* Test method for {@link ContextElement#getTypeDesc()}.
*/
@Test
    public void testGetTypeDesc() {
        assertEquals(new org.apache.axis.description.TypeDesc(ContextElement.class), ContextElement.getTypeDesc());
    }

    @Test
    public void testIncorrectArg() {
        try {
            ContextElement.getTypeDesc();
            
        } catch (java.lang.RuntimeException ex) {
            java.lang.String mess = "Error in ContextElement.getTypeDesc()";
            assertTrue(mess, true);
        }
    }

    @Test
    public void testCorrectArg() {
        assertNotNull(ContextElement.getName());
    }

}