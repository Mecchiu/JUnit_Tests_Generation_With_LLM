// ArrayOfDependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependencyTest {
		
    /**
     * Test of getTypeDesc method, of class mygrid.web.ArrayOfDependency.
     */
    @Test
    void testGetTypeDesc() {
        System.out.println("getTypeDesc");
        ArrayOfDependency instance = null; 
        ArrayOfDependency expected = null;
        
        instance = new ArrayOfDependency();
        expect(instance.getTypeDesc()).andReturn(expected.getTypeDesc());
       
        instance = new ArrayOfDependency();
        expect(instance.getTypeDesc()).andReturn(expected.getTypeDesc());
        
        System.out.println("test");
        ArrayOfDependency instance2 = new ArrayOfDependency();
      
    }
    
}