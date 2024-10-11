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
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the method with a null string.
	*/
	@Test
	void testMessageBoxNull() {
		GUI gui = new GUI();
		assertEquals(JOptionPane.NO_OPTION, gui.MessageBox(null));
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the method with an empty string.
	*/
	@Test
	void testMessageBoxEmpty() {
		GUI gui = new GUI();
		assertEquals(JOptionPane.NO_OPTION, gui.MessageBox(""));
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the method with a string of length 1.
	*/
	@Test
	void testMessageBoxLength1() {
		GUI gui = new GUI();
		assertEquals(JOptionPane.NO_OPTION, gui.MessageBox("a"));
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the method with a string of length 2.
	*/
	@Test
	void testMessageBoxLength2() {
		GUI gui = new GUI();
		assertEquals(JOptionPane.NO_OPTION, gui.MessageBox("ab"));
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the method with a string of length 3.
	*/
	@Test
	void testMessageBoxLength3() {
		GUI gui = new GUI();
		assertEquals(JOptionPane.NO_OPTION, gui.MessageBox("abc"));
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the method with a string of length 4.
	*/
	@Test
	void testMessageBoxLength4() {
		GUI gui = new GUI();
		assertEquals(JOptionPane.NO_OPTION, gui.MessageBox("abcd"));
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the method with a string of length 5.
	*/
	@Test
	void testMessageBoxLength5() {
		GUI gui = new GUI();
		assertEquals(JOptionPane.NO_OPTION, gui.MessageBox("abcde"));
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the method with a string of length 6.
	*/
	@Test
	void testMessageBoxLength6() {
		GUI gui = new GUI();
		assertEquals(JOptionPane.NO_OPTION, gui.MessageBox("abcdef"));
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the method with a string of length 7.
	*/
	@Test
	void testMessageBoxLength7() {
		GUI gui = new GUI();
		assertEquals(JOptionPane.NO_OPTION, gui.MessageBox("abcdefg"));
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the method with a string of length 8.
	*/
	@Test
	void testMessageBoxLength8() {
		GUI gui = new GUI();
		assertEquals(JOptionPane.NO_OPTION, gui.MessageBox("abcdefgh"));
	}
}