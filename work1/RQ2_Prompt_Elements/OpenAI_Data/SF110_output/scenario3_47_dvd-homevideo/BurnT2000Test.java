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
	* return   A boolean to determine if an error occurred in the function
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
 * This class is the main class that controls the DVD creation process.
 */
public class DVD {

    /**
     * This is the main function that controls the DVD creation process.
     *
     * @param args This is the command line arguments
     */
    public static void main(String[] args);
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
* It contains ten unit test cases for the {@link DVD#main(String[])} method.
*/
class DVDTest {
		
	/**
	* Test case for {@link DVD#main(String[])}
	*
	* @param args This is the command line arguments
	*/
	@Test
	void testMain() {
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
 * This class is the main GUI class that controls the form.
 */
public class GUI {

    /**
     * This is the main function that controls the GUI form.
     *
     * @param args This is the command line arguments
     */
    public static void main(String[] args);
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
* It contains ten unit test cases for the {@link GUI#main(String[])} method.
*/
class GUITest {
		
	/**
	* Test case for {@link GUI#main(String[])}
	*
	* @param args This is the command line arguments
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
 * This class creates the DVD menu structure.
 */
public class Menu {

    /**
     * This function creates the DVD menu structure.
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
	* return   A boolean to determine if an error occurred in the function
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
 * This class creates the DVD video structure.
 */
public class Video {

    /**
     * This function creates the DVD video structure.
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
	* return   A boolean to determine if an error occurred in the function
	*/
	@Test
	void testCreateVideo() {
		// TODO
	}
}