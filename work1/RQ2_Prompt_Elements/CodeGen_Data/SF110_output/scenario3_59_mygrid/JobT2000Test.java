// JobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Job}.
* It contains one unit test case for the {@link Job#getTypeDesc()} method.
*/
class JobTest {

	/**
	 * Test method for {@link Job#getTypeDesc()}.
	 */
	@Test
    public void testGetTypeDesc() {
        assertEquals(com.myGrid.web.Job.class.getCanonicalName(),
                JobTest.getTypeDesc());
    }


}