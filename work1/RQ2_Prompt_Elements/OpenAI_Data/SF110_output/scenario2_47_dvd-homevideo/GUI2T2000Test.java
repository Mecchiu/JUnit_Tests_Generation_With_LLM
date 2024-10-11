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
* It contains ten unit test cases for the {@link GUI#ErrorCheck(String)} method.
*/
class GUITest {

	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "Error".
	*/
	@Test
	void testErrorCheck_Error() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "error".
	*/
	@Test
	void testErrorCheck_error() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_error.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("error");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "ERROR".
	*/
	@Test
	void testErrorCheck_ERROR() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_ERROR.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("ERROR");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "Broken".
	*/
	@Test
	void testErrorCheck_Broken() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Broken.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Broken");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "broken".
	*/
	@Test
	void testErrorCheck_broken() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_broken.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("broken");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "BROKEN".
	*/
	@Test
	void testErrorCheck_BROKEN() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_BROKEN.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("BROKEN");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "Error" and the word "broken".
	*/
	@Test
	void testErrorCheck_ErrorBroken() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_ErrorBroken.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error broken");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "Error" and the word "broken" and the word "error".
	*/
	@Test
	void testErrorCheck_ErrorBrokenError() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_ErrorBrokenError.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error broken error");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "Error" and the word "broken" and the word "error" and the word "ERROR".
	*/
	@Test
	void testErrorCheck_ErrorBrokenErrorERROR() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_ErrorBrokenErrorERROR.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error broken error ERROR");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "Error" and the word "broken" and the word "error" and the word "ERROR" and the word "BROKEN".
	*/
	@Test
	void testErrorCheck_ErrorBrokenErrorERRORBROKEN() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_ErrorBrokenErrorERRORBROKEN.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error broken error ERROR BROKEN");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns false when the log file does not contain the word "Error" or the word "broken" or the word "error" or the word "ERROR" or the word "BROKEN".
	*/
	@Test
	void testErrorCheck_NoError() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_NoError.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
