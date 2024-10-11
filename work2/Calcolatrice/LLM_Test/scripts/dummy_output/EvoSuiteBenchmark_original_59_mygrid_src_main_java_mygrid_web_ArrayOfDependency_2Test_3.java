// ArrayOfDependency_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependency_2Test {
		
	@Test
    public void should_getTypeDesc() {
        String value = new ArrayOfDependency().getTypeDesc();
        assertEquals(value, "ArrayOfDependency");
    }
	
}