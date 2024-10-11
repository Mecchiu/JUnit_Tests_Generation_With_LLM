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
	* This test case checks if the method returns true when the file contains the word "error".
	*/
	@Test
	void testErrorCheck_Error() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error.txt";
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
	* This test case checks if the method returns true when the file contains the word "Error".
	*/
	@Test
	void testErrorCheck_Error_Capital() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Capital.txt";
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
	* This test case checks if the method returns true when the file contains the word "error" with a space before it.
	*/
	@Test
	void testErrorCheck_Error_Space() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Space.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write(" error");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a space after it.
	*/
	@Test
	void testErrorCheck_Error_Space_After() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Space_After.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("error ");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a space before and after it.
	*/
	@Test
	void testErrorCheck_Error_Space_Before_After() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Space_Before_After.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write(" error ");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a tab before it.
	*/
	@Test
	void testErrorCheck_Error_Tab() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Tab.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("\terror");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a tab after it.
	*/
	@Test
	void testErrorCheck_Error_Tab_After() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Tab_After.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("error\t");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a tab before and after it.
	*/
	@Test
	void testErrorCheck_Error_Tab_Before_After() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Tab_Before_After.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("\terror\t");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a comma before it.
	*/
	@Test
	void testErrorCheck_Error_Comma() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Comma.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write(",error");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a comma after it.
	*/
	@Test
	void testErrorCheck_Error_Comma_After() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Comma_After.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("error,");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a comma before and after it.
	*/
	@Test
	void testErrorCheck_Error_Comma_Before_After() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Comma_Before_After.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write(",error,");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a semicolon before it.
	*/
	@Test
	void testErrorCheck_Error_Semicolon() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Semicolon.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write(";error");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a semicolon after it.
	*/
	@Test
	void testErrorCheck_Error_Semicolon_After() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Semicolon_After.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("error;");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a semicolon before and after it.
	*/
	@Test
	void testErrorCheck_Error_Semicolon_Before_After() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Semicolon_Before_After.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write(";error;");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a colon before it.
	*/
	@Test
	void testErrorCheck_Error_Colon() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Colon.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write(":error");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a colon after it.
	*/
	@Test
	void testErrorCheck_Error_Colon_After() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Colon_After.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("error:");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a colon before and after it.
	*/
	@Test
	void testErrorCheck_Error_Colon_Before_After() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Colon_Before_After.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write(":error:");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a hyphen before it.
	*/
	@Test
	void testErrorCheck_Error_Hyphen() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Hyphen.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("-error");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a hyphen after it.
	*/
	@Test
	void testErrorCheck_Error_Hyphen_After() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Hyphen_After.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("error-");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a hyphen before and after it.
	*/
	@Test
	void testErrorCheck_Error_Hyphen_Before_After() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Hyphen_Before_After.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("-error-");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" with a tilde before it.
	*/
	@Test
	void testErrorCheck_Error_Tilde() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_Error_Tilde.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("~error");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
