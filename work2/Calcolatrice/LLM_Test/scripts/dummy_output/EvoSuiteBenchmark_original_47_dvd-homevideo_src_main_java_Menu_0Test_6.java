// Menu_0Test.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FilenameFilter;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Menu}.
* It contains one unit test case for the {@link Menu#init()} method.
*/
class Menu_0Test {
		/**
		* Initializes a new instance of {@link Menu}
		*/
		public Menu_0Test() {
		}

		/**
		* Tests the menu file has been created with required parameters.
		* @throws IOException This exception will also be thrown if {@link #init()} fails.
		*/
		@Test
		public void testXMLCreation() throws IOException {
			File testfile = new File("MenuTestFile.xml");
			//create the XML file with dvd-menu
			createXMLButton();
			Menu mdl = new Menu();
			String returnvalue = mdl.init();
			//Check results of Menu.init() vs. returnvalue
			assertTrue("Menu Creation Error", returnvalue.toLowerCase().equals("ok"));
		}

		/**
		* Checks that an XML file with dvd-menu menu is created
		* using a required XMLElements object with a required value.
		* @throws IOException This exception will also be thrown if {@link #init()} fails.
		*/
		@Test
		public void testFileElementCreation() throws IOException {
			createXMLButton();
			Menu mdl = new Menu(dvd_menu);
			String returnvalue = mdl.init();
			//Check results of Menu.init() vs. returnvalue
			assertTrue("Menu Creation Error", returnvalue.toLowerCase().equals("ok"));
		}

		/**
		* Test a file without a required menu
		* This file is used by other tests.
		* @throws IOException This exception will also be thrown if {@link #init()} fails.
		*/
		@Test
		public void testFileWithoutMenu() throws IOException {
			//create a file with 2 title, title and DVD menu buttons
			File testfile = new File("MenuTestFile.txt");
			createXMLButton();
			Menu mdl = new Menu();
			String returnvalue = mdl.init();
			//Check results of Menu.init() vs. returnvalue
			assertTrue("File Creation Error", returnvalue.toString().equals("The DVD menu is not used as a menu.")
						|| returnvalue.toString().equals("This file is not used in the menus"));
		}

		/**
		* Test a file with a non-default menu
		* This file contains a title, track, and DVD menu button
		* @throws IOException This exception will also be thrown if {@link #init()} fails.
		*/
		@Test
		public void testFileWithMenu() throws IOException {
			//create a file with 2 title, title and track with DVD menu button
			File testfile = new File("menu_2_track_2_title.txt");
			createXMLButton();
			Menu mdl = new Menu();
			String returnvalue = mdl.init();
			//Check results of Menu.init() vs. returnvalue
			assertTrue("File Creation Error", returnvalue.toString().equals("The DVD menu is not used as a menu.")
						|| returnvalue.toString().equals("This file is not used in the menus"));
		}
}

/**
 * Main Test.java
 */
public class Menu_0Test {
	/**
	 * Main class for the {@link Menu}
	 * @throws FileNotFoundException
	 */
	@Test
	public void testFileCreation() throws FileNotFoundException {
		if (!menu_3_test()) {
			file1_menu_1();
		} else {
			file1_menu_3();
		}
	}
	@Test
	public void testFileButtonCreation() throws FileNotFoundException {
		menu_menu_button_menu();
	}
	@Test
	public void testFileElementCreation() throws FileNotFoundException {
		menu_menu_button();
	}
}