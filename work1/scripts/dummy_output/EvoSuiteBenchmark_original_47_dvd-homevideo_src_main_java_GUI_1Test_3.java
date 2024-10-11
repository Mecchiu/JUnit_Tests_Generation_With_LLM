// GUI_1Test.java


//import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileFilter;
import java.awt.Color;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GUI}.
* It contains one unit test case for the {@link GUI#MessageBox(String)} method.
*/
class GUI_1Test {
		/**
		 * Constructor
		 */
    public GUI_1Test() {
    }

    /*
     * @see TestCase#setUp()
     */
    @Test
    public void TestSetup() {
        //
    }

    /**
     * Tests {@link GUI#MessageBox(String)}.
     */
    @Test(timeout=9000)
    public void MessageBox_Test() throws Exception {
        String message;
        int result;

        // Show help
        result = JOptionPane.showOptionDialog(null, "Please enter 1, 2, or -1",
            "Help for 1", JOptionPane.WARNING_MESSAGE, null,
            new String[]{"Help", "OK"},
            "Help");

        Message.Debug(message, 0);
        //TODO: Test
        //assertEquals("message is: \"" + message + "\"",
        //         0,
        //         result);
    } 
}
//
//GUI_2Test.java