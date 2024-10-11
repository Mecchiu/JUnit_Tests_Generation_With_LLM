// GUI_2Test.java


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
class GUI_2Test {

	/**
	* Test case for the {@link GUI#ErrorCheck(String)} method.
	* This test case checks the ErrorCheck method with a file that contains the word "Error"
	* @see GUI#ErrorCheck(String)
	*/
	@Test
	void testErrorCheck_1() {
		GUI gui = new GUI();
		boolean result = gui.ErrorCheck("/home/shane/dvd-homevideo/test/testErrorCheck_1.txt");
		assertTrue(result);
	}
	
	/**
	* Test case for the {@link GUI#ErrorCheck(String)} method.
	* This test case checks the ErrorCheck method with a file that does not contain the word "Error"
	* @see GUI#ErrorCheck(String)
	*/
	@Test
	void testErrorCheck_2() {
		GUI gui = new GUI();
		boolean result = gui.ErrorCheck("/home/shane/dvd-homevideo/test/testErrorCheck_2.txt");
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link GUI#ErrorCheck(String)} method.
	* This test case checks the ErrorCheck method with a file that contains the word "Error"
	* @see GUI#ErrorCheck(String)
	*/
	@Test
	void testErrorCheck_3() {
		GUI gui = new GUI();
		boolean result = gui.ErrorCheck("/home/shane/dvd-homevideo/test/testErrorCheck_3.txt");
		assertTrue(result);
	}
	
	/**
	* Test case for the {@link GUI#ErrorCheck(String)} method.
	* This test case checks the ErrorCheck method with a file that does not contain the word "Error"
	* @see GUI#ErrorCheck(String)
	*/
	@Test
	void testErrorCheck_4() {
		GUI gui = new GUI();
		boolean result = gui.ErrorCheck("/home/shane/dvd-homevideo/test/testErrorCheck_4.txt");
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link GUI#ErrorCheck(String)} method.
	* This test case checks the ErrorCheck method with a file that contains the word "Error"
	* @see GUI#ErrorCheck(String)
	*/
	@Test
	void testErrorCheck_5() {
		GUI gui = new GUI();
		boolean result = gui.ErrorCheck("/home/shane/dvd-homevideo/test/testErrorCheck_5.txt");
		assertTrue(result);
	}
	
	/**
	* Test case for the {@link GUI#ErrorCheck(String)} method.
	* This test case checks the ErrorCheck method with a file that does not contain the word "Error"
	* @see GUI#ErrorCheck(String)
	*/
	@Test
	void testErrorCheck_6() {
		GUI gui = new GUI();
		boolean result = gui.ErrorCheck("/home/shane/dvd-homevideo/test/testErrorCheck_6.txt");
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link GUI#ErrorCheck(String)} method.
	* This test case checks the ErrorCheck method with a file that contains the word "Error"
	* @see GUI#ErrorCheck(String)
	*/
	@Test
	void testErrorCheck_7() {
		GUI gui = new GUI();
		boolean result = gui.ErrorCheck("/home/shane/dvd-homevideo/test/testErrorCheck_7.txt");
		assertTrue(result);
	}
	
	/**
	* Test case for the {@link GUI#ErrorCheck(String)} method.
	* This test case checks the ErrorCheck method with a file that does not contain the word "Error"
	* @see GUI#ErrorCheck(String)
	*/
	@Test
	void testErrorCheck_8() {
		GUI gui = new GUI();
		boolean result = gui.ErrorCheck("/home/shane/dvd-homevideo/test/testErrorCheck_8.txt");
		assertFalse(result);
	}
	
	/**
	* Test case for the {@link GUI#ErrorCheck(String)} method.
	* This test case checks the ErrorCheck method with a file that contains the word "Error"
	* @see GUI#ErrorCheck(String)
	*/
	@Test
	void testErrorCheck_9() {
		GUI gui = new GUI();
		boolean result = gui.ErrorCheck("/home/shane/dvd-homevideo/test/testErrorCheck_9.txt");
		assertTrue(result);
	}
	
	/**
	* Test case for the {@link GUI#ErrorCheck(String)} method.
	* This test case checks the ErrorCheck method with a file that does not contain the word "Error"
	* @see GUI#ErrorCheck(String)
	*/
	@Test
	void testErrorCheck_10() {
		GUI gui = new GUI();
		boolean result = gui.ErrorCheck("/home/shane/dvd-homevideo/test/testErrorCheck_10.txt");
		assertFalse(result);
	}
}

// GUI_3Test.java


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
* It contains ten unit test cases for the {@link GUI#MessageBox(String, int)} method.
*/
class GUI_3Test {
		
	/**
	* Test case for the {@link GUI#MessageBox(String, int)} method.
	* This test case checks the MessageBox method with a message and type of 0
	* @see GUI#MessageBox(String, int)
	*/
	@Test
	void testMessageBox_1() {
		GUI gui = new GUI();
		gui.MessageBox("Test Message", 0);
	}
	
	/**
	* Test case for the {@link GUI#MessageBox(String, int)} method.
	* This test case checks the MessageBox method with a message and type of 1
	* @see GUI#MessageBox(String, int)
	*/
	@Test
	void testMessageBox_2() {
		GUI gui = new GUI();
		gui.MessageBox("Test Message", 1);
	}
	
	/**
	* Test case for the {@link GUI#MessageBox(String, int)} method.
	* This test case checks the MessageBox method with a message and type of 2
	* @see GUI#MessageBox(String, int)
	*/
	@Test
	void testMessageBox_3() {
		GUI gui = new GUI();
		gui.MessageBox("Test Message", 2);
	}
	
	/**
	* Test case for the {@link GUI#MessageBox(String, int)} method.
	* This test case checks the MessageBox method with a message and type of 3
	* @see GUI#MessageBox(String, int)
	*/
	@Test
	void testMessageBox_4() {
		GUI gui = new GUI();
		gui.MessageBox("Test Message", 3);
	}
	
	/**
	* Test case for the {@link GUI#MessageBox(String, int)} method.
	* This test case checks the MessageBox method with a message and type of 4
	* @see GUI#MessageBox(String, int)
	*/
	@Test
	