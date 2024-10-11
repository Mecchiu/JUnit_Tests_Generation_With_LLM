// IsBoredTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {
	@Test
			void test1() {
				String s = "I am bored.";
				int expected = 1;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
			}
			
			@Test
			void test2() {
				String s = "I am bored. I am bored.";
				int expected = 2;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
			}
			
			@Test
			void test3() {
				String s = "I am bored. I am bored. I am bored.";
				int expected = 3;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
			}
			
			@Test
			void test4() {
				String s = "I am bored. I am bored. I am bored. I am bored.";
				int expected = 4;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
			}
			
			@Test
			void test5() {
				String s = "I am bored. I am bored. I am bored. I am bored. I am bored.";
				int expected = 5;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
			}
			
			@Test
			void test6() {
				String s = "I am bored. I am bored. I am bored. I am bored. I am bored. I am bored.";
				int expected = 6;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
			}
			
			@Test
			void test7() {
				String s = "I am bored. I am bored. I am bored. I am bored. I am bored. I am bored. I am bored.";
				int expected = 7;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
			}
			
			@Test
			void test8() {
				String s = "I am bored. I am bored. I am bored. I am bored. I am bored. I am bored. I am bored. I am bored.";
				int expected = 8;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
			}
			
			@Test
			void test9() {
				String s = "I am bored. I am bored. I am bored. I am bored. I am bored. I am bored. I am bored. I am bored. I am bored.";
				int expected = 9;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
			}
			
			@Test
			void test10() {
				String s = "I am bored. I am bored. I am bored. I am bored. I am bored. I am bored. I am bored. I am bored. I am bored. I am bored.";
				int expected = 10;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
			}
}