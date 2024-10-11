// NextSmallestTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains one unit test case for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {
// NextSmallest.java
package scenario1;

import java.util.List;

class NextSmallest {

    public static Integer nextSmallest(List<Object> lst) {
        if (lst.size() <= 1) {
            return null;
        }
        Integer smallest = (Integer) lst.get(0);
        Integer nextSmallest = null;
        for (int i = 1; i < lst.size(); i++) {
            Integer current = (Integer) lst.get(i);
            if (current < smallest) {
                nextSmallest = smallest;
                smallest = current;
            } else if (nextSmallest == null || current < nextSmallest) {
                if (current!= smallest)
                    nextSmallest = current;
            }
        }
        return nextSmallest;
    }
}

// NextSmallestTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains one unit test case for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {
		@Test
		void test1() {
			List<Object> lst = newList(10, "1","2","3","4","5","6","7","8","9","A","B");
			Integer result = nextSmallest(lst);
			assertEquals(4, result.intValue());
		}
		@Test
		void test2() {
			List<Object> lst = newList(2, "2","2");
			Integer result = nextSmallest(lst);
			assertEquals(3, result.intValue());
		}
		
		public List<Object> newList(int size, String ele, Object obj1, Object obj2, Object obj3) {
		        List<Object> list = newList(size, ele, obj1, obj2, obj3);
		        return list;
		}
		public List<Object> newList(int size, String ele1, Object obj1, Object obj2, Object obj3) {		
			List<Object> list = new List<Object>();
			list.add(ele1);
			list.add(obj1);
			list.add(obj2);
			list.add(obj3);
			list.add(null);
			list.add(null);
			list.add(null);
			list.add(null);
			list.add(null);
			list.add(null);
			list.add(null);
			list.add(null);
			list.add(null);
			list.add(null);
			list.add(null);
			list.add(null);
			return list;
		}
	}

