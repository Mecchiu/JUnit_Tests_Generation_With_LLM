// _CompleteTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains ten unit test cases for the {@link _Complete#getTypeDesc()} method.
*/
class _CompleteTest {
		
	/**
	* Test case for the {@link _Complete#getTypeDesc()} method.
	*/
	@Test
	public void testGetTypeDesc() {
		_Complete _complete = new _Complete();
		assertNotNull(_complete.getTypeDesc());
	}
}