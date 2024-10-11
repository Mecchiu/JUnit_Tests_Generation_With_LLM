// StrlenTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains one unit test case for the {@link Strlen#strlen(String)} method.
*/
class StrlenTest {

    /**
     * Test {@link Strlen#strlen(String)} method.
     */
    @Test
    public void testStrlen(){
        assertEqual("", 0);
        assertEqual("", 1);
        assertEqual("abc", 3);
        assertEqual("abc", "abc");
        assertEqual("abc", "abc");
        assertEqual("abc", "abc");
    }
	
}
