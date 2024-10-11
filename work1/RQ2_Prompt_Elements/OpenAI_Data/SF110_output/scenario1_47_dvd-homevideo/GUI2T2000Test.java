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
	void testErrorCheck_1() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_1.txt";
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
	* This test case checks if the method returns true when the file contains the word "error" in the middle of a sentence.
	*/
	@Test
	void testErrorCheck_2() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_2.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("This is an error");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" at the end of a sentence.
	*/
	@Test
	void testErrorCheck_3() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_3.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("This is an error.");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" at the beginning of a sentence.
	*/
	@Test
	void testErrorCheck_4() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_4.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error is here.");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" at the beginning of a sentence.
	*/
	@Test
	void testErrorCheck_5() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_5.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error is here.");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" at the beginning of a sentence.
	*/
	@Test
	void testErrorCheck_6() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_6.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error is here.");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" at the beginning of a sentence.
	*/
	@Test
	void testErrorCheck_7() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_7.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error is here.");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" at the beginning of a sentence.
	*/
	@Test
	void testErrorCheck_8() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_8.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error is here.");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" at the beginning of a sentence.
	*/
	@Test
	void testErrorCheck_9() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_9.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error is here.");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
	
	/**
	* Test case for {@link GUI#ErrorCheck(String)} method.
	* This test case checks if the method returns true when the file contains the word "error" at the beginning of a sentence.
	*/
	@Test
	void testErrorCheck_10() {
		GUI gui = new GUI();
		String fileName = "testErrorCheck_10.txt";
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
			out.write("Error is here.");
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		assertTrue(gui.ErrorCheck(fileName));
	}
}