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
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Burn burn = new Burn();
		GUI DVD_GUI = new GUI();
		boolean result = burn.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Burn burn = new Burn();
		GUI DVD_GUI = new GUI();
		boolean result = burn.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Burn burn = new Burn();
		GUI DVD_GUI = new GUI();
		boolean result = burn.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Burn burn = new Burn();
		GUI DVD_GUI = new GUI();
		boolean result = burn.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Burn burn = new Burn();
		GUI DVD_GUI = new GUI();
		boolean result = burn.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Burn burn = new Burn();
		GUI DVD_GUI = new GUI();
		boolean result = burn.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Burn burn = new Burn();
		GUI DVD_GUI = new GUI();
		boolean result = burn.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Burn burn = new Burn();
		GUI DVD_GUI = new GUI();
		boolean result = burn.BurnToDVD(GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Burn#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Burn burn = new Burn();
		GUI DVD_GUI = new GUI();
		boolean result = burn.BurnToDVD(GUI);
		assertTrue(result);
	}
}

// GUI.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Shane Santner
 * This class is the GUI for the dvd-homevideo application.
 */
public class GUI {

    /**
     * Creates a new instance of GUI
     */
    public GUI() {
    }

    /**
     * Creates a new instance of GUI
     * @param   burnToDVD   boolean value used to determine whether or not to burn to a DVD
     *                      when dvd-homevideo completes
     */
    public GUI(boolean burnToDVD) {
    }

    /**
     * GUI Member Variables
     */
    private boolean m_Burn;

    private String m_growisofs = "growisofs -speed=4 -Z /dev/dvd -dvd-video temp/DVD/";

    private String m_BaseErr = "Burn Error - ";

    /**
     * Optionally burn to DVD when complete and no errors, uses growisofs
     * @param   DVD_GUI    This is the GUI object used to control the form
     * return   A boolean to determine if an error occurred in the function
     */
    public boolean BurnToDVD(GUI DVD_GUI);
}

// GUITest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GUI}.
* It contains ten unit test cases for the {@link GUI#BurnToDVD(GUI)} method.
*/
class GUITest {
		
	/**
	* Test case for {@link GUI#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		GUI GUI = new GUI();
		boolean result = GUI.BurnToDVD(GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link GUI#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		GUI GUI = new GUI();
		boolean result = GUI.BurnToDVD(GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link GUI#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		GUI GUI = new GUI();
		boolean result = GUI.BurnToDVD(GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link GUI#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		GUI GUI = new GUI();
		boolean result = GUI.BurnToDVD(GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link GUI#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		GUI GUI = new GUI();
		boolean result = GUI.BurnToDVD(GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link GUI#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		GUI GUI = new GUI();
		boolean result = GUI.BurnToDVD(GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link GUI#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		GUI GUI = new GUI();
		boolean result = GUI.BurnToDVD(GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link GUI#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		GUI GUI = new GUI();
		boolean result = GUI.BurnToDVD(GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link GUI#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		GUI GUI = new GUI();
		boolean result = GUI.BurnToDVD(GUI);
		assertTrue(result);
	}
}

// Main.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Shane Santner
 * This class is the main class for the dvd-homevideo application.
 */
public class Main {

    /**
     * Creates a new instance of Main
     */
    public Main() {
    }

    /**
     * Creates a new instance of Main
     * @param   burnToDVD   boolean value used to determine whether or not to burn to a DVD
     *                      when dvd-homevideo completes
     */
    public Main(boolean burnToDVD) {
    }

    /**
     * Main Member Variables
     */
    private boolean m_Burn;

    private String m_growisofs = "growisofs -speed=4 -Z /dev/dvd -dvd-video temp/DVD/";

    private String m_BaseErr = "Burn Error - ";

    /**
     * Optionally burn to DVD when complete and no errors, uses growisofs
     * @param   DVD_GUI    This is the GUI object used to control the form
     * return   A boolean to determine if an error occurred in the function
     */
    public boolean BurnToDVD(GUI DVD_GUI);
}

// MainTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#BurnToDVD(GUI)} method.
*/
class MainTest {
		
	/**
	* Test case for {@link Main#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Main Main = new Main();
		GUI DVD_GUI = new GUI();
		boolean result = Main.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Main#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Main Main = new Main();
		GUI DVD_GUI = new GUI();
		boolean result = Main.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Main#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Main Main = new Main();
		GUI DVD_GUI = new GUI();
		boolean result = Main.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Main#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Main Main = new Main();
		GUI DVD_GUI = new GUI();
		boolean result = Main.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Main#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Main Main = new Main();
		GUI DVD_GUI = new GUI();
		boolean result = Main.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Main#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Main Main = new Main();
		GUI DVD_GUI = new GUI();
		boolean result = Main.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Main#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Main Main = new Main();
		GUI DVD_GUI = new GUI();
		boolean result = Main.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Main#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Main Main = new Main();
		GUI DVD_GUI = new GUI();
		boolean result = Main.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link Main#BurnToDVD(GUI)} method.
	* It tests the method with a valid DVD.
	*/
	@Test
	void testBurnToDVDValidDVD() {
		Main Main = new Main();
		GUI DVD_GUI = new GUI();
		boolean result = Main.BurnToDVD(DVD_GUI);
		assertTrue(result);
	}
}

// Menu.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Shane Santner
 * This class creates the DVD menu for the dvd-homevideo application.
 */
public class Menu {

    /**
     * Creates a new instance of Menu
     */
    public Menu() {
    }

    /**
     * Creates a new instance of Menu
     * @param   burnToDVD   boolean value used to determine whether or not to burn to a DVD
     *                      when dvd-homevideo completes
     */
    public Menu(boolean burnToDVD) {
    }

    /**
     * Menu Member Variables
     */
    private boolean m_Burn;

    private String m_growisofs = "growisofs -speed=4 -Z /dev/dvd -dvd-video temp/DVD/";

    private String m_BaseErr = "Burn Error - ";

    /**
     * Optionally burn to DVD when complete and no errors, uses growisofs
     * @param   DVD_GUI    This is the GUI object used to control the form
     * return   A boolean to determine if an error occurred in the function
     */
    public boolean BurnToDVD(GUI DVD_GUI);
}

// MenuTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Menu}.
* It contains ten unit test cases for the {@link