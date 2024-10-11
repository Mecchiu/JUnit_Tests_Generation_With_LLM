// GUI_0Test.java


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
class GUI_0Test {

	/**
	* Test case for {@link GUI#checkForModules()}.
	* This test case checks if the raw1394 module is loaded.
	* This module is only needed to capture audio and video from the
	* dv camcorder.
	*/
	@Test
	void testCheckForModules() {
		GUI gui = new GUI();
		assertTrue(gui.checkForModules());
	}
}

// GUI_1Test.java


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
* It contains ten unit test cases for the {@link GUI#checkForProg(String[])} method.
*/
class GUI_1Test {
		
	/**
	* Test case for {@link GUI#checkForProg(String[])}.
	* This test case checks if all dependent programs are installed.
	*/
	@Test
	void testCheckForProg() {
		GUI gui = new GUI();
		assertTrue(gui.checkForProg(gui.DependentPrograms));
	}
}

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
* It contains ten unit test cases for the {@link GUI#MessageBox(String)} method.
*/
class GUI_2Test {
		
	/**
	* Test case for {@link GUI#MessageBox(String)}.
	* This test case checks if the message box is displayed.
	*/
	@Test
	void testMessageBox() {
		GUI gui = new GUI();
		assertEquals(0, gui.MessageBox("Test Message"));
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
	* Test case for {@link GUI#MessageBox(String, int)}.
	* This test case checks if the message box is displayed.
	*/
	@Test
	void testMessageBox() {
		GUI gui = new GUI();
		gui.MessageBox("Test Message", 0);
	}
}

// GUI_4Test.java


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
import static org.junit.jupiter.api.Assertions.*

/**
* Test class of {@link GUI}.
* It contains ten unit test cases for the {@link GUI#MessageBox(String, int, String)} method.
*/
class GUI_4Test {
		
	/**
	* Test case for {@link GUI#MessageBox(String, int, String)}.
	* This test case checks if the message box is displayed.
	*/
	@Test
	void testMessageBox() {
		GUI gui = new GUI();
		gui.MessageBox("Test Message", 0, "logo_32x32.png");
	}
}

// GUI_5Test.java


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
import static org.junit.jupiter.api.Assertions.*

/**
* Test class of {@link GUI}.
* It contains ten unit test cases for the {@link GUI#ErrorCheck(String)} method.
*/
class GUI_5Test {
		
	/**
	* Test case for {@link GUI#ErrorCheck(String)}.
	* This test case checks if an error was found.
	*/
	@Test
	void testErrorCheck() {
		GUI gui = new GUI();
		assertFalse(gui.ErrorCheck("dvd-homevideo.log"));
	}
}

// GUI_6Test.java


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
import static org.junit.jupiter.api.Assertions.*

/**
* Test class of {@link GUI}.
* It contains ten unit test cases for the {@link GUI#UpdateStatus(Color, String)} method.
*/
class GUI_6Test {
		
	/**
	* Test case for {