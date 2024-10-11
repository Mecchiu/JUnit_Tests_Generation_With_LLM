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
* It contains one unit test case for the {@link GUI#MessageBox(String)} method.
*/
class GUI_1Test {
		final static String DATA_PATH = "../../../resources/Test/";

    /**
     * Method for creating a new instance of the GUI object.
     */
    public GUI_1Test() {
    }
    /**
     * Test of initializeGUI.
     */
    @Test
    public void testInitializeGUI() throws Exception {
	String strFileName = DATA_PATH + "dvdtest_file.txt";
	File fileInput = new File(strFileName);
	File fileOutput = new File(strFileName);

    // Load file into output textstream
	assertTrue(fileInput.canRead());
	// File is not a directory
	assertEquals(false, fileInput.isDirectory());

	String str = new String(readFile(fileInput));
	assertTrue((str.length()!= 0).isTrue());

	// Load file output to text stream
	assertTrue(fileOutput.canWrite());
	// File not existing
	assertEquals(null, fileOutput.getParentFile());

    // Open file input stream
	FileReader reader = new FileReader(fileInput);
	BufferedReader stream = new BufferedReader(reader);

    // Use file stream Reader to read file input stream output to text stream	
	assertTrue(stream.toString().length()!= 0);
	str = new String(stream.toString());

	assertTrue( (str.length()!= 0).isTrue());
    }
    /**
     * Test of getFileInput.
     */
    @Test
    public void testGetFileInput() throws Exception {
    // No test method required
    }

    /**
     * Test of getFileOutput.
     */
    @Test
    public void testGetFileOutput() throws Exception {
    // No test method required
    }

    private static String readFile(File file) throws IOException {
        String fileInput = "";
        String error = "";

        try {
            fileInput = readFile(new File(file));
        } catch ( FileNotFoundException e ) {
            error = e.getMessage();
        }
        return fileInput;
    }

}