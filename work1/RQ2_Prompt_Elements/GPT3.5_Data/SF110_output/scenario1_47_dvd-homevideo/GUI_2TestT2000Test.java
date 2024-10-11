// GUI_2Test.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link GUI}.
 * It contains ten unit test cases for the {@link GUI#ErrorCheck(String)} method.
 */
class GUI_2Test {
    
    @Test
    void testErrorCheck_noError() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("testFiles/test1.txt");
        assertFalse(result);
    }
    
    @Test
    void testErrorCheck_specificError() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("testFiles/test2.txt");
        assertTrue(result);
    }
    
    @Test
    void testErrorCheck_errorInLine() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("testFiles/test3.txt");
        assertTrue(result);
    }
    
    @Test
    void testErrorCheck_errorInToken() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("testFiles/test4.txt");
        assertTrue(result);
    }
    
    @Test
    void testErrorCheck_errorInTokenMixedCase() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("testFiles/test5.txt");
        assertTrue(result);
    }
    
    @Test
    void testErrorCheck_errorInTokenWithSpecialCharacters() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("testFiles/test6.txt");
        assertTrue(result);
    }
    
    @Test
    void testErrorCheck_errorInTokenWithNumbers() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("testFiles/test7.txt");
        assertTrue(result);
    }
    
    @Test
    void testErrorCheck_errorInTokenWithUnderscore() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("testFiles/test8.txt");
        assertTrue(result);
    }
    
    @Test
    void testErrorCheck_errorInTokenWithDash() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("testFiles/test9.txt");
        assertTrue(result);
    }
    
    @Test
    void testErrorCheck_fileNotFound() {
        GUI gui = new GUI();
        boolean result = gui.ErrorCheck("testFiles/nonexistent.txt");
        assertTrue(result);
    }
}