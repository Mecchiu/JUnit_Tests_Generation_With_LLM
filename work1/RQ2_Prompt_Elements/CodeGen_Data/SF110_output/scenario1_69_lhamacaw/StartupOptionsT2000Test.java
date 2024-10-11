// StartupOptionsTest.java
package macaw.system;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartupOptions}.
* It contains one unit test case for the {@link StartupOptions#useDemo()} method.
*/
class StartupOptionsTest {

	/**
	* Test of initialize method, of class {@link StartupOptions}.
	*/
    @Test
    public void testInitialize() {
        System.out.println("Use demo");
        StartupOptions options = new StartupOptions();
        System.out.println("Use demo:" + options.useDemo());
        assertTrue("useDemo value should be true", options.useDemo());
    }
}
