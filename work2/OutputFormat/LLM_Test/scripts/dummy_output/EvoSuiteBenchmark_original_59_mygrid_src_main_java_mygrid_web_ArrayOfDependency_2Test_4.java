// ArrayOfDependency_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependency_2Test {
		
    /**
     * Test of getTypeDesc method, of class ArrayOfDependency.
     */
    @Test
    public void testGetTypeDesc2() {
        ArrayOfDependency instance = null;
        String expResult = null;
        
        // call the method under test
        instance = instance.getTypeDesc();
        
        // validate the result
        assertNotNull(instance);
        assertEquals(instance.getTypeDesc().ordinal(), instance.getType().ordinal());
        
        
        
    }

}