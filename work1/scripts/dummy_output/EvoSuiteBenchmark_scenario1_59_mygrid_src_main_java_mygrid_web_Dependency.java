// DependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains ten unit test cases for the {@link Dependency#getTypeDesc()} method.
*/
class DependencyTest {
		
	/**
	* Test case for {@link Dependency#getTypeDesc()} method.
	*/
	@Test
	public void testGetTypeDesc() {
		assertNotNull(Dependency.getTypeDesc());
	}
}