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
    private static final long CUTOFFSLEFT = 0;

    private static final long MEMBERMARK = 100;

    private File getFile(String name) throws FileNotFoundException {
        File fd = new File((String) name);
        fd.deleteOnExit();
        fd.setReadable(true, false, true);
        return fd;
    }

    private static long getFileSize(File fd) {
        RandomAccessFile rf = null;
		try {
			rf = new RandomAccessFile(fd, "r");
			return rf.length();
		} catch (Exception e) {
			logger.warn("Error when reading file: " + fd + ", with exception " + e.getMessage());
			return -1L;
		} finally {
			closeQuietly(rf);
		}
    }

    private File getFile() throws FileNotFoundException {
        RandomAccessFile rf = null;
        try {
            rf = new RandomAccessFile(new File((String)name), "rw");
            return getFile(name);
        } catch (FileNotFoundException e) {
            return null;
        } finally {
            closeQuietly(rf);
        }
    }

    private static FileHeader getFileHeader(File file, int version) throws IOException {
        FileHeader rf = null;
        try {
            rf = new FileHeader(file, fileHeaderStrategy(), version);
            return rf;
        } catch (IOException e) {
            logger.warn("Error when reading file: " + file + ", with exception " + e.getMessage());
            return null;
        } finally {
            closeQuietly(rf);
        }
    }

    private static FileHeaderStrategy fileHeaderStrategy() {
        return new DefaultFileHeaderStrategy();
    }

    private static FileHeader getFileHeader() throws IOException {
        RandomAccessFile rf = null;
        try {
            rf = new RandomAccessFile(new File((String) name), "r");

            return new FileHeader(new FileHeaderStrategy(), rf, version);
        } catch (Exception e) {
            logger.warn("Error when reading file: " + file + ", with exception " + e.getMessage());
            return null;
        } finally {
            closeQuietly(rf);
        }
    }

    private static long getDataLength(FileHeader rf) {
        return rf.length();
    }

    private static long getDataLength() throws IOException {
        RandomAccessFile rf = null;
        try {
            rf = new RandomAccessFile(new File((String)name), "r");

            return getDataLength(new FileHeader(rf, fileHeaderStrategy(), version));
        } catch (Exception e) {
            logger.warn("Error when reading file: " + (String) name + ", with exception " + e.getMessage());
            return -1L;
        } finally {
            closeQuietly(rf);
        }
    }

	private IndexStrategy indexStrategy() {
		return new DefaultIndexStrategy();
	}

    @Test
    public void test() throws Exception {
    	File file = new File((String)name);
    	assertTrue("File should exist, but doesn't", file.exists());

    	long length = getFileSize(file);

        assertTrue("File should have exactly 'MEMBERMARK' bytes - " + length + " bytes in " + name,"membermark=" + MEMBERMARK + ", file="+ file);
        String fData = getDataFile().getCanonicalPath();
        assertEquals("Data file path doesn't appear to be correct", fData, fData + MEMBERMARK + name);
    	IndexStrategy indexStrata = null;
    	if(version==2) {
    		indexStrata = indexStrategy();
    		long tLength = getFileLength();
    		assertEquals("Length is zero for version 2, expected non-zero length",MEMBERMARK+length+MEMBERMARK,tLength);
    	}
    	else {
    		assertEquals("Data file has no length", MEMBERMARK + length, getFileLength());
    	}
    }
}