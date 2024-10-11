// BurnTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Burn}.
* It contains one unit test case for the {@link Burn#BurnToDVD(GUI)} method.
*/
class BurnTest {
// Burn.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Shane Santner
 * This class burns the DVD file structure previously created by
 * dvd-author to a DVD disc.
 */
public class Burn {

    /**
     * Optionally burn to DVD when complete and no errors, uses growisofs
     *
     * @param DVD_GUI This is the GUI object used to control the form
     * return   A boolean to determine if an error occurred in the function
     */
    public boolean BurnToDVD(GUI DVD_GUI) {
        /* Update growisofs command with the correct paths */
        m_growisofs = m_growisofs.replaceAll("temp", DVD_GUI.strOutputDir);
        /* 
         * Burn object always gets created, so m_Burn will not always be true,
         * must be checked. 
         */
        if (m_Burn == true) {
            try {
                /* Create the growisofs process which actually burns the DVD */
                Process p = Runtime.getRuntime().exec(m_growisofs);
                /* Instantiate input and output readers for dvd-author streams */
                BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
                BufferedReader err_in = new BufferedReader(new InputStreamReader(p.getErrorStream()));
                BufferedWriter out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/log/burn.log"));
                BufferedWriter err_out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/log/burn.err"));
                String line;
                /* We will miss the error without this delay */
                Thread.sleep(50);
                /* 
                 * Check for the case where the necessary dependencies are not
                 * installed, but the user tries to run dvd-homevideo anyway
                 */
                if (err_in.ready()) {
                    line = err_in.readLine();
                    if (line.equals("/bin/sh: growisofs: command not found")) {
                        DVD_GUI.MessageBox("Could not locate growisofs in your path." + "\nPlease install all necessary dependencies" + "\nand rerun dvd-homevideo.", 0);
                        /* Close all open streams */
                        in.close();
                        out.close();
                        err_in.close();
                        err_out.close();
                        /* Indicate that there was an error */
                        return true;
                    } else {
                        DVD_GUI.txtAreaOutput.append(line + "\n");
                        out.write(line);
                        out.newLine();
                    }
                }
                out.write("burn.log--->dvd-homevideo");
                out.newLine();
                /* Write the output to the txtAreaOutput user display */
                while ((line = in.readLine())!= null) {
                    DVD_GUI.txtAreaOutput.append(line + "\n");
                    out.write(line);
                    out.newLine();
                }
                /*
                 * close() throws an IOException
                 */
                in.close();
                out.close();
                err_in.close();
                err_out.close();
                /*
                 * p.waitFor() throws an InterruptedException
                 */
                p.waitFor();
            } catch (IOException ex) {
                SaveStackTrace.printTrace(DVD_GUI.strOutputDir, ex);
                DVD_GUI.MessageBox(m_BaseErr + "IO Error\n" + ex.toString(), 0);
                ex.printStackTrace();
                return true;
            } catch (InterruptedException ex) {
                SaveStackTrace.printTrace(DVD_GUI.strOutputDir, ex);
                DVD_GUI.MessageBox(m_BaseErr + "dvd-homevideo thread was interrupted\n" + ex.toString(), 0);
                ex.printStackTrace();
                return true;
            } catch (NullPointerException ex) {
                SaveStackTrace.printTrace(DVD_GUI.strOutputDir, ex);
                DVD_GUI.MessageBox(m_BaseErr + "Error executing Runtime.getRuntime().exec()\n" + ex.toString(), 0);
                ex.printStackTrace();
                return true;
            } catch (IllegalArgumentException ex) {
                SaveStackTrace.printTrace(DVD_GUI.strOutputDir, ex);
                DVD_GUI.MessageBox(m_BaseErr + "Illegal argument sent to Runtime.getRuntime().exec()\n" + ex.toString(), 0);
                ex.printStackTrace();
                return true;
            } catch (Exception ex) {
                SaveStackTrace.printTrace(DVD_GUI.strOutputDir, ex);
                DVD_GUI.MessageBox(m_BaseErr + "Unknown Error occurred\n" + ex.toString(), 0);
                ex.printStackTrace();
                return true;
            }
        }
        if (m_Burn)
            return DVD_GUI.ErrorCheck(DVD_GUI.strOutputDir + "/log/burn.log");
        return false;
    }
}

// BurnTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Burn}.
* It contains one unit test case for the {@link Burn#BurnToDVD(GUI)} method.
*/
class BurnTest {
		static final int NUM_MEMFILLS = 10000;
		static final int NUM_GENS = 500000;
		private static GUI.GUI_STATE g_State = new GUI.GUI_STATE();
		private int m_Gen = 0;
		private Buffer_V_D DVD = new Buffer_V_D(new String[] {"/bin/sh", "dvd-author"}, NUM_MEMFILLS, NUM_GENS);
		
		/**
		* This method runs the burn to DVD process repeatedly to ensure that the
		* result is as expected.
		*/
		public void burn() {

			/* 
				Initialize Burn object
			*/
			m_Burn = new Burn(GUI.GUI_CONTEXT_PANE, DVD);

			/*
			 * Burn object has state
			 */
			g_State.reset();

			/* 
				Initialize burn and start it as follows
			*/
			g_State.m_NumV_D = getNumV_D();
			g_State.m_Gen = generate().toString();
			g_State.start();

			/*
			 * Burn object has finished starting, so wait for burner to
			 * fire
			 */
			m_Burn.runCheck();

			/*
			 * Burn object has finish running and finished, so we're finished
			 * with Burn object
			 */
			burn.finish();
			burn.close();

			/*
			 * Check for expected output
			*/
			assertEquals(g_State.m_Output[0], DVD_TEXT_MEM, DVD_TEXT);
			assertEquals(g_State.m_Output[1], (g_State.reset.increment() * g_State.m_NumV_D));

		}
		
		/*
		 * This method cleans the GUI object and reinitializes it for the next run
		 */
		public void clear() {
			GUI.GUI_CONTEXT_PANE.close();
			
			/*
				Start and terminate the burn process
			*/
			m_Burn = new Burn(GUI.GUI_CONTEXT_PANE, DVD);
			m_Burn.start();
			m_Burn.runCheck();
		}
		
		
		/**
		* This method reads the file size from the burn output and returns
		* the number of bytes to be transferred.
		*/
		public int getNumV_D() {
			String line;
			BufferedReader out;
			String output = g_State.m_Output[2];
			int return_numBytes = 0;
			
			/* 
				Open burn output and seek to the end 
			*/
			out = new BufferedReader(
				new InputStreamReader(new FileInputStream