// MapFilesListerTest.java
package common;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapFilesLister}.
* It contains ten unit test cases for the {@link MapFilesLister#ListMaps(String)} method.
*/
class MapFilesListerTest {

		private static final Logger logger = Logger.getLogger(MapFilesListerTest.class);
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps2() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps3() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps4() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps5() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps6() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps7() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps8() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps9() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
		
		/**
		* Test case for {@link MapFilesLister#ListMaps(String)} method.
		* It tests if the method returns a list of files.
		*/
		@Test
		void testListMaps10() {
				MapFilesLister mfl = new MapFilesLister();
				Vector<File> files = mfl.ListMaps("maps");
				assertNotNull(files);
		}
}