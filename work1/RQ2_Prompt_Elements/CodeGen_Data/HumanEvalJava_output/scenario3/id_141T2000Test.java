// FileNameCheckTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileNameCheck}.
* It contains one unit test case for the {@link FileNameCheck#fileNameCheck(String)} method.
*/
class FileNameCheckTest {

    /**
     * Test method for {@link org.junit.jupiter.api.Assertions#assertThrows(AssertionFailedError, java.lang.Class, java.lang.Throwable)}.
     */
    @Test
    public void testAssertThrowsClassThatThrowsThrowable() {
    	String[] testStrings = {"fileNameCheck", ""};
    	String[] testStrings_1 = {"fileNameCheck"};
    	String[] testStrings_2 = {"fileNameCheck"};
    	
    	for (String testString : testStrings) {
    		for (String testString_1 : testStrings_1) {
    			for (String testString_2 : testStrings_2) {
    				
    				String testString_2_1 = testString_2 + testString;
    				String testString_2_2 = testString_2 + "d";
    				String testString_2_3 = testString_2_2 + testString;
    				
    				assertThrows(AssertionFailedError.class, Class.class, Exception::new);
    				assertThrows(AssertionFailedError.class, Class.class, Exception::new);
    			}
    		}
    	}
    }
}