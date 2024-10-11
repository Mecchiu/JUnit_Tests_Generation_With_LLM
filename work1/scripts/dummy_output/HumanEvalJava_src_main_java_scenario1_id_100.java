// MakeAPileTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakeAPile}.
* It contains ten unit test cases for the {@link MakeAPile#makeAPile(int)} method.
*/
class MakeAPileTest {
			// Test case 1
    @Test
    void testMakeAPile1() {
        int n = 1;
        List<Integer> expResult = new ArrayList<Integer>();
        expResult.add(1);
        List<Integer> result = MakeAPile.makeAPile(n);
        assertEquals(expResult, result);
    }
			// Test case 2
    @Test
    void testMakeAPile2() {
        int n = 2;
        List<Integer> expResult = new ArrayList<Integer>();
        expResult.add(2);
        expResult.add(4);
        List<Integer> result = MakeAPile.makeAPile(n);
        assertEquals(expResult, result);
    }
			// Test case 3
    @Test
    void testMakeAPile3() {
        int n = 3;
        List<Integer> expResult = new ArrayList<Integer>();
        expResult.add(3);
        expResult.add(5);
        expResult.add(7);
        List<Integer> result = MakeAPile.makeAPile(n);
        assertEquals(expResult, result);
    }
			// Test case 4
    @Test
    void testMakeAPile4() {
        int n = 4;
        List<Integer> expResult = new ArrayList<Integer>();
        expResult.add(4);
        expResult.add(6);
        expResult.add(8);
        expResult.add(10);
        List<Integer> result = MakeAPile.makeAPile(n);
        assertEquals(expResult, result);
    }
			// Test case 5
    @Test
    void testMakeAPile5() {
        int n = 5;
        List<Integer> expResult = new ArrayList<Integer>();
        expResult.add(5);
        expResult.add(7);
        expResult.add(9);
        expResult.add(11);
        expResult.add(13);
        List<Integer> result = MakeAPile.makeAPile(n);
        assertEquals(expResult, result);
    }
			// Test case 6
    @Test
    void testMakeAPile6() {
        int n = 6;
        List<Integer> expResult = new ArrayList<Integer>();
        expResult.add(6);
        expResult.add(8);
        expResult.add(10);
        expResult.add(12);
        expResult.add(14);
        expResult.add(16);
        List<Integer> result = MakeAPile.makeAPile(n);
        assertEquals(expResult, result);
    }
			// Test case 7
    @Test
    void testMakeAPile7() {
        int n = 7;
        List<Integer> expResult = new ArrayList<Integer>();
        expResult.add(7);
        expResult.add(9);
        expResult.add(11);
        expResult.add(13);
        expResult.add(15);
        expResult.add(17);
        expResult.add(19);
        List<Integer> result = MakeAPile.makeAPile(n);
        assertEquals(expResult, result);
    }
			// Test case 8
    @Test
    void testMakeAPile8() {
        int n = 8;
        List<Integer> expResult = new ArrayList<Integer>();
        expResult.add(8);
        expResult.add(10);
        expResult.add(12);
        expResult.add(14);
        expResult.add(16);
        expResult.add(18);
        expResult.add(20);
        expResult.add(22);
        List<Integer> result = MakeAPile.makeAPile(n);
        assertEquals(expResult, result);
    }
			// Test case 9
    @Test
    void testMakeAPile9() {
        int n = 9;
        List<Integer> expResult = new ArrayList<Integer>();
        expResult.add(9);
        expResult.add(11);
        expResult.add(13);
        expResult.add(15);
        expResult.add(17);
        expResult.add(19);
        expResult.add(21);
        expResult.add(23);
        expResult.add(25);
        List<Integer> result = MakeAPile.makeAPile(n);
        assertEquals(expResult, result);
    }
			// Test case 10
    @Test
    void testMakeAPile10() {
        int n = 10;
        List<Integer> expResult = new ArrayList<Integer>();
        expResult.add(10);
        expResult.add(12);
        expResult.add(14);
        expResult.add(16);
        expResult.add(18);
        expResult.add(20);
        expResult.add(22);
        expResult.add(24);
        expResult.add(26);
        expResult.add(28);
        List<Integer> result = MakeAPile.makeAPile(n);
        assertEquals(expResult, result);
    }
}