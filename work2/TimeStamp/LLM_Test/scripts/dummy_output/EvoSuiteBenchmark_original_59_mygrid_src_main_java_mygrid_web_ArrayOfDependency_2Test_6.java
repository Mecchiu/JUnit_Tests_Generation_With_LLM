// ArrayOfDependency_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependency_2Test {
		
	int[] dependency = new int[] {2};
	
	String getTypeDesc() {
		//return null to test deserialization of empty array
		return null;
	}

	/**
	 * Initialize the test with a test data.
	 */
	@Test
	public void test1getTypeDesc() {
		
		assertEquals(ArrayOfDependency.class, ArrayOfDependency_2Test.dependency.getTypeClass());
		assertEquals(javax.xml.namespace.QName.class, ArrayOfDependency_2Test.dependency.getTypeQNameClass());
		assertEquals(java.lang.String.class, ArrayOfDependency_2Test.dependency.getDependencyClass());
		assertEquals(int.class, ArrayOfDependency_2Test.dependency.getTypeClass());
		assertEquals(int[].class, ArrayOfDependency_2Test.dependency.getDependencyClass());
	}
	
}