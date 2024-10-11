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
		
	// --------------------------------------
	//  Utilities
	// --------------------------------------
	
    private static void assertEquals(int expected, int actual) {
        assertEquals(String.format("actual: %d, expected: %d", actual, expected), expected, actual);
    }
	
	// --------------------------------------
	//  Constructors
	// --------------------------------------

    /**
     * Creates a new indexed file for testing. The file should
     * already exist, therefore there is no need to specify a file header
     * strategy.
     */
    public IndexingCallableTest() {
    }

    // --------------------------------------
    //  Getters and setters
    // --------------------------------------
    
    /**
     * Returns the index file.
     *
     * @return {@code non-null;} the indexed file
     */
    public File getIndexFile() {
        return indexFile;
    }

    /**
     * Sets the index file to the specified file.
     *
     * @param indexFile {@code non-null;} the indexed file
     * @throws NullPointerException if the argument is null
     */
    public void setIndexFile(File indexFile) {
        assertArgumentNotNull(indexFile);
        this.indexFile = indexFile;
    }
    
    /**
     * Returns the data file.
     *
     * @return {@code non-null;} the indexed file
     */
    public File getDataFile() {
        return dataFile;
    }
    
    /**
     * Sets the data file to the specified file.
     *
     * @param dataFile {@code non-null;} the indexed file
     * @throws NullPointerException if the argument is null
     */
    public void setDataFile(File dataFile) {
        assertArgumentNotNull(dataFile);
        this.dataFile = dataFile;
    }
    
    /**
     * Creates a new DataFileHeaderStrategy.
     */
    public void setDataFileStrategy(FileHeaderStrategy fileHeaderStrategy, int size) {
        assertArgumentNotNull(fileHeaderStrategy);
        logger.info("Set data header strategy with size: " + size);
        dataFileStrategy = new DefaultDataStrategy(fileHeaderStrategy, size);
    }
    
    /**
     * Creates a new DefaultFileHeaderStrategy.
     */
    public void setFileHeaderStrategy(FileHeaderStrategy fileHeaderStrategy) {
        dataFileHeaderStrategy = new DefaultFileHeaderStrategy(fileHeaderStrategy);
    }

    // --------------------------------------
    //  Tester methods
	
    /**
     * Returns a callable that creates an indexed file for testing.
     * The file should already exist, therefore there is no need to specify
     * a file header strategy.
     *
     * @throws NullPointerException if the argument is null
     */
    public static AbstractProgressingCallable<FileHeader> createIndexFileHeaderStrategy(FileHeaderStrategy fileHeaderStrategy) {
        return new IndexingCallableTest(null, fileHeaderStrategy) { getDataFileHeaderStrategy(fileHeaderStrategy); };
    }

    /**
     * Returns a callable that creates an indexed file for testing.
     * The expected file does not exist, therefore there is no need to
     * specify a file header strategy.
     *
     * @return non-null {@code non-null;} a callable that creates an indexed file for testing
     * @throws NullPointerException if the argument is null
     */
    public static AbstractProgressingCallable<FileHeader> createIndexFileHeaderStrategy(FileHeaderStrategy fileHeaderStrategy) {
        assertNotNull(fileHeaderStrategy, "Null file header strategy");
        return new IndexingCallableTest(null, fileHeaderStrategy) { getDataFileHeaderStrategy(fileHeaderStrategy); };
    }

    /**
     * Returns a callable that creates an indexed file for testing.
     * The file should already exist, therefore there is no need to specify
     * a file header strategy.
     *
     * @throws NullPointerException if the argument is null
     * @throws FileNotFoundException if the specified file cannot be opened
     */
    public static AbstractProgressingCallable<FileHeader> createDataFileHeaderStrategy() throws FileNotFoundException {
        return createIndexFileHeaderStrategy(new DefaultIndexStrategy());
    }
    
    /**
     * Returns a callable that creates an indexed file for testing.
     * The expected file does not exist, therefore there is no need to
     * specify a file header strategy.
     *
     * @return non-null {@code non-null;} a callable that creates an indexed file for testing
     */
    public static AbstractProgressingCallable<FileHeader> createDataFileHeaderStrategy() throws FileNotFoundException {
        return createIndexFileHeaderStrategy(new DefaultDataStrategy());
    }
}