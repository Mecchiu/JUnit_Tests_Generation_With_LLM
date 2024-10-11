// GenerateIntegersTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains one unit test case for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {

    /**
     * Test cases for {@link GenerateIntegers#generateIntegers(int, int)}.
     */
    @Test
    void testGenerateIntegers() {
  		
         List<Object> expected = ListToArray(generateIntegers(2, 8));
          assertEquals(expected, ListToArray(generateIntegers(8, 2)));
  		
    }
		
}
