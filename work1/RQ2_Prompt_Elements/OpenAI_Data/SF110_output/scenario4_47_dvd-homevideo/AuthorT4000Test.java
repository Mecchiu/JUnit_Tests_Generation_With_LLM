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
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		file = new File("dvdauthor.xml");
		
		// Create a new instance of the BufferedWriter class
		writer = new BufferedWriter(new FileWriter(file));
		
		// Write the dvdauthor.xml file
		writer.write("dvdauthor.xml");
		
		// Close the writer
		writer.close();
		
		// Create a new instance of the File class
		