// GUI_2Test.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link GUI}.
 * It contains ten unit test cases for the {@link GUI#ErrorCheck(String)} method.
 */
class GUI_2Test {
    
    /**
     * Test case for when the log file contains no errors.
     */
    @Test
    void testNoErrors() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/no_errors.log");
        assertFalse(result);
    }
    
    /**
     * Test case for when the log file contains a specific burn error.
     */
    @Test
    void testSpecificBurnError() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/specific_burn_error.log");
        assertTrue(result);
    }
    
    /**
     * Test case for when the log file contains the word "error".
     */
    @Test
    void testErrorKeyword() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/error_keyword.log");
        assertTrue(result);
    }
    
    /**
     * Test case for when the log file contains the word "Error".
     */
    @Test
    void testErrorKeywordCapitalized() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/error_keyword_capitalized.log");
        assertTrue(result);
    }
    
    /**
     * Test case for when the log file contains the word "broken".
     */
    @Test
    void testBrokenKeyword() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/broken_keyword.log");
        assertTrue(result);
    }
    
    /**
     * Test case for when the log file contains the word "Broken".
     */
    @Test
    void testBrokenKeywordCapitalized() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/broken_keyword_capitalized.log");
        assertTrue(result);
    }
    
    /**
     * Test case for when the log file contains a mix of errors and non-errors.
     */
    @Test
    void testMixedErrors() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/mixed_errors.log");
        assertTrue(result);
    }
    
    /**
     * Test case for when the log file is empty.
     */
    @Test
    void testEmptyLogFile() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/empty_log_file.log");
        assertFalse(result);
    }
    
    /**
     * Test case for when the log file does not exist.
     */
    @Test
    void testNonExistentLogFile() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/non_existent_log_file.log");
        assertTrue(result);
    }
    
    /**
     * Test case for when an IOException occurs while reading the log file.
     */
    @Test
    void testIOException() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/io_exception.log");
        assertTrue(result);
    }
}