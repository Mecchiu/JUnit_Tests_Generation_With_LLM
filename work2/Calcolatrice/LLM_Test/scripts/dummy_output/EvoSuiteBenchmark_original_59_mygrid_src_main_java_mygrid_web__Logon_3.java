// _LogonTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains one unit test case for the {@link _Logon#getTypeDesc()} method.
*/
class _LogonTest {
		
private static java.lang.String clusterUrl;

    private static java.lang.String user;

    private static java.lang.String password;

    /**
     * This method applies all modifications to the test object.
     * <br>It runs the {@code @After} annotation. It then returns the instance.
     * <br>It executes each test case asynchronously. It then returns a
     * value.
     * @throws java.lang.Exception
     */
    @Test
    void testLogon() throws java.lang.Exception {
        
        try {
            // do before each test method
            
            clusterUrl = mygrid.web.cluster.clusterUrl();
            user = mygrid.web.username;
            password = mygrid.web.password;

            // do after each test method

            // do other tests

            
        }
        catch(Exception e) {
            assertNotNull(e);
        }
    }
    
}