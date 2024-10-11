// IsBoredTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains one unit test case for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {

    @Test
    public void test() {
		
        IsBored isBored = new IsBored();
        assertEquals(true, isBored.isBored("I"));
        assertEquals(false, isBored.isBored("I+"));
        assertEquals(true, isBored.isBored("I "));
        assertEquals(true, isBored.isBored("I+1"));
        assertEquals(false, isBored.isBored(" I"));
        assertEquals(false, isBored.isBored(" I "));
        assertEquals(false, isBored.isBored(" I+"));
        assertEquals(false, isBored.isBored(" I "));
        assertEquals(false, isBored.isBored(" I+1"));
        assertEquals(false, isBored.isBored(" Is "));
        assertEquals(false, isBored.isBored(" Is "));

    }
}
