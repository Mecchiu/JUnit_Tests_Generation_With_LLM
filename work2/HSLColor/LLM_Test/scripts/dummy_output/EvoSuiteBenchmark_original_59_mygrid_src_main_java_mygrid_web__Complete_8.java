// _CompleteTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains one unit test case for the {@link _Complete#getTypeDesc()} method.
*/
class _CompleteTest {
		public _CompleteTest(mygrid.web.Job job) {
	}
    /**
     * Tests the {@link _Complete#getTypeDesc()} method with each test case in the constructor as parameter.
     */
    @Test
    public void testAll() {
		try {
			_Complete.getTypeDesc();
			fail("An exception should have been thrown");
		} catch(org.junit.jupiter.api.Assertions.Failures) {
    		// do nothing
        }
    }

}