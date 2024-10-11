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
     * Checks to ensure that the raw1394 module is loaded.
     */
    @Test
    public final void test()
        throws FileNotFoundException, FileNotFoundException, IOException {
	this_test();
    }

    /**
     * Checks to ensure that the raw1394 module is loaded.
     */
    void this_test()
        throws FileNotFoundException, FileNotFoundException, IOException {
	new  GUI();
    }
    
    
        
    /**
     * On startup, checks to ensure that the raw1394 module is loaded.
     * This module is only needed to capture audio and video from the
     * dv camcorder.
     */
    @Test
    public final void checkForModules(){
	assertTrue(checkForModules());
    }
}
