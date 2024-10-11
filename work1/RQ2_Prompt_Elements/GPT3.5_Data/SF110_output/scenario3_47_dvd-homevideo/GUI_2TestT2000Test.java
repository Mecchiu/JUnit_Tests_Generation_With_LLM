// Here's an example implementation of the ErrorCheck method in the GUI class:

/**
 * Check dvd-homevideo for runtime errors
 *
 * @param fileName This is a log file to parse through, looking for
 *                      the keyword "Error"
 * @return A boolean indicating if an error was found
 */
public boolean ErrorCheck(String fileName) {
    boolean errorFound = false;
    try {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains("Error")) {
                errorFound = true;
                break;
            }
        }
        reader.close();
    } catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
    }
    return errorFound;
}

// And here's an example implementation of the GUI_2Test class:

/**
 * Test class of {@link GUI}.
 * It contains ten unit test cases for the {@link GUI#ErrorCheck(String)} method.
 */
class GUI_2Test {
    @Test
    void testErrorCheck_noError() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/no_error.log");
        assertFalse(result);
    }

    @Test
    void testErrorCheck_singleError() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/single_error.log");
        assertTrue(result);
    }

    @Test
    void testErrorCheck_multipleErrors() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/multiple_errors.log");
        assertTrue(result);
    }

    @Test
    void testErrorCheck_emptyFile() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/empty_file.log");
        assertFalse(result);
    }

    @Test
    void testErrorCheck_fileNotFound() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/nonexistent_file.log");
        assertFalse(result);
    }

    @Test
    void testErrorCheck_nullFileName() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck(null);
        assertFalse(result);
    }

    @Test
    void testErrorCheck_blankFileName() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("");
        assertFalse(result);
    }

    @Test
    void testErrorCheck_whitespaceFileName() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("   ");
        assertFalse(result);
    }

    @Test
    void testErrorCheck_nonTextFile() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files/non_text_file.jpg");
        assertFalse(result);
    }

    @Test
    void testErrorCheck_directory() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("test_files");
        assertFalse(result);
    }
}