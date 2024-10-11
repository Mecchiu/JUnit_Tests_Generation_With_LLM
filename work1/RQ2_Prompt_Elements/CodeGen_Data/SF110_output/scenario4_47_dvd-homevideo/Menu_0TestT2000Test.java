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
private static final int[] s_pt_values = {0};

		private final String AUDIO_PATH =
			"D:\\dvdauthor\\tests\\movies_v4\\pics\\";
		private final int AUDIO_PATH_START_POS = 8;
		private final String AUDIO_FILE =
			"D:\\dvdauthor\\tests\\movies_v4\\music\\";
		private final String TEXT_FILE =
			"D:\\dvdauthor\\tests\\movies_v4\\text_";
		private final String TEXT_FILE_START_POS = 12;
		private final String AUDIO_FILE1 =
			"D:\\dvdauthor\\tests\\movies_v4\\music\\";
		private final int TEXT_FILE1_START_POS = 7;
		private final String[] video_files = {
			AUDIO_PATH, TEXT_FILE
		};
		
		// Used to instantiate a new thread and to perform error checking.
		private final MediaPlayer m_mediaplayer = new MediaPlayer();

		/**
		* Creates and returns an instance of Menu
		*/
		public static Menu getMenu() {
			GUI m_GUI;
			return null;
		}


		@Test
		public void test_init() throws Exception {
			m_GUI = new Menu(BaseGUI.GUI_MENU,  AUDIO_PATH, false, m_mediaplayer);
			assertNotNull(m_GUI);
			m_GUI.init();
			System.out.println("Menu_0Test: init completed");
		}


		@Test
		public void test_DVDMainMenu() throws Exception {
			m_mediaplayer.setOnPrepared(new Runnable() {
		    @Override
		    public void run() {
		    // Make the title text.
			System.out.println("menu_0 test DVD_MainMenu title: " + strTitle);
		  //	System.out.println("menu_0 test DVD_MainMenu audioFile: " + AUDIO_PATH + AUDIO_FILE);
		    }
	    	});
			m_GUI.DVDMainMenu();
			assertNotNull(m_GUI);
			// Now check if the title entry has been updated.
			assertEquals(strTitle, strTitle);
			// Let's make sure it did update properly
			assertEquals(0, m_GUI.getEntryCount(s_pt_values));
		}


		@Test
		public void test_createXML() throws Exception {
			m_GUI = new Menu(BaseGUI.GUI_MENU,  AUDIO_PATH, true, m_mediaplayer);
			assertNotNull(m_GUI);
			m_GUI.createXML();
			System.out.println("Menu_0Test: createXML completed");
		}


		@Test
		public void test_createXML2() throws Exception {
			String[] tmp_files = new String[video_files.length];
			for (int i = 0; i < video_files.length; i++) {
				tmp_files[i] = AUDIO_FILE.concat(".txt");
			}
			File files[] = new File[] {
				new File(AUDIO_PATH_START_POS, AUDIO_FILE.substring(0, AUDIO_FILE.length()-2) + ".txt")
			};
			String filename = files[0].toString();
			m_GUI = new Menu(BaseGUI.GUI_MENU, AUDIO_PATH, false, m_mediaplayer);
			assertNotNull(m_GUI);
			for (int i = 0; i < video_files.length; i++) {
				m_GUI.createXML(AUDIO_PATH, tmp_files[i]);
				assertNotNull(m_GUI);
				assertEquals(i, m_GUI.getEntryCount(s_pt_values));
				// Make sure we did not re-initialize the menu here
				assertEquals(((Menu)m_GUI).getEntryCount(s_pt_values), ((Menu)m_GUI).getEntryCount(s_pt_values));
		   //	assert