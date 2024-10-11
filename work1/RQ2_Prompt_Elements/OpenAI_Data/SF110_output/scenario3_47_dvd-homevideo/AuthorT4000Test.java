// AuthorTest.java


import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Author}.
* It contains ten unit test cases for the {@link Author#CreateDVDFileStructure(GUI)} method.
*/
class AuthorTest {

	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)}
	*
	* @param DVD_GUI This is the GUI object used to control the form
	* @return A boolean to determine if an error occurred in the function
	*/
	@Test
	void testCreateDVDFileStructure() {
		// TODO
	}
}

// Burn.java
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;

/**
 * @author Shane Santner
 * This class will burn the DVD filesystem to disc.
 *
 * TODO - Need to handle input, output and error streams
 *        more appropriatly.
 */
public class Burn {

    /**
     * Burn the DVD filesystem to disc using growisofs
     *
     * @param DVD_GUI This is the GUI object used to control the form
     * @return A boolean to determine if an error occurred in the function
     */
    public boolean BurnDVD(GUI DVD_GUI);
}

// BurnTest.java


import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Burn}.
* It contains ten unit test cases for the {@link Burn#BurnDVD(GUI)} method.
*/
class BurnTest {
		
	/**
	* Test case for {@link Burn#BurnDVD(GUI)}
	*
	* @param DVD_GUI This is the GUI object used to control the form
	* @return A boolean to determine if an error occurred in the function
	*/
	@Test
	void testBurnDVD() {
		// TODO
	}
}

// GUI.java
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;

/**
 * @author Shane Santner
 * This class will create the GUI for the application.
 *
 * TODO - Need to handle input, output and error streams
 *        more appropriatly.
 */
public class GUI {

    /**
     * Create the GUI for the application
     *
     * @param args This is the command line arguments
     * @return A boolean to determine if an error occurred in the function
     */
    public boolean CreateGUI(String[] args);
}

// GUITest.java


import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GUI}.
* It contains ten unit test cases for the {@link GUI#CreateGUI(String[])} method.
*/
class GUITest {
		
	/**
	* Test case for {@link GUI#CreateGUI(String[])}
	*
	* @param args This is the command line arguments
	* @return A boolean to determine if an error occurred in the function
	*/
	@Test
	void testCreateGUI() {
		// TODO
	}
}

// Main.java
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;

/**
 * @author Shane Santner
 * This class will create the GUI for the application.
 *
 * TODO - Need to handle input, output and error streams
 *        more appropriatly.
 */
public class Main {

    /**
     * Create the GUI for the application
     *
     * @param args This is the command line arguments
     * @return A boolean to determine if an error occurred in the function
     */
    public static void main(String[] args);
}

// MainTest.java


import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
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
	* @return A boolean to determine if an error occurred in the function
	*/
	@Test
	void testMain() {
		// TODO
	}
}

// Menu.java
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;

/**
 * @author Shane Santner
 * This class will create the DVD menu.
 *
 * TODO - Need to handle input, output and error streams
 *        more appropriatly.
 */
public class Menu {

    /**
     * Create the DVD menu using dvdauthor
     *
     * @param DVD_GUI This is the GUI object used to control the form
     * @return A boolean to determine if an error occurred in the function
     */
    public boolean CreateDVDMenu(GUI DVD_GUI);
}

// MenuTest.java


import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Menu}.
* It contains ten unit test cases for the {@link Menu#CreateDVDMenu(GUI)} method.
*/
class MenuTest {
		
	/**
	* Test case for {@link Menu#CreateDVDMenu(GUI)}
	*
	* @param DVD_GUI This is the GUI object used to control the form
	* @return A boolean to determine if an error occurred in the function
	*/
	@Test
	void testCreateDVDMenu() {
		// TODO
	}
}

// Transcode.java
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;

/**
 * @author Shane Santner
 * This class will transcode the video files to the proper format.
 *
 * TODO - Need to handle input, output and error streams
 *        more appropriatly.
 */
public class Transcode {

    /**
     * Transcode the video files to the proper format using ffmpeg
     *
     * @param DVD_GUI This is the GUI object used to control the form
     * @return A boolean to determine if an error occurred in the function
     */
    public boolean TranscodeVideo(GUI DVD_GUI);
}

// TranscodeTest.java


import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transcode}.
* It contains ten unit test cases for the {@link Transcode#TranscodeVideo(GUI)} method.
*/
class TranscodeTest {
		
	/**
	* Test case for {@link Transcode#TranscodeVideo(GUI)}
	*
	* @param DVD_GUI This is the GUI object used to control the form
	* @return A boolean to determine if an error occurred in the function
	*/
	@Test
	void testTranscodeVideo() {
		// TODO
	}
}