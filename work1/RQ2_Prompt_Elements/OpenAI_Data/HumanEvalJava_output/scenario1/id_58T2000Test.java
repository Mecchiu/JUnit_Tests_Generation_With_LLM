// CommonTest.java
package scenario1;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains ten unit test cases for the {@link Common#common(List, List)} method.
*/
class CommonTest {
	// Test case 1
    @Test
    void testCommon1() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        List<Object> result = Common.common(l1, l2);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }
			// Test case 2
    @Test
    void testCommon2() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        List<Object> result = Common.common(l1, l2);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }
			// Test case 3
    @Test
    void testCommon3() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
        List<Object> result = Common.common(l1, l2);
        assertEquals(0, result.size());
    }
			// Test case 4
    @Test
    void testCommon4() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        List<Object> result = Common.common(l1, l2);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }
			// Test case 5
    @Test
    void testCommon5() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        List<Object> result = Common.common(l1, l2);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }
			// Test case 6
    @Test
    void testCommon6() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        List<Object> result = Common.common(l1, l2);
        assertEquals(6, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
    }
			// Test case 7
    @Test
    void testCommon7() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l2.add(11);
        l2.add(12);
        List<Object> result = Common.common(l1, l2);
        assertEquals(0, result.size());
    }
			// Test case 8
    @Test
    void testCommon8() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l2.add(11);
        l2.add(12);
        List<Object> result = Common.common(l1, l2);
        assertEquals(6, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
    }
			// Test case 9
    @Test
    void testCommon9() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l2.add(18);
        l2.add(19);
        l2.add(20);
        List<Object> result = Common.common(l1, l2);
        assertEquals(6, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
    }
			// Test case 10
    @Test
    void testCommon10() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        List<Object> l2 = new ArrayList<Object>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l2.add(18);
        l2.add(19);
        l2.add(20);
        l2.add(21);
        l2.add(22);
        l2.add(23);
        l2.add(24);
        l2.add(25);
        l2.add(26);
        l2.add(27);
        l2.add(28);
        l2.add(29);
        l2.add(30);
        List<Object> result = Common.common(l1, l2);
        assertEquals(6, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
    }
}
