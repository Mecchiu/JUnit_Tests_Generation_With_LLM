// OddCountTest.java
package scenario1;

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
package scenario1;

import java.util.ArrayList;
import java.util.List;

class OddCount {

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
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains one unit test case for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {
		/**
	 * Unit test for {@link OddCount#oddCount(List)}.
	 */
	@Test
		public void test() {
		//fail("Not yet implemented.");
		// TODO Auto-generated method stub
		
	}
}