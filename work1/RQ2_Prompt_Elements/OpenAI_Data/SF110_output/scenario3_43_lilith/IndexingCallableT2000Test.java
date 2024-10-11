// IndexingCallableTest.java
package de.huxhorn.lilith.swing.callables;

import de.huxhorn.sulky.codec.filebuffer.DefaultDataStrategy;
import de.huxhorn.sulky.codec.filebuffer.DefaultFileHeaderStrategy;
import de.huxhorn.sulky.codec.filebuffer.DefaultIndexStrategy;
import de.huxhorn.sulky.codec.filebuffer.FileHeader;
import de.huxhorn.sulky.codec.filebuffer.FileHeaderStrategy;
import de.huxhorn.sulky.codec.filebuffer.IndexStrategy;
import de.huxhorn.sulky.codec.filebuffer.SparseDataStrategy;
import de.huxhorn.sulky.tasks.AbstractProgressingCallable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IndexingCallable}.
* It contains ten unit test cases for the {@link IndexingCallable#call()} method.
*/
class IndexingCallableTest {

		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is null.
		* Expected result: {@link NullPointerException}.
		*/
		@Test
		public void testCall_fileIsNull() throws Exception {
				// GIVEN
				File file = null;
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(NullPointerException.class, () -> indexingCallable.call());
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but does not exist.
		* Expected result: {@link FileNotFoundException}.
		*/
		@Test
		public void testCall_fileDoesNotExist() throws Exception {
				// GIVEN
				File file = new File("test.txt");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(FileNotFoundException.class, () -> indexingCallable.call());
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is a directory.
		* Expected result: {@link FileNotFoundException}.
		*/
		@Test
		public void testCall_fileIsDirectory() throws Exception {
				// GIVEN
				File file = new File(".");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(FileNotFoundException.class, () -> indexingCallable.call());
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is not a file.
		* Expected result: {@link FileNotFoundException}.
		*/
		@Test
		public void testCall_fileIsNotFile() throws Exception {
				// GIVEN
				File file = new File("/dev/null");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(FileNotFoundException.class, () -> indexingCallable.call());
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is not readable.
		* Expected result: {@link FileNotFoundException}.
		*/
		@Test
		public void testCall_fileIsNotReadable() throws Exception {
				// GIVEN
				File file = new File("/dev/null");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(FileNotFoundException.class, () -> indexingCallable.call());
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is not writable.
		* Expected result: {@link FileNotFoundException}.
		*/
		@Test
		public void testCall_fileIsNotWritable() throws Exception {
				// GIVEN
				File file = new File("/dev/null");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(FileNotFoundException.class, () -> indexingCallable.call());
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is not a file buffer.
		* Expected result: {@link IOException}.
		*/
		@Test
		public void testCall_fileIsNotFileBuffer() throws Exception {
				// GIVEN
				File file = new File("test.txt");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(IOException.class, () -> indexingCallable.call());
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is a file buffer, but is not inactive.
		* Expected result: {@link IOException}.
		*/
		@Test
		public void testCall_fileIsFileBufferButNotInactive() throws Exception {
				// GIVEN
				File file = new File("test.txt");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(IOException.class, () -> indexingCallable.call());
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is a file buffer, but is inactive, but is not readable.
		* Expected result: {@link IOException}.
		*/
		@Test
		public void testCall_fileIsFileBufferButNotReadable() throws Exception {
				// GIVEN
				File file = new File("test.txt");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(IOException.class, () -> indexingCallable.call());
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is a file buffer, but is inactive, but is not writable.
		* Expected result: {@link IOException}.
		*/
		@Test
		public void testCall_fileIsFileBufferButNotWritable() throws Exception {
				// GIVEN
				File file = new File("test.txt");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(IOException.class, () -> indexingCallable.call());
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is a file buffer, but is inactive, but is not readable, but is not writable.
		* Expected result: {@link IOException}.
		*/
		@Test
