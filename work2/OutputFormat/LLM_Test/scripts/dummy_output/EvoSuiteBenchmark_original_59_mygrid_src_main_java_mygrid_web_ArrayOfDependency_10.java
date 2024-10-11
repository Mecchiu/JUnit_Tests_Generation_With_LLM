// ArrayOfDependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependencyTest {
		
    @Test
    public void test() {
        ArrayOfDependency dependency = new ArrayOfDependency();
        assertEquals("getTypeDesc", dependency.getTypeDesc());
    }
}