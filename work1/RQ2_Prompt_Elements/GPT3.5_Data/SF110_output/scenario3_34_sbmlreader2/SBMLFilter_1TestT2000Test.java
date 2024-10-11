// Here's an example implementation of the SBMLFilter_1Test class with ten unit test cases for the getReader method:

package sbmlreader2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SBMLFilter_1Test {

    @Test
    void testGetReaderWithValidFileName() {
        SBMLFilter filter = new SBMLFilter();
        GraphReader reader = filter.getReader("test.sbml");
        assertNotNull(reader);
    }

    @Test
    void testGetReaderWithInvalidFileName() {
        SBMLFilter filter = new SBMLFilter();
        GraphReader reader = filter.getReader("invalid_file_name.txt");
        assertNull(reader);
    }

    @Test
    void testGetReaderWithNullFileName() {
        SBMLFilter filter = new SBMLFilter();
        GraphReader reader = filter.getReader(null);
        assertNull(reader);
    }

    @Test
    void testGetReaderWithEmptyFileName() {
        SBMLFilter filter = new SBMLFilter();
        GraphReader reader = filter.getReader("");
        assertNull(reader);
    }

    @Test
    void testGetReaderWithNonexistentFile() {
        SBMLFilter filter = new SBMLFilter();
        GraphReader reader = filter.getReader("nonexistent_file.sbml");
        assertNull(reader);
    }

    @Test
    void testGetReaderWithUnsupportedFileExtension() {
        SBMLFilter filter = new SBMLFilter();
        GraphReader reader = filter.getReader("test.xml");
        assertNull(reader);
    }

    @Test
    void testGetReaderWithLibSBMLAvailable() {
        // TODO: Implement test with libSBML available
    }

    @Test
    void testGetReaderWithLibSBMLNotAvailable() {
        // TODO: Implement test with libSBML not available
    }

    @Test
    void testGetReaderReturnsSameObject() {
        SBMLFilter filter = new SBMLFilter();
        GraphReader reader1 = filter.getReader("test.sbml");
        GraphReader reader2 = filter.getReader("test.sbml");
        assertSame(reader1, reader2);
    }

    @Test
    void testGetReaderReturnsDifferentObjects() {
        SBMLFilter filter1 = new SBMLFilter();
        SBMLFilter filter2 = new SBMLFilter();
        GraphReader reader1 = filter1.getReader("test.sbml");
        GraphReader reader2 = filter2.getReader("test.sbml");
        assertNotSame(reader1, reader2);
    }
}