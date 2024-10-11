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
		public static final File indexFile = new File("/tmp/indexFile");

		@Test
		public void shouldReadAndWriteIndexFile() throws Exception {
			final RandomAccessFile file = new RandomAccessFile(indexFile, "rw");
			try {
				SparseDataStrategy sparseStrategy = new DefaultSparseDataStrategy(DefaultDataStrategy.LARGE_BLOCK_WRITTEN, SparseDataStrategy.DEFAULT_READ_LIMIT);
				FileHeader.FileHeaderStrategy fileHeaderStrategy = new DefaultFileHeaderStrategy.FileHeaderStrategyWithFileHeader(DefaultFileHeaderStrategy.FILE_HEADER, sparseStrategy);
				indexFile.createNewFile();
				long position = indexFile.length();
				int valueLength = 10;
				IndexStrategy.IndexStrategyWithFileHeader valueIndexStrategy = new IndexStrategy.IndexStrategyWithFileHeader(valueLength, fileHeaderStrategy);
				assertNotNull(valueIndexStrategy);
				SparseDataStrategy.SparseFile dataStrategy = SparseDataStrategy.createSparseDataStrategyFromFileHeader((FileHeader) SparseDataStrategy.FILE_HEADER, SparseDataStrategy.DEFAULT_HEADER_WAL_VALUE_LENGTH_IN_BYTES);
				indexFile.deleteOnExit();
				valueIndexStrategy.setFileLength(position);

				file.seek(position);
				file.writeInt(1);
				file.seek(position);
				file.writeInt(2);
				file.seek(position);
				file.writeInt(3);
				file.seek(position);
				file.writeInt(4);
				file.seek(position);
				file.writeInt(5);
				file.seek(position);
				file.writeInt(6);
				file.seek(position);
				file.writeInt(7);
				file.seek(position);
				file.writeInt(8);
				file.seek(position);
				file.writeInt(9);
				file.seek(position);
				file.writeInt(10);

				assertEquals(SparseDataStrategy.DEFAULT_HEADER_WAL_VALUE_LENGTH_IN_BYTES, SparseDataStrategy.SIZE_OF_BLOCK);
				assertEquals(valueIndexStrategy.getIndex(), SparseDataStrategy.SIZE_OF_BLOCK);
			} finally {
				file.close();
				assertFalse(SparseDataStrategy.shouldReadAndWriteSparseDataFile(dataFile));
			}
		}
		
	}