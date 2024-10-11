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
	 * Menu Member Variables
	 */
	private String strTitle = "";
	private String strPicPath = "";
	private boolean isPal_menu = false;

	/**
	 * Menu File Methods
	 */
	MenuMenu(String t, String S, GUI g, String s, String d, String t) throws FileNotFoundException{
		dvd_menu = d;
		createXML = s == null && d == null;

		readXML(g,t);

		readTextFilePath(s);

		readAudioFolder(s);
	}

	/**
	 * Menu File Methods
	 */
	MenuMenu(String t, String S, GUI g, String s, String d, String s2, String l, String t) throws FileNotFoundException {
		dvd_menu = d;
		String s3 = (l == null)? "" : l;
		String l3 = (s2!= null)? s2 : "";
		String s4 = (l3 == null)? "" : l3;

		createXML = s!= null;

		readXML(g,t);

		readTextFilePath(s);

		readAudioFolder(s);

		readTextFilePath(s);

		readAudioFilePath(s);

		readAudioFilePath(s2);
		readAudioFilePath(l3);
		readAudioFilePath(l4);
		readAudioFilePath(l5);

	}

	/**
	 * Menu File Methods
	 */
	MenuMenu(String t, String S, LCD g) throws FileNotFoundException {
		dvd_menu = d;
		String s0 = g.getText(LCD.FONT_GREEN, "Menu", 0);
		assertEquals(t+">", s0);
	}

	/**
	 * Menu File Methods
	 */
	MenuMenu(String t, String S, LCD g, String s) throws FileNotFoundException {
		dvd_menu = d;
		String s1 = g.getText(LCD.FONT_GREEN, "Menu", 1);
		assertEquals(t+">", s1);
		readTextFilePath(s);
	}


	/**
	 * Menu File Methods
	 */
    MenuMenu(String t, String S) throws FileNotFoundException {
        dvd_menu = d;
        createXML = s!= null;
    }

	@Test
	/**
	 * readXML
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void readXML(GUI g,String t) throws FileNotFoundException, IOException{

		System.out.println("Reading XML - "+ t);
		System.out.println("Input: "+ strTitle);
		System.out.println("Pitch: "+pitch);
		System.out.println("Version: "+version);

		StringBuilder sb = new StringBuilder("<Menu menuFile=\"");
		sb.append(dvd_menu);
		sb.append("\">");

		InputStreamReader br = new InputStreamReader(getClass().getClassLoader().getResourceAsStream(t));

		BufferedReader br2 = new BufferedReader(br);

		String str;

		while ((str = br2.readLine())!= null){
			sb.append(str);
		}

		br2.close();

		br = new InputStreamReader(getClass().getClassLoader().getResourceAsStream(S));

		BufferedReader br2s = new BufferedReader(br);

		String str2;

		while ((str2 = br2s.readLine())!= null){
			sb.append(str2);
		}

		br2.close();

		assertEquals(strTitle, sb.toString());
	}

	/**
	 * readTextFilePath
	 * @param s Path to text file
	 */
	void readTextFilePath(String s) throws FileNotFoundException {
		StringTokenizer st = new StringTokenizer(s,".");
}
}