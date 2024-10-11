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
	* This test case tests the {@link GUI#MessageBox(String)} method with a valid input.
	*/
	@Test
	void testMessageBoxValid() {
		GUI gui = new GUI();
		int result = gui.MessageBox("Test");
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the {@link GUI#MessageBox(String)} method with a valid input.
	*/
	@Test
	void testMessageBoxValid2() {
		GUI gui = new GUI();
		int result = gui.MessageBox("Test");
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the {@link GUI#MessageBox(String)} method with a valid input.
	*/
	@Test
	void testMessageBoxValid3() {
		GUI gui = new GUI();
		int result = gui.MessageBox("Test");
		assertEquals(2, result);
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the {@link GUI#MessageBox(String)} method with a valid input.
	*/
	@Test
	void testMessageBoxValid4() {
		GUI gui = new GUI();
		int result = gui.MessageBox("Test");
		assertEquals(3, result);
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the {@link GUI#MessageBox(String)} method with a valid input.
	*/
	@Test
	void testMessageBoxValid5() {
		GUI gui = new GUI();
		int result = gui.MessageBox("Test");
		assertEquals(4, result);
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the {@link GUI#MessageBox(String)} method with a valid input.
	*/
	@Test
	void testMessageBoxValid6() {
		GUI gui = new GUI();
		int result = gui.MessageBox("Test");
		assertEquals(5, result);
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the {@link GUI#MessageBox(String)} method with a valid input.
	*/
	@Test
	void testMessageBoxValid7() {
		GUI gui = new GUI();
		int result = gui.MessageBox("Test");
		assertEquals(6, result);
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the {@link GUI#MessageBox(String)} method with a valid input.
	*/
	@Test
	void testMessageBoxValid8() {
		GUI gui = new GUI();
		int result = gui.MessageBox("Test");
		assertEquals(7, result);
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the {@link GUI#MessageBox(String)} method with a valid input.
	*/
	@Test
	void testMessageBoxValid9() {
		GUI gui = new GUI();
		int result = gui.MessageBox("Test");
		assertEquals(8, result);
	}
	
	/**
	* Test case for {@link GUI#MessageBox(String)} method.
	* This test case tests the {@link GUI#MessageBox(String)} method with a valid input.
	*/
	@Test
	void testMessageBoxValid10() {
		GUI gui = new GUI();
		int result = gui.MessageBox("Test");
		assertEquals(9, result);
	}
}