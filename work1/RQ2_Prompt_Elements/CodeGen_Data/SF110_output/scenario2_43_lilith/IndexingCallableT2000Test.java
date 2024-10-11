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
// IndexingCallable.java
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

/**
 * Should only be executed on inactive files.
 */
public class IndexingCallable extends AbstractProgressingCallable<Long> {

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    public Long call() throws Exception {
        if (!dataFile.exists()) {
            throw new FileNotFoundException("File '" + dataFile.getAbsolutePath() + "' does not exist!");
        }
        if (!dataFile.isFile()) {
            throw new FileNotFoundException("File '" + dataFile.getAbsolutePath() + "' is not a file!");
        }
        long fileSize = dataFile.length();
        setNumberOfSteps(fileSize);
        FileHeaderStrategy fhs = new DefaultFileHeaderStrategy();
        FileHeader fileHeader = fhs.readFileHeader(dataFile);
        if (fileHeader!= null) {
            boolean sparse = fileHeader.getMetaData().isSparse();
            long offset = fileHeader.getDataOffset();
            RandomAccessFile dataRAFile = null;
            RandomAccessFile indexRAFile = null;
            Exception ex = null;
            long counter = 0;
            IndexStrategy indexStrategy = new DefaultIndexStrategy();
            try {
                dataRAFile = new RandomAccessFile(dataFile, "r");
                indexRAFile = new RandomAccessFile(indexFile, "rw");
                indexRAFile.setLength(0);
                while (offset < fileSize) {
                    dataRAFile.seek(offset);
                    int dataSize = dataRAFile.readInt();
                    if (!sparse) {
                        indexStrategy.setOffset(indexRAFile, counter, offset);
                        offset = offset + dataSize + DefaultDataStrategy.DATA_LENGTH_SIZE;
                    } else {
                        long index = dataRAFile.readLong();
                        indexStrategy.setOffset(indexRAFile, index, offset);
                        offset = offset + dataSize + SparseDataStrategy.DATA_LENGTH_SIZE + SparseDataStrategy.INDEX_SIZE;
                    }
                    counter++;
                    setCurrentStep(offset);
                }
            } catch (IOException e) {
                ex = e;
            } catch (InterruptedException e) {
                ex = e;
            } finally {
                closeQuietly(dataRAFile);
                closeQuietly(indexRAFile);
            }
            if (ex!= null) {
                if (!indexFile.delete()) {
                    if (logger.isWarnEnabled()) {
                        logger.warn("Failed to delete index file '{}'!", indexFile.getAbsolutePath());
                    }
                }
                // rethrow
                throw ex;
            }
            if (logger.isInfoEnabled())
                logger.info("File '{}' has {} entries.", dataFile.getAbsolutePath(), counter);
            return counter;
        } else {
            throw new IllegalArgumentException("File '" + dataFile.getAbsolutePath() + "' is not a valid file!");
        }
    }
}

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

	/**
	 * The expected result of the test is the number of entries (data and index).
	 * @throws FileNotFoundException if the result of the file not found.
	 */
	@Test
	public void testCreateWithNullData() throws FileNotFoundException {
		try ( RandomAccessFile randomAccessFile = new RandomAccessFile(dataFile, "r");
		        RandomAccessFile indexRAFile = new RandomAccessFile(indexFile, "rw");
		        FileHeaderStrategy fhs = new DefaultFileHeaderStrategy() ){
		        	fhs.setBlockSize(IndexStrategy.BLOCK_SIZE);
		        }){
			long size = fhs.getBlockSize();
			assertTrue("Block size of '" + fhs.getBlockSize() + "' is less than '" + (size / 10) + "'", size < (fhs.getBlockSize() / 10));
			logger.debug("Block size of '" + fhs.getBlockSize() + "' is less than '" + (size / 10) + "'");
			IndexingCallable indexingCallable = new IndexingCallable();
			assertNull(indexingCallable.call());
			try ( FileHeader indexFH = indexRAFile.readHeader() ){
				assertEquals("Entries size for index file was incorrect.", size, indexFH.getBlockSize(), Double.MIN_VALUE);
			}
		}
	}
	
	/**
	 * It should write data to the test file. Does nothing if test file was already existing.
	 */
	@Test
	public void testWriteToNewFile() {
		try ( RandomAccessFile randomAccessFile = new RandomAccessFile(dataFile, "r");
		        RandomAccessFile indexRAFile = new RandomAccessFile(indexFile, "rw");
		        FileHeaderStrategy fhs = new DefaultFileHeaderStrategy()) {
			long size = fhs.getBlockSize();
			assertTrue("Block size of '" + fhs.getBlockSize() + " was incorrect.", size < ( fhs.getBlockSize()/10));
			if (logger.isDebugEnabled()) {
				logger.debug("Block size of '" + fhs.getBlockSize() + " was less than '" + (size / 10) + "!=");
			}
			long offset = size / 10;
			if (offset == 0) {
				offset++;
				long limit = 10;
			} else {
				offset++;
				limit = offset;
			}
			IndexingCallable indexingCallable = new IndexingCallable();
			long actualSize = indexingCallable.call();
			assertNotEquals("The size of the file should be greater than the limit and should not be larger than the limit!",
