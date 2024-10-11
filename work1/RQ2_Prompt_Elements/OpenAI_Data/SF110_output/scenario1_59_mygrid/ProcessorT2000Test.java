// ProcessorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Processor}.
* It contains ten unit test cases for the {@link Processor#getTypeDesc()} method.
*/
class ProcessorTest {

	/**
	* Test case for {@link Processor#getTypeDesc()} method.
	* It tests the method with the following assertions:
	* <ul>
	* 	<li>The method returns a non-null value.</li>
	* </ul>
	*/
	@Test
	void testGetTypeDesc() {
		assertNotNull(Processor.getTypeDesc());
	}
}