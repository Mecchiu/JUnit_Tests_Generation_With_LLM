// ResourceService_2Test.java
package common;

import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ResourceService}.
 * It contains ten unit test cases for the {@link ResourceService#getInputStream(String)} method.
 */
class ResourceService_2Test {

    /**
     * Test case for a valid resource path.
     * Expected result: An input stream pointing to the requested resource.
     */
    @Test
    void testGetInputStream_validPath() {
        InputStream inputStream = ResourceService.getInputStream("common/test.txt");
        assertNotNull(inputStream);
    }

    /**
     * Test case for a null resource path.
     * Expected result: A null input stream.
     */
    @Test
    void testGetInputStream_nullPath() {
        InputStream inputStream = ResourceService.getInputStream(null);
        assertNull(inputStream);
    }

    /**
     * Test case for an empty resource path.
     * Expected result: A null input stream.
     */
    @Test
    void testGetInputStream_emptyPath() {
        InputStream inputStream = ResourceService.getInputStream("");
        assertNull(inputStream);
    }

    /**
     * Test case for a non-existent resource path.
     * Expected result: A null input stream.
     */
    @Test
    void testGetInputStream_nonExistentPath() {
        InputStream inputStream = ResourceService.getInputStream("common/nonexistent.txt");
        assertNull(inputStream);
    }

    /**
     * Test case for a resource path that points to a directory.
     * Expected result: A null input stream.
     */
    @Test
    void testGetInputStream_directoryPath() {
        InputStream inputStream = ResourceService.getInputStream("common");
        assertNull(inputStream);
    }

    /**
     * Test case for a resource path that points to a file outside the classpath.
     * Expected result: A null input stream.
     */
    @Test
    void testGetInputStream_fileOutsideClasspath() {
        InputStream inputStream = ResourceService.getInputStream("../test.txt");
        assertNull(inputStream);
    }

    /**
     * Test case for a resource path that contains spaces.
     * Expected result: An input stream pointing to the requested resource.
     */
    @Test
    void testGetInputStream_pathWithSpaces() {
        InputStream inputStream = ResourceService.getInputStream("common/test with spaces.txt");
        assertNotNull(inputStream);
    }

    /**
     * Test case for a resource path that contains special characters.
     * Expected result: An input stream pointing to the requested resource.
     */
    @Test
    void testGetInputStream_pathWithSpecialCharacters() {
        InputStream inputStream = ResourceService.getInputStream("common/test!@#$%^&*()_+-={}|[]\\:\";'<>?,./`~.txt");
        assertNotNull(inputStream);
    }

    /**
     * Test case for a resource path that contains non-ASCII characters.
     * Expected result: An input stream pointing to the requested resource.
     */
    @Test
    void testGetInputStream_pathWithNonAsciiCharacters() {
        InputStream inputStream = ResourceService.getInputStream("common/测试.txt");
        assertNotNull(inputStream);
    }

    /**
     * Test case for a resource path that contains a mix of characters.
     * Expected result: An input stream pointing to the requested resource.
     */
    @Test
    void testGetInputStream_pathWithMixedCharacters() {
        InputStream inputStream = ResourceService.getInputStream("common/test with spaces!@#$%^&*()_+-={}|[]\\:\";'<>?,./`~.txt");
        assertNotNull(inputStream);
    }
}