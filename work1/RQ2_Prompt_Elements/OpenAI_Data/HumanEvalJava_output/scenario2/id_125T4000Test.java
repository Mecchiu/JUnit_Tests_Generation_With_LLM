// SplitWordsTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {

		@Test
		void testSplitWords1() {
				assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a b c"));
		}
		
		@Test
		void testSplitWords2() {
				assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a,b,c"));
		}
		
		@Test
		void testSplitWords3() {
				assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("abc"));
		}
		
		@Test
		void testSplitWords4() {
				assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a b,c"));
		}
		
		@Test
		void testSplitWords5() {
				assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a,b c"));
		}
		
		@Test
		void testSplitWords6() {
				assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a,b,c"));
		}
		
		@Test
		void testSplitWords7() {
				assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a b c"));
		}
		
		@Test
		void testSplitWords8() {
				assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a b c"));
		}
		
		@Test
		void testSplitWords9() {
				assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a b c"));
		}
		
		@Test
		void testSplitWords10() {
				assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a b c"));
		}
}