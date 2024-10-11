// IsHappyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {

		/**
		* Test case 1.
		* The input string is "abc".
		* The expected result is true.
		*/
		@Test
		void test1() {
				assertTrue(IsHappy.isHappy("abc"));
		}
		
		/**
		* Test case 2.
		* The input string is "abcc".
		* The expected result is false.
		*/
		@Test
		void test2() {
				assertFalse(IsHappy.isHappy("abcc"));
		}
		
		/**
		* Test case 3.
		* The input string is "abccc".
		* The expected result is false.
		*/
		@Test
		void test3() {
				assertFalse(IsHappy.isHappy("abccc"));
		}
		
		/**
		* Test case 4.
		* The input string is "abcccc".
		* The expected result is false.
		*/
		@Test
		void test4() {
				assertFalse(IsHappy.isHappy("abcccc"));
		}
		
		/**
		* Test case 5.
		* The input string is "abccccc".
		* The expected result is false.
		*/
		@Test
		void test5() {
				assertFalse(IsHappy.isHappy("abccccc"));
		}
		
		/**
		* Test case 6.
		* The input string is "abcccccc".
		* The expected result is false.
		*/
		@Test
		void test6() {
				assertFalse(IsHappy.isHappy("abcccccc"));
		}
		
		/**
		* Test case 7.
		* The input string is "abccccccc".
		* The expected result is false.
		*/
		@Test
		void test7() {
				assertFalse(IsHappy.isHappy("abccccccc"));
		}
		
		/**
		* Test case 8.
		* The input string is "abcccccccc".
		* The expected result is false.
		*/
		@Test
		void test8() {
				assertFalse(IsHappy.isHappy("abcccccccc"));
		}
		
		/**
		* Test case 9.
		* The input string is "abccccccccc".
		* The expected result is false.
		*/
		@Test
		void test9() {
				assertFalse(IsHappy.isHappy("abccccccccc"));
		}
		
		/**
		* Test case 10.
		* The input string is "abcccccccccc".
		* The expected result is false.
		*/
		@Test
		void test10() {
				assertFalse(IsHappy.isHappy("abcccccccccc"));
		}
}
```

## Scenario 2

```java
// IsHappy.java
package scenario2;

class IsHappy {

    public static Boolean isHappy(String s) {
        if (s.length() < 3) {
            return false;
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i) == s.charAt(i + 2) || s.charAt(i + 1) == s.charAt(i + 2)) {
                return false;
            }
        }
        return true;
    }
}

// IsHappyTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {
		
		/**
		* Test case 1.
		* The input string is "abc".
		* The expected result is true.
		*/
		@Test
		void test1() {
				assertTrue(IsHappy.isHappy("abc"));
		}
		
		/**
		* Test case 2.
		* The input string is "abcc".
		* The expected result is false.
		*/
		@Test
		void test2() {
				assertFalse(IsHappy.isHappy("abcc"));
		}
		
		/**
		* Test case 3.
		* The input string is "abccc".
		* The expected result is false.
		*/
		@Test
		void test3() {
				assertFalse(IsHappy.isHappy("abccc"));
		}
		
		/**
		* Test case 4.
		* The input string is "abcccc".
		* The expected result is false.
		*/
		@Test
		void test4() {
				assertFalse(IsHappy.isHappy("abcccc"));
		}
		
		/**
		* Test case 5.
		* The input string is "abccccc".
		* The expected result is false.
		*/
		@Test
		void test5() {
				assertFalse(IsHappy.isHappy("abccccc"));
		}
		
		/**
		* Test case 6.
		* The input string is "abcccccc".
		* The expected result is false.
		*/
		@Test
		void test6() {
				assertFalse(IsHappy.isHappy("abcccccc"));
		}
		
		/**
		* Test case 7.
		* The input string is "abccccccc".
		* The expected result is false.
		*/
		@Test
		void test7() {
				assertFalse(IsHappy.isHappy("abccccccc"));
		}
		
		/**
		* Test case 8.
		* The input string is "abcccccccc".
		* The expected result is false.
		*/
		@Test
		void test8() {
				assertFalse(IsHappy.isHappy("abcccccccc"));
		}
		
		/**
		* Test case 9.
		* The input string is "abccccccccc".
		* The expected result is false.
		*/
		@Test
		void test9() {
				assertFalse(IsHappy.isHappy("abccccccccc"));
		}
		
		/**
		* Test case 10.
		* The input string is "abcccccccccc".
		* The expected result is false.
		*/
		@Test
		void test10() {
				assertFalse(IsHappy.isHappy("abcccccccccc"));
		}
}
```

## Scenario 3

```java
// IsHappy.java
package scenario3;

class IsHappy {

    public static Boolean isHappy(String s) {
        if (s.length() < 3) {
            return false;
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i) == s.charAt(i + 2) || s.charAt(i + 1) == s.charAt(i + 2)) {
                return false;
            }
        }
        return true;
    }
}

// IsHappyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {
		
		/**
		* Test case 1.
		* The input string is "abc".
		* The expected result is true.
		*/
		@Test
		void test1() {
				assertTrue(IsHappy.isHappy("abc"));
		}
		
		/**
		* Test case 2.
		* The input string is "abcc".
		* The expected result is false.
		*/
		@Test
		void test2() {
				assertFalse(IsHappy.isHappy("abcc"));
		}
		
		/**
		* Test case 3.
		* The input string is "abccc".
		* The expected result is false.
		*/
		@Test
		void test3() {
				assertFalse(IsHappy.isHappy("abccc"));
		}
		
		/**
		* Test case 4.
		* The input string is "abcccc".
		* The expected result is false.
		*/
		@Test
		void test4() {
				assertFalse(IsHappy.isHappy("abcccc"));
		}
		
		/**
		* Test case 5.
		* The input string is "abccccc".
		* The expected result is false.
		*/
		@Test
		void test5() {
				assertFalse(IsHappy.isHappy("abccccc"));
		}
		
		/**
		* Test case 6.
		* The input string is "abcccccc".
		* The expected result is false.
		*/
		@Test
		void test6() {
				assertFalse(IsHappy.isHappy("abcccccc"));
		}
		
		/**
		* Test case 7.
		* The input string is "abccccccc".
		* The expected result is false.
		*/
		@Test
		void test7() {
				assertFalse(IsHappy.isHappy("abccccccc"));
		}
		
		/**
		* Test case 8.
		* The input string is "abcccccccc".
		* The expected result is false.
		*/
		@Test
		void test8() {
				assertFalse(IsHappy.isHappy("abcccccccc"));
		}
		
		/**
		* Test case 9.
		* The input string is "abccccccccc".
		* The expected result is false.
		*/
		@Test
		void test9() {
				assertFalse(IsHappy.isHappy("abccccccccc"));
		}
		
		/**
		* Test case 10.
		* The input string is "abcccccccccc".
		* The expected result is false.
		*/
		@Test
		void test10() {
				assertFalse(IsHappy.isHappy("abcccccccccc"));
		}
}
```

## Scenario 4

```java
// IsHappy.java
package scenario4;

class IsHappy {

    public static Boolean isHappy(String s) {
        if (s.length() < 3) {
            return false;
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i) == s.charAt(i + 2) || s.charAt(i + 1) == s.charAt(i + 2)) {
                return false;
            }
        }
        return true;
    }
}

// IsHappyTest.java
package scenario4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {
		
		/**
		* Test case 1.
		* The input string is "abc".
		* The expected result is true.
		*/
		@Test
		void test1() {
				assertTrue(IsHappy.isHappy("abc"));
		}
		
		/**
		* Test case 2.
		* The input string is "abcc".
		* The expected result is false.
		*/
		@Test
		void test2() {
				assertFalse(IsHappy.isHappy("abcc"));
		}
		
		/**
		* Test case 3.
		* The input string is "abccc".
		* The expected result is false.
		*/
		@Test
		void test3() {
				assertFalse(IsHappy.isHappy("abccc"));
		}
		
		/**
		* Test case 4.
		* The input string is "abcccc".
		* The expected result is false.
		*/
		@Test
		void test4() {
				assertFalse(IsHappy.isHappy("abcccc"));
		}
		
		/**
		* Test case 5.
		* The input string is "abccccc".
		* The expected result is false.
		*/
		@Test
		void test5() {
				assertFalse(IsHappy.isHappy("abccccc"));
		}
		
		/**
		* Test case 6.
		* The input string is "abcccccc".
		* The expected result is false.
		*/
		@Test
		void test6() {
				assertFalse(IsHappy.isHappy("abcccccc"));
		}
		
		/**
		* Test case 7.
		* The input string is "abccccccc".
		* The expected result is false.
		*/
		@Test
		void test7() {
				assertFalse(IsHappy.isHappy("abccccccc"));
		}
		
		/**
		* Test case 8.
		* The input string is "abcccccccc".
		* The expected result is false.
		*/
		@Test
		void test8() {
				assertFalse(IsHappy.isHappy("abcccccccc"));
		}
		
		/**
		* Test case 9.
		* The input string is "abccccccccc".
		* The expected result is false.
		*/
		@Test
		void test9() {
				assertFalse(IsHappy.isHappy("abccccccccc"));
		}
		
		/**
		* Test case 10.
		* The input string is "abcccccccccc".
		* The expected result is false.
		*/
		@Test
		void test10() {
				assertFalse(IsHappy.isHappy("abcccccccccc"));
		}
}
```

## Scenario 5

```java
// IsHappy.java
package scenario5;

class IsHappy {

    public static