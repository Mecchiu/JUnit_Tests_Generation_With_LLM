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
		
	//private File tempDir = null;
	
	//private static final File[] files = new File[] {
	//			new File("/home/homedrive/home_video.log"),
	//});
	
	/**
	 * Returns 0 if the file doesn't exist, or the error if it does exist.
	 * @param   File the file to test
	 * @return   0 if the file doesn't exist, or the error if it exists  
	 */
	public static int ErrorCheck(File fileName) {
		try {
			if (!fileName.getCanonicalFile().exists()) {
				return 0;
			}
			
			FileReader f = new FileReader(fileName);
			
			BufferedReader br = new BufferedReader(f);
			
			//int fileNumber = 0;
			
			String line = null;
			
			while ((line = br.readLine())!= null) {
				//System.out.println(line);
				
				File ftest = new File("/home/homedrive/home_video.log"); //"/home/homedrive/home_video" + _1 + "/home/homedrive/home_video.log");
				File f = new File(ftest);
				
				if (new File(f).exists()) {
					if (line.indexOf("Error") == 0) {
						return 1;
					}
					else {
						if (line.indexOf("Error", 3) < 0) {
							return 2;
						}
						else {
							if (line.indexOf("Error: ") < 0) {
								return 3; 
							}
							else {
								return 4; 
							}
						}
					}
				}
				else {
					System.out.println();
					throw new FileNotFoundException("File " + ftest.getPath() + " does not exist.");
				}
			}
			
			br.close();
			
			f.delete();
			
			return 0;
		} 
		catch (IOException e) {
			return 1;
		}
	}
	
	/**
	 * @return  the tempDir as String
	 */
	public static String FileNameToString(File dirName) {
		try {
			return dirName.getCanonicalPath();
			
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * @param   dir the directory to find
	 * @return   either a file or a directory
	 */
	
	public File findDir(File dir);
	
	/**
	 * Starts a frame on the screen.
	 */
	public void run() {
                
                runFrame();
                System.exit(0);
        }	        

	/**
	 * This method runs on the screen. It starts a frame, creates
     * a directory, and executes a file check for each directory of files.
	 *
	 */  
    
	public void runFrame() {
}
}