// WordsStringTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains one unit test case for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {
/**
		 * Test method for {@link wordsString(String)}.
		 */
		@org.junit.jupiter.api.Test
		public void testWordsString() {
			assertEquals(new ArrayList<Object>(Arrays.asList("Hi, my name is John", "One, two, three, four, five, six")),
		        new WordsString<String>().wordsString("Hi, my name is John"));
		}
		/**
		 * Test method for {@link wordsString(List)}.
		 */
		@org.junit.jupiter.api.Test
		public void testWordsStringList() {
			List<Object> list1 = new ArrayList(Arrays.asList("Hi, my name is John", "One, two, three, four, five, six"));
			List<Object> list2 = new ArrayList<Object>(Arrays.asList("hi, my name is John", "one, two, three, four, five, six"));
			assertEquals(list1, wordsString(list2));
		}
		/**
		 * Test method for {@link wordsString(List)}.
		 */
		@org.junit.jupiter.api.Test
		public void testWordsStringListList() {
			List<Object> list1 = new ArrayList();
			list1.add("Hi, my name is John");
			list1.add("One, two, three, four, five, six");
			List<Object> list2 = new ArrayList<Object>();
			list2.add("hi, my name is John");
			list2.add("one, two, three, four, five, six");
			List<String> list3 = wordsString("hi, my name is John");
			assertEquals(list1, wordsString(list2, list3));
		}

		/**
		* Test method for {@link wordsString(List)}.
		*/
		@org.junit.jupiter.api.Test
		public void testWordsStringNul() {
			//Test null case
			assertEquals(StringUtils.EMPTY, wordsString(null, null) + "");

			//Test empty case
			List<Object> list0 = new ArrayList();
			assertEquals(
			        StringUtils.EMPTY + "",
			        StringUtils.compose(
			                list0, StringUtils.EMPTY)
			);

			//Test no list case
			List<Object> list1 = new ArrayList();
			list1.add("Hi, my name is John");
			list1.add("One, two, three, four, five, six");
			assertEquals("Hi, my name is John",  StringUtils.compose(
			  	list1, "Hi", "my", "name", "is", "John"));
		}
		/**
		* Test method for {@link wordsString(List)}.
		*/
		@org.junit.jupiter.api.Test
		public void testWordsStringArrayList() {
            assertEquals(new ArrayList<Object>(Arrays.asList("Hi, my name is John", "One, two, three, four, five, six")), wordsString(Arrays.asList("Hi", "my", "name", "is", "John")));
            assertEquals(new ArrayList<Object>(Arrays.asList("Hi", "my")), wordsString(Arrays.asList("Hi", "my")));
        }

}
