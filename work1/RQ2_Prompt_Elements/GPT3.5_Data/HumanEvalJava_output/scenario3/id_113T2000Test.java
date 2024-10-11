// OddCount.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class OddCount {

    /**
     * Given a list of strings, where each string consists of only digits, return a list.
     * Each element i of the output should be "the number of odd elements in the
     * string i of the input." where all the i's should be replaced by the number
     * of odd digits in the i'th string of the input.
     *
     * >>> oddCount(['1234567'])
     * ["the number of odd elements 4n the str4ng 4 of the 4nput."]
     * >>> oddCount(['3',"11111111"])
     * ["the number of odd elements 1n the str1ng 1 of the 1nput.",
     * "the number of odd elements 8n the str8ng 8 of the 8nput."]
     *
     * > oddCount(["1234567"])
     * ["the number of odd elements 4n the str4ng 4 of the 4nput."]
     * > oddCount(["3", "11111111"])
     * ["the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 8n the str8ng 8 of the 8nput."]
     * > oddCount(["271", "137", "314"])
     * ["the number of odd elements 2n the str2ng 2 of the 2nput.", "the number of odd elements 3n the str3ng 3 of the 3nput.", "the number of odd elements 2n the str2ng 2 of the 2nput."]
     */
    public static List<String> oddCount(List<String> lst) {
        List<String> result = new ArrayList<>();
        for (String str : lst) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (c % 2 != 0) {
                    count++;
                }
            }
            result.add("the number of odd elements " + count + "n the str" + (result.size() + 1) + "ng " + (result.size() + 1) + " of the " + (result.size() + 1) + "nput.");
        }
        return result;
    }
}

// OddCountTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains ten unit test cases for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {

    @Test
    void testOddCount() {
        List<String> input1 = Arrays.asList("1234567");
        List<String> expected1 = Arrays.asList("the number of odd elements 4n the str1ng 1 of the 1nput.");
        assertEquals(expected1, OddCount.oddCount(input1));

        List<String> input2 = Arrays.asList("3", "11111111");
        List<String> expected2 = Arrays.asList("the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 8n the str2ng 2 of the 2nput.");
        assertEquals(expected2, OddCount.oddCount(input2));

        List<String> input3 = Arrays.asList("271", "137", "314");
        List<String> expected3 = Arrays.asList("the number of odd elements 2n the str1ng 1 of the 1nput.", "the number of odd elements 3n the str2ng 2 of the 2nput.", "the number of odd elements 2n the str3ng 3 of the 3nput.");
        assertEquals(expected3, OddCount.oddCount(input3));
    }
}