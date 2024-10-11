// CaptureTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Capture}.
* It contains one unit test case for the {@link Capture#init()} method.
*/
class CaptureTest {
		
	/**
	* Initialization of the CaptureTest.  Creates the object of Capture
	* and performs setup & cleaning of the member variables.
	* @return  true if a test is successfuly completed
	*          false
	*/
	@Test
	public boolean basicSetup() {
        return init();
	}
   

	/**
	* Initialization of the CaptureTest.  Creates the object of Capture
	* and performs setup & cleaning of the member variables.
	* @return  true if a test is successfuly completed
	*          false
	*/
	@Test
  public boolean DVGrab() {
    return init();
  }


	
	/**
	* Creates a default instance of Capture object
	* @return  true if error occurred in the function
	*          false
	*/
	@Test
	public boolean DV_Capture() {
		return DV_Capture();
	}
	
	/**
	 * Basic clean up of the member variables
	*/
	@Test
	public void DV_Capture_clean() {
        DV_Capture();
	}
	
	/**
	* Capture member variables
	*/
	private boolean init() {
        m_Minutes = 1;       //Capture Error;
        m_Seconds = 0;       //Capture Error;
        m_BaseErr = " ";     //Capture Error;
        m_GUI = new GUI();   //Display GUI if necessary
        return true;
    }
	
	private void DV_Capture() {
        try {
            m_GUIPath = m_GUI.openDVScreen();

            //Open file
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String line;

            while ((line = br.readLine())!= null) {
                StringTokenizer parser = new StringTokenizer(line, "\r\n");
                String filename = null;

				    if (parser.hasMoreTokens()) {
					  filename = parser.nextToken();
					}

                //Capture file
                File f = new File(m_GUIPath, filename);
                if (!f.exists()) {
                    JOptionPane.showMessageDialog(null, "Capture Error - No such file or directory.");
                    continue;
                }
                FileWriter fw = new FileWriter(f);
                try {
                    String s = f.getAbsolutePath();
                    fw.write(String.format(m_dvgrab, s));
                    fw.flush();
                    fw.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Capture Error - Error Capture.");
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    continue;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Capture Error - Error Capture.");
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Capture Error - No video capture file.");
        }


    }

    /**
     *  Open GUI and GUI path and file-path
     */
	private String m_GUIPath;
	private String m_GUI;
	private GUI m_GUI2;
	
	private File m_TmpDir;
	private File m_dvScreen;
 	
	/**
	* Open video file - DVD
	*
	* @return  File to Capture if DVD is selected else null
	*/
	private File openFileDV() {
    m_dvScreen = File.createTempFile("CaptureTest", "dv");
		try {
			m_dvScreen.deleteOnExit();
		} catch (IOException e) {
			e.printStackTrace();
		}
		m_TmpDir = new File(System.getProperty("java.io.tmpdir") + "/dv_capture");
		m_TmpDir.mkdir();
		
		m_TmpDir = new File(System.getProperty("java.io.tmpdir"));
		return m_TmpDir.listFiles()[0];
	}

    /**
     *  Open another directory - DVD
     * @return  Return a File of DVD Files
     */
    private File getNewDirectory() {
        m_TmpDir.mkdir();
        m_TmpDir = new File(System.getProperty("java.io.tmpdir") + "/dv_capture");
        return m_TmpDir.listFiles()[0];
	}

	/**
	* Create the GUI for the capture function
	* 	@return  JFrame for this object
	*/
	private JFrame createGUI() {
        m_GUI2 = new GUI();
        return m_GUI2;
	}
	
	/**
	* Add the file-path to the FilePath
	* @return  true if successful
	*/
	public boolean add_filepath(){
		return m_GUIPath!= null;
	}
	
}