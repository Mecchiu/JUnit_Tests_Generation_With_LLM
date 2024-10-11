// LineReader_1Test.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LineReader}.
* It contains ten unit test cases for the {@link LineReader#readBlock(int, int)} method.
*/
class LineReader_1Test {

		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the file is empty.
		*
		* @throws IOException if an error occurs during the test
		*/
		@Test
		void testReadBlock_EmptyFile() throws IOException {
				// Given
				File file = new File("src/test/resources/empty.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 0);
				
				// Then
				assertEquals(0, lines.size());
		}
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the file contains one line.
		*
		* @throws IOException if an error occurs during the test
		*/
		@Test
		void testReadBlock_OneLine() throws IOException {
				// Given
				File file = new File("src/test/resources/one_line.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 1);
				
				// Then
				assertEquals(1, lines.size());
				assertEquals("one line", lines.get(0));
		}
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the file contains two lines.
		*
		* @throws IOException if an error occurs during the test
		*/
		@Test
		void testReadBlock_TwoLines() throws IOException {
				// Given
				File file = new File("src/test/resources/two_lines.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 2);
				
				// Then
				assertEquals(2, lines.size());
				assertEquals("first line", lines.get(0));
				assertEquals("second line", lines.get(1));
		}
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the file contains three lines.
		*
		* @throws IOException if an error occurs during the test
		*/
		@Test
		void testReadBlock_ThreeLines() throws IOException {
				// Given
				File file = new File("src/test/resources/three_lines.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 3);
				
				// Then
				assertEquals(3, lines.size());
				assertEquals("first line", lines.get(0));
				assertEquals("second line", lines.get(1));
				assertEquals("third line", lines.get(2));
		}
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the file contains four lines.
		*
		* @throws IOException if an error occurs during the test
		*/
		@Test
		void testReadBlock_FourLines() throws IOException {
				// Given
				File file = new File("src/test/resources/four_lines.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 4);
				
				// Then
				assertEquals(4, lines.size());
				assertEquals("first line", lines.get(0));
				assertEquals("second line", lines.get(1));
				assertEquals("third line", lines.get(2));
				assertEquals("fourth line", lines.get(3));
		}
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the file contains five lines.
		*
		* @throws IOException if an error occurs during the test
		*/
		@Test
		void testReadBlock_FiveLines() throws IOException {
				// Given
				File file = new File("src/test/resources/five_lines.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 5);
				
				// Then
				assertEquals(5, lines.size());
				assertEquals("first line", lines.get(0));
				assertEquals("second line", lines.get(1));
				assertEquals("third line", lines.get(2));
				assertEquals("fourth line", lines.get(3));
				assertEquals("fifth line", lines.get(4));
		}
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the file contains six lines.
		*
		* @throws IOException if an error occurs during the test
		*/
		@Test
		void testReadBlock_SixLines() throws IOException {
				// Given
				File file = new File("src/test/resources/six_lines.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 6);
				
				// Then
				assertEquals(6, lines.size());
				assertEquals("first line", lines.get(0));
				assertEquals("second line", lines.get(1));
				assertEquals("third line", lines.get(2));
				assertEquals("fourth line", lines.get(3));
				assertEquals("fifth line", lines.get(4));
				assertEquals("sixth line", lines.get(5));
		}
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the file contains seven lines.
		*
		* @throws IOException if an error occurs during the test
		*/
		@Test
		void testReadBlock_SevenLines() throws IOException {
				// Given
				File file = new File("src/test/resources/seven_lines.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 7);
				
				// Then
				assertEquals(7, lines.size());
				assertEquals("first line", lines.get(0));
				assertEquals("second line", lines.get(1));
				assertEquals("third line", lines.get(2));
				assertEquals("fourth line", lines.get(3));
				assertEquals("fifth line", lines.get(4));
				assertEquals("sixth line", lines.get(5));
				assertEquals("seventh line", lines.get(6));
		}
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the file contains eight lines.
		*
		* @throws IOException if an error occurs during the test
		*/
		@Test
		void testReadBlock_EightLines() throws IOException {
				// Given
				File file = new File("src/test/resources/eight_lines.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 8);
				
				// Then
				assertEquals(8, lines.size());
				assertEquals("first line", lines.get(0));
				assertEquals("second line", lines.get(1));
				assertEquals("third line", lines.get(2));
				assertEquals("fourth line", lines.get(3));
				assertEquals("fifth line", lines.get(4));
				assertEquals("sixth line", lines.get(5));
				assertEquals("seventh line", lines.get(6));
				assertEquals("eighth line", lines.get(7));
		}
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the file contains nine lines.
		*
		* @throws IOException if an error occurs during the test
		*/
		@Test
		void testReadBlock_NineLines() throws IOException {
				// Given
				File file = new File("src/test/resources/nine_lines.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 9);
				
				// Then
				assertEquals(9, lines.size());
				assertEquals("first line", lines.get(0));
				assertEquals("second line", lines.get(1));
				assertEquals("third line", lines.get(2));
				assertEquals("fourth line", lines.get(3));
				assertEquals("fifth line", lines.get(4));
				assertEquals("sixth line", lines.get(5));
				assertEquals("seventh line", lines.get(6));
				assertEquals("eighth line", lines.get(7));
				assertEquals("ninth line", lines.get(8));
		}
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the file contains ten lines.
		*
		* @throws IOException if an error occurs during the test
		*/
		@Test
		void testReadBlock_TenLines() throws IOException {
				// Given
				File file = new File("src/test/resources/ten_lines.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 10);
				
				// Then
				assertEquals(10, lines.size());
				assertEquals("first line", lines.get(0));
				assertEquals("second line", lines.get(1));
				assertEquals("third line", lines.get(2));
				assertEquals("fourth line", lines.get(3));
				assertEquals("fifth line", lines.get(4));
				assertEquals("sixth line", lines.get(5));
				assertEquals("seventh line", lines.get(6));
				assertEquals("eighth line", lines.get(7));
				assertEquals("ninth line", lines.get(8));
				assertEquals("tenth line", lines.get(9));
		}
}

// LineReader_2Test.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LineReader}.
* It contains ten unit test cases for the {@link LineReader#readBlock(int, int)} method.
*/
class LineReader_2Test {
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the file is empty.
		*
		* @throws IOException if an error occurs during the test
		*/
		@Test
		void testReadBlock_EmptyFile() throws IOException {
				// Given
				File file = new File("src/test/resources/empty.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 0);
				
				// Then
				assertEquals(0, lines.size());
		}
		
		/**
		* Test case for {@link LineReader#readBlock(int, int)} method.
		* It tests the case where the file contains one line.
		*
		* @throws IOException if an error occurs during the test
		*/
		@Test
		void testReadBlock_OneLine() throws IOException {
				// Given
				File file = new File("src/test/resources/one_line.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 1);
				
				// Then
				assertEquals(1, lines.size());
				assertEquals("one line", lines.get(0));
		}
		
		/**
		* Test