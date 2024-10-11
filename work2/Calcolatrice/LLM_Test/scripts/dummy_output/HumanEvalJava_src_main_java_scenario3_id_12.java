// LongestTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains ten unit test cases for the {@link Longest#longest(List)} method.
*/
class LongestTest {
			@Test
			void testLongest() {
				// Test case 1: Test for empty list
				List<Object> list1 = new ArrayList<>();
				String result1 = Longest.longest(list1);
				assertNull(result1);
				
				// Test case 2: Test for list with one element
				List<Object> list2 = new ArrayList<>();
				list2.add("a");
				String result2 = Longest.longest(list2);
				assertEquals("a", result2);
				
				// Test case 3: Test for list with multiple elements
				List<Object> list3 = new ArrayList<>();
				list3.add("a");
				list3.add("bb");
				list3.add("ccc");
				String result3 = Longest.longest(list3);
				assertEquals("ccc", result3);
				
				// Test case 4: Test for list with multiple elements of same length
				List<Object> list4 = new ArrayList<>();
				list4.add("a");
				list4.add("bb");
				list4.add("ccc");
				list4.add("dddd");
				String result4 = Longest.longest(list4);
				assertEquals("a", result4);
				
				// Test case 5: Test for list with multiple elements of same length
				List<Object> list5 = new ArrayList<>();
				list5.add("a");
				list5.add("bb");
				list5.add("ccc");
				list5.add("dddd");
				list5.add("eeeee");
				String result5 = Longest.longest(list5);
				assertEquals("eeeee", result5);
				
				// Test case 6: Test for list with multiple elements of same length
				List<Object> list6 = new ArrayList<>();
				list6.add("a");
				list6.add("bb");
				list6.add("ccc");
				list6.add("dddd");
				list6.add("eeeee");
				list6.add("ffffff");
				String result6 = Longest.longest(list6);
				assertEquals("ffffff", result6);
				
				// Test case 7: Test for list with multiple elements of same length
				List<Object> list7 = new ArrayList<>();
				list7.add("a");
				list7.add("bb");
				list7.add("ccc");
				list7.add("dddd");
				list7.add("eeeee");
				list7.add("ffffff");
				list7.add("ggggggg");
				String result7 = Longest.longest(list7);
				assertEquals("ggggggg", result7);
				
				// Test case 8: Test for list with multiple elements of same length
				List<Object> list8 = new ArrayList<>();
				list8.add("a");
				list8.add("bb");
				list8.add("ccc");
				list8.add("dddd");
				list8.add("eeeee");
				list8.add("ffffff");
				list8.add("ggggggg");
				list8.add("hhhhhhhh");
				String result8 = Longest.longest(list8);
				assertEquals("hhhhhhhh", result8);
				
				// Test case 9: Test for list with multiple elements of same length
				List<Object> list9 = new ArrayList<>();
				list9.add("a");
				list9.add("bb");
				list9.add("ccc");
				list9.add("dddd");
				list9.add("eeeee");
				list9.add("ffffff");
				list9.add("ggggggg");
				list9.add("hhhhhhhh");
				list9.add("iiiiiiiii");
				String result9 = Longest.longest(list9);
				assertEquals("iiiiiiiii", result9);
				
				// Test case 10: Test for list with multiple elements of same length
				List<Object> list10 = new ArrayList<>();
				list10.add("a");
				list10.add("bb");
				list10.add("ccc");
				list10.add("dddd");
				list10.add("eeeee");
				list10.add("ffffff");
				list10.add("ggggggg");
				list10.add("hhhhhhhh");
				list10.add("iiiiiiiii");
				list10.add("jjjjjjjjjj");
				String result10 = Longest.longest(list10);
				assertEquals("jjjjjjjjjj", result10);
			}
}