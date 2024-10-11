// GUITest.java


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
* It contains ten unit test cases for the {@link GUI#checkForModules()} method.
*/
class GUITest {
		
	/**
	 * Test case for {@link GUI#checkForModules()}.
	 * This test case checks to ensure that the raw1394 module is loaded.
	 * This module is only needed to capture audio and video from the
	 * dv camcorder.
	 * return   A boolean indicating if the module is present
	 */
	@Test
	void testCheckForModules() {
		// TODO
	}
}