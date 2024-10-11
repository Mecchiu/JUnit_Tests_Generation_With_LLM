// _RequestTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains one unit test case for the {@link _Request#getTypeDesc()} method.
*/
class _RequestTest {
private mygrid.web.Job _getTypeDescTest;

    /**
     * Set up method test
     * @throws java.lang.Exception if the setup was not successful
     */
    @Test
    public void test() throws java.lang.Exception {
        _getTypeDescTest = new mygrid.web.Job();
        assertSame("getJob", _getTypeDescTest.getType(), getTypeDesc());
    }

    /**
     * Verify method's parameter type, it is {@link _Request}.
     */
    @Test
    public void testTypeDesc() {
        assertEquals("setJob", "mygrid.web.Job", _getTypeDescTest.getTypeDesc().name());
    }

    /**
     * Test if {@link _Request#get_Job()} is the value for {@link _Request#getTypeDesc()}.
     * Check it is the same object {@link mygrid.web.Job}.
     */
     @Test
     public void testJob() {
          _getTypeDescTest = new mygrid.web.Job();     
         assertSame("_Job", _getTypeDescTest.get_Job(), _getTypeDescTest.getType());
     }
}