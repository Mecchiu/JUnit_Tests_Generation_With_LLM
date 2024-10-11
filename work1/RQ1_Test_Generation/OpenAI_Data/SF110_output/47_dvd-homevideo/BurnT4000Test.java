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
* It contains ten unit test cases for the {@link Burn#BurnToDVD(GUI)} method.
*/
class BurnTest {

		/**
		* Test case for {@link Burn#BurnToDVD(GUI)} method.
		* This test case checks if the method returns true when the growisofs command is not found.
		*/
		@Test
		void testBurnToDVD_1() {
				Burn burn = new Burn();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = burn.BurnToDVD(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link Burn#BurnToDVD(GUI)} method.
		* This test case checks if the method returns true when the growisofs command is not found.
		*/
		@Test
		void testBurnToDVD_2() {
				Burn burn = new Burn();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = burn.BurnToDVD(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link Burn#BurnToDVD(GUI)} method.
		* This test case checks if the method returns true when the growisofs command is not found.
		*/
		@Test
		void testBurnToDVD_3() {
				Burn burn = new Burn();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = burn.BurnToDVD(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link Burn#BurnToDVD(GUI)} method.
		* This test case checks if the method returns true when the growisofs command is not found.
		*/
		@Test
		void testBurnToDVD_4() {
				Burn burn = new Burn();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = burn.BurnToDVD(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link Burn#BurnToDVD(GUI)} method.
		* This test case checks if the method returns true when the growisofs command is not found.
		*/
		@Test
		void testBurnToDVD_5() {
				Burn burn = new Burn();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = burn.BurnToDVD(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link Burn#BurnToDVD(GUI)} method.
		* This test case checks if the method returns true when the growisofs command is not found.
		*/
		@Test
		void testBurnToDVD_6() {
				Burn burn = new Burn();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = burn.BurnToDVD(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link Burn#BurnToDVD(GUI)} method.
		* This test case checks if the method returns true when the growisofs command is not found.
		*/
		@Test
		void testBurnToDVD_7() {
				Burn burn = new Burn();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = burn.BurnToDVD(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link Burn#BurnToDVD(GUI)} method.
		* This test case checks if the method returns true when the growisofs command is not found.
		*/
		@Test
		void testBurnToDVD_8() {
				Burn burn = new Burn();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = burn.BurnToDVD(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link Burn#BurnToDVD(GUI)} method.
		* This test case checks if the method returns true when the growisofs command is not found.
		*/
		@Test
		void testBurnToDVD_9() {
				Burn burn = new Burn();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = burn.BurnToDVD(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link Burn#BurnToDVD(GUI)} method.
		* This test case checks if the method returns true when the growisofs command is not found.
		*/
		@Test
		void testBurnToDVD_10() {
				Burn burn = new Burn();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = burn.BurnToDVD(DVD_GUI);
				assertTrue(result);
		}
}

// CheckDependencies.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Shane Santner
 * This class checks for the necessary dependencies to run dvd-homevideo
 */
public class CheckDependencies {

    /**
     * Creates a new instance of CheckDependencies
     */
    public CheckDependencies() {
    }

    /**
     * CheckDependencies Member Variables
     */
    private String m_BaseErr = "CheckDependencies Error - ";

    /**
     * Check for the necessary dependencies to run dvd-homevideo
     * @param   DVD_GUI    This is the GUI object used to control the form
     * return   A boolean to determine if an error occurred in the function
     */
    public boolean CheckDependencies(GUI DVD_GUI) {
        try {
            /* Create the dvd-author process */
            Process p = Runtime.getRuntime().exec("dvd-author");
            /* Instantiate input and output readers for dvd-author streams */
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader err_in = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            BufferedWriter out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/log/dvd-author.log"));
            BufferedWriter err_out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/log/dvd-author.err"));
            String line;
            /* We will miss the error without this delay */
            Thread.sleep(50);
            /* 
             * Check for the case where the necessary dependencies are not
             * installed, but the user tries to run dvd-homevideo anyway
             */
            if (err_in.ready()) {
                line = err_in.readLine();
                if (line.equals("/bin/sh: dvd-author: command not found")) {
                    DVD_GUI.MessageBox("Could not locate dvd-author in your path." + "\nPlease install all necessary dependencies" + "\nand rerun dvd-homevideo.", 0);
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
            out.write("dvd-author.log--->dvd-homevideo");
            out.newLine();
            /* Write the output to the txtAreaOutput user display */
            while ((line = in.readLine()) != null) {
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
        return false;
    }
}

// CheckDependenciesTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDependencies}.
* It contains ten unit test cases for the {@link CheckDependencies#CheckDependencies(GUI)} method.
*/
class CheckDependenciesTest {
		
		/**
		* Test case for {@link CheckDependencies#CheckDependencies(GUI)} method.
		* This test case checks if the method returns true when the dvd-author command is not found.
		*/
		@Test
		void testCheckDependencies_1() {
				CheckDependencies checkDependencies = new CheckDependencies();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = checkDependencies.CheckDependencies(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link CheckDependencies#CheckDependencies(GUI)} method.
		* This test case checks if the method returns true when the dvd-author command is not found.
		*/
		@Test
		void testCheckDependencies_2() {
				CheckDependencies checkDependencies = new CheckDependencies();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = checkDependencies.CheckDependencies(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link CheckDependencies#CheckDependencies(GUI)} method.
		* This test case checks if the method returns true when the dvd-author command is not found.
		*/
		@Test
		void testCheckDependencies_3() {
				CheckDependencies checkDependencies = new CheckDependencies();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = checkDependencies.CheckDependencies(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link CheckDependencies#CheckDependencies(GUI)} method.
		* This test case checks if the method returns true when the dvd-author command is not found.
		*/
		@Test
		void testCheckDependencies_4() {
				CheckDependencies checkDependencies = new CheckDependencies();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = checkDependencies.CheckDependencies(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link CheckDependencies#CheckDependencies(GUI)} method.
		* This test case checks if the method returns true when the dvd-author command is not found.
		*/
		@Test
		void testCheckDependencies_5() {
				CheckDependencies checkDependencies = new CheckDependencies();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = checkDependencies.CheckDependencies(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link CheckDependencies#CheckDependencies(GUI)} method.
		* This test case checks if the method returns true when the dvd-author command is not found.
		*/
		@Test
		void testCheckDependencies_6() {
				CheckDependencies checkDependencies = new CheckDependencies();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = checkDependencies.CheckDependencies(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link CheckDependencies#CheckDependencies(GUI)} method.
		* This test case checks if the method returns true when the dvd-author command is not found.
		*/
		@Test
		void testCheckDependencies_7() {
				CheckDependencies checkDependencies = new CheckDependencies();
				GUI DVD_GUI = new GUI();
				DVD_GUI.strOutputDir = "temp";
				boolean result = checkDependencies.CheckDependencies(DVD_GUI);
				assertTrue(result);
		}
		
		/**
		* Test case for {@link CheckDependencies#CheckDependencies(GUI)} method.
		* This test case checks if the method returns true when the