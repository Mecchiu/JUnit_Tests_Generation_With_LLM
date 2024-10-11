// CaptureTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Capture}.
* It contains one unit test case for the {@link Capture#init()} method.
*/
class CaptureTest {
/**   
*     * @summary Test of the constructor.
*     */
	@Test
    void testDV_Capture() throws Exception {
    	// Create an instance of Capture
    	Capture dv_capture = new Capture();
    	// Use a test instance for the test


        // check result
        assertEquals("DV test passed", true,dv_capture.init());
    }


    /**   
*     * @summary Test of the destructor.
*     */
	@Test
    void testDV_Capture_dvr() throws Exception {
    	// Create an instance of Capture
    	Capture dv_capture = new Capture();
    	// Run the test
    	dv_capture.run();
    }
}

// Capture.java


