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
		
    // Test code
    public static void main ( String arg[] ) throws java.io.FileNotFoundException,
        IOException { 
        // Create the frame to be displayed
        GUI frame; 
        JFrame frameF; 
        final File testFolder; 
        final String testFolderName = "testfolder"; 
        
        testFolder = new File("."); 
        testFolder.mkdir(); 
        
        
        
        frame = new GUI(
            Color.MAGENTA, 
            Color.BLACK, 
            Color.DARK_GRAY, 
            new File(testFolderName, "testdata" ), 
            "DvdHomeVideo - "
        ); 
        frameF = new JFrame(frame); 
        frameF.setSize(600,300); 
        frameF.setLocation(0,0); 
        frameF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameF.setVisible(true);
        frameF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frameF.setTitle("testFrameTitle"); 
        
        // Run the test code 
        frame.RunFrame(); 
        // Wait for frame to complete 
        frame.WaitAfterFrame();
         
    } 

    /**
     * Constructor for the Test object.
     * @param arg
     */
    public GUI_1Test(
        Color color, 
        Color colorBlack, 
        Color colorRed, 
        File testData, 
        String text, 
        String name) { 
        this.color = color; 
        this.colorRed = colorRed; 
        this.colorBlack = colorBlack; 
        this.testFolder = new File(testData, name);			
        this.testFolder.mkdir(); 
        
        testFolderName = this.testFolder.getAbsolutePath(); 
        testFolder.mkdir();
        JFileChooser jfc = new JFileChooser(); 
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        jfc.setFileSystemView(null); 
        jfc.setFont(new Font("SansSerif", Font.PLAIN, 10)); 
        FileFilter filter = new FileFilter() { 
            public boolean accept(File pathname) { 
                return pathname.getPath().endsWith("txt"); 
            } 
            public String getDescription() { 
                return "Text File"; 
            } 
        }; 
        jfc.setAcceptAllFileFilterUsed(false); 
        jfc.setFileFilter( filter ); 
        jfc.setApproveButtonText(JOptionPane.UNINITIALIZED_VALUE); 

        jfc.setMultiSelectionEnabled(false); 
        jfc.setFileFilter(filter);
        
        int result; 
        result = this.MessageBox(text); 
        
    } 
 
    
    /**
     * Returns the button state.
     * @return 
     */
    public final boolean isOKCancelButtonState() { 
        return ((this.okToDoButton!= null) && 
               (this.okButtonState == 0) &&
               (this.okToDoLabelState == 1)); 
    }
    
    /**
     * Returns an input string based on the state of the button state.
     * @return 
     */
    public final String testButtonText() { 
        if ( this.isOKCancelButtonState() ) { 
            return ("OK"+"."); 
        } else { 
            switch ((this.okButtonState = ((this.okButtonState == 1)? 0 : 1)) &
                    (0x01 << 0x00)) { 
                case 0:
                case 1: 
                return( "OK"); 
                case 2: 
                return( "Cancel");
            }
        }
    }
    
    /**
     * Returns an input string based on the state of the button state.
     * @return 
     */
    public final String testDoButtonText() { 
        if ( this.isOKCancelButtonState() ) { 
            return ("OK.  Cancel     "); 
        } else { 
            switch ((this.okButtonState = ((this.okButtonState == 1)? 0 : 1)) &
                    (0x01 << 0x02)) { 
                case 0: 
                    return( "OK"+"."); 
                case 1: 
                    return("Cancel");
            }
        }
    }
    
    
    /**
     * Returns the background color of the frame.
     * @return 
     */
    Color getFrameBgColor() { 
        return (color); 
    }
    
    /**
     * Returns the color for the okToDoButton.
     * @return 
     */
    final Color getOnRedButtonColor() { 
        return ((this.okButtonState == 0)? colorBlack : this.color); 
    }
    
    /**
     * Returns the color for the okToDoLabel
     * @return 
     */
    final Color getOnRedLabelColor() { 
        return ((this.okButtonState == 1)? colorBlack : this.color); 
    }
    
    /**
     * Initialize the text based text field for the default text
     */
    final void initDefaultTextField() { 
        defaultTextField(); 
    }
    
    /**
     * Initialize the colorized text color field.
     * @return 
     */
    final Color initTextColor() { 
    return (Color.DARK_GRAY);
  } 

    /**
     * Returns the color for the okToDoButton.
     * @return 
     */
    final Color getOnBlueButtonColor() { 
        return ((this.okButtonState == 2)? colorRed : color); 
    }
    
    /**
     * Returns the text for the okToDoButton (not currently implemented).
     * @return 
     */
    final String initOnToButtonText() { return "OK.  Do";  }
    
    /**
     * Reads a String from the text field and changes the text field.
     * @throws java.io.FileNotFoundException
     */
    void readTextString() 
        throws FileNotFoundException { 
        String currText; 
        
}
}