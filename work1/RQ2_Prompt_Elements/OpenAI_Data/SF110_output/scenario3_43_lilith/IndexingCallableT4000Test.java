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
				Throwable thrown = assertThrows(NullPointerException.class, indexingCallable::call);
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
				File file = new File("test.log");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(FileNotFoundException.class, indexingCallable::call);
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
				Throwable thrown = assertThrows(FileNotFoundException.class, indexingCallable::call);
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
				Throwable thrown = assertThrows(FileNotFoundException.class, indexingCallable::call);
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
				Throwable thrown = assertThrows(FileNotFoundException.class, indexingCallable::call);
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
				Throwable thrown = assertThrows(FileNotFoundException.class, indexingCallable::call);
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
				File file = new File("/dev/null");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(IOException.class, indexingCallable::call);
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is a file buffer, but is not inactive.
		* Expected result: {@link IOException}.
		*/
		@Test
		public void testCall_fileIsNotInactive() throws Exception {
				// GIVEN
				File file = new File("/dev/null");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(IOException.class, indexingCallable::call);
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is a file buffer, but is inactive, but is not readable.
		* Expected result: {@link IOException}.
		*/
		@Test
		public void testCall_fileIsNotReadable2() throws Exception {
				// GIVEN
				File file = new File("/dev/null");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(IOException.class, indexingCallable::call);
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is a file buffer, but is inactive, but is not writable.
		* Expected result: {@link IOException}.
		*/
		@Test
		public void testCall_fileIsNotWritable2() throws Exception {
				// GIVEN
				File file = new File("/dev/null");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(IOException.class, indexingCallable::call);
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is a file buffer, but is inactive, but is not readable, but is not writable.
		* Expected result: {@link IOException}.
		*/
		@Test
		public void testCall_fileIsNotReadableAndNotWritable() throws Exception {
				// GIVEN
				File file = new File("/dev/null");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(IOException.class, indexingCallable::call);
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is a file buffer, but is inactive, but is readable, but is not writable.
		* Expected result: {@link IOException}.
		*/
		@Test
		public void testCall_fileIsReadableAndNotWritable() throws Exception {
				// GIVEN
				File file = new File("/dev/null");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(IOException.class, indexingCallable::call);
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is a file buffer, but is inactive, but is not readable, but is writable.
		* Expected result: {@link IOException}.
		*/
		@Test
		public void testCall_fileIsNotReadableAndWritable() throws Exception {
				// GIVEN
				File file = new File("/dev/null");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(IOException.class, indexingCallable::call);
				// THEN
				assertNotNull(thrown);
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: file is not null, but is a file buffer, but is inactive, but is readable, but is writable.
		* Expected result: {@link IOException}.
		*/
		@Test
		public void testCall_fileIsReadableAndWritable() throws Exception {
				// GIVEN
				File file = new File("/dev/null");
				IndexingCallable indexingCallable = new IndexingCallable(file);
				// WHEN
				Throwable thrown = assertThrows(IOException.class, indexingCallable::call);
				// THEN
				assertNotNull(thrown);
		}
}

// IndexingTask.java
package de.huxhorn.lilith.swing.taskmanager;

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
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.swing.SwingWorker;

/**
 *
 */
public class IndexingTask
		extends SwingWorker<Long, Void>
{
		private final Logger logger = LoggerFactory.getLogger(IndexingTask.class);
		private final File file;
		private final Future<Long> future;

		public IndexingTask(File file, Future<Long> future)
		{
				this.file = file;
				this.future = future;
		}

		public File getFile()
		{
				return file;
		}

		public Future<Long> getFuture()
		{
				return future;
		}

		/**
		 * Computes a result, or throws an exception if unable to do so.
		 *
		 * @return computed result
		 * @throws Exception if unable to compute a result
		 */
		@Override
		protected Long doInBackground()
				throws Exception
		{
				try
				{
						return future.get(1, TimeUnit.SECONDS);
				}
				catch (TimeoutException ex)
				{
						logger.debug("Timeout while waiting for indexing of {}.", file);
				}
				catch (InterruptedException ex)
				{
						logger.debug("Interrupted while waiting for indexing of {}.", file);
				}
				catch (ExecutionException ex)
				{
						logger.error("Error while indexing {}!", file, ex);
				}
				return null;
		}
}

// IndexingTaskTest.java
package de.huxhorn.lilith.swing.taskmanager;

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
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.swing.SwingWorker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IndexingTask}.
* It contains ten unit test cases for the {@link IndexingTask#doInBackground()} method.
*/
class IndexingTaskTest {
		
		/**
		* Test case for {@link IndexingTask#doInBackground()} method.
		* Test data: file is null.
		* Expected result: {@link NullPointerException}.
		*/
		@Test
		public void testDoInBackground_fileIsNull() throws Exception {
