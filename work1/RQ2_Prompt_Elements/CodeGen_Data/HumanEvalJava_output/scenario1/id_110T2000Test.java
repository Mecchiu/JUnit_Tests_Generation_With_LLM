// ExchangeTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains one unit test case for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {
// Exchange.java
package scenario1;

import java.util.List;

class Exchange {

    public static String exchange(List<Integer> lst1, List<Integer> lst2) {
        int count = 0;
        for (int i = 0; i < lst1.size(); i++) {
            if (lst1.get(i) % 2!= 0) {
                count++;
            }
        }
        for (int i = 0; i < lst2.size(); i++) {
            if (lst2.get(i) % 2 == 0) {
                count--;
            }
        }
        if (count <= 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

// ExchangeTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains one unit test case for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {
		
	@Test
	void testExchange() {
		
		List<Integer> list1 = new Exchange(3, 19)
               .exchange(new LinkedList<>(30, 25, 10),
                       new LinkedList<>(27));
		List<Integer> list2 = new Exchange(14, 13)
               .exchange(13, 18);
		
		assertEquals("List not equal", new LinkedList<>(19), list1);
		assertEquals("List not equal", new LinkedList<>(27), list2);
		
	}

}
