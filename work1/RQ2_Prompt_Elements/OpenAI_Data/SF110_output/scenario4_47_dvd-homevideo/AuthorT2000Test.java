// AuthorTest.java


import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Author}.
* It contains ten unit test cases for the {@link Author#CreateDVDFileStructure(GUI)} method.
*/
class AuthorTest {

	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)}
	*
	* @throws IOException
	*/
	@Test
	void testCreateDVDFileStructure() throws IOException {
		
		// Create a new instance of the Author class
		Author author = new Author();
		
		// Create a new instance of the GUI class
		GUI DVD_GUI = new GUI();
		
		// Create a new instance of the File class
		File file = new File("vmgm.xml");
		
		// Create a new instance of the BufferedWriter class
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
		// Write the XML file
		writer.write("<dvdauthor dest=\"DVD\">\n");
		writer.write("<vmgm>\n");
		writer.write("<menus>\n");
		writer.write("<video format=\"ntsc\" aspect=\"4:3\" resolution=\"720x480\" />\n");
		writer.write("<pgc>\n");
		writer.write("<vob file=\"menu.mpg\" pause=\"inf\" />\n");
		writer.write("<post>\n");
		writer.write("jump menu 1;\n");
		writer.write("</post>\n");
		writer.write("</pgc>\n");
		writer.write("</menus>\n");
		writer.write("</vmgm>\n");
		writer.write("<titleset>\n");
		writer.write("<titles>\n");
		writer.write("<video format=\"ntsc\" aspect=\"4:3\" resolution=\"720x480\" />\n");
		writer.write("<pgc>\n");
		writer.write("<vob file=\"video.mpg\" pause=\"inf\" />\n");
		writer.write("<post>\n");
		writer.write("jump menu 1;\n");
		writer.write("</post>\n");
		writer.write("</pgc>\n");
		writer.write("</titles>\n");
		writer.write("</titleset>\n");
		writer.write("</dvdauthor>\n");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("menu.mpg");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the menu.mpg file
		writer.write("menu.mpg");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("video.mpg");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the video.mpg file
		writer.write("video.mpg");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("DVD");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the DVD file
		writer.write("DVD");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("DVD/VIDEO_TS");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the VIDEO_TS file
		writer.write("VIDEO_TS");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("DVD/VIDEO_TS/VTS_01_0.IFO");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the VTS_01_0.IFO file
		writer.write("VTS_01_0.IFO");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("DVD/VIDEO_TS/VTS_01_0.BUP");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the VTS_01_0.BUP file
		writer.write("VTS_01_0.BUP");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("DVD/VIDEO_TS/VTS_01_1.VOB");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the VTS_01_1.VOB file
		writer.write("VTS_01_1.VOB");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("DVD/VIDEO_TS/VTS_01_2.VOB");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the VTS_01_2.VOB file
		writer.write("VTS_01_2.VOB");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("DVD/VIDEO_TS/VTS_01_3.VOB");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the VTS_01_3.VOB file
		writer.write("VTS_01_3.VOB");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("DVD/VIDEO_TS/VTS_01_4.VOB");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the VTS_01_4.VOB file
		writer.write("VTS_01_4.VOB");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("DVD/VIDEO_TS/VTS_01_5.VOB");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the VTS_01_5.VOB file
		writer.write("VTS_01_5.VOB");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("DVD/VIDEO_TS/VTS_01_6.VOB");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the VTS_01_6.VOB file
		writer.write("VTS_01_6.VOB");
		
		// Close the writer
	