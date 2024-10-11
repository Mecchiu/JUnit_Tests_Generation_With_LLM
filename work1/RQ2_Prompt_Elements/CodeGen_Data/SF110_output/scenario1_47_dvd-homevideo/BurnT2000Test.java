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
		private String m_BaseErr;
    private GUI m_DVD;
    static int m_Burn = 0;

    /**
    * Set test environment variables.
    * @param BaseDir base directory inside which all test case will be created
    * @throws IOException if unable to create the directories
    */
    void setUp() throws IOException {
        BufferedReader cmd_in = new BufferedReader(
                    new InputStreamReader(System.in));
        BufferedReader cmd_err_in = new BufferedReader(
                    new InputStreamReader(System.err));
        m_BaseErr = cmd_in.readLine();
        m_DVD = new GUI(m_BaseDir + "/log/");
        m_DVD.MessageBox(m_BaseErr, 0);
        BufferedWriter cmd_out = new BufferedWriter(new FileWriter(
                        "temp/log/burn.log"));
        m_Burn = Burn.BurnToDVD(m_DVD);
        assertTrue(m_Burn);
        try {
            Process p = Runtime.getRuntime().exec("dvd-homevideo -verbose");
            /*
             * Check for the process output
             */
            p.waitFor();
            assertNotNull("No dvd home video found", p);
        } catch (IOException fail) {
            p.destroy();
            assertNull(fail);
        } catch (InterruptedException fail) {
            p.destroy();
            assertNull(fail);
        }
        p.destroy();
        cmd_out.close();
        cmd_err_in.close();
    }

    /**
    * Reset the Environment with default values for all Environment variables.
    */
    public void reset() {
        cmd_in = new BufferedReader(new InputStreamReader(System.in));
        cmd_out = new BufferedWriter(new FileWriter(
                        "temp/log/burn.log"));
        m_Burn = Burn.BurnToDVD(m_DVD);
        m_Burn = 0;
        cmd_in.readLine();
    }

    /**
    * Test for failure case with empty output.
    */
    @Test
    public void failureTest() {
        reset();
        m_DVD.MessageBox(m_BaseErr, 0);
        assertTrue(m_Burn);
    }

    /**
    * Test for success case.
    */
    @Test
    public void successTest() {
        reset();
        String[] command = new String[] {"dvd-homevideo -verbose", "test"};
        String out = new String(new byte[] {
            0x6A, 0x6A, 0x63, 0x6A, 0x6A, 0x6A, 0x6A, 0x6A });
        DVD_GUI.txtAreaOutput = new TextAreaOutput(m_DVD.strOutputDir + "/log/full");
        DVD_GUI.txtAreaOutput.setText(out);
