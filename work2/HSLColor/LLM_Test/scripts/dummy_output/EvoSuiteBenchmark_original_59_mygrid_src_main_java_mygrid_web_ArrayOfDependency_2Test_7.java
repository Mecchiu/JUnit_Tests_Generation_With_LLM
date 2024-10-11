// ArrayOfDependency_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependency_2Test {
		ArrayOfDependency_2Test() {
		}
		
	/**
	* Test getting the type description.
	*/
	@Test
	public void testGetTypeDesc() {
		ArrayOfDependency x = new ArrayOfDependency();
		assertNotNull(x.getTypeDesc());
	}
}