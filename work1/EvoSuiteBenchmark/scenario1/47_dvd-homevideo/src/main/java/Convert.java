import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;

/**
 * @author Shane Santner
 * This class is used to transcode the video captured
 * from the digital camcorder into mpeg4, the DVD compatible
 * format.  It explicitly calls the transcode command
 * after meticulously preparing the options that can be passed
 * to transcode.
 *
 * TODO - Break mplex out into its own class.
 *        Figure out how to calculate remaining time even if
 *        video was not captured from the camcorder during the
 *        current session.
 *        Need to handle input, output and error streams
 *        more appropriatly.
 */
public class Convert implements Runnable {

    public boolean init() {
        if (m_GUI.menuChkThread.isSelected()) {
            m_Thread = new Thread(this);
            m_Thread.start();
            try {
                m_Thread.join();
            } catch (InterruptedException ex) {
                SaveStackTrace.printTrace(m_GUI.strOutputDir, ex);
                m_GUI.MessageBox(m_BaseErr + "Could not join Convert.java thread\n" + ex.toString(), 0);
                ex.printStackTrace();
                m_Error = true;
            }
        } else
            Transcode();
        /* 
         * Check transcode.log and mplex.log for any sign of an error.
         * If either file contains an error then return an error.  Also
         * check m_Error to see if it was set while executing the 
         * Transcode method.
         */
        return (m_Error || m_GUI.ErrorCheck(m_GUI.strOutputDir + "/log/transcode.log") || m_GUI.ErrorCheck(m_GUI.strOutputDir + "/log/mplex.log"));
    }
}
