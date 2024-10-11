// ArrayOfDependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependencyTest {
private static final long serialVersionUID = 1L;
	@Test
	  public void testGetTypeDesc() {
		assertEquals(typeDesc, ArrayOfDependency.getTypeDesc());
	}
}



