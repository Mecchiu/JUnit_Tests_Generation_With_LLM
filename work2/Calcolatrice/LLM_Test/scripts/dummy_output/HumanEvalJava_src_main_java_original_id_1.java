// SeparateParenGroupsTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SeparateParenGroups}.
* It contains ten unit test cases for the {@link SeparateParenGroups#separateParenGroups(String)} method.
*/
class SeparateParenGroupsTest {
			@Test
			void test1() {
				List<String> expected = new ArrayList<String>();
				expected.add("(()())");
				expected.add("((()))");
				expected.add("()");
				expected.add("((())()())");
				List<String> actual = SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())");
				assertEquals(expected, actual);
			}
			
			@Test
			void test2() {
				List<String> expected = new ArrayList<String>();
				expected.add("()");
				expected.add("(())");
				expected.add("((()))");
				expected.add("(((())))");
				List<String> actual = SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))");
				assertEquals(expected, actual);
			}
			
			@Test
			void test3() {
				List<String> expected = new ArrayList<String>();
				expected.add("(()(())((())))");
				List<String> actual = SeparateParenGroups.separateParenGroups("(()(())((())))");
				assertEquals(expected, actual);
			}
			
			@Test
			void test4() {
				List<String> expected = new ArrayList<String>();
				expected.add("()");
				expected.add("(())");
				expected.add("(()())");
				List<String> actual = SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))");
				assertEquals(expected, actual);
			}
			
			@Test
			void test5() {
				List<String> expected = new ArrayList<String>();
				expected.add("()");
				expected.add("(())");
				expected.add("((()))");
				expected.add("(((())))");
				List<String> actual = SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))");
				assertEquals(expected, actual);
			}
			
			@Test
			void test6() {
				List<String> expected = new ArrayList<String>();
				expected.add("(()(())((())))");
				List<String> actual = SeparateParenGroups.separateParenGroups("(()(())((())))");
				assertEquals(expected, actual);
			}
			
			@Test
			void test7() {
				List<String> expected = new ArrayList<String>();
				expected.add("()");
				expected.add("(())");
				expected.add("(()())");
				List<String> actual = SeparateParenGroups.separateParenGroups("( ) (( )) (( )( ))");
				assertEquals(expected, actual);
			}
			
			@Test
			void test8() {
				List<String> expected = new ArrayList<String>();
				expected.add("(()())");
				expected.add("((()))");
				expected.add("()");
				expected.add("((())()())");
				List<String> actual = SeparateParenGroups.separateParenGroups("(()()) ((())) () ((())()())");
				assertEquals(expected, actual);
			}
			
			@Test
			void test9() {
				List<String> expected = new ArrayList<String>();
				expected.add("()");
				expected.add("(())");
				expected.add("((()))");
				expected.add("(((())))");
				List<String> actual = SeparateParenGroups.separateParenGroups("() (()) ((())) (((())))");
				assertEquals(expected, actual);
			}
			
			@Test
			void test10() {
				List<String> expected = new ArrayList<String>();
				expected.add("(()(())((())))");
				List<String> actual = SeparateParenGroups.separateParenGroups("(()(())((())))");
				assertEquals(expected, actual);
			}
}