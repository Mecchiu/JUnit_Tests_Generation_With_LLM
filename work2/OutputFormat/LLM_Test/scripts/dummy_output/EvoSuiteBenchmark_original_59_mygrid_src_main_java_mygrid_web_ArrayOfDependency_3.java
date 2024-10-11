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
	 * Test case for getTypeDesc
	 */
	@Test
    public void getTypeDescTest() {
        ArrayOfDependency dep1 = new ArrayOfDependency();
        dep1.setDependency(new int[] {1});
        assertEquals(dep1.getTypeDesc().getValue(),dep1.getDependency()[0].getValue());
    }

}