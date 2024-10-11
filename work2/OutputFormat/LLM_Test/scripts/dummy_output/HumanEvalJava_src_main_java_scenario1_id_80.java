// IsHappyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {
			// Test case 1
    @Test
    void isHappyTest1() {
        String s = "abc";
        Boolean result = IsHappy.isHappy(s);
        assertFalse(result);
    }
			// Test case 2
    @Test
    void isHappyTest2() {
        String s = "aaa";
        Boolean result = IsHappy.isHappy(s);
        assertFalse(result);
    }
			// Test case 3
    @Test
    void isHappyTest3() {
        String s = "abab";
        Boolean result = IsHappy.isHappy(s);
        assertFalse(result);
    }
			// Test case 4
    @Test
    void isHappyTest4() {
        String s = "abba";
        Boolean result = IsHappy.isHappy(s);
        assertFalse(result);
    }
			// Test case 5
    @Test
    void isHappyTest5() {
        String s = "abca";
        Boolean result = IsHappy.isHappy(s);
        assertTrue(result);
    }
			// Test case 6
    @Test
    void isHappyTest6() {
        String s = "abcb";
        Boolean result = IsHappy.isHappy(s);
        assertTrue(result);
    }
			// Test case 7
    @Test
    void isHappyTest7() {
        String s = "abac";
        Boolean result = IsHappy.isHappy(s);
        assertTrue(result);
    }
			// Test case 8
    @Test
    void isHappyTest8() {
        String s = "abbc";
        Boolean result = IsHappy.isHappy(s);
        assertTrue(result);
    }
			// Test case 9
    @Test
    void isHappyTest9() {
        String s = "abcc";
        Boolean result = IsHappy.isHappy(s);
        assertTrue(result);
    }
			// Test case 10
    @Test
    void isHappyTest10() {
        String s = "abaa";
        Boolean result = IsHappy.isHappy(s);
        assertTrue(result);
    }
}