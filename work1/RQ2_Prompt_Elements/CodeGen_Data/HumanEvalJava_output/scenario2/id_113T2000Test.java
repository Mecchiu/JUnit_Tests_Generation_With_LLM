// OddCountTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains one unit test case for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {
// OddCount.java
package scenario2;

import java.util.ArrayList;
import java.util.List;

class OddCount {

    /**
     * Given a list of strings, where each string consists of only digits, return a list.
     * Each element i of the output should be "the number of odd elements in the
     * string i of the input." where all the i's should be replaced by the number
     * of odd digits in the i'th string of the input.
     */
    public static List<String> oddCount(List<String> lst) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < lst.size(); i++) {
            int count = 0;
            for (int j = 0; j < lst.get(i).length(); j++) {
                if (Integer.parseInt(lst.get(i).substring(j, j + 1)) % 2!= 0) {
                    count++;
                }
            }
            result.add("the number of odd elements " + count + "n the str" + count + "ng " + count + " of the " + count + "nput.");
        }
        return result;
    }
}

// OddCountTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains one unit test case for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {
		
	@Test
	void test00() {
		// Given
		List<Integer> input = new ArrayList<Integer>();
		input.add(0);

		// When
		List<String> output = OddCount.oddCount(input);

		// Then
		assertEquals(1, output.size());
		assertTrue(output.get(0).equals("the number of odd elements 0 of the string 0 of the input. "));
	}
	
}
