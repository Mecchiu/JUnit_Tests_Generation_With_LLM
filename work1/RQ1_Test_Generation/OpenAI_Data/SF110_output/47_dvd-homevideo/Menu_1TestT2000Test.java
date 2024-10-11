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
* It contains ten unit test cases for the {@link Menu#createXML()} method.
*/
class Menu_1Test {

		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case checks if the method creates the xml file correctly.
		*/
		@Test
		void testCreateXML() {
				
				// Create a new Menu object
				Menu menu = new Menu();
				
				// Create a new File object
				File xmlFile = new File("vmgm.xml");
				
				// Create a new File object
				File ListDir = new File(".");
				
				// Create a new FilenameFilter object
				FilenameFilter filter = new FilenameFilter() {
						
						boolean ret_val = true;
						
						public boolean accept(File dir, String name) {
								if (name.endsWith("vob")) {
										if (!name.equals("menu.vob"))
												ret_val = true;
										else
												ret_val = false;
								} else
										ret_val = false;
								return ret_val;
						}
				};
				
				// Create a new String array
				String[] video_files = ListDir.list(filter);
				
				// Create a new BufferedWriter object
				BufferedWriter writer = new BufferedWriter(new FileWriter(xmlFile));
				
				// Create a new StringTokenizer object
				StringTokenizer st;
				
				// Create a new BufferedReader object
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(xmlFile)));
				
				// Create a new String
				String line;
				
				// Create a new String
				String line2;
				
				// Create a new String
				String line3;
				
				// Create a new String
				String line4;
				
				// Create a new String
				String line5;
				
				// Create a new String
				String line6;
				
				// Create a new String
				String line7;
				
				// Create a new String
				String line8;
				
				// Create a new String
				String line9;
				
				// Create a new String
				String line10;
				
				// Create a new String
				String line11;
				
				// Create a new String
				String line12;
				
				// Create a new String
				String line13;
				
				// Create a new String
				String line14;
				
				// Create a new String
				String line15;
				
				// Create a new String
				String line16;
				
				// Create a new String
				String line17;
				
				// Create a new String
				String line18;
				
				// Create a new String
				String line19;
				
				// Create a new String
				String line20;
				
				// Create a new String
				String line21;
				
				// Create a new String
				String line22;
				
				// Create a new String
				String line23;
				
				// Create a new String
				String line24;
				
				// Create a new String
				String line25;
				
				// Create a new String
				String line26;
				
				// Create a new String
				String line27;
				
				// Create a new String
				String line28;
				
				// Create a new String
				String line29;
				
				// Create a new String
				String line30;
				
				// Create a new String
				String line31;
				
				// Create a new String
				String line32;
				
				// Create a new String
				String line33;
				
				// Create a new String
				String line34;
				
				// Create a new String
				String line35;
				
				// Create a new String
				String line36;
				
				// Create a new String
				String line37;
				
				// Create a new String
				String line38;
				
				// Create a new String
				String line39;
				
				// Create a new String
				String line40;
				
				// Create a new String
				String line41;
				
				// Create a new String
				String line42;
				
				// Create a new String
				String line43;
				
				// Create a new String
				String line44;
				
				// Create a new String
				String line45;
				
				// Create a new String
				String line46;
				
				// Create a new String
				String line47;
				
				// Create a new String
				String line48;
				
				// Create a new String
				String line49;
				
				// Create a new String
				String line50;
				
				// Create a new String
				String line51;
				
				// Create a new String
				String line52;
				
				// Create a new String
				String line53;
				
				// Create a new String
				String line54;
				
				// Create a new String
				String line55;
				
				// Create a new String
				String line56;
				
				// Create a new String
				String line57;
				
				// Create a new String
				String line58;
				
				// Create a new String
				String line59;
				
				// Create a new String
				String line60;
				
				// Create a new String
				String line61;
				
			