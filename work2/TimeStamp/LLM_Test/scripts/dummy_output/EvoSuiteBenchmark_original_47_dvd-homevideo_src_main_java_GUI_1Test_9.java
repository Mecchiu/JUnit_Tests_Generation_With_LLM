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
	 * Checks if the JFileChooser does indeed open in the specified 
	 * location
	 */
	@Test
	public void JFileChooserIsOpenWithoutFileChooserOpen() {
		File f = null;	
		
		JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fc.setAcceptAllFileFilterUsed(false);
	
		f =  fc.showSaveDialog(null);
		assertEquals("Directory doesn't seem to be specified", null, f);
	}
   
   /**
   * checks if the JFileChooser does indeed open in the
   * specified location, but which
   */
	@Test
	public void JFileChooserIsOpenWithSaveFileChooserOpen() {
		
		File f = null;	
		//JFileChooser fc = new  JFileChooser();
		//fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		//fc.setAcceptAllFileFilterUsed(false);
	
		//f =  fc.showSaveDialog(null);
		//assertNotNull("FileChooser was not opened correctly", f);
	}
   
   /**
   * checks if JFileChooser can be open in full
   */
	@Test
	public void JFileChooserCanBeOpenWithFullFileChooserOpen() {
		try {
			String result = JFileChooser.showOpenDialog(null);
			assertEquals("File dialog box was not opened correctly",
			           "Open", result);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	} 
   
   /**
   * checks if JFileChooser can be open with extension 
   */
	@Test
	public void JFileChooserCanBeOpenWithExtensionFileChooserOpen() {
		try {
			String result = JFileChooser.showOpenDialog(null, ".avi");
			assertEquals("File dialog box was not opened correctly",
			           ".avi", result);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	} 
   
   /**
   * check if JFileChooser asks to be opened in directory specified by
   * the parameter filename.  
   */
	@Test
	public void JFileChooserAskToOpenWithFilenameAsText() {
		
		//JFileChooser jfc = new JFileChooser();
		//jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		//jfc.setAcceptAllFileFilterUsed(false);
		
		String result = JFileChooser.showOpenDialog(null);
		FileChooser fc = new FileChooser();
		
		fc.setInitialDirectory(new File(result));
		
		String f = fc.getFileName();
		System.out.println("The current file name is: "+f);
		
		//fc.setTitle("FileChooserDialogTest");
		//fc.setDialogType(FileChooser.OPEN_DIALOG);

		//set dialogTitle to ""
		//fc.setFileFilter(new FileFilter() {
		//    public boolean accept(File file) {
		//        return false;  
		//    }
		//    public String getDescription() {
		//        return "This is a File";
		//    }    
		//    public String getName() {
		//        return "This is a File";
		//    }});
		
		int i = fc.showOpenDialog(null);
		String name = fc.getFileName();
		
		System.out.println("The chosen file name is: "+name);
		
		assertTrue("Dialog type is not set to OPEN_DIALOG", fc.getDialogType() == JFileChooser.OPEN_DIALOG);
		assertEquals("Wrong initial directory has been chosen", fc.getFile("").getAbsolutePath(), result);
	}
   
   /**
   * Checks if JFileChooser ask a "full" filename to open
   */   
   @Test
	public void JFileChooserAskFullFilenameToOpen() {
		try {
			String result = JFileChooser.showOpenDialog(null);
			System.out.println("The file name is: "+result);
			assertEquals("The file was not opened", "", result);
		} catch (FileNotFoundException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	} 	
   
   /**
   * Checks JFileChooser asking for a filename (with one extension) 
   */   
   @Test
	public void JFileChooserAskFullFilenameWithExtensionToOpen() {
		try {
			String result = JFileChooser.showOpenDialog(null, ".jpg");
			System.out.println("The file name is: "+result);
			assertEquals("The file was not opened", "", result);
		} catch (FileNotFoundException e) {
			fail(e.getMessage());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	} 	
   
   /**
   * @see {@link GUI#MessageBox(String)}
   */   
   @Test
	public void MessageBoxWithValidNameAsText() {
		MessageBox(null, "Hello World!");
	}   
   
   /**
   * @see JFileChooser#showSaveDialog(File)
   */
   @Test
	public void showSaveDialogWithFileObjectAsText() {
		try {
		     File f = new File("Hello world!");
		     
		     JFileChooser fc = new JFileChooser();
		     fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		     fc.setAcceptAllFileFilterUsed(false);
		     f =  fc.showSaveDialog(null);
		     
		     String f1 = f.getAbsolutePath();
		     assertNotNull("f1 should not be null", f1);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}   	
   /**
   * @see {@link GUI#showSaveDialog(File)}
   */   
   @Test
	public void showSaveDialogWithFileObjectAsFile() {
}
}