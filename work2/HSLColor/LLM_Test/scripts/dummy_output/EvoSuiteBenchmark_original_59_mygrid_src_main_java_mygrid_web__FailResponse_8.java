// _FailResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains one unit test case for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponseTest {
		
	@java.lang.SuppressWarnings("all")
    public _FailResponseTest(
		java.lang.String testName
    ) {
        this.testName = testName;
	}

	final java.lang.String testName;

    /**
     * Test method for {@link mygrid.web._FailResponse#getTypeDesc()}.
     */
    @Test
    public void testGetTypeDesc() {
        java.lang.String returnValue = _FailResponse.getTypeDesc();
        if (returnValue == null || returnValue.length() == 0) {
            assertEquals(java.lang.String.class.getCanonicalName(), (java.lang.String) returnValue);
        }
    }

}