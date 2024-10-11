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
		 * @param message the message in which a textbox should be display
		 * @param args the parameters for the textbox
		 */
    public static String[] args = new String[] { "foo", "bar" };



	/**
	 * @param args command line arguments
	 */
	public GUI_1Test(String[] args) {
	}

	/**
	* Test method for {@link GUI#GUI(java.lang.String)}.
     *
	*/
	@Test
	public void testGUI(){
	}
	
	/**
	 * Test method for {@link GUI#startGUI(String)}.
     *
	*/
	@Test
	public void testStartGUI(){
	}

	/**
	 * Test method for {@link GUI#getFileName(int)}.
     *
	*/
	@Test
	public void testGetFileName(){
		String[] args = { "/foo/bar" };
	}
	
	/**
		* Test method for {@link GUI#moveUpFile(String)}.
	*
	*/
	@Test
	public void testMoveUpFile(){
	}
	
	/**
	 * Test method for {@link GUI#moveDownFile(String)}.
	*
	*/
	@Test
	public void testMoveDownFile(){
	}
	
	/**
	 * Test method for {@link GUI#deleteFile(String)}.
	*
	*/
	@Test
	public void testDeleteFile(){
	}
	
	/**
	 * Test method for {@link GUI#getFileDir(int)}.
	*
	*/
	@Test
	public void testGetFileDir(){
	}
	
	/**
	 * Test method for {@link GUI#isFileOk(String)}.
	*
	*/
	@Test
	public void testIsFileOk(){
	}
	
	/**
	 * Test method for {@link GUI#moveFileUp(String)}.
    *
    */
	@Test
	public void testMoveFileUp(){
	}
	
	/**
	* Test method for {@link GUI#moveFileDown(String)}.
    *
    */
	@Test
	public void testMoveFileDown(){
	}
	
	/**
	 * Test method for {@link GUI#createNewFile(String)}.
	*
	*/
	@Test
	public void testCreateNewFile(){
	}
	
	/**
	* Test method for {@link GUI#getFileDir(String)}.
	*
	*/
	@Test
	public void testGetFileDir():{}
	
	/**
	* Test method for {@link GUI#deleteFile(String)}.
	*
	*/
	@Test
	public void testDeleteFile():{}
	
	/**
	* Test method for {@link GUI#deleteFile(String)}.
	*/
	@Test(expected=FileNotFoundException.class)
	public void testDeleteFile_error(){
		GUI_1Test.deleteFile("/foo/bar");
	}
	
	/**
	* Test method for {@link GUI#createNewFile(String)}.
	*/
	public void testCreateNewFile_error(){
		GUI_1Test.createNewFile("/foo/bar");
	}
	
	/**
	* Test method for {@link GUI#getFileDir(String)}.
	*/
	public void testGetFileDir():{}
	
	/**
	* Test method for {@link GUI#deleteFile(String)}.
	*/
	public void testDeleteFile():{}
	
	@Override
	public void run(){
		String[] cmdArgs = {};
		newFileArgs = new String[] {};
		testString = "Hello world!\n";
	}
  
  protected String newFileArgs[] = {};
  protected String testString = "";
	private String[] newFileArgs = { "foo", "bar", "bar", "baz", "quux" };
	private String testString = "Hello world!\n";
	private String[] testStringArgs[] = { "foo", "bar", "bar", "baz", "quux" };
	
  
    // Test methods
    
    /**
     * Test method for {@link GUI#getFileDir(String)}.
     *
     */
    public void testGetFileDir():{}
    /**
     * Test method for {@link GUI#moveFileUp(String)}.
     *
     */
    public void testMoveFileUp():{}
    /**
     * Test method for {@link GUI#moveFileDown(String)}.
     *
     */
    public void testMoveFileDown():{}
    /**
     * Test method for {@link GUI#moveFileUp(String)}.
     */
    public void testMoveFileUp(){
    }
    /**
     * Test method for {@link GUI#moveFileDown(String)}.
     */
    public void testMoveFileDown(){
    }

    
    public File[] getFileArgs(){
    	return null;
    }

    
    public String getTestString(){
    	return testString;
    }

    
    public static String newTextArgs[] = {};
    public static String testTextArgs[] = { "bazzer" };


    private String[] newTestArgs = {};
    private String testText = "Hello world!\n";


    private File[] newFileArgs = { null };
    private String testFile = "/foo/bar/test.sav";


    /**
	 * Test method for {@link GUI#isFileOk(String)}.
	 *
	*/
	@Test
	public void testIsFileOk():{}
	
	/**
	* Test method for {@link GUI#deleteFile(String)}.
	*
	*/
	@Test(expected=FileNotFoundException.class)
	public void testDeleteFile_error(){
		GUI_1Test.deleteFile("/foo/bar/test_file_test");
	}
	
	/**
	* Test method for {@link GUI#deleteFile(String)}.
	*/
	@Test(expected=MessageBox.ConfirmDeleteDialog.class)
	public void testDeleteFile_error():{}
	
	/**
	* Test method for {@link GUI#move