// CommonTest.java
package scenario1;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains one unit test case for the {@link Common#common(List, List)} method.
*/
class CommonTest {
// Common.java
package scenario1;

import java.util.*;

class Common {

    public static List<Object> common(List<Integer> l1, List<Object> l2) {
        Set<Integer> set = new HashSet<Integer>();
        for (Integer value : l1) {
            set.add(value);
        }
        List<Object> result = new ArrayList<Object>();
        for (Object value : l2) {
            if (value instanceof Integer) {
                int i = (Integer) value;
                if (set.contains(i) &&!result.contains(i)) {
                    result.add(i);
                }
            }
        }
        Collections.sort(result, new Comparator<Object>() {

            public int compare(Object o1, Object o2) {
                if (o1 instanceof Integer && o2 instanceof Integer) {
                    return (Integer) o1 - (Integer) o2;
                }
                return 0;
            }
        });
        return result;
    }
}

// CommonTest.java
package scenario1;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains one unit test case for the {@link Common#common(List, List)} method.
*/
class CommonTest {
		
    @Test
    void test1() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        common(list, list);
        assertTrue(list.containsAll(new ArrayList<Integer>() {
        	
        	public int size() {
                return 0;
        	}
        }));
        assertTrue(list.contains(3));
        assertFalse(list.contains(5));
        
    }
 
    @Test
    void test2() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(2);
        
        common(list, list);
        assertTrue(list.containsAll(new ArrayList<Integer>() {
        	
        	public int size() {
                return 3;
        	}
        }));
        assertFalse(list.contains(5));
    }
 
    // Not supported.
    // @Test
    public void test3() {
        List l = new ArrayList();
        l.add(9);
        l.add(9);
        l.add(9);
        l.add(9);
        l.add(9);
        l.add(9);
        
        common(l, l);
        assertTrue(l.containsAll(new ArrayList<Integer>() {
        	
        	public int size() {
                return 2;
        	}
        }));
        assertFalse(l.contains(8));
    }
 
    // Not supported.
    // @Test
    public void test4() {
        List l = new ArrayList();
        l.add(3);
        l.add(5);
        l.add(15);
        l.add(23);
    
        common(l, l);
        assertTrue(l.containsAll(new ArrayList<Integer>() {
        	
        	public int size() {
                return 6;
        	}
        }));
        assertFalse(l.contains(8));
    }
}
