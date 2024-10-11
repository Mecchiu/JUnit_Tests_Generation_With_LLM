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
     * Creates a new instance of GUI_0Test
     *
     * @param testFile the input test file
     * @throws FileNotFoundException
     * if the input test file cannot be found
     */
    public GUI_0Test(File testFile)
            throws FileNotFoundException {
           
        createUI();
        readFile(testFile);
    }
    
    /**
     * Creates & starts a new GUI
     *
     */
    private void createUI() {
        File testDir = null;

        try {
            testDir = new File(GUI_0.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        }
        catch (IOException ioe) {
            fail(ioe.getMessage());
        }

        assertTrue(testDir!= null);

        new GUI(testDir).setVisible(true);
    }

    /**
     * Writes input data to input test file
     *
     * @param input the input test file
     * @throws FileNotFoundException
     * if the input test file cannot be read
     */
    public void readFile(File input)
            throws FileNotFoundException {
        FileReader fileReader = null;
        BufferedReader buffReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(input);
            buffReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(input);
            String line;
            while ((line = buffReader.readLine())!= null) {
                fileWriter.write(line+System.getProperty("line.separator"));
            }
        } catch (IOException ioe) {
            fail(ioe.getMessage());
        } finally {
            try {
                fileReader.close();
            } catch (IOException ioe) {
                fail(ioe.getMessage());
            }
            try {
                fileWriter.close();
            } catch (IOException ioe) {
                fail(ioe.getMessage());
            }
        }
    }

    /**
     * Main method for test program
     */
    public static void main(String args[]) {
        testProc(GUIMain.class);
        
        junit.textui.TestRunner.run(GUIMaint.class);
    }
}