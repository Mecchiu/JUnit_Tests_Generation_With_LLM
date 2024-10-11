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
		* Function to validate that the Runtime errors can come out of and be caught 
		* by the class. It returns the first error that wasn't caught by checking dvd-homevideo: 
		* or null if none.
		*/
	public static String ErrorCheck1() {
		String outString1 = null;
		String outString2 = null;
		try {
			StringTokenizer st = new StringTokenizer(ErrorCheck((String)new File("/home/josh/homevideo/HomeVideo.xml")), ".");
			while (st.hasMoreTokens()) {
				outString1 = st.nextToken();
			}
			// TODO This is commented out because this is a test
//           RuntimeError rt = new RuntimeError();
//            rt.msg = "The home video file " + outString1 + " is not a subdirectory of " + outString1 + ". Use '..'."
//           rt.printStackTrace();
//           assertTrue(rt.hasBeenGenerated());
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}
		return outString1;
	}

	/**
	 * Function to test the runtime errors.
	 * It ensures that when a file is read from a bad location, it just returns null
	 */
	@Test
	public void Test1() {
		boolean b = ErrorCheck1();
		assertTrue(b);
	}

    /**
     * Function to test the runtime errors
     * This is a simple case of the file-read logic.  I.e. you shouldn't worry about getting
     * messages in bad locations
     */
    public boolean ErrorCheck(String path) {
        // Try to open the specified log location as a file
        // TODO Is a good idea to open a file that does not end with ".gz" in order to read the "Error"
        // message from DSA?
        JFileChooser chooser = new JFileChooser(new File("/home/josh/homevideo"));

		if (path.toLowerCase().endsWith(".gz")) {
            String filename = path; // it does not matter to us that our file-name ends with ".gz"
            chooser.setFileFilter(new FileFilter() {
                public boolean accept(File f) {
                    return f.getName().endsWith(".gz");
                }
            });
            chooser.setDialogTitle("Open as Gzip file");
        } else {
            int returnVal = chooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File f = chooser.getSelectedFile();
                path = f.getPath();
            }
        }

        try {

            //try to reopen as a Gzip file
            File f = new File(path);
            try {
                f.close();
                return true;
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error", "Warning", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error", "Warning", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }
}