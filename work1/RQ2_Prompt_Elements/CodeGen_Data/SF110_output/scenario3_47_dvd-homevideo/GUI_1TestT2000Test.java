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
public GUI_1Test() {
			
		}
        /**
        * Run a test case for the
     * {@link GUI#MessageBox(String)} method.
     */
	
	
        @Test
        public void showMessage() {
            try {
                String message = "Error 1";
                GUI.MessageBox(message);
                assertTrue("Message should not be blank: " + message, message!= "");
            } catch (Exception e) {
                fail("Error 1; " + e.getMessage());
            }
        }
        @Test
        public void editMessage() throws Exception {
            File editedFile = File.createTempFile("EditMsg", "txt");
            String message = "Error 2";
            try {
                GUI.MessageBox(message, editedFile, "txt", "error");
            } catch (Exception e) {
                fail("Error 2; " + e.getMessage());
            }
            
            try {
                GUI.MessageBox(message);
            } catch (Exception e) {
                fail("Error 2 cannot edit message");
            }
        }
	
        @Test
        public void createEditor() throws Exception {
            File editedFile = File.createTempFile("EditMsg", "txt");
            String message = "Error 3";
            
            try {
                GUI.MessageBox(message, editedFile, "txt", "edit");
            } catch (Exception e) {
                fail("Error 3; " + e.getMessage());
        }
            
            try {
                GUI.MessageBox(message);
            } catch (Exception e) {
                fail("Error 3 cannot edit message");
            }
        }

        @Test
        public void find() throws Exception {
            File editedFile = File.createTempFile("FindEdit", "txt");
            String message = "Error 4";
            
            checkFile(message);

            
            try {
                GUI.find(message, true);
            } catch (Exception e) {
                fail("Error 4 should not happen");
            }
            
            try {
                GUI.find(message, false);
            } catch (Exception e) {
                fail("Error 4 should not happen");
			}
		}

        /**
        *
        * FileFilter for text and dvd
     */
	
    static final String[] FILTERS = {File.separator + "*.txt",
                                    "-.dv"};
    
    /** Creates a file with files.
     */
    private void checkFile(String message) throws FileNotFoundException {
        
        String fileName = "fileName";
        byte[] fileByte = message.getBytes();
        File f = new File(fileName);
        BufferedWriter out = new BufferedWriter(new FileWriter (f));

        for (String filter : FILTERS) {
            FileFilter[] filters = f.getFileSystem().getFileObjects
            (new FileFilter [] {new FileFilter()});
            for (FileFilter filter1 : filters) {
                if (filter == "" || filter1.accept(f) == false) {

                    //System.err.println("File Name is " + fileName);
                    out.write(fileName);
                    out.write(" ");
                    out.write(message);

                    out.newLine();
            
                    out.close();
                    
                    while (! out.checkCanceled())
                        out = new BufferedWriter(new FileWriter (f));
                    
                }
            }
        }
        out.close();
    }
}

