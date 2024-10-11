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
		
	private final Logger logger = LoggerFactory.getLogger(getClass());
  
    /**
     * Default constructor, it sets default values.
     * @throws IOException thrown by default
     */
    public IndexingCallableTest() throws IOException {
    }

    public final void testOpenSufficient() throws Throwable {
        open(dataFile);
        assertNull(indexFile);
    }

    public final void testOpenInsufficient() throws Throwable {
        fileHeader = new FileHeader();
        fileHeader.setSuffix(".lsm");
        RandomAccessFile raf = new RandomAccessFile(dataFile, "rw");
        raf.seek(7);
        raf.write(Integer.toBinaryString(testIndex1Size).getBytes());
        raf.close();
        indexFile = new File(dataFile.getParent(), "index.blob");
        indexFile = indexFile.mkdir();
        indexFile = indexFile.getAbsoluteFile();
        assertEquals(dataFile.length(), indexFile.length());
        open(indexFile);
        logger.debug(indexFile + " " + dataFile.length());
        closeQuietly(raf);
        raf = new RandomAccessFile(indexFile, "r");
        assertTrue(raf.length()< dataFile.length());
        closeQuietly(raf);
    }

  //@Test
    void testCloseable() {
        final File file = new File(new File(dataFile.getParentFile(), "index.blob"),
            "index.blob");
        final FileHeader indexHeader = new FileHeader(10);
        FileHeaderStrategy fhs = new FileHeaderStrategy() {
            @Override
             public int getFileHeader(File headerName, long currentPosition)
                throws FileNotFoundException {
                if(headerName.compareTo(indexHeader.name())==0) {
                    return 1;
                } else {
                    return 2;
                }
            }
            
            @Override
             public void close() throws IOException {
                File f = new File(new File(dataFile.getParentFile(), "index.blob"),
                    "index.blob");
                closeQuietly(f);
                super.close();
            }
        };
        final IndexStrategy is = new IndexStrategy(fhs, SparseDataStrategy.YES, false, false);
        fhs.setFileHeaderStrategy(is);
        open(file);
    }

  //@Test
    void testFileHeader() {
        final File file = new File(dataFile.getParentFile(), "index.blob");
        try {
            FileHeader header = AbstractProcessingCallable.readFileHeader(file);
            assertEquals(new FileHeader(indexFile.length()-header.size(), 1), header);
        } catch (FileNotFoundException | IOException ex) {
            fail(ex.getMessage());
        }
    }

    @Test
    void testIndexFile() throws Throwable {
        open(indexFile);
        try {
            IndexHeader ih = new IndexHeader();
            ih.size = testIndex1Size;
            new SparseDataStrategy().initIndex(ih);
            new SparseDataStrategy().fill();
            IndexStrategy is = new IndexStrategy(ih, SparseDataStrategy.YES, false, true);
            logger.debug("Index is "+ih);
            this.logHeader(ih);
            logger.debug(ih + " " + currentIndexValue());
            new SparseDataStrategy().fill();
            currentIndexValue = 0;
            new SparseDataStrategy().initIndex(ih);
        } finally {
            this.logHeader(ih);
        }
    }

    private void logHeader(IndexHeader ih) {
        LogHeader.add(new FileHeader(ih, this.getClass()), this);
    }

    private void thistestIndex() throws Exception {
        final int k = 2;
        FileHeader index = new FileHeader();
        testIndex1Size = k*k;
        index.size = testIndex1Size;
        index.magic = LittleIronMagicFile.MAGIC_FILE_INDEX_BIG;
        IndexHeader imark = new IndexHeader();
        imark.size   = k * k;
        marker = index;
        index.name = String.format("index.%08d.%08d",k,k);
        RandomAccessFile raf = new RandomAccessFile(indexFile, "r");
        raf.seek(0);
        raf.writeByte(indexHeader.makeMagic());
        raf.write(new long[] { 0 });
        raf.write(BigIndextor.toByteArray(marker));
        raf.close();
    }

    public final void testNewIndex() throws FileNotFoundException {
        final RandomAccessFile raf = new RandomAccessFile(indexFile);
        if(newIndexFromStrategy(raf, null)) {
            throw new RuntimeException("Cannot create a new index");
        }
        indexFile.delete();
        raf.close();
        raf = new RandomAccessFile(indexFile, "r");
        RandomAccessFile raf3 = new RandomAccessFile(dataFile, "r");
}
}