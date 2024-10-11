// Menu_1Test.java


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
* It contains one unit test case for the {@link Menu#createXML()} method.
*/
class Menu_1Test {
		Menu sutMenu;

		/**
		 * Tests the main() method of a {@link Menu} class.
		 */
		@Test
		public void main() {
				sutMenu = new Menu( baseErr );
				sutMenu.createXML();

				assertTrue(!sutMenu.baseErr.equals("") );
				assertTrue( sutMenu.getError() );
				assertEquals( sutMenu.getTitle(), dvd_menu );
				assertEquals( sutMenu.getTextFilePath(), "/root/Text File" );
			}

		/**
         * Tests the createXML() and toString() methods of a {@link Menu} class.
         */
		@Test
		public void toString() {
				Menu sutMenu = new Menu( baseErr );

				// TODO: Add all tests!
				sutMenu.createXML();

				sutMenu.toString();

				assertTrue( sutMenu.getError() );
				System.out.println( "Error Message - " + sutMenu.getError() );
		}
}