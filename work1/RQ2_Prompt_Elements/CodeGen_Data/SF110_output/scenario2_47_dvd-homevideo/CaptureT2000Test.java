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

    final Capture m_TestCam = new Capture();

    /**
     * A unit test case for Capture.
     *
     */
    @Test
    public void test() throws Exception {
        File dir = new File(System.getProperty("user.dir")+"/../../log/");
        File camera = new File(dir,"m_capture");

        // Set the up and down button states based on the state of the button press
        boolean up = true;
        boolean down = false;

        JOptionPane.showMessageDialog (null, "Start capture...");

        String strLine = null;
        InputStreamReader srr = null;
        BufferedReader br = null;

        if (!m_TestCam.init()) {
            System.exit(1);
        }
        boolean res;
        BufferedWriter fw = new BufferedWriter(new FileWriter(camera,"y"));
        fw.write("start capture 1");
        fw.flush();

        /* start capturing a file or a directory */
        if (m_GUI.CheckFile()) {
            return;
        }

        /* CheckFile was not able to figure out where the output dir should go for a file */
        if (m_GUI.menuChkFile.isSelected() && m_TestCam.init()) {
            DV_Capture();
            fw.write("end capture 1");
            fw.flush();
            return;
        }


        /* capture a directory */
        if (m_GUI.menuChkDir.isSelected() && m_TestCam.init()) {
            DV_Capture();
            fw.write("end capture 1");
            fw.flush();
            return;
        }
        
        // Set up the default test file as the default video mode
        m_FilePath = camera;
        m_FileType = FileType.VIDEO;

        // The function name to call will be in the form of file1.txt
        JOptionPane.showMessageDialog(null, "Start capture...");

        System.out.println("Sending File Name to testCam");
        File f0 = new File(dir,"m_capture/");
        f0.createNewFile();
        File f = new File(f0,"testCam.txt");
        f.createNewFile();

        String str = "Capture File:\t" + f0.toString();
        DV_Capture();
        fw.write(str);
        fw.write("end capture");
        fw.write("\n");
        DV_ErrorCheck(null);
        fw.write("Capture File: " + camera.toString());
        fw.flush();

        JOptionPane.showMessageDialog(null, "End Capture");
        fw.close();

        JOptionPane.showMessageDialog(null, "Captured!");
        m_TestCam.uninit();
        System.err.println(m_TestCam); 
        if (m_GUI.menuChkDir.isSelected()) {
            m_FilePath = new File(dir,"dvgrab/");
        }
        fileCreated();
    }

    /**
     * Initialize the GUI to be used once this class is loaded in.
     *
     */
    public void preCreate(){
        m_GUI = new GUI(m_TestCam);
        m_Thread = new Thread(m_TestCam);
        m_Thread.start();
        System.err.println(m_Thread);
        /*
         * In this case the gui is created once, not for each frame,
         * because the gui is created when the frame is added to the frame.
         * This means that the gui is created when the first frame is added.
         * This is a hack, but it doesn't really matter.  It only makes one
         * gui per frame that it works upon for the duration of the frame.  
         * It isn't necessary to do this!
         */
        JOptionPane.showMessageDialog(null, "Initialize GUI");
       
    }

    public void fileCreated(){
        BufferedReader br = null;
        System.err.println("Reading File Name:");
        int pos = m_TestCam.readFile(strLine);
        System.err.print("Line was null (" + pos + "): ");

        /* Check to see if the line contains the characters */
        if (pos == -1) {
            JOptionPane.showMessageDialog(null, "No Frame Name for File.");
   
        } 

        br = new BufferedReader(new InputStreamReader(m_TestCam.getInputStream()));

        String s;
        
        while ((s=br.readLine())!=null){
            s = s.trim();

            /* Replace multiple spaces with a single space and put the backslash
             * since there might be more spaces on this line.  This does not give
             * an error, but this does do the test. */
            StringTokenizer st = new StringTokenizer(s," ");
            s = "";

            while(st.hasMoreTokens()){
                s = s + st.nextToken();
            }

            File file = new File(m_FilePath,s);
            if (file.exists()){
                System.err.println("Frame Name found in testCam : " + file.getName()+": "+file.getName());
            } else {
                System.err.println("No frame name found in testCam : "+file.getName());
            }
            
        }
    }

    public void DV_Capture() throws IOException {
        m_guiCreate = true;
        preCreate();
        m_TestCam.writeFile(m_FilePath); 

    } 

    public void DV_ErrCheck(String outputDir) throws IOException {
            m_guiCreate = true;
            preCreate();
               /* Create the output directory if it does not already exist */
            FileOutputStream fo = null;
            FileOutputStream fos = null;
            FileOutputStream ffos = null;
            File