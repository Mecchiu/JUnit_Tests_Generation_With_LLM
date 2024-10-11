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
		
    @Test
    public void MenuSubmenus() {
	String menu_path;
	Menu menu;
	int i = 5;

        menu_path = null;
        menu = null;
	
	/**
	* Testing the dvdauthor member function
	*/
     m_GUI = new DVD_GUI();
       m_GUI.init();
	menu_path = "/home/shan.santner/Downloads/DVDs/Avant-GA/DVDMenu/menu.xml";

       menu = new Menu("Menu Test", menu_path, false, m_GUI);
     menu.menu();
    }

	/**
	* Testing a user defined menu with files in a file system
	* and a non PAL DVD.
	*/
	@Test
        public void Menu2FileSystem() {
		String menu_path;
		String menu_fname;

        menu_path = null;
        menu_fname = null;

	/**
	* Testing the dvdauthor member function
	*/
        m_GUI = new DVD_GUI();
        m_GUI.init();
}
}