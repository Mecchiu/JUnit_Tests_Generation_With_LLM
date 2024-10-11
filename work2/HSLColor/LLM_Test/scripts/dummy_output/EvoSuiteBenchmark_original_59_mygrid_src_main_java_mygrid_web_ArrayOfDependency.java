// ArrayOfDependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependencyTest {
		
    int expected = 1;
    int actual = 1;
    
    @Test
    public void testGetTypeDesc() {
        ArrayOfDependency target = new ArrayOfDependency();
        String res = target.getTypeDesc();
        assertTrue("The result is null.", res.equals("ArrayOfDependency"));
    }

}