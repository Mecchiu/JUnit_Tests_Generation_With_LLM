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
		
    // Initialize GUI with the specified path
    private String path;
    /**
     * @param inputFile This is a log file to parse through, looking for
     *                  the keyword "Error"
     * @return A boolean indicating if an error was found
     */
    public boolean ErrorCheck(String inputFile) {
        boolean success;
        path = inputFile;
        try {
            // Check file for existence, and close if successful
            try {
                File f = new File(path);
                if (f.exists() == false) {
                    System.out.println("File exists");
                    f = new File(
                        System.getProperty("basedir") + File.separator
                        + path 
                        + File.separator
                        + "Error.log" 
                    );
                    System.out.println("Opening");
                    System.out.println("Please type the following text in your log stream:");
                    System.out.println("   " + path
                    + 
                    " " 
                    + 
                    "Log" 
                    + 
                    "Error." 
                    +  "\n");
                    System.out.println("Please type the following text in your log stream:");
                    System.out.println("   " + path
                    + 
                    " " 
                    + 
                    "Log2" 
                    + 
                    "Error." 
                    +  "\n");
                    System.out.println("Press Enter to continue");
                    System.out.println("If this operation cancels, the log will be lost.");
                    System.out.println("Enter to Continue.");
                    success = false;
                    // close the stream
                    f = new File(System.getProperty("basedir") + File.separator
                                  + path
                                  + File.separator
                                  + inputFile 
                                  + File.separator
                                  + "Error.log" 
                                  + File.separator
                                  + "Error." 
                                  + File.separator
                                  + inputFile 
                                  + File.separator
                                  + "Error." 
                                  + File.separator
                                  + inputFile 
                                  + File.separator
                                  + "Error." 
                                  );
                }
            }
            catch (FileNotFoundException fnfe) {
                System.out.println("FileNotFound exception");
                System.err.println("File " + path + 
                    " not exists.");
                success = true;
            }
            // Check for the log file's contents
            f = new File(path);
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(
                new java.io.FileInputStream(f),
                "UTF-8"));
            String s;
            fail("Should not have gotten here.");
            while ((s = br.readLine())!= null) {
                fail("Should not have gotten here.");
            }
            // Close the stream
        } 
        catch (Exception e) {
            System.err.println("An unexpected error has occurred.");
            System.err.println("It's in:");
            e.printStackTrace();
            System.err.println("It's out:");
            System.out.println("");
            success = false;
        }
        if (success)
            JOptionPane.showMessageDialog(null,
                "Error was found.", "Error",
                JOptionPane.INFORMATION_MESSAGE);
        return success;

    }
    
}