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
     * Returns the name of the test.
     */
    static String getTestName() {
        String name = "cap";
        return name;
    }
    
    /**
     * Test the {@link Capture#DV_Capture()} method
     */
    @Test
    public void test_dvCapture() {
        // Verify the base error message is still present.
        JOptionPane.showMessageDialog(null, this.m_BaseErr);

        // We cannot test the error here, because in test case we don't need the VM running
        
        // Create a variable to store the initial error code
        int initialError = 0;
        
        String inputFile = "";
        String outputFile = "";
        int count = 0;

        boolean captureResult = m_GUI.CAPTURE_OPEN;
        String captureError = m_GUI.CAPTURE_OPEN_ERR;
        String captureInfo = m_GUI.CAPTURE_INFO;
        
        
        // Get the number of seconds that we should wait before capturing
        // This should only pass if the value passed in is positive.
        if (m_Seconds > 0) {
            captureResult = m_GUI.CAPTURE;

            try{
                m_Seconds++;
            } catch (Exception e){
                 assert(false );
            }
        }
        
        // Start the capturing
        m_Thread = new Thread(this);
        try {
            m_Thread.start();
        } catch (Exception e) {
            assert(false);
        }

        // Get the capture info from the GUI
        try{
            captureInfo = m_GUI.CAPTURE_INFO_OUT;

            if (m_Seconds > 0){
                count = StringTokenizer.countTokens(captureInfo, ',', "\n",  ',');
            }
        }
        catch (FileNotFoundException e){
            assert(false);
        }
        
        // Stop the capturing
        m_GUI.CAPTURE_CLOSE;

        if (captureResult == true) {
            assert(captureInfo.equals("0"));

            // Capture the file.  Should stop at the end of the file and check it to see if
            // the file was consumed or not.
            do {
                inputFile = JOptionPane.showInputDialog(null, "Input File", "Input File");
                // If we don't have an input file set to 'N/A'
                if (inputFile.equals("")) {
                    inputFile = "N/A";
                }
                
                // If this line will fail during Capture (i.e. we didn't receive
                // any audio, video, or error streams)
                if (StringTokenizer.countTokens(inputFile, "\n") == 0){
                    m_Thread.interrupt();
                    assert(m_GUI.CAPTURE_FAILED);
                    m_Thread.join();
                    break;
                }

                File myfile = new File(inputFile);

                // Get the data from the reader and writer
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(myfile), "ISO-8859-1"));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

                String lineRead = null;

                // Read the line by line until we get to the end of the file
                while ((lineRead = reader.readLine())!= null) {
                    writer.write(lineRead + "\n");
                    writer.flush();
                }
                reader.close();
                writer.close();
                
                try {
                    m_GUI.CAPTURE_DONE;
                } catch (IOException e) {
                    m_GUI.CAPTURE_FAILED;
                }

                // Stop capturing
                m_GUI.CAPTURE_CLOSE;
            }
            while ( count > 0);
        } else {
            // The input file does not exist so we should get the initial error.
            assertEquals(captureError, m_BaseErr);
        }

        // Save the capture error to the screen
        try{
            JOptionPane.showMessageDialog(null, captureError);
        } catch (Exception e){
            assertTrue(false);
        }
    }

    /**
     * This method tests the functionality of the Capture object.
     */

    @Test
    public void test_Capture() {

        // Make sure the GUI is up-to-date.
        // It is important to test this as well as the error code since
        // as such, test_Capture may be failing in a race condition between the thread and the GUI.
        assertEquals(m_GUI.CAPTURE_DONE, 0);
        assertEquals(m_GUI.CAPTURE_OPEN, 0);

        // Start the capturing
        m_GUI.CAPTURE_OPEN;

        // Capture the error with no error message
        DV_Capture();

        // Change the capture error message
        m_GUI.CAPTURE_OPEN_ERR = m_GUI.CAPTURE_WAIT_ERR;

        // Capture the error
        DV_Capture();

        // Change the capture error message again, but with no "error" message
        m_GUI.CAPTURE_OPEN_ERR = m_GUI.CAPTURE_WAIT_ERR;
        // Capture should terminate when we capture.  To test failure condition,
        //
}
}