// FTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains ten unit test cases for the {@link F#f(int)} method.
*/
class FTest {
	// Test case 1
    @Test
    void testF1() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        List<Integer> actual = F.f(10);
        assertEquals(expected, actual);
    }

    // Test case 2
    @Test
    void testF2() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        List<Integer> actual = F.f(11);
        assertEquals(expected, actual);
    }

    // Test case 3
    @Test
    void testF3() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        List<Integer> actual = F.f(12);
        assertEquals(expected, actual);
    }

    // Test case 4
    @Test
    void testF4() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        expected.add(479001600);
        List<Integer> actual = F.f(13);
        assertEquals(expected, actual);
    }

    // Test case 5
    @Test
    void testF5() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        expected.add(479001600);
        expected.add(14);
        List<Integer> actual = F.f(14);
        assertEquals(expected, actual);
    }

    // Test case 6
    @Test
    void testF6() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        expected.add(479001600);
        expected.add(14);
        expected.add(6227020800L);
        List<Integer> actual = F.f(15);
        assertEquals(expected, actual);
    }

    // Test case 7
    @Test
    void testF7() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        expected.add(479001600);
        expected.add(14);
        expected.add(6227020800L);
        expected.add(16);
        List<Integer> actual = F.f(16);
        assertEquals(expected, actual);
    }

    // Test case 8
    @Test
    void testF8() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        expected.add(479001600);
        expected.add(14);
        expected.add(6227020800L);
        expected.add(16);
        expected.add(87178291200L);
        List<Integer> actual = F.f(17);
        assertEquals(expected, actual);
    }

    // Test case 9
    @Test
    void testF9() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        expected.add(479001600);
        expected.add(14);
        expected.add(6227020800L);
        expected.add(16);
        expected.add(87178291200L);
        expected.add(18);
        List<Integer> actual = F.f(18);
        assertEquals(expected, actual);
    }

    // Test case 10
    @Test
    void testF10() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        expected.add(479001600);
        expected.add(14);
        expected.add(6227020800L);
        expected.add(16);
        expected.add(87178291200L);
        expected.add(18);
        expected.add(1307674368000L);
        List<Integer> actual = F.f(19);
        assertEquals(expected, actual);
    }
}
