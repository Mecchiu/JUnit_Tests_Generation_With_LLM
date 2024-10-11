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
		public static final String XML_RES_PATH = "../menus";
        public static final String TITLE = "Menu Title";
        public static final String PIC_PATH = "../pic.png";
        public static final String AUDIO = "menu audio path";
        public static final String TITLE_WITHOUT_SPACES = TITLE + " ";
        public static final String AUDIO_WITHOUT_SPACES = AUDIO;
        public static final String TITLE_WITH_SPACES_AND_TAB = TITLE + " " + " ";
        public static final String AUDIO_WITH_TAB_AND_SPACES = AUDIO + "\n  " +
"  ";
        public static final String TITLE_WITH_TAB = TITLE + "\n   ";
        public static final String AUDIO_WITH_TAB = AUDIO + "\n   ";
        public static final String TITLE_IN_DVDS = TITLE + " DVD Menu";
        public static final String AUDIO_IN_DVDS = AUDIO + " DVD Menu";
        public static final String VIDEO_FILES = "VIDEO Filename";
        public static final String AUDIO_FILES = "AUDIO Filename";

	@Test  
	public void testCreateXML() throws FileNotFoundException {
		//Create a file to test XML

		//Write the title in the "title" property

		//Write a file to test XML
		int i=0;
		String path = XML_RES_PATH + File.separator + "menu-" + TITLE + ".xml";
		File f = new File(path);

		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);

		//Write the title in the title property

		//Write a file to test XML
		bw.write("<menu-xml title=\"" + TITLE  +  "\">");

		//Write a file to test XML
		bw.write("<title>" + TITLE  + "</title>");

		//Write a file to test XML
		bw.write("<pic path=\"" + PIC_PATH  + "\">");

		//Write a file to test XML
		bw.write("<audio path=\"" + AUDIO_PATH + "\">");

		//Write a file to test XML
		bw.write("<audio>  " + AUDIO_WITH_TAB + " " + AUDIO_WITH_TAB + AUDIO_WITH_TAB  + AUDIO_WITH_TAB  + AUDIO_WITH_TAB + "</audio>");

		//Write a file to test XML
}
}