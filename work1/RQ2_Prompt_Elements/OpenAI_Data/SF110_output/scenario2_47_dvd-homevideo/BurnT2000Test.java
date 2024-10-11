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
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = true;
		assertTrue(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_2() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = false;
		assertFalse(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_3() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = true;
		assertTrue(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_4() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = false;
		assertFalse(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_5() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = true;
		assertTrue(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_6() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = false;
		assertFalse(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_7() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = true;
		assertTrue(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_8() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = false;
		assertFalse(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_9() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = true;
		assertTrue(burn.BurnToDVD(DVD_GUI));
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* This test case checks if the method returns true when the growisofs command is not found.
	*/
	@Test
	void testBurnToDVD_10() {
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "temp";
		Burn burn = new Burn();
		burn.m_growisofs = "/bin/sh: growisofs: command not found";
		burn.m_Burn = false;
		assertFalse(burn.BurnToDVD(DVD_GUI));
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
 * This class checks for the necessary dependencies to run dvd-homevideo.
 */
public class CheckDependencies {

    /**
     * Check for the necessary dependencies to run dvd-homevideo
     *
     * @param DVD_GUI This is the GUI object used to control the form
     * return   A boolean to determine if an error occurred in the function
     */
    public boolean CheckDependencies(GUI DVD_GUI) {
        try {
            /* Create the dvd-author process */
            Process p = Runtime.getRuntime().exec(m_dependencies);
            /* Instantiate input and output readers for dvd-author streams */
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader err_in = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            BufferedWriter out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/log/dependencies.log"));
            BufferedWriter err_out = new BufferedWriter(new FileWriter(DVD_GUI.strOutputDir + "/log/dependencies.err"));
            String line;
            /* We will miss the error without this delay */
            Thread.sleep(50);
            /* 
             * Check for the case where the necessary dependencies are not
             * installed, but the user tries to run dvd-homevideo anyway
             */
            if (err_in.ready()) {
                line = err_in.readLine();
                if (line.equals("/bin/sh: dvdauthor: command not found")) {
                    DVD_GUI.MessageBox("