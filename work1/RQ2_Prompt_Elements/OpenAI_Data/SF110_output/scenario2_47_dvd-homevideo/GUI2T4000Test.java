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
	* This test case checks if the method returns true when the log file contains the word "Error:".
	*/
	@Test
	void testErrorCheck_ErrorColon() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_ErrorColon.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error:");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "Error~".
	*/
	@Test
	void testErrorCheck_ErrorTilde() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_ErrorTilde.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error~");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "Error,".
	*/
	@Test
	void testErrorCheck_ErrorComma() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_ErrorComma.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error,");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "Error;".
	*/
	@Test
	void testErrorCheck_ErrorSemicolon() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_ErrorSemicolon.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error;");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "Error*".
	*/
	@Test
	void testErrorCheck_ErrorAsterisk() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_ErrorAsterisk.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error*");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "Error-".
	*/
	@Test
	void testErrorCheck_ErrorHyphen() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_ErrorHyphen.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error-");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "Error'".
	*/
	@Test
	void testErrorCheck_ErrorApostrophe() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_ErrorApostrophe.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error'");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "Error ".
	*/
	@Test
	void testErrorCheck_ErrorSpace() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_ErrorSpace.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error ");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the word "Error\t".
	*/
	@Test
	void testErrorCheck_ErrorTab() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_ErrorTab.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error\t");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns false when the log file does not contain the word "Error".
	*/
	@Test
	void testErrorCheck_NoError() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_NoError.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("No Error");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertFalse(gui.ErrorCheck(fileName));
	}
}