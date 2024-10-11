// IsNestedTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsNested}.
* It contains ten unit test cases for the {@link IsNested#isNested(String)} method.
*/
class IsNestedTest {
			/**
			* Test case 1: isNested('[[]]') ➞ True
			*/
			@Test
			void test1() {
				String string = "[[]]";
				Boolean expected = true;
				Boolean actual = IsNested.isNested(string);
				assertEquals(expected, actual);
			}

			/**
			* Test case 2: isNested('[]]]]]]][[[[[]') ➞ False
			*/
			@Test
			void test2() {
				String string = "[]]]]]]][[[[[]";
				Boolean expected = false;
				Boolean actual = IsNested.isNested(string);
				assertEquals(expected, actual);
			}

			/**
			* Test case 3: isNested('[][]') ➞ False
			*/
			@Test
			void test3() {
				String string = "[][]";
				Boolean expected = false;
				Boolean actual = IsNested.isNested(string);
				assertEquals(expected, actual);
			}

			/**
			* Test case 4: isNested('[]') ➞ False
			*/
			@Test
			void test4() {
				String string = "[]";
				Boolean expected = false;
				Boolean actual = IsNested.isNested(string);
				assertEquals(expected, actual);
			}

			/**
			* Test case 5: isNested('[[][]]') ➞ True
			*/
			@Test
			void test5() {
				String string = "[[][]]";
				Boolean expected = true;
				Boolean actual = IsNested.isNested(string);
				assertEquals(expected, actual);
			}

			/**
			* Test case 6: isNested('[[]][[') ➞ True
			*/
			@Test
			void test6() {
				String string = "[[]][[";
				Boolean expected = true;
				Boolean actual = IsNested.isNested(string);
				assertEquals(expected, actual);
			}

			/**
			* Test case 7: isNested("[[]")
			* false
			*/
			@Test
			void test7() {
				String string = "[[]";
				Boolean expected = false;
				Boolean actual = IsNested.isNested(string);
				assertEquals(expected, actual);
			}

			/**
			* Test case 8: isNested("[]]")
			* false
			*/
			@Test
			void test8() {
				String string = "[]]";
				Boolean expected = false;
				Boolean actual = IsNested.isNested(string);
				assertEquals(expected, actual);
			}

			/**
			* Test case 9: isNested("[[]][[")
			* true
			*/
			@Test
			void test9() {
				String string = "[[]][[";
				Boolean expected = true;
				Boolean actual = IsNested.isNested(string);
				assertEquals(expected, actual);
			}

			/**
			* Test case 10: isNested("[[][]]")
			* true
			*/
			@Test
			void test10() {
				String string = "[[][]]";
				Boolean expected = true;
				Boolean actual = IsNested.isNested(string);
				assertEquals(expected, actual);
			}
}