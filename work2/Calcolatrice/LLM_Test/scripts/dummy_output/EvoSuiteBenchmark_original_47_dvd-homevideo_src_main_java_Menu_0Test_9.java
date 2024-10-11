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
	 * Test {@link Menu#init()} with an optional picture and audio file that will
	 * be used to create the menu
	 * @throws  IOException
	*/
	@Test
	public void Menu_0Test_1() throws FileNotFoundException, IOException {
		
		File pathTemp = new File("/Users/shane/Documents/Music/SimpleMusic/Samples/");
		pathTemp.mkdir();
		String base = "/Users/shane/Samples/SimpleMusic/Samples/"; // "/Users/shane/Documents/Music/SimpleMusic/Samples/";
		String title = "/Users/shane/Documents/Music/SimpleMusic/SimpleMusic/Samples/";
		
		File testDir = new File(base + title + dvd_menu + File.separator + "1");

		//System.out.println("testFilePath : " + testDir.getAbsolutePath());

		Video v1 = new Video("s1_10.avi","0");
		Video v2 = new Video("s1_10.avi","1");
		Video v3 = new Video("s1_10.avi","2");
		Video v4 = new Video("s1_10.avi","3");
		Video vt = new Video("s2_2.avi","4");
		Video v5 = new Video("s2_2.avi","5");

		Menu w1 = new Menu(title,pathTemp.getAbsolutePath()+"1","1","0","/Users/shane/Samples/");
		Menu w2 = new Menu(title,pathTemp.getAbsolutePath()+"2","2","1","/Users/shane/Samples/");
		Menu w3 = new Menu(title,base+"3",pathTemp.getAbsolutePath()+"3","3","1","/Users/shane/Samples/");

		v1.setMenu(w1);
		//w1.setTitle(title); // set the title on the Video.
		v2.setMenu(w2);
		v3.setMenu(w3);
		v2.setTitles(new String[]{"s3_1.avi"});
		v3.setTitles(new String[]{"s3_1.avi"});
		v3.setType(1);
		v1.setType(3);
		v2.setType(1);
		v3.setType(3);
		v1.setVideo(v2);
		w3.setVideo(v3);
		w2.setVideo(v2);
		w3.setVideo(v2);
		
		v1.addToMenu(true);
		Thread.sleep(100);
		
		System.out.println(v3.getIndex());
		
		v1.open();
		System.out.println(w1.open());
		System.out.println(w3.open());
		
		Thread.sleep(100);
		
		Menu w3b = w3.close();
		
		System.out.println("The Menu is : " + w3b.getTitle());
		System.out.println ("The List is : "+ w3b.getVideo());
		System.out.println("The Menu's Title is :" + w3b.getTitle()+baseStr);
		
	}
}