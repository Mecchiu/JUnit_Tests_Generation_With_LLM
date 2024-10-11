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

    /**
     * Test of {@link GUI#MessageBox(String)}.
     */
    @Test
    public void test_MessageBox(){
    	String testName = this.getClass().getSimpleName().toUpperCase();
    	
        // 1. test case for {@link GUI#MessageBox(String)}
        String msg = JOptionPane.showInputDialog("dvd-homevideo-message", "message");
        MessageBox(msg);
        
        // 2. test case for {@link GUI#MessageBox(String)}.
        testName = "test_MessageBox - " + testName;
        msg = JOptionPane.showInputDialog("dvd-homevideo-message", "message");
        MessageBox(msg);
        
        // 3. test case for {@link GUI#MessageBox(String)}.
        // 3.testcase for {@link GUI#MessageBox(String)}
        JFileChooser chooser = new JFileChooser("C:/homevideo/C++/homevideo-gtest-2/homevideo-gtest-2-1/homevideo-gtest-2-1-1-1");
        chooser.setFileFilter(new FileFilter(){
            public boolean accept(File f) {
            return f.getName().equals("file");
            }
        });
        String[] list = (String[]) chooser.showOpenDialog(null);
        assertEquals(1, list.length);
        
        inputFile = new File(list[0]);
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(inputFile));
            StringTokenizer st = new StringTokenizer(reader.readLine());
            
            // read the line of the file. the file may not
            // contain a delimiter.
            msg = st.nextToken();
            JOptionPane.showMessageDialog("message.txt", msg);
        } catch (FileNotFoundException e) {
            fail("file " + inputFile.getCanonicalPath() + " not found.");
        } catch (IOException e) {
            fail("IOException: " + e.getMessage());
        }
        
        assertNotNull(msg);
    }
    
    /**
     * 
     * @param msg
     * @return message; null if not found in
     * the current directory
     */
    public static String InputFile(String msg) {

        String curdir = System.getProperty("user.dir");
        StringInput inputFile = new StringInput(curdir + File.separator + msg);
        
        FileFilter currentFilter = new FileFilter() {
            public boolean accept(File file) {
                
                // we want to allow only text files.
                String name = file.getName();
                
                // we want to also allow only gtest files but do not want to accept text files
                return name.endsWith(".gtest") || file.getPath().endsWith(".gtest");

            }
        };
		
        inputFile.setFilenameFilter(currentFilter);

        File file = new File(inputFile.getFilename());
        return inputFile.readLine();
	}

    /**
     * 
     * @param msg
     * @param errorCode
     * @return
     */
    public static boolean testMessageBox(String msg, int errorCode) {
    	//TODO: implement this
        throw new AssertionError();
    }

    /**
     * The text of the filename.
     */
    private String inputFile = null;

}
