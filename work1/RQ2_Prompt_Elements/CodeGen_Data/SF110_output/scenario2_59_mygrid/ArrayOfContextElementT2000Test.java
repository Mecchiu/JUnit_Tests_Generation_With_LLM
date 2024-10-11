// ArrayOfContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains one unit test case for the {@link ArrayOfContextElement#getTypeDesc()} method.
*/
class ArrayOfContextElementTest {

	/**
	* Call {@link ArrayOfContextElement#getTypeDesc()} method from outside test class
	* via parameterized @Test
	* Assertions of type {@link Object}
	*/
	@Test
	public void testCtxEleOne() {
		assertNotNull(ArrayOfContextElement.getTypeDesc().getValue());
	}


	/**
	* Call {@link ArrayOfContextElement#toString()} method from outside test class
	* via parameterized @Test
	* Assertions of type {@link String}
	*/
	@Test
	public void testStringOne() {
		assertNotNull(ArrayOfContextElement.toString().trim());
	}
}
