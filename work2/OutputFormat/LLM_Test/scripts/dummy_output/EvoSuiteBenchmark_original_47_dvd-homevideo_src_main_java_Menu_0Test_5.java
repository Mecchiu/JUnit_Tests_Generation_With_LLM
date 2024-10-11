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
		 * Initializes the class with the baseDir and baseErr
		 */
		public final static void baseDir(String base) {
			System.setProperty("baseDir", base);
		}

		/**
		 * Initialize the class with the input parameters
		 */
		public final static void baseErr(String base) {
			base = base;
		}

		/**
		 * Tests the {@link Menu#DVDMainMenu()} method. 
		 * @throws  Exception
		 */
		@Test
		public final void testDVDMainMenu() throws Exception {
			Menu menu;
	
			baseDir(menu.getBaseDir());
			
			// make an XML file to be sure the directory exists already is not empty
			File dir = new File("D:\\" + menu.getBaseDir() + "/xmltest.xml");
			if (!dir.exists()) {
				dir.mkdir();
			}
			
			// Create and open a file to be used as the parameter for the DVD main menu.
			
			FileWriter writer = null;
			BufferedWriter reader = null;
			
			// Check that there is no error yet
			
			m_GUI = new DVD_GUI();
			assertNoError();
			
	        try {
					reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("D:\\" + menu.getBaseDir() + "/xmlinst.xml").getAbsolutePath())));
				String line1 = "<?xml version=\"1.0\" encoding=\"" + "UTF-8\"?>" + 
		            "<menu>" +
		            "<command key=\"D\" cmd=\"1\">dvd-menu</command>" +
		            "<command key=\"f2\" cmd=\"cd\">dvd-openfile.xml</command>" +
		            "<command key=\"d\" cmd=\"2\">dvd-next.xml</command>" +
				"</menu>";
				assertEquals("Wrong DVD Main Menu XML output ", line1, reader.readLine());
				
				// Check the contents of the file
				
				writer = new BufferedWriter(new FileWriter(new File("D:\\" + menu.getBaseDir() + "/xmlinst.xml").getName()));
				while ((line = reader.readLine())!= null) {
					writer.write(line);
		            writer.newLine();
				}
				
			} catch (Exception e) {
				System.err.println("Error creating text file");
				e.printStackTrace();
			} finally {
				try {
					writer.close();
				} catch (IOException ioe) {
					System.err.println("Error closing text file");
					ioe.printStackTrace();
					return;
				}
				try {
					reader.close();
				} catch (IOException ioe) {
					System.err.println("Error closing stream");
					ioe.printStackTrace();
					return;
				}
			}
			// Check that there is no error yet.  In an ideal it would always return.
			assertNoError();
		}
		
		/**
		 * Tests the {@link Menu#DVDMainMenu()} method with parameters not 
		 * including the baseDir.  
		 * @throws  Exception
		 */
		@Test
		public final void testDVDMultiMenu() throws Exception {
			Menu menu;
			baseDir(menu.getBaseDir());
			// make an XML file to be sure the directory exists already is not empty
					File dir = new File("D:\\" + menu.getBaseDir() + "/xmltest.xml");
					if (!dir.exists()) {
						dir.mkdir();
					}
		
			// Create and open a file to be used as the parameter for the DVD main menu.
			
			FileWriter writer = null;
			BufferedWriter reader = null;
			
			// Check that there is no error yet
			
			menu = new Menu();
			menu.DVDMainMenu();
			assertNoError();
			
}
}