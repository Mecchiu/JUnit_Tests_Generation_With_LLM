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
	* This test case checks if the method returns true when the log file contains the keyword "Error".
	*/
	@Test
	void testErrorCheckTrue() {
		GUI gui = new GUI();
		assertTrue(gui.ErrorCheck("testErrorCheckTrue.log"));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns false when the log file does not contain the keyword "Error".
	*/
	@Test
	void testErrorCheckFalse() {
		GUI gui = new GUI();
		assertFalse(gui.ErrorCheck("testErrorCheckFalse.log"));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns false when the log file does not exist.
	*/
	@Test
	void testErrorCheckFileNotFound() {
		GUI gui = new GUI();
		assertFalse(gui.ErrorCheck("testErrorCheckFileNotFound.log"));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns false when the log file is empty.
	*/
	@Test
	void testErrorCheckEmptyFile() {
		GUI gui = new GUI();
		assertFalse(gui.ErrorCheck("testErrorCheckEmptyFile.log"));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the keyword "Error" in the first line.
	*/
	@Test
	void testErrorCheckFirstLine() {
		GUI gui = new GUI();
		assertTrue(gui.ErrorCheck("testErrorCheckFirstLine.log"));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the keyword "Error" in the last line.
	*/
	@Test
	void testErrorCheckLastLine() {
		GUI gui = new GUI();
		assertTrue(gui.ErrorCheck("testErrorCheckLastLine.log"));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the keyword "Error" in the middle of the file.
	*/
	@Test
	void testErrorCheckMiddleLine() {
		GUI gui = new GUI();
		assertTrue(gui.ErrorCheck("testErrorCheckMiddleLine.log"));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the keyword "Error" in the first line and the last line.
	*/
	@Test
	void testErrorCheckFirstAndLastLine() {
		GUI gui = new GUI();
		assertTrue(gui.ErrorCheck("testErrorCheckFirstAndLastLine.log"));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the keyword "Error" in the first line and the middle of the file.
	*/
	@Test
	void testErrorCheckFirstAndMiddleLine() {
		GUI gui = new GUI();
		assertTrue(gui.ErrorCheck("testErrorCheckFirstAndMiddleLine.log"));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the log file contains the keyword "Error" in the last line and the middle of the file.
	*/
	@Test
	void testErrorCheckLastAndMiddleLine() {
		GUI gui = new GUI();
		assertTrue(gui.ErrorCheck("testErrorCheckLastAndMiddleLine.log"));
	}
}