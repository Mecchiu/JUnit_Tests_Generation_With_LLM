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

// DVD_Author.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Shane Santner
 * This class creates the DVD file structure using dvd-author
 */
public class DVD_Author {

    /**
     * Creates a new instance of DVD_Author
     */
    public DVD_Author() {
    }

    /**
     * DVD_Author Member Variables
     */
    private String m_dvdauthor = "dvdauthor -o temp/DVD -t -v -c temp/DVD/dvd.xml";

    private String m_BaseErr = "DVD_Author Error - ";

    /**
     * Create the DVD file structure using dvd-author
     * @param   DVD_GUI    This is the GUI object used to control the form
     * return   A boolean to determine if an error occurred in the function
     */
    public boolean CreateDVD(GUI DVD_GUI) {
        /* Update dvd-author command with the correct paths */
        m_dvdauthor = m_dvdauthor.replaceAll("temp", DVD_GUI.strOutputDir);
        try {
            /* Create the dvd-author process */
            Process p = Runtime.getRuntime().exec(m_dvdauthor);
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
                line = err_in.