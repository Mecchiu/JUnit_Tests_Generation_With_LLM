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
* It contains one unit test case for the {@link GUI#ErrorCheck(String)} method.
*/
class GUI_2Test {
		boolean check = true; // this flag is used for test code
		/**
		* Set a variable to a specific value
		* @param string String to the value of the flag to be set
		*/
		public void setTestCheck(boolean string) {
            	check = string;
			}
		/**
		*  Test the function of ErrorCheck()
		*/
        @Test
        public void ErrorCheck() {
            	boolean result = false;
                assertFalse(ErrorCheck("TestFile"));
                assertTrue(ErrorCheck("TestFile"));

		}

}