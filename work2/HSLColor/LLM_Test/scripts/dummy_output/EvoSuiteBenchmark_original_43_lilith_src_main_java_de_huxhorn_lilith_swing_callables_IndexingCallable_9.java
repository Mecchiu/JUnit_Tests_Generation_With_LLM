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
* It contains one unit test case for the {@link IndexingCallable#call()} method.
*/
class IndexingCallableTest {
		private static final Logger logger = LoggerFactory.getLogger(IndexingCallableTest.class);

		@Test
		public void testGetDataFromIndexFile() throws Exception {
			final IndexingCallable indexingCallable = new IndexingCallable(Testfile.file, Testfile.dataFile);
			final AbstractProgressingCallable<Long> actual = indexingCallable.call();//TODO call method should have this signature

			//if (actual!= null) {
			//	String data = actual.getData();
			//}
			assertEquals(1, indexingCallable.getNumFailed());
		}

		@Test(expected = FileNotFoundException.class)
		public void testNotFoundIndexFile1() throws Exception {
			final IndexingCallable indexingCallable = new IndexingCallable(Testfile.file, null);
		}
}

//IndexingCallable.java