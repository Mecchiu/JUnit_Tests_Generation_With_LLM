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
		
    private static class MockIndexStrategy extends IndexStrategy {

        MockIndexStrategy(File index) {
            super(index);
        }

        @Override
        public FileHeaderStrategy newFileHeaderStrategy(FileFileHeader fileHeader) {
            return super.newFileHeaderStrategy(fileHeader);
        }

    }

    class MockFileHeaderStrategy implements FileHeaderStrategy {

        MockFileHeaderStrategy(FileHeader fileHeader) {
            this.fileHeader = fileHeader;
        }

        @Override
        public FileHeaderStrategy newFileHeaderStrategy(RandomAccessFile file) {
            return new MockFileHeaderStrategy(fileHeader);
        }

    }

    class MockFileHeaderStrategyTest {

        MockFileHeaderStrategyTest(FileFileHeader fileHeader) {
            this.fileHeader = fileHeader;
        }
        MockFileHeaderStrategyTest(FileFileHeader fileHeader, File index) {
            this.fileHeader = fileHeader;
            this.indexFile = index;
        }

        @Test
        public void checkSameFileHeader() throws FileNotFoundException, IOException {

        }

        @Test
        public void checked() throws IOException {

        }

        FileHeader fileHeader;
        FileIndex index;
        File file;
        File indexFile;

        @Test
        public void checkDifferentFileHeader() throws IOException {

        }
    }

    class MockDataStrategy implements SparseDataStrategy {

        MockDataStrategy(int blockSize) {
            this.blockSize = blockSize;
        }

        @Override
        public boolean isSame(FileReference fileRef, int blockSize) {
            return fileRef.isSame(this.file, this.blockSize);
        }

        @Override
        public void writeSparse(SparseDataIndex index, boolean isLast,
                                int offset) {

        }

        @Override
        public void writeDense(int[] sparse, int[] denseCount, int offset) {

        }

        public int blockSize;

    }

    void createIndexFile(File indexFile) throws FileNotFoundException, IOException {

        // create index file
        FileIndex index = new DefaultIndexStrategy(new RandomAccessFile(indexFile, "rw"));
        index.close();
        indexFile.delete();

        this.indexFile = indexFile;

    }

    void createDataFile(File dataFile) throws FileNotFoundException, IOException {

        // create data file
        FileIndex index = new DefaultIndexStrategy(new RandomAccessFile(dataFile, "rw"));
        index.close();
        dataFile.delete();

        this.dataFile = dataFile;

    }

    @Test
    public void runCallableTest() throws Exception {

            IndexingCallable indexingCallable = new IndexingCallable();
            indexingCallable.close();

        FileIndex index = this.getIndexStrategy().findFileIndex(this.dataFile);
        FileIndex indexFile = this.getFileHeaderStrategy().findFileIndex(this.indexFile);
        File indexFile1 = this.getDataStrategy().findFileIndex(this.dataFile);

        assertEquals(0, index.getCompressionAlgorithm().getCodec().getBlockSize());
        assertEquals(5, (int) indexFile.getCompressionAlgorithm().getCodec().getBlockSize());
        assertEquals(0, (int) indexFile1.getCompressionAlgorithm().getCodec().getBlockSize());

        indexingCallable.close();

        FileIndex index2 = index.copyIfDifferent();
        FileIndex indexFile2 = indexFile.copyIfDifferent();

        assertNotEquals(indexFile, indexFile2);
        assertEquals(index, index2);

        FileIndex index3 = new MockIndexStrategy(this.dataFile);
        FileIndex indexFile3 = this.getFileHeaderStrategy().findFileIndex(this.dataFile);

        assertNotEquals(index, indexFile);
        assertEquals(index, index3);

        FileIndex index4 = indexFile.copyIfDifferent();
        FileIndex indexFile4 = indexFile.findDifferent();

        assertNotEquals(indexFile, indexFile4);
        assertEquals(index.copyIfDifferent(), index4);

        assertTrue(indexFile == indexFile4);

        assertTrue(indexFile1!= index2.getContent());
        assertTrue(indexFile == indexFile1.copy());
        assertEquals(indexFile1.getCompressionAlgorithm().getCodec().getBlockSize(), indexFile.getCompressionAlgorithm().getCodec().getBlockSize());
        assertEquals(1, (indexFile1.getCompressionAlgorithm().getCodec().getBlockSize()));
        assertEquals(indexFile2.getCompressionAlgorithm().getCodec().getBlockSize(), index2.getCompressionAlgorithm().getCodec().getBlockSize());

        FileIndex index5 = indexFile.findDifferent();
        assertNotSame(index, index5);
        assertEquals(index.copyIfDifferent(), index5);

        assertTrue(indexFile == index5);

        FileIndex index6 = indexFile.findDifferent();
        assertEquals(indexFile1, index6);
}
}