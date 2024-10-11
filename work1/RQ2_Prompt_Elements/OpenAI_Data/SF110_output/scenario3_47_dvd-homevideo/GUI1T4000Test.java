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
* It contains ten unit test cases for the {@link GUI#MessageBox(String)} method.
*/
class GUITest {

	/**
	 * Test case for {@link GUI#MessageBox(String)}
	 * 
	 * @throws IOException
	 */
	@Test
	void testMessageBox() throws IOException {
		GUI gui = new GUI();
		String message = "Test Message";
		int result = gui.MessageBox(message);
		assertEquals(0, result);
	}
}