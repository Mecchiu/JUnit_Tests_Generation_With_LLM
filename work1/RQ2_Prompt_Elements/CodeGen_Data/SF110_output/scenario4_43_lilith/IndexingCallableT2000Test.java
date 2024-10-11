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
private static final Logger log = LoggerFactory.getLogger(IndexingCallableTest.class);

    @Test
    public void test() throws FileNotFoundException, IOException {
         String dataFilePath = getClass().getResource("/tmp/sulky-index-data");
        indexFile = new File(dataFilePath);
        indexFileSize = indexFile.length();
         assertNotNull("indexFile not yet created", dataFile);

         openFileAndReadIndex();
         assertIndexEqual(indexFile.length(), indexFileSize/10);
         long fileOffset = 0;
         for (FileHeader header : indexFile.getFile().readFileHeader(indexFile), HeaderIterator.IteratorType.HEAD) {
            assertFileHeaderEqual(header, fileOffset, fileOffset / 10);
            fileOffset += header.getNumData();
         }
     }

    @Test
    public void canCloseIndex() throws Exception {
        final IndexStrategy strategy = new DefaultIndexStrategy();
        final SparseDataStrategy strategy2 = new SparseDataStrategy();

        call("Data"); // close the index first

        final RandomAccessFile dataFile = new RandomAccessFile(dataFilePath, "r");
        if (dataFile.length()!= indexFileSize) {
            throw new Exception("IndexFile length is not the correct size");
        }

        int numElements = 10;
        final Long[] bytes = new Long[numElements];
        Arrays.fill(bytes, (long) numElements - 1, (long) numElements, (long) 0);
        strategy.setData(dataFile, bytes);

        assertFileHeaderEqual(indexFile.getFileHeader(), indexFile.length(), indexFile.length());

        final byte[] data = new byte[numElements * 10];
        final Long[] dataBytes = strategy.getData(dataFile);
        StringBuilder failureMessage = new StringBuilder();
        for (Long value : dataBytes) {
            if (value > 0) {
                failureMessage.append(Integer.toString((int) value));

                if (value < (long) (dataBytes.length / 2)) {
                    if (data[value - 1]!= dataBytes[value - 1]) {
                        failureMessage.append("!= ").append((int) value);
                    }
                    else {
                        failureMessage.append("== ").append((int) value);
                    }
                }
            }
        }
        assertTrue(failureMessage.toString(), failureMessage.length() < 100);
        strategy2.setData(dataFile, data);
        assertIndexEqual(indexFile.length(), indexFileSize);

        dataFile.close();
        dataFile.getFD().sync(); // ensure index file is removed

        indexFile.setFlag(true); // ensure that the file is in a "valid" state
        dataFile.close();
        dataFile.getFD().sync(); // ensure file is in a "valid" state
    }

    private static void assertFileHeaderEqual(FileHeader fileHeader, long dataFileOffset, long indexFileOffset) throws Exception {
        FileHeaderStrategy.assertFileHeaderEqual(new FileHeader(fileHeader), new FileHeader(dataFileHeader));

        FileHeaderStrategy.assertIndexFileHeaderEqual(fileHeader, indexFileHeader);

        assertEquals("Data offset mismatch", (int)fileHeader.getSize(), indexFileOffset);
        assertEquals("Index file offset mismatch", dataFileOffset, indexFileOffset);
        assertEquals("Data file length mismatch", (int)dataFileOffset, indexFileSize - indexFileOffset);
        SparseDataStrategy.assertDataFileHeaderEqual(indexFileFileHeader, fileHeader);
        assertEquals("Index file length mismatch", dataFileOffset, indexFileOffset);
    }

    private static void openFileAndReadIndex() throws FileNotFoundException, IOException {
        log.error("Starting indexing file - {}", dataFile.getName());
        dataFile.seek(0);
        if (indexFile.length() < indexFileSize) {
            throw new IOException("IndexFile length is wrong");
        }

        long fileOffset = 0;
        int numElements = 10;
        final Long[] bytes = new Long[numElements];
        Arrays.fill(bytes, (long) numElements - 1, (long) numElements, (long) 0);
        RandomAccessFile dataFile = new RandomAccessFile(dataFilePath, "r");
        strategy.setData(dataFile, bytes);
        indexFile.setFlag(false);
        indexFile.setLength(indexFileSize);
        while (indexFile.length() < fileOffset) {
            FileHeader fileHeader = new FileHeader(fileHeaderStrategy.getFile(), indexFile.getFileHeader());
            assertFileHeaderEqual(fileHeader, fileHeader.getSize(), fileOffset);
            assertTrue("Index file length is wrong", (int)fileFileHeaderSize > (int)fileHeader.getSize());
            int numElements = (int)(fileOffset / fileFileHeaderSize) + 30;
            fileOffset += fileHeader.getNumData();
            if (numElements > indexFileLength) {
                return;
            }
            dataFile.seek(fileOffset);
            final Long[] data =