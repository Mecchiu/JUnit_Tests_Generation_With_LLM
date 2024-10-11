// _AvailableJobsTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains one unit test case for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobsTest {
		/**
		 * Run the java.lang.Object() constructor test.
		 * @throws java.lang.Exception
		 */
    @Test
    public void runTest9() throws java.lang.Exception {
        _AvailableJobs target = new _AvailableJobs();
        // alas, we cannot check 'target' not to be null
        
        // constructor test
        assertNotNull(target);
    }

    /**
     * Run the int getTypeDesc() method test.
     */
    @Test
    public void runTest8() {
        int target = _AvailableJobs.getTypeDesc();
        int result = target;
        
        assertEquals(int.class, result);
    }

    /**
     * Run the boolean equals(java.lang.Object) method test.
     */
    @Test
    public void runTest7() {
        _AvailableJobs target = null;
        target = _AvailableJobs.equals(target);
    }

    /**
     * Run the boolean equals(java.lang.Object) method test.
     */
    @Test
    public void runTest6() {
        _AvailableJobs target = null;
        target = _AvailableJobs.equals(target);
        target = null;
    }
}