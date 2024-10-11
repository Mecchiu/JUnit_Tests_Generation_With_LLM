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
		String Path = "D:\\\\Data\\DVDSim\\PC\\dvdauthor\\";
		String filename;

		//TODO - Make all classes to be derived from Menu_1Test class
		public Menu_1Test() {
			filename = Path + "dvdauthor.xml";
		}
		
		//TODO - Make all classes to be derived from Menu_1Test class
		public String strPlausant = "Please select your picture to use for video";
		public String strPicPath = "Select image to use for video";
		public String strAudioPath = "Select audio file for video to use for the menu";
		public String strXMLPath = "Select xml files for menu to use in menus";

		public String[] pList = new String[10];
		public String[] audioList = new String[10];
		public String[] videList= new String[10];

		@Test
		public void TestPlausant(){
			File file = new File(Path + "dvdauthor.xml");
			BufferedReader br = null;
			br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(file.getPath())));
			String line = br.readLine();
			while (line!= null){
				StringTokenizer token2 = new StringTokenizer(line);
				if(token2.nextToken().equalsIgnoreCase("file")){
					pList[0] = token2.nextToken();
				}else if(token2.nextToken().equalsIgnoreCase("audio")){
					audioList[0] = token2.nextToken();
				}else if(token2.nextToken().equalsIgnoreCase("videos")){
					videList[0] = token2.nextToken();
				}else{
					System.out.println(String.format("Line: %s is invalid.  " +
							"Please see above for more information.", token2.nextToken()));
					break;
				}
				line = br.readLine();
			}
			
		}
		
	@Test
	public void TestPlausant_3() {
		//TODO - Create function to test inital line
	}

	@Test
	public void TestXML_Plausant(){
		int p = 0;
		int audio = 0;
		int vide = 0;
		File dirName = new File(Path + "dvdauthor");
		File xmlFile = new File(Path + "D:\\\\Data\\DVDSim\\PC\\dvdauthor\\");
		File testXML = new File(Path + "D:\\DVDAuthor_XML2_Test\\DVDAuthor_1");
		File nameList = new File(testXML.getAbsolutePath()
				+ File.separator
				+ "dvdauthor_names");
		File name = new File(nameList.getAbsolutePath()
				+ File.separator
				+ (p++), "Name"
				+ "P"
				+ "P"
				+ "I"
				+ "M"
				+ "D"
				+ "N"
				+ "E"
				+ "S"
				+ "C"
				+ "d"
				+ "w"
				+ "e");
		File dir = new File(dirName.getAbsolutePath()
				+ File.separator
				+ "dvdauthor");
		String nameString = "Name ";
		//Create a new empty string
		nameString = nameString.concat(nameString);
		
		//Create FileWriter to write to file
		FileWriter out = null;
}
}