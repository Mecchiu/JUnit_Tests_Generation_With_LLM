// RightAngleTriangleTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RightAngleTriangle}.
* It contains ten unit test cases for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
*/
class RightAngleTriangleTest {

		/**
		* Test case 1.
		* Input: 3, 4, 5
		* Expected output: true
		*/
		@Test
		void test1() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(3, 4, 5));
		}
		
		/**
		* Test case 2.
		* Input: 5, 4, 3
		* Expected output: true
		*/
		@Test
		void test2() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(5, 4, 3));
		}
		
		/**
		* Test case 3.
		* Input: 3, 5, 4
		* Expected output: true
		*/
		@Test
		void test3() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(3, 5, 4));
		}
		
		/**
		* Test case 4.
		* Input: 4, 3, 5
		* Expected output: true
		*/
		@Test
		void test4() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(4, 3, 5));
		}
		
		/**
		* Test case 5.
		* Input: 4, 5, 3
		* Expected output: true
		*/
		@Test
		void test5() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(4, 5, 3));
		}
		
		/**
		* Test case 6.
		* Input: 5, 3, 4
		* Expected output: true
		*/
		@Test
		void test6() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(5, 3, 4));
		}
		
		/**
		* Test case 7.
		* Input: 3, 3, 5
		* Expected output: false
		*/
		@Test
		void test7() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(3, 3, 5));
		}
		
		/**
		* Test case 8.
		* Input: 3, 5, 3
		* Expected output: false
		*/
		@Test
		void test8() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(3, 5, 3));
		}
		
		/**
		* Test case 9.
		* Input: 5, 3, 3
		* Expected output: false
		*/
		@Test
		void test9() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(5, 3, 3));
		}
		
		/**
		* Test case 10.
		* Input: 3, 3, 3
		* Expected output: false
		*/
		@Test
		void test10() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(3, 3, 3));
		}
}

// RightAngleTriangleTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RightAngleTriangle}.
* It contains ten unit test cases for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
*/
class RightAngleTriangleTest {
		
		/**
		* Test case 1.
		* Input: 3, 4, 5
		* Expected output: true
		*/
		@Test
		void test1() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(3, 4, 5));
		}
		
		/**
		* Test case 2.
		* Input: 5, 4, 3
		* Expected output: true
		*/
		@Test
		void test2() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(5, 4, 3));
		}
		
		/**
		* Test case 3.
		* Input: 3, 5, 4
		* Expected output: true
		*/
		@Test
		void test3() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(3, 5, 4));
		}
		
		/**
		* Test case 4.
		* Input: 4, 3, 5
		* Expected output: true
		*/
		@Test
		void test4() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(4, 3, 5));
		}
		
		/**
		* Test case 5.
		* Input: 4, 5, 3
		* Expected output: true
		*/
		@Test
		void test5() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(4, 5, 3));
		}
		
		/**
		* Test case 6.
		* Input: 5, 3, 4
		* Expected output: true
		*/
		@Test
		void test6() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(5, 3, 4));
		}
		
		/**
		* Test case 7.
		* Input: 3, 3, 5
		* Expected output: false
		*/
		@Test
		void test7() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(3, 3, 5));
		}
		
		/**
		* Test case 8.
		* Input: 3, 5, 3
		* Expected output: false
		*/
		@Test
		void test8() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(3, 5, 3));
		}
		
		/**
		* Test case 9.
		* Input: 5, 3, 3
		* Expected output: false
		*/
		@Test
		void test9() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(5, 3, 3));
		}
		
		/**
		* Test case 10.
		* Input: 3, 3, 3
		* Expected output: false
		*/
		@Test
		void test10() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(3, 3, 3));
		}
}

// RightAngleTriangle.java
package scenario2;

class RightAngleTriangle {

    public static Boolean rightAngleTriangle(int a, int b, int c) {
        if (a == b || b == c || a == c) {
            return false;
        }
        if (a > b && a > c) {
            return a * a == b * b + c * c;
        }
        if (b > a && b > c) {
            return b * b == a * a + c * c;
        }
        return c * c == a * a + b * b;
    }
}

// RightAngleTriangleTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RightAngleTriangle}.
* It contains ten unit test cases for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
*/
class RightAngleTriangleTest {
		
		/**
		* Test case 1.
		* Input: 3, 4, 5
		* Expected output: true
		*/
		@Test
		void test1() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(3, 4, 5));
		}
		
		/**
		* Test case 2.
		* Input: 5, 4, 3
		* Expected output: true
		*/
		@Test
		void test2() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(5, 4, 3));
		}
		
		/**
		* Test case 3.
		* Input: 3, 5, 4
		* Expected output: true
		*/
		@Test
		void test3() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(3, 5, 4));
		}
		
		/**
		* Test case 4.
		* Input: 4, 3, 5
		* Expected output: true
		*/
		@Test
		void test4() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(4, 3, 5));
		}
		
		/**
		* Test case 5.
		* Input: 4, 5, 3
		* Expected output: true
		*/
		@Test
		void test5() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(4, 5, 3));
		}
		
		/**
		* Test case 6.
		* Input: 5, 3, 4
		* Expected output: true
		*/
		@Test
		void test6() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(5, 3, 4));
		}
		
		/**
		* Test case 7.
		* Input: 3, 3, 5
		* Expected output: false
		*/
		@Test
		void test7() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(3, 3, 5));
		}
		
		/**
		* Test case 8.
		* Input: 3, 5, 3
		* Expected output: false
		*/
		@Test
		void test8() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(3, 5, 3));
		}
		
		/**
		* Test case 9.
		* Input: 5, 3, 3
		* Expected output: false
		*/
		@Test
		void test9() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(5, 3, 3));
		}
		
		/**
		* Test case 10.
		* Input: 3, 3, 3
		* Expected output: false
		*/
		@Test
		void test10() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(3, 3, 3));
		}
}

// RightAngleTriangle.java
package scenario3;

class RightAngleTriangle {

    public static Boolean rightAngleTriangle(int a, int b, int c) {
        if (a == b || b == c || a == c) {
            return false;
        }
        if (a > b && a > c) {
            return a * a == b * b + c * c;
        }
        if (b > a && b > c) {
            return b * b == a * a + c * c;
        }
        return c * c == a * a + b * b;
    }
}

// RightAngleTriangleTest.java
package scenario4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RightAngleTriangle}.
* It contains ten unit test cases for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
*/
class RightAngleTriangleTest {
		
		/**
		* Test case 1.
		* Input: 3, 4, 5
		* Expected output: true
		*/
		@Test
		void test1() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(3, 4, 5));
		}
		
		/**
		* Test case 2.
		* Input: 5, 4, 3
		* Expected output: true
		*/
		@Test
		void test2() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(5, 4, 3));
		}
		
		/**
		* Test case 3.
		* Input: 3, 5, 4
		* Expected output: true
		*/
		@Test
		void test3() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(3, 5, 4));
		}
		
		/**
		* Test case 4.
		* Input: 4, 3, 5
		* Expected output: true
		*/
		@Test
		void test4() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(4, 3, 5));
		}
		
		/**
		* Test case 5.
		* Input: 4, 5, 3
		* Expected output: true
		*/
		@Test
		void test5() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(4, 5, 3));
		}
		
		/**
		* Test case 6.
		* Input: 5, 3, 4
		* Expected output: true
		*/
		@Test
		void test6() {
			assertTrue(RightAngleTriangle.rightAngleTriangle(5, 3, 4));
		}
		
		/**
		* Test case 7.
		* Input: 3, 3, 5
		* Expected output: false
		*/
		@Test
		void test7() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(3, 3, 5));
		}
		
		/**
		* Test case 8.
		* Input: 3, 5, 3
		* Expected output: false
		*/
		@Test
		void test8() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(3, 5, 3));
		}
		
		/**
		* Test case 9.
		* Input: 5, 3, 3
		* Expected output: false
		*/
		@Test
		void test9() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(5, 3, 3));
		}
		
		/**
		* Test case 10.
		* Input: 3, 3, 3
		* Expected output: false
		*/
		@Test
		void test10() {
			assertFalse(RightAngleTriangle.rightAngleTriangle(3, 3, 3));
		}
}

// RightAngleTriangle.java
package scenario4;

class RightAngleTriangle {

    public static Boolean rightAngleTriangle(int a, int b, int c) {
        if (a == b || b == c || a == c) {
            return false;
        }
        if (a > b && a > c) {
            return a * a == b * b + c * c;
        }
        if (b > a && b > c) {
            return b * b ==