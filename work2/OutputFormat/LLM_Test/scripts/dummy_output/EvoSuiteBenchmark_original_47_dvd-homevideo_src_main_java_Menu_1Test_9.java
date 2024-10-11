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
		/**
		* @jti
		* dvd-menu
		* Read in menus and return a 2d array of menus.
		* @throws FileNotFoundException
		* @throws IOException
		*/
		@Test
		public void readXMLFile() throws FileNotFoundException,
						 IOException {
				// Write out a menubg file
				FileWriter menu_1File = null;
				boolean writeSuccess = false;

				menu_1File = new FileWriter( "src/itest/" + dvd_menu + ".xml" );
				menu_1File.write( "    <menubg>" +
								  "        <title>"+
								  "        <text>"+
								  "                <text>Title</text>" +
								  "            <text>DVD Menu</text>" +
								  "        </text>" +
								  "        </title>"+
								  "        <title>"+
								  "            <text>Audio List</text>" +
								  "        </title>"+
								  "        <title>"+
								  "            <text>Pictures</text>" +
								  "        </title>"+
								  "        </title>"+
								  "        <title>"+
								  "            <text>TitleList</text>" +
								  "        </title>"+
						  "    </menubg>" +
						  "</menubg>" );

				writeSuccess = menu_1File.flush() && menu_1File.getChannel().force(false) == FileChannel.WriteMode.WRITE;

				if( writeSuccess == false ) {
					throw new RuntimeException( baseErr + "Unable to Flush the File Channels" );
				}

				writeSuccess = menu_1File.flush() && menu_1File.getChannel().force(false) == FileChannel.WriteMode.REPLACE;

				menu_1File.getChannel().force( WriteMode.REPLACE );

				menu_1File.flush();

				menu_1File.close();

			    menu_1File = null;

				if( writeSuccess == false ) {
					throw new RuntimeException( baseErr + " Unable to Force flush the File Channels" );
				}

				menu_1File = null;

				// Now close the file
				menu_1File.close();
		}
}