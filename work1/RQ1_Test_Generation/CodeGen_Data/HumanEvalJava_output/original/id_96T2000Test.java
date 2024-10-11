// CountUpToTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains one unit test case for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {

    /**
     * Test of countUpTo method.
     */
    @Test
    public void testCountUpTo() {
        int n = 3;
        List<Object> resultList = new ArrayList<Object>();
        assertTrue("Incorrect return value", countUpTo(n).equals(resultList));
    }

    @Test
    public void testConcatenatedCountUpTo() {
        List<Object> resultList = countUpTo(5);
        assertTrue("Incorrect result", resultList.equals(new ArrayList<Object>(Arrays.asList(5))));
    }
	
}
