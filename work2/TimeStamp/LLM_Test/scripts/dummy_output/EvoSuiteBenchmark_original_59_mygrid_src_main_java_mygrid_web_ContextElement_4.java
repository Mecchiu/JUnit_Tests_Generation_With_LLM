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
       assertNotNull(ContextElement.typeDesc);
    }

    @Test
    public void test0() {
        final ContextElement ce = new ContextElement();
        assertNotNull(ce.getName());
        ContextElement.typeDesc = ContextElement.getTypeDesc();
        assertNotNull(ce.getName());
    }

 }