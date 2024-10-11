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
		Menu m_Menu;


			public enum Title {
				TEST  //Test Title
			}


			private Title m_Title;



			public Menu_1Test() {
			}

	/**
	*	Creates and initializes the Menu.
	*	This method is executed during the run() method of the main thread.
	*	@return  A boolean indicating if createXML() succeeds or not
	*/
	public boolean execute() {
		return m_Menu.createXML();
	}


		public void setTitle(String t_c) {
		this.m_Title = Title.valueOf(t_c);
	}

		public String getTitle() {
		return m_Title.toString();
	}

	public int numTitles() {
	return titles.length;
	}



	public void setMenu(String path) {
		File testFile = new File(path);
		try {
			writeXML(testFile.getAbsolutePath());
			if (testFile.exists()) {
				return;
			}
		} catch (java.io.IOException e) {
		}
		System.out.println(baseErr+"Warning - "
			+ "Menu path, "
			+ "does not exist, "
			+ "and could not be built."
			+ "Please make sure "+testFile.getAbsolutePath()+" exists and it's not created beforehand."
			);
		}

	/**
	* Method to retrieve all the video files contained in a DVD.
	* The variable contains a list of files to be read sequentially
	* within the DVD. This means that all unique titles of a given
	* file are written sequentially as determined by the title sequence.
	* The titles of the files are stored first by name and then
	* by number.
	* @return returns the path to the list of files to be read sequentially
	*/
	public String[] readTest() {
	File testFile = new File(VideoList.getTestFilePath());
	File[] audioFiles = testFile.listFiles(new FilenameFilter() {
	    @Override
	    public boolean accept(File d, String name) {
	        return name.endsWith(".ogg");
	    }
	}
	);
	String[] audioFiles1 = audioFiles[audioFiles.length-1].list();
	String[] audioFiles2 = { "index.ogg","poster.ogg","title.vhd" };
	return audioFiles2;
	}

public class VideoList {
	String file1 = "test/DVDAuthorTest/DVDAuthorTest.avi";
	String file2 = "test/XML Test/XML Test/XML Test/XML Test/XML Test/XML Test/XML Test/XML Test/XML Test/XML Test/XML Test/dvdauthor.xml";
}
}