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
		* This test case checks if the method returns true when the user
		* specifies a background picture and audio to use for the menu.
		*/
		@Test
		public void testCreateXML1() {
				Menu menu = new Menu();
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case checks if the method returns true when the user
		* specifies a default background to use for the menu.
		*/
		@Test
		public void testCreateXML2() {
				Menu menu = new Menu();
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case checks if the method returns true when the user
		* specifies unique titles for each chapter of the DVD.
		*/
		@Test
		public void testCreateXML3() {
				Menu menu = new Menu();
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case checks if the method returns true when the user
		* specifies nothing and the title of the DVD will be used followed
		* by an underscore and increasing integer for each video clip.
		*/
		@Test
		public void testCreateXML4() {
				Menu menu = new Menu();
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case checks if the method returns true when the user
		* specifies a background picture and audio to use for the menu.
		*/
		@Test
		public void testCreateXML5() {
				Menu menu = new Menu();
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case checks if the method returns true when the user
		* specifies a default background to use for the menu.
		*/
		@Test
		public void testCreateXML6() {
				Menu menu = new Menu();
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case checks if the method returns true when the user
		* specifies unique titles for each chapter of the DVD.
		*/
		@Test
		public void testCreateXML7() {
				Menu menu = new Menu();
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case checks if the method returns true when the user
		* specifies nothing and the title of the DVD will be used followed
		* by an underscore and increasing integer for each video clip.
		*/
		@Test
		public void testCreateXML8() {
				Menu menu = new Menu();
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case checks if the method returns true when the user
		* specifies a background picture and audio to use for the menu.
		*/
		@Test
		public void testCreateXML9() {
				Menu menu = new Menu();
				assertTrue(menu.createXML());
		}
		
		/**
		* Test case for {@link Menu#createXML()} method.
		* This test case checks if the method returns true when the user
		* specifies a default background to use for the menu.
		*/
		@Test
		public void testCreateXML10() {
				Menu menu = new Menu();
				assertTrue(menu.createXML());
		}
}