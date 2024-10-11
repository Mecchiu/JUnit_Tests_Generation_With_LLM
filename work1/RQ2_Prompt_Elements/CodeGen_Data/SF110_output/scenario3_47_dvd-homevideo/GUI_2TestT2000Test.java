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
/**
		 * This method performs a quick test checking for runtime errors.
		 * @param name The string where a tokenizer can be added to the
		 * filename to have to be verified. This can be used to check the
		 * string passed as parameter
		 * @throws FileNotFoundException The exception is thrown when a file
		 * could not be found.
		 */
    @Test
    void ErrorCheck(String name) throws FileNotFoundException {
        System.out.println("Test: ErrorCheck");

        // Add a tokenizer to the name argument to validate 
        // the tokenized string
        StringTokenizer st = new StringTokenizer(name, " ", true);
        
        // Create a new instance of the test class to be created
        // and create a new JOptionPane on the class.
        GUI err;
        try {
            // Open the error checking dialog. This should return the 
            // appropriate dialog
            err = new GUI("Error");
            
            // Get the dialog
            // The error checking dialog is now set to the test class, 
            // so we call its "show" method on it. This will attempt to 
            // create the appropriate dialog, and show it for the test.
            err.showDialog();
            
            // Get the dialog size
            JOptionPane op;
            op  = err.getOptionPane();
        } catch (Exception e) {
            // Test that an exception is thrown when the dialog was 
            // created
            System.err.println("Caught exception");
            e.printStackTrace();
            throw e;
        }
                
        // Check if error is encountered already in the test case
        if(err.ErrorCheck(st.nextToken()) == false)
            fail("Error not detected!");

        return;
    }

	/**
	 * Checks if there are errors in the test case. If there are, an
	 * instance of the JOptionPane will not be displayed, the dialog should
	 * be closed.
	 * @return The boolean that indicate the test case is done.
	 */
	public boolean ErrorCheck() {
		System.out.println("Test: ErrorCheck");

		// Add a tokenizer to the name argument to get the dialog size
		StringTokenizer st = new StringTokenizer(GUI.class.getName()," ",true);
		StringTokenizer st2 = new StringTokenizer(GUI_2Test.class.getName()," ",true);

		return(st.nextToken().charAt(0)=='1') && (st2.hasMoreTokens()==false);

	}
    
    /**
* Constructor of main.
*/ 
    public GUI_2Test() {
      super();
        // Create a file chooser
        JFileChooser fc = new JFileChooser("");
        
        try {
            // Set the chooser filename. This is the path where the test
            // will be run.
            String filename =
                   "../Test_";
            fc.setCurrentDirectory(new File(filename));

            // Save the filechooser
            FileDialog fd = new FileDialog(fc, "Set test directory");
            
            // Initialize the file name to be used.
            String dir = fc.getSelectedFile().getAbsolutePath();
            fd.setDirectory(dir);
            
            // Initialize the file chooser
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            
            fc.setSelectedFile(fd.getSelectedFile());
            
        } catch (Exception e) {
        	e.printStackTrace();
            fail("Can not set the chooser with the test.");
        }
	}

//  Main
   public static void main(String args[]) { 
  
   String input = "";
   GUI_2Test gui = new GUI_2Test();
       
   // Create a log file to display when the tests is run
   BufferedWriter rw = new BufferedWriter(new FileWriter( "gui_2test_log.txt","1252"));

       
       // Create a file for the file-name argument
   String fileName = "gui_2test_log.txt";
 
       
       // Add a line
       try {
        input = "Hello, World!";
       } catch (Exception e) {
      	    e.printStackTrace();
       }    
   }

}



// class GUIs is a dummy class to help us create a setter
// and a getter for the test-case's attributes
class GUIs {

    public  GUIs(String name) {
        System.out.println("Test: GUI is created: "+name);
        name = name.replaceAll("<", "").replaceAll(">", "");
        GUISetterGUIShouldBeCreated = true;
    }

    public  GUISetterGUIShouldBeCreated GUISetterGUIShouldBeCreated 
    { return GUISetterGUIShouldBeCreated;} 


    public static GuisetterGUIShouldBeCreated setterGUIShouldBeCreated
    (GUIs instance, boolean val ) {
        GUIs instance2 = new GUIs(instance.name);
        GUIs.setterGUIShouldBeCreated = instance2;
        GUISetterGUIShouldBeCreated = val;
        return GUIs.setterGUIShouldBeCreated;
    }

    public static void main(String args[]) {

       GUIs.GUISetterGUIShouldBeCreated GUISetterGUIShouldBeCreated = false;
       GUI_2Test GUi = GUIs.GUI(GUISetterGUIShouldBeCreated);
       
       if (GUi.ErrorCheck()== false)
       {
      	  JOptionPane jp = new JOptionPane();
      	  
	  	  jp.setTitle("Log In");   
	  	  JPanel jp2 = new JPanel(null);
	  	  jp2.add(Gui.GUI_2Test.class.getSimpleName());
		
			int result = JOptionPane.showConfirmDialog(null, jp2, "",
		                                           JOptionPane.YES_NO_OPTION)  ;
                    System.out.println(result);
	      }
        System.out.println(GUi.ErrorCheck());
        System.exit(0); }


        


};

