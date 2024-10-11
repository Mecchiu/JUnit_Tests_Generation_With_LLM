// UniqueDigitsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains one unit test case for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {

/**
 * Test case for {@link UniqueDigits#uniqueDigits(List)}.
 */
    @Test
    public void testUniqueDigitsList() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        
        Integer[] expected = new Integer[9];
        expected[0] = 1;
        expected[1] = 2;
        expected[2] = 3;
        expected[3] = 4;
        expected[4] = 5;
        expected[5] = 6;
        expected[6] = 7;
        expected[7] = 8;
        expected[8] = 9;
 
        int[] actual = UniqueDigits.uniqueDigits(list);
        
        assertArrayEquals(expected, actual);
    }
}