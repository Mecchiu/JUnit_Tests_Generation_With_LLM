// MenuTest.java


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
* It contains ten unit test cases for the {@link Menu#createXML()} method.
*/
class MenuTest {

		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case tests the method with a valid background image and audio file.
		*/
		@Test
		public void testCreateXML1() {
				Menu menu = new Menu();
				menu.setBackgroundImage("/home/santner/Pictures/background.jpg");
				menu.setBackgroundAudio("/home/santner/Music/background.mp3");
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case tests the method with a valid background image and no audio file.
		*/
		@Test
		public void testCreateXML2() {
				Menu menu = new Menu();
				menu.setBackgroundImage("/home/santner/Pictures/background.jpg");
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case tests the method with a valid background audio and no image file.
		*/
		@Test
		public void testCreateXML3() {
				Menu menu = new Menu();
				menu.setBackgroundAudio("/home/santner/Music/background.mp3");
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case tests the method with no background image or audio file.
		*/
		@Test
		public void testCreateXML4() {
				Menu menu = new Menu();
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case tests the method with a valid background image and audio file,
		* and a valid chapter title.
		*/
		@Test
		public void testCreateXML5() {
				Menu menu = new Menu();
				menu.setBackgroundImage("/home/santner/Pictures/background.jpg");
				menu.setBackgroundAudio("/home/santner/Music/background.mp3");
				menu.setChapterTitle("Chapter 1");
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case tests the method with a valid background image and audio file,
		* and a valid chapter title.
		*/
		@Test
		public void testCreateXML6() {
				Menu menu = new Menu();
				menu.setBackgroundImage("/home/santner/Pictures/background.jpg");
				menu.setBackgroundAudio("/home/santner/Music/background.mp3");
				menu.setChapterTitle("Chapter 1");
				menu.setChapterTitle("Chapter 2");
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case tests the method with a valid background image and audio file,
		* and a valid chapter title.
		*/
		@Test
		public void testCreateXML7() {
				Menu menu = new Menu();
				menu.setBackgroundImage("/home/santner/Pictures/background.jpg");
				menu.setBackgroundAudio("/home/santner/Music/background.mp3");
				menu.setChapterTitle("Chapter 1");
				menu.setChapterTitle("Chapter 2");
				menu.setChapterTitle("Chapter 3");
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case tests the method with a valid background image and audio file,
		* and a valid chapter title.
		*/
		@Test
		public void testCreateXML8() {
				Menu menu = new Menu();
				menu.setBackgroundImage("/home/santner/Pictures/background.jpg");
				menu.setBackgroundAudio("/home/santner/Music/background.mp3");
				menu.setChapterTitle("Chapter 1");
				menu.setChapterTitle("Chapter 2");
				menu.setChapterTitle("Chapter 3");
				menu.setChapterTitle("Chapter 4");
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case tests the method with a valid background image and audio file,
		* and a valid chapter title.
		*/
		@Test
		public void testCreateXML9() {
				Menu menu = new Menu();
				menu.setBackgroundImage("/home/santner/Pictures/background.jpg");
				menu.setBackgroundAudio("/home/santner/Music/background.mp3");
				menu.setChapterTitle("Chapter 1");
				menu.setChapterTitle("Chapter 2");
				menu.setChapterTitle("Chapter 3");
				menu.setChapterTitle("Chapter 4");
				menu.setChapterTitle("Chapter 5");
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case tests the method with a valid background image and audio file,
		* and a valid chapter title.
		*/
		@Test
		public void testCreateXML10() {
				Menu menu = new Menu();
				menu.setBackgroundImage("/home/santner/Pictures/background.jpg");
				menu.setBackgroundAudio("/home/santner/Music/background.mp3");
				menu.setChapterTitle("Chapter 1");
				menu.setChapterTitle("Chapter 2");
				menu.setChapterTitle("Chapter 3");
				menu.setChapterTitle("Chapter 4");
				menu.setChapterTitle("Chapter 5");
				menu.setChapterTitle("Chapter 6");
				assertTrue(menu.createXML());
		}
}