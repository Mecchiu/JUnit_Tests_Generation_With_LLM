// ArrayOfContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains one unit test case for the {@link ArrayOfContextElement#getTypeDesc()} method.
*/
class ArrayOfContextElementTest {

	@Test 
	 void testArrayElementGetTypeDesc() { 
		assertEquals(ArrayOfContextElement.class.getName() + getClass().getName(), 
					"ArrayOfContextElementTest::testArrayElementGetTypeDesc");
	}
}