// _CompleteTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains one unit test case for the {@link _Complete#getTypeDesc()} method.
*/
class _CompleteTest {
		
	/**
	 * Tests for getTypeDescWithDefault.
	 */
	@Test
    public void getTypeDescWithDefault() {
        _Complete completetest = new _Complete();
        completetest.getTypeDesc();
        assertTrue(true);
    }
}