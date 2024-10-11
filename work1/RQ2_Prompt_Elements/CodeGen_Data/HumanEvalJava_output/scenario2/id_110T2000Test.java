// ExchangeTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains one unit test case for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {
// Exchange.java
package scenario2;

import java.util.List;

class Exchange {

    /**
     * In this problem, you will implement a function that takes two lists of numbers,
     * and determines whether it is possible to perform an exchange of elements
     * between them to make lst1 a list of only even numbers.
     * There is no limit on the number of exchanged elements between lst1 and lst2.
     * If it is possible to exchange elements between the lst1 and lst2 to make
     * all the elements of lst1 to be even, return "YES".
     * Otherwise, return "NO".
     */
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
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains one unit test case for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {
		/**
		 * This method tests the {@link Exchange#exchange(List, List)} method.
		*/
        @Test
    public void testExchange(){
			List<Integer> list = new ArrayList<>(); // list where elements are of type {int,int}
			list.add(20);
			list.add(23);
			
			
			assertEquals(false, exchange(list, list));
			assertEquals(false, exchange(list, new ArrayList<>()));
			assertEquals(true, exchange(list, new ArrayList<>().add(-1)));
			assertEquals(true, exchange(new ArrayList<>().add(-1), new ArrayList<>()));
			
			
			
		}
		
		
}
