// ContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains one unit test case for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElementTest {

	/**
	 * Test case for {@link ContextElement#getTypeDesc()} method
	 * The {@link ContextElement#getTypeDesc()} method returns an instance of
	 * class {@link ContextElement}.
	 * It has not been designed to have many tests.
	 * The test fails if a {@link ClassNotFoundException} is thrown by
	 * the method getTypeDesc, and that this cause
	 * was never caught.
	 */
	@Test
	public void testGetTypeDesc() {
		if (null!= ContextElement.class) {
			org.apache.axis.description.TypeDesc result =
				ContextElement.getTypeDesc();
			assertNull(result);
		}
	}
}

// End of ContextElementTest.java
