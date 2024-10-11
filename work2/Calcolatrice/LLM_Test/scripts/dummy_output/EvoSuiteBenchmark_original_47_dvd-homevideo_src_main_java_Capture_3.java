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
         *
         */
        public CaptureTest() {
        }

		/**
         * @return  The value of "Minutes" as a string
         */
        protected String getMin() {
            return String.valueOf(m_Minutes);
        }

		/**
         * @return  The value of "Seconds" as a string
         */
        protected String getSeconds() {
            return String.valueOf(m_Seconds);
        }

		/**
         * @return  The value of "GUI" as a String
         */
        protected String getGUIText() {
            return String.valueOf(m_GUI);
        }

        /**
         * Check constructor that takes the Min/Sec/Time
         */
        @Test
        public void checkConstructor() {
            assertNotNull(() -> new CaptureTest());
            assertNotNull(() -> new Capture(3000, 0, null)); // 0 minutes
            assertNotNull(() -> new Capture(3001, 0, null)); // 0 seconds
            assertNotNull(() -> new Capture(3000, 1, null)); // 1 minute
            assertNotNull(() -> new Capture(3000, 2, null)); // 2 minutes
            assertNotNull(() -> new Capture(3000, 5, null)); // 5 minutes
        }

        /**
         * Run tests
         */
        public void run() {
            assertNotNull(() -> new CaptureTest());
            assertNotNull(() -> new Capture(3001, 5, null)); // 5 min
            assertNotNull(() -> new Capture(3002, 0, null)); // 2 min
            assertNotNull(() -> new Capture(3003, 7, null)); // 7 min
            assertNotNull(() -> new Capture(3004, 6, null)); // 6 min
        }
}

class DVGUITest extends CaptureTest {

    @Test
    public void videoCapture() throws Exception {
        String filename = getGUIText();

        File file = new File(filename);
        File dir = file.getParentFile();
        String sdir = "";
        String ext = ".0.0";

        // The test should not throw a.0 exception.
        m_GUI = new GUI();
        m_GUI.start();
        String s = "";

        // Read the camcorder input from the video file
        BufferedReader vReader = new BufferedReader(
            new InputStreamReader(
                new FileInputStream(filename)));

        String vLine;
        // Read until end of stream (\n)
        while((vLine = vReader.readLine())!= null){
            s += vLine + "\n";
        }
        vReader.close();

        String vout = null;
        String vlast_vout = null;

}
}