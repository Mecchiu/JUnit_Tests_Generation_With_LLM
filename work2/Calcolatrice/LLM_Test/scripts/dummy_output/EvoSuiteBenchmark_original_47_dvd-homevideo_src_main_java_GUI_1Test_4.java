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
		
    @Test
    public void Test_messageBox_1(){
        JFileChooser chooser = null;
        String testText = null;
                
        String testSelection = null; //"Select file with extension dvd-1.mp4"; 
        /*String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        
        String testSelection = null;
        String testSelection = null;
        
        String testSelection = null;
		
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        String testSelection = null;
        */
        
        String testText = null; //testText
        
        //get selection
        testSelection = JFileChooser.APPLES_FILTER;
        
        //get test text
        try{
            testText = JFileChooser.showOpenDialog(GUI.frame, "Select file containing movie information.")
        }
        catch(FileNotFoundException fnfe){
            JOptionPane.showMessageDialog(GUI.frame, "File not found.", "Fail", JOptionPane.ERROR_MESSAGE);
            fail();
        }
    }
	
}