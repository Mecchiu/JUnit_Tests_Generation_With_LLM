// SortThirdTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains ten unit test cases for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {
			// Test case 1
    @Test
    void testSortThird1() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        List<Integer> l2 = SortThird.sortThird(l);
        assertEquals(1, l2.get(0));
        assertEquals(2, l2.get(1));
        assertEquals(3, l2.get(2));
        assertEquals(4, l2.get(3));
        assertEquals(5, l2.get(4));
        assertEquals(6, l2.get(5));
        assertEquals(7, l2.get(6));
        assertEquals(8, l2.get(7));
        assertEquals(9, l2.get(8));
        assertEquals(10, l2.get(9));
    }

    // Test case 2
    @Test
    void testSortThird2() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(9);
        l.add(8);
        l.add(7);
        l.add(6);
        l.add(5);
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(1);
        List<Integer> l2 = SortThird.sortThird(l);
        assertEquals(1, l2.get(0));
        assertEquals(9, l2.get(1));
        assertEquals(8, l2.get(2));
        assertEquals(2, l2.get(3));
        assertEquals(5, l2.get(4));
        assertEquals(6, l2.get(5));
        assertEquals(7, l2.get(6));
        assertEquals(4, l2.get(7));
        assertEquals(3, l2.get(8));
        assertEquals(10, l2.get(9));
    }

    // Test case 3
    @Test
    void testSortThird3() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(1);
        List<Integer> l2 = SortThird.sortThird(l);
        assertEquals(1, l2.get(0));
        assertEquals(1, l2.get(1));
        assertEquals(1, l2.get(2));
        assertEquals(1, l2.get(3));
        assertEquals(1, l2.get(4));
        assertEquals(1, l2.get(5));
        assertEquals(1, l2.get(6));
        assertEquals(1, l2.get(7));
        assertEquals(1, l2.get(8));
        assertEquals(1, l2.get(9));
    }

    // Test case 4
    @Test
    void testSortThird4() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(15);
        l.add(16);
        l.add(17);
        l.add(18);
        l.add(19);
        l.add(20);
        List<Integer> l2 = SortThird.sortThird(l);
        assertEquals(1, l2.get(0));
        assertEquals(2, l2.get(1));
        assertEquals(3, l2.get(2));
        assertEquals(4, l2.get(3));
        assertEquals(5, l2.get(4));
        assertEquals(6, l2.get(5));
        assertEquals(7, l2.get(6));
        assertEquals(8, l2.get(7));
        assertEquals(9, l2.get(8));
        assertEquals(10, l2.get(9));
        assertEquals(11, l2.get(10));
        assertEquals(12, l2.get(11));
        assertEquals(13, l2.get(12));
        assertEquals(14, l2.get(13));
        assertEquals(15, l2.get(14));
        assertEquals(16, l2.get(15));
        assertEquals(17, l2.get(16));
        assertEquals(18, l2.get(17));
        assertEquals(19, l2.get(18));
        assertEquals(20, l2.get(19));
    }

    // Test case 5
    @Test
    void testSortThird5() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(20);
        l.add(19);
        l.add(18);
        l.add(17);
        l.add(16);
        l.add(15);
        l.add(14);
        l.add(13);
        l.add(12);
        l.add(11);
        l.add(10);
        l.add(9);
        l.add(8);
        l.add(7);
        l.add(6);
        l.add(5);
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(1);
        List<Integer> l2 = SortThird.sortThird(l);
        assertEquals(1, l2.get(0));
        assertEquals(19, l2.get(1));
        assertEquals(18, l2.get(2));
        assertEquals(2, l2.get(3));
        assertEquals(5, l2.get(4));
        assertEquals(6, l2.get(5));
        assertEquals(7, l2.get(6));
        assertEquals(4, l2.get(7));
        assertEquals(3, l2.get(8));
        assertEquals(10, l2.get(9));
        assertEquals(11, l2.get(10));
        assertEquals(12, l2.get(11));
        assertEquals(13, l2.get(12));
        assertEquals(14, l2.get(13));
        assertEquals(15, l2.get(14));
        assertEquals(16, l2.get(15));
        assertEquals(17, l2.get(16));
        assertEquals(8, l2.get(17));
        assertEquals(9, l2.get(18));
        assertEquals(20, l2.get(19));
    }

    // Test case 6
    @Test
    void testSortThird6() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(15);
        l.add(16);
        l.add(17);
        l.add(18);
        l.add(19);
        l.add(20);
        l.add(21);
        l.add(22);
        l.add(23);
        l.add(24);
        l.add(25);
        l.add(26);
        l.add(27);
        l.add(28);
        l.add(29);
        l.add(30);
        List<Integer> l2 = SortThird.sortThird(l);
        assertEquals(1, l2.get(0));
        assertEquals(2, l2.get(1));
        assertEquals(3, l2.get(2));
        assertEquals(4, l2.get(3));
        assertEquals(5, l2.get(4));
        assertEquals(6, l2.get(5));
        assertEquals(7, l2.get(6));
        assertEquals(8, l2.get(7));
        assertEquals(9, l2.get(8));
        assertEquals(10, l2.get(9));
        assertEquals(11, l2.get(10));
        assertEquals(12, l2.get(11));
        assertEquals(13, l2.get(12));
        assertEquals(14, l2.get(13));
        assertEquals(15, l2.get(14));
        assertEquals(16, l2.get(15));
        assertEquals(17, l2.get(16));
        assertEquals(18, l2.get(17));
        assertEquals(19, l2.get(18));
        assertEquals(20, l2.get(19));
        assertEquals(21, l2.get(20));
        assertEquals(22, l2.get(21));
        assertEquals(23, l2.get(22));
        assertEquals(24, l2.get(23));
        assertEquals(25, l2.get(24));
        assertEquals(26, l2.get(25));
        assertEquals(27, l2.get(26));
        assertEquals(28, l2.get(27));
        assertEquals(29, l2.get(28));
        assertEquals(30, l2.get(29));
    }

    // Test case 7
    @Test
    void testSortThird7() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(30);
}
}