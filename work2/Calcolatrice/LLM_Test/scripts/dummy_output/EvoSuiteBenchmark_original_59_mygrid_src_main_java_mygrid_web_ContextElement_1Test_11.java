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
     * Test method for {@link ContextElement#getName()}.
     */
    @Test
    public void testGetName() {
        ContextElement ce = new ContextElement();
        javax.xml.namespace.QName type = new javax.xml.namespace.QName("http://tempuri.org/", "type");
        assertNotNull(type);
        ce.getName();
        assertFalse(type.equals(ce.getName()));
    }

    
    /**
     * Test method for {@link ContextElement#getName()}.
     */
    @Test
    public void testGetName_2() {
        javax.xml.namespace.QName type = new javax.xml.namespace.QName("http://tempuri.org/", "type");
        ContextElement ce = new ContextElement();
        
        try {
            ce.getName();
            fail("Expected IllegalArgumentException.");
        } catch (java.lang.IllegalArgumentException ex) {
            // ignored
        }
        
        ce.getName("");
        assertFalse(type.equals(ce.getName("")));
        assertFalse(type.equals(new javax.xml.namespace.QName("http://tempuri.org/", "type")));
    }
}