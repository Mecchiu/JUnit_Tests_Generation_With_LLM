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
		* Test case 1.
		* The file contains one line.
		* The block to read is the whole file.
		*/
		@Test
		void testReadBlock_1() throws IOException {
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
		* Test case 2.
		* The file contains one line.
		* The block to read is empty.
		*/
		@Test
		void testReadBlock_2() throws IOException {
				// Given
				File file = new File("src/test/resources/one_line.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(1, 1);
				
				// Then
				assertEquals(0, lines.size());
		}
		
		/**
		* Test case 3.
		* The file contains one line.
		* The block to read is the whole file.
		*/
		@Test
		void testReadBlock_3() throws IOException {
				// Given
				File file = new File("src/test/resources/one_line.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 2);
				
				// Then
				assertEquals(1, lines.size());
				assertEquals("one line", lines.get(0));
		}
		
		/**
		* Test case 4.
		* The file contains two lines.
		* The block to read is the whole file.
		*/
		@Test
		void testReadBlock_4() throws IOException {
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
		* Test case 5.
		* The file contains two lines.
		* The block to read is the first line.
		*/
		@Test
		void testReadBlock_5() throws IOException {
				// Given
				File file = new File("src/test/resources/two_lines.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 1);
				
				// Then
				assertEquals(1, lines.size());
				assertEquals("first line", lines.get(0));
		}
		
		/**
		* Test case 6.
		* The file contains two lines.
		* The block to read is the second line.
		*/
		@Test
		void testReadBlock_6() throws IOException {
				// Given
				File file = new File("src/test/resources/two_lines.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(1, 2);
				
				// Then
				assertEquals(1, lines.size());
				assertEquals("second line", lines.get(0));
		}
		
		/**
		* Test case 7.
		* The file contains two lines.
		* The block to read is empty.
		*/
		@Test
		void testReadBlock_7() throws IOException {
				// Given
				File file = new File("src/test/resources/two_lines.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(2, 2);
				
				// Then
				assertEquals(0, lines.size());
		}
		
		/**
		* Test case 8.
		* The file contains two lines.
		* The block to read is the whole file.
		*/
		@Test
		void testReadBlock_8() throws IOException {
				// Given
				File file = new File("src/test/resources/two_lines.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(0, 3);
				
				// Then
				assertEquals(2, lines.size());
				assertEquals("first line", lines.get(0));
				assertEquals("second line", lines.get(1));
		}
		
		/**
		* Test case 9.
		* The file contains two lines.
		* The block to read is the whole file.
		*/
		@Test
		void testReadBlock_9() throws IOException {
				// Given
				File file = new File("src/test/resources/two_lines.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(1, 3);
				
				// Then
				assertEquals(1, lines.size());
				assertEquals("second line", lines.get(0));
		}
		
		/**
		* Test case 10.
		* The file contains two lines.
		* The block to read is empty.
		*/
		@Test
		void testReadBlock_10() throws IOException {
				// Given
				File file = new File("src/test/resources/two_lines.txt");
				FileIndex index = new FileIndex(file);
				LineReader reader = new LineReader(file, index);
				
				// When
				List<String> lines = reader.readBlock(3, 3);
				
				// Then
				assert