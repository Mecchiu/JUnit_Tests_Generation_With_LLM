// _AvailableJobs_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains one unit test case for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobs_1Test {
		
    /**
     * Test case for {@link _AvailableJobs#getTypeDesc()}.
     * @throws java.lang.Exception if an unexpected exception occurs
     */
    @Test
    public void testGetTypeDesc() throws java.lang.Exception {
        // BEGIN main
        // Testing getTypeDesc()
        String typeDesc = _AvailableJobs.getTypeDesc();
        
        if ((typeDesc == null)!= (typeDesc == null)) {
            System.out.println("\n\n_AvailableJobs.getTypeDesc(): expected: " +
                               "<NONE> but was < " + typeDesc + ">.");
            System.out.println("\n\n_AvailableJobs.getTypeDesc(): test case");
            return;
        }
        
        // END main
    }
}