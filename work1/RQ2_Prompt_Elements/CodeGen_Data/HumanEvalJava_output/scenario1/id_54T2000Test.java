// SameCharsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SameChars}.
* It contains one unit test case for the {@link SameChars#sameChars(String, String)} method.
*/
class SameCharsTest {
// SameChars.java
package scenario1;

class SameChars {

    public static Boolean sameChars(String s0, String s1) {
        int[] count0 = new int[26];
        int[] count1 = new int[26];
        for (int i = 0; i < s0.length(); i++) {
            count0[s0.charAt(i) - 'a'] = 1;
        }
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a'] = 1;
        }
        for (int i = 0; i < 26; i++) {
            if (count0[i]!= count1[i]) {
                return false;
            }
        }
        return true;
    }
}

// SameCharsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SameChars}.
* It contains one unit test case for the {@link SameChars#sameChars(String, String)} method.
*/
class SameCharsTest {
		@Test
		 //@ExpectedFFD: int[][] counts
		public void test_sameChars(){
			//@ExpectedFFD: expected [0]
                assertArrayEquals(
                        new int[] {0},
                        new SameChars().sameChars("ab", "a")
                ); //@ExpectedFFD: expected [{0}, {1},..., {26}}
                assertArrayEquals(
                        new int[] {16},
                        new SameChars().sameChars("ab", "")
                ); //@ExpectedFFD: expected [{0}, {1},..., {26}}
        }
}