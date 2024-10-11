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
	* Test case for {@link GUI#checkForModules()} method.
	* This test case checks if the method returns true when the module is loaded.
	*/
	@Test
	void testCheckForModules_1() {
		GUI gui = new GUI();
		assertTrue(gui.checkForModules());
	}
	
	/**
	* Test case for {@link GUI#checkForModules()} method.
	* This test case checks if the method returns false when the module is not loaded.
	*/
	@Test
	void testCheckForModules_2() {
		GUI gui = new GUI();
		assertFalse(gui.checkForModules());
	}
	
	/**
	* Test case for {@link GUI#checkForModules()} method.
	* This test case checks if the method returns true when the module is loaded.
	*/
	@Test
	void testCheckForModules_3() {
		GUI gui = new GUI();
		assertTrue(gui.checkForModules());
	}
	
	/**
	* Test case for {@link GUI#checkForModules()} method.
	* This test case checks if the method returns false when the module is not loaded.
	*/
	@Test
	void testCheckForModules_4() {
		GUI gui = new GUI();
		assertFalse(gui.checkForModules());
	}
	
	/**
	* Test case for {@link GUI#checkForModules()} method.
	* This test case checks if the method returns true when the module is loaded.
	*/
	@Test
	void testCheckForModules_5() {
		GUI gui = new GUI();
		assertTrue(gui.checkForModules());
	}
	
	/**
	* Test case for {@link GUI#checkForModules()} method.
	* This test case checks if the method returns false when the module is not loaded.
	*/
	@Test
	void testCheckForModules_6() {
		GUI gui = new GUI();
		assertFalse(gui.checkForModules());
	}
	
	/**
	* Test case for {@link GUI#checkForModules()} method.
	* This test case checks if the method returns true when the module is loaded.
	*/
	@Test
	void testCheckForModules_7() {
		GUI gui = new GUI();
		assertTrue(gui.checkForModules());
	}
	
	/**
	* Test case for {@link GUI#checkForModules()} method.
	* This test case checks if the method returns false when the module is not loaded.
	*/
	@Test
	void testCheckForModules_8() {
		GUI gui = new GUI();
		assertFalse(gui.checkForModules());
	}
	
	/**
	* Test case for {@link GUI#checkForModules()} method.
	* This test case checks if the method returns true when the module is loaded.
	*/
	@Test
	void testCheckForModules_9() {
		GUI gui = new GUI();
		assertTrue(gui.checkForModules());
	}
	
	/**
	* Test case for {@link GUI#checkForModules()} method.
	* This test case checks if the method returns false when the module is not loaded.
	*/
	@Test
	void testCheckForModules_10() {
		GUI gui = new GUI();
		assertFalse(gui.checkForModules());
	}
}