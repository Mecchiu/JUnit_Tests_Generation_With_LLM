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
* It contains one unit test case for the {@link GUI#checkForModules()} method.
*/
class GUI_0Test {
		/**
		* Get the {@link GUI#checkForModules()} method.
		* By default returns {@code true}.
		* @return a boolean.
		*/
    public boolean checkForModules();
    
    /**
    * Get the checkForModules() method with a false return value.
    * Since the dv-camcorder tool doesn't depend on any dvd-v4 modules, this method is just here to test the {@link GUI#checkForModules()} method.
    */
	public void test();
}

//GUI_1Test.java

//import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.awt.Color;
import javax.swing.filechooser.FileFilter;

public class GUI_1Test {
	
	/**
	* Get the checkForModules() method with a false return value.
	* Since the dv-camcorder tool doesn't depend on any dvd-v4 modules, this method is just here to test the {@link GUI#checkForModules()} method.
	*/
    public void test();
	
    /**
    * Get the checkForModules() method.
    * This is the standard way to load the dvd-v4 modules that
    * can be compiled with dvd-homevideo.
    */
	public  static boolean checkForModules() throws Exception {
   		return (
   			GUI.main(new String[] { "--homevideo" } ) == 0
   		);
	}

	/**
	* A program to test {@link GUI#checkForModules()} method.
	*/
	public static void main(String[] argv) {
    	//System.setSecurityManager(null);
    	//System.setSecurityProperty("file.security.checkPackageAccess", "true");
		GUI_1Test test = new GUI_1Test();
		test.test();
	}
}