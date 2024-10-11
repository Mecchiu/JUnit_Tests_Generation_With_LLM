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
     * Inits the test.
     * @throws IOException exception causing test setup in the {@link #init(File,boolean)} method
     * @throws FileNotFoundException exception causing test setup in the {@link #init(File,boolean)} method
     */
    @Test
    public void init() throws IOException, FileNotFoundException {
        init_();
    }
    
    
    /**
     * Inits the test for the specific <code>file</code> argument.
     * @param file the input file
     * @param isInitial if <code>true</code> indicates that the test will start with
     *<code>file</code> in directory <code>dir</code> cleared out of the current 
     * test directory.
     * @throws IOException if no module is available.
     */
    private void init_() throws IOException {
//System.out.println("Initing...");
        // Ensure the modules directory is created
        File dir = new File("/dvd/raw1394");
        if (dir.exists())
            (new File("/dvd/raw1394", "modules")).delete();
        
    
        // create the modules directory
        File modules_dir = new File("./dvd/raw1394");
        if (!modules_dir.exists())
            modules_dir.mkdir();
        
        File filter_ = new File("./dvd/raw1394", "modules/javac.java");

    
        // Open the specified file.
        // If the file doesn't exist or the extension for.java doesn't match the.java extension this will throw an exception.
        File f = new File(new File(dir, "raw1394") + File.separator + "modules", "javac.java");
	
        if (f.exists() &&!f.getName().endsWith(".java"))
            throw new Exception("Expected raw1394 module name to end with.java");
  
        FileFilter module_filter = new FileFilter() {
                public boolean accept(File aFile) {
                    return aFile.getName().endsWith(".java");
                }};
       
	//create a java file which contains a java file with an exception which is thrown in the call to setSource()
	FileWriter f_write = null;
	try {
            f_write = new FileWriter("/dvd/raw1394", false);
        } 
        catch (IOException e) {
            
        }
       
	try {
	    f_write.write("Module name"+File.separator+"javac.java");
	} catch (IOException e) {
	    e.printStackTrace();
	}
	try {
	    f_write.write("module " + f.getName() + " " + f.getName() + ";\n");
	} catch (IOException e) {
	    e.printStackTrace();
	}
        try {
            inputFile("/dvd/raw1394", f.getName());
        } catch (FileNotFoundException e) {
            throw new IOException("Error opening raw1394 module file");
        }
        
        f.delete();
        
        //setSource("/dvd/raw1394/javac.class");
        
        try {
            f_write.close();
        } catch (IOException e) {
        }
        
        //checkForModules();
    }
    
    
    // --------------------------------------------------------
    // Class specific operations.
    // --------------------------------------------------------
    
    
    /**
     * Load the modules as specified in <code>modules</code> file in the specified dir.
     * @param dir dir where to set the modules.
     * @param isInitial if <code>true</code> indicates that the modules will be loaded first
     */
    public void loadMdModule(File dir, boolean isInitial) throws IOException {
        String s;
        File modules0 = new File("/dvd/raw1394");
		FileFilter filter = new FileFilter() {
			public boolean accept(File aFile) {
                return aFile.getName().endsWith(".java");
			}};
        f_write = new FileWriter("/dvd/raw1394", false);
        outputFile("/dvd/raw1394", modules0.getName()+File.separator+"javac.java");
        f_write.write(File.separator + "module " + modules0.getName() + ";\n");
        f_write.write("module " + modules0.getName() + ";\n");        
        
        f_write.close();
        
        StringBuilder modules0Str = new StringBuilder();
        for (int i = 0; i < modules0Str.length(); i++)
        {
            s = modules0.getName().substring(0, modules0.getName().length() - 1) + " ";
            modules0Str.append(s);
            
        }
				if (isInitial) {
            modules0Str = modules0Str.replace("modules","../raw1394/videod/");
        }
				
        try {
            inputFile("/dvd/raw1394", modules0Str.toString());
        } catch (FileNotFoundException e) {
        }
        modules0.delete();
    }
}