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
		* Test method: {@link LineReader#readBlock(int, int)}.
		* Test data: a file with one line.
		* Expected result: the line is read.
		*/
		@Test
		void testReadBlock_1() throws IOException {
				// Given
				final File file = new File("src/test/resources/testReadBlock_1.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final List<String> result = lineReader.readBlock(0, 1);
				
				// Then
				assertEquals(1, result.size());
				assertEquals("line 1", result.get(0));
		}
		
		/**
		* Test case 2.
		* Test method: {@link LineReader#readBlock(int, int)}.
		* Test data: a file with two lines.
		* Expected result: the two lines are read.
		*/
		@Test
		void testReadBlock_2() throws IOException {
				// Given
				final File file = new File("src/test/resources/testReadBlock_2.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final List<String> result = lineReader.readBlock(0, 2);
				
				// Then
				assertEquals(2, result.size());
				assertEquals("line 1", result.get(0));
				assertEquals("line 2", result.get(1));
		}
		
		/**
		* Test case 3.
		* Test method: {@link LineReader#readBlock(int, int)}.
		* Test data: a file with two lines.
		* Expected result: the first line is read.
		*/
		@Test
		void testReadBlock_3() throws IOException {
				// Given
				final File file = new File("src/test/resources/testReadBlock_2.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final List<String> result = lineReader.readBlock(0, 1);
				
				// Then
				assertEquals(1, result.size());
				assertEquals("line 1", result.get(0));
		}
		
		/**
		* Test case 4.
		* Test method: {@link LineReader#readBlock(int, int)}.
		* Test data: a file with two lines.
		* Expected result: the second line is read.
		*/
		@Test
		void testReadBlock_4() throws IOException {
				// Given
				final File file = new File("src/test/resources/testReadBlock_2.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final List<String> result = lineReader.readBlock(1, 2);
				
				// Then
				assertEquals(1, result.size());
				assertEquals("line 2", result.get(0));
		}
		
		/**
		* Test case 5.
		* Test method: {@link LineReader#readBlock(int, int)}.
		* Test data: a file with two lines.
		* Expected result: an empty list is returned.
		*/
		@Test
		void testReadBlock_5() throws IOException {
				// Given
				final File file = new File("src/test/resources/testReadBlock_2.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final List<String> result = lineReader.readBlock(2, 3);
				
				// Then
				assertEquals(0, result.size());
		}
		
		/**
		* Test case 6.
		* Test method: {@link LineReader#readBlock(int, int)}.
		* Test data: a file with two lines.
		* Expected result: an empty list is returned.
		*/
		@Test
		void testReadBlock_6() throws IOException {
				// Given
				final File file = new File("src/test/resources/testReadBlock_2.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final List<String> result = lineReader.readBlock(3, 4);
				
				// Then
				assertEquals(0, result.size());
		}
		
		/**
		* Test case 7.
		* Test method: {@link LineReader#readBlock(int, int)}.
		* Test data: a file with two lines.
		* Expected result: an empty list is returned.
		*/
		@Test
		void testReadBlock_7() throws IOException {
				// Given
				final File file = new File("src/test/resources/testReadBlock_2.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final List<String> result = lineReader.readBlock(4, 5);
				
				// Then
				assertEquals(0, result.size());
		}
		
		/**
		* Test case 8.
		* Test method: {@link LineReader#readBlock(int, int)}.
		* Test data: a file with two lines.
		* Expected result: an empty list is returned.
		*/
		@Test
		void testReadBlock_8() throws IOException {
				// Given
				final File file = new File("src/test/resources/testReadBlock_2.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
				// When
				final List<String> result = lineReader.readBlock(5, 6);
				
				// Then
				assertEquals(0, result.size());
		}
		
		/**
		* Test case 9.
		* Test method: {@link LineReader#readBlock(int, int)}.
		* Test data: a file with two lines.
		* Expected result: an empty list is returned.
		*/
		@Test
		void testReadBlock_9() throws IOException {
				// Given
				final File file = new File("src/test/resources/testReadBlock_2.txt");
				final FileIndex index = new FileIndex(file);
				final LineReader lineReader = new LineReader(file, index);
				
		