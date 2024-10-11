// SolutionTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains one unit test case for the {@link Solution#solution(List)} method.
*/
class SolutionTest {

    @Test
    void testAdd() {
        List<Integer> lst = new ArrayList<Integer>();

        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);

        assertEquals(40, solution(lst).intValue());
    }
    
    @Test
    void testInsert() {
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(10);
        lst.add(30);

        list.add(2);
        assertEquals(4, solution(lst).intValue());
    }
    
    @Test
    void testRemove() {
    	List<Integer> lst = new ArrayList<Integer>();

    	lst.add(10);
    	lst.add(30);
    	lst.add(40);

    	assertEquals(3, solution(lst).intValue());
    }

    @Test
    void testPop() {
    	List<Integer> lst = new ArrayList<Integer>();

    	lst.add(10);
    	lst.add(30);
    	lst.add(40);

    	assertEquals(2, solution(lst, 2).doubleValue());
    }
}