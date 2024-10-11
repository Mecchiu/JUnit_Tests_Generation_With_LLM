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
	* Test case for {@link Burn#BurnToDVD(GUI)}
	*
	* @param DVD_GUI This is the GUI object used to control the form
	* @return   A boolean to determine if an error occurred in the function
	*/
	@Test
	void testBurnToDVD() {
		// TODO
	}
}

// DVD.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Shane Santner
 * This class creates the DVD file structure using dvd-author
 */
public class DVD {

    /**
     * Create the DVD file structure using dvd-author
     *
     * @param DVD_GUI This is the GUI object used to control the form
     * return   A boolean to determine if an error occurred in the function
     */
    public boolean CreateDVD(GUI DVD_GUI);
}

// DVDTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DVD}.
* It contains ten unit test cases for the {@link DVD#CreateDVD(GUI)} method.
*/
class DVDTest {
		
	/**
	* Test case for {@link DVD#CreateDVD(GUI)}
	*
	* @param DVD_GUI This is the GUI object used to control the form
	* @return   A boolean to determine if an error occurred in the function
	*/
	@Test
	void testCreateDVD() {
		// TODO
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
 * This class creates the GUI for the DVD authoring program
 */
public class GUI {

    /**
     * Create the GUI for the DVD authoring program
     *
     * return   A boolean to determine if an error occurred in the function
     */
    public boolean CreateGUI();
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
* It contains ten unit test cases for the {@link GUI#CreateGUI()} method.
*/
class GUITest {
		
	/**
	* Test case for {@link GUI#CreateGUI()}
	*
	* @return   A boolean to determine if an error occurred in the function
	*/
	@Test
	void testCreateGUI() {
		// TODO
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
 * This class is the main class for the DVD authoring program
 */
public class Main {

    /**
     * Main class for the DVD authoring program
     *
     * @param args This is the command line arguments
     * return   A boolean to determine if an error occurred in the function
     */
    public static void main(String[] args);
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
* It contains ten unit test cases for the {@link Main#main(String[])} method.
*/
class MainTest {
		
	/**
	* Test case for {@link Main#main(String[])}
	*
	* @param args This is the command line arguments
	* @return   A boolean to determine if an error occurred in the function
	*/
	@Test
	void testMain() {
		// TODO
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
 * This class creates the DVD menu using dvdauthor
 */
public class Menu {

    /**
     * Create the DVD menu using dvdauthor
     *
     * @param DVD_GUI This is the GUI object used to control the form
     * return   A boolean to determine if an error occurred in the function
     */
    public boolean CreateMenu(GUI DVD_GUI);
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
* It contains ten unit test cases for the {@link Menu#CreateMenu(GUI)} method.
*/
class MenuTest {
		
	/**
	* Test case for {@link Menu#CreateMenu(GUI)}
	*
	* @param DVD_GUI This is the GUI object used to control the form
	* @return   A boolean to determine if an error occurred in the function
	*/
	@Test
	void testCreateMenu() {
		// TODO
	}
}

// Video.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Shane Santner
 * This class creates the DVD video using ffmpeg
 */
public class Video {

    /**
     * Create the DVD video using ffmpeg
     *
     * @param DVD_GUI This is the GUI object used to control the form
     * return   A boolean to determine if an error occurred in the function
     */
    public boolean CreateVideo(GUI DVD_GUI);
}

// VideoTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Video}.
* It contains ten unit test cases for the {@link Video#CreateVideo(GUI)} method.
*/
class VideoTest {
		
	/**
	* Test case for {@link Video#CreateVideo(GUI)}
	*
	* @param DVD_GUI This is the GUI object used to control the form
	* @return   A boolean to determine if an error occurred in the function
	*/
	@Test
	void testCreateVideo() {
		// TODO
	}
}