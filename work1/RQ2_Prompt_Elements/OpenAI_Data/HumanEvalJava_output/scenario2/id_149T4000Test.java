// SortedListSumTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortedListSum}.
* It contains ten unit test cases for the {@link SortedListSum#sortedListSum(List)} method.
*/
class SortedListSumTest {

	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* The test case checks if the method returns the correct list of strings
	* when the input list contains only strings with even length.
	*/
	@Test
	void testSortedListSum_1() {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("bb");
		lst.add("ccc");
		lst.add("dddd");
		lst.add("eeeee");
		lst.add("ffffff");
		lst.add("ggggggg");
		lst.add("hhhhhhhh");
		lst.add("iiiiiiiii");
		lst.add("jjjjjjjjjj");
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("bb");
		expected.add("ccc");
		expected.add("dddd");
		expected.add("eeeee");
		expected.add("ffffff");
		expected.add("ggggggg");
		expected.add("hhhhhhhh");
		expected.add("iiiiiiiii");
		expected.add("jjjjjjjjjj");
		Collections.sort(expected, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1.toString().length() == o2.toString().length()) {
					return o1.toString().compareTo(o2.toString());
				} else {
					return o1.toString().length() - o2.toString().length();
				}
			}
		});
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* The test case checks if the method returns the correct list of strings
	* when the input list contains only strings with odd length.
	*/
	@Test
	void testSortedListSum_2() {
		List<String> lst = new ArrayList<String>();
		lst.add("aa");
		lst.add("bbb");
		lst.add("cccc");
		lst.add("ddddd");
		lst.add("eeeeee");
		lst.add("fffffff");
		lst.add("gggggggg");
		lst.add("hhhhhhhhh");
		lst.add("iiiiiiiiii");
		lst.add("jjjjjjjjjjj");
		List<Object> expected = new ArrayList<Object>();
		Collections.sort(expected, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1.toString().length() == o2.toString().length()) {
					return o1.toString().compareTo(o2.toString());
				} else {
					return o1.toString().length() - o2.toString().length();
				}
			}
		});
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* The test case checks if the method returns the correct list of strings
	* when the input list contains strings with both even and odd length.
	*/
	@Test
	void testSortedListSum_3() {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("bb");
		lst.add("ccc");
		lst.add("dddd");
		lst.add("eeeee");
		lst.add("ffffff");
		lst.add("ggggggg");
		lst.add("hhhhhhhh");
		lst.add("iiiiiiiii");
		lst.add("jjjjjjjjjj");
		lst.add("aa");
		lst.add("bbb");
		lst.add("cccc");
		lst.add("ddddd");
		lst.add("eeeeee");
		lst.add("fffffff");
		lst.add("gggggggg");
		lst.add("hhhhhhhhh");
		lst.add("iiiiiiiiii");
		lst.add("jjjjjjjjjjj");
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("bb");
		expected.add("ccc");
		expected.add("dddd");
		expected.add("eeeee");
		expected.add("ffffff");
		expected.add("ggggggg");
		expected.add("hhhhhhhh");
		expected.add("iiiiiiiii");
		expected.add("jjjjjjjjjj");
		Collections.sort(expected, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1.toString().length() == o2.toString().length()) {
					return o1.toString().compareTo(o2.toString());
				} else {
					return o1.toString().length() - o2.toString().length();
				}
			}
		});
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* The test case checks if the method returns the correct list of strings
	* when the input list contains strings with both even and odd length,
	* and the list contains duplicates.
	*/
	@Test
	void testSortedListSum_4() {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("bb");
		lst.add("ccc");
		lst.add("dddd");
		lst.add("eeeee");
		lst.add("ffffff");
		lst.add("ggggggg");
		lst.add("hhhhhhhh");
		lst.add("iiiiiiiii");
		lst.add("jjjjjjjjjj");
		lst.add("aa");
		lst.add("bbb");
		lst.add("cccc");
		lst.add("ddddd");
		lst.add("eeeeee");
		lst.add("fffffff");
		lst.add("gggggggg");
		lst.add("hhhhhhhhh");
		lst.add("iiiiiiiiii");
		lst.add("jjjjjjjjjjj");
		lst.add("a");
		lst.add("bb");
		lst.add("ccc");
		lst.add("dddd");
		lst.add("eeeee");
		lst.add("ffffff");
		lst.add("ggggggg");
		lst.add("hhhhhhhh");
		lst.add("iiiiiiiii");
		lst.add("jjjjjjjjjj");
		lst.add("aa");
		lst.add("bbb");
		lst.add("cccc");
		lst.add("ddddd");
		lst.add("eeeeee");
		lst.add("fffffff");
		lst.add("gggggggg");
		lst.add("hhhhhhhhh");
		lst.add("iiiiiiiiii");
		lst.add("jjjjjjjjjjj");
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("bb");
		expected.add("ccc");
		expected.add("dddd");
		expected.add("eeeee");
		expected.add("ffffff");
		expected.add("ggggggg");
		expected.add("hhhhhhhh");
		expected.add("iiiiiiiii");
		expected.add("jjjjjjjjjj");
		expected.add("a");
		expected.add("bb");
		expected.add("ccc");
		expected.add("dddd");
		expected.add("eeeee");
		expected.add("ffffff");
		expected.add("ggggggg");
		expected.add("hhhhhhhh");
		expected.add("iiiiiiiii");
		expected.add("jjjjjjjjjj");
		Collections.sort(expected, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1.toString().length() == o2.toString().length()) {
					return o1.toString().compareTo(o2.toString());
				} else {
					return o1.toString().length() - o2.toString().length();
				}
			}
		});
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* The test case checks if the method returns the correct list of strings
	* when the input list contains strings with both even and odd length,
	* and the list contains duplicates.
	*/
	@Test
	void testSortedListSum_5() {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("bb");
		lst.add("ccc");
		lst.add("dddd");
		lst.add("eeeee");
		lst.add("ffffff");
		lst.add("ggggggg");
		lst.add("hhhhhhhh");
		lst.add("iiiiiiiii");
		lst.add("jjjjjjjjjj");
		lst.add("aa");
		lst.add("bbb");
		lst.add("cccc");
		lst.add("ddddd");
		lst.add("eeeeee");
		lst.add("fffffff");
		lst.add("gggggggg");
		lst.add("hhhhhhhhh");
		lst.add("iiiiiiiiii");
		lst.add("jjjjjjjjjjj");
		lst.add("a");
		lst.add("bb");
		lst.add("ccc");
		lst.add("dddd");
		lst.add("eeeee");
		lst.add("ffffff");
		lst.add("ggggggg");
		lst.add("hhhhhhhh");
		lst.add("iiiiiiiii");
		lst.add("jjjjjjjjjj");
		lst.add("aa");
		lst.add("bbb");
		lst.add("cccc");
		lst.add("ddddd");
		lst.add("eeeeee");
		lst.add("fffffff");
		lst.add("gggggggg");
		lst.add("hhhhhhhhh");
		lst.add("iiiiiiiiii");
		lst.add("jjjjjjjjjjj");
		lst.add("a");
		lst.add("bb");
		lst.add("ccc");
		lst.add("dddd");
		lst.add("eeeee");
		lst.add("ffffff");
		lst.add("ggggggg");
		lst.add("hhhhhhhh");
		lst.add("iiiiiiiii");
		lst.add("jjjjjjjjjj");
		lst.add("aa");
		lst.add("bbb");
		lst.add("cccc");
		lst.add("ddddd");
		lst.add("eeeeee");
		lst.add("fffffff");
		lst.add("gggggggg");
		lst.add("hhhhhhhhh");
		lst.add("iiiiiiiiii");
		lst.add("jjjjjjjjjjj");
		List<Object> expected = new ArrayList<Object>();
		expected.add("a");
		expected.add("bb");
		expected.add("ccc");
		expected.add("dddd");
		expected.add("eeeee");
		expected.add("ffffff");
		expected.add("ggggggg");
		expected.add("hhhhhhhh");
		expected.add("iiiiiiiii");
		expected.add("jjjjjjjjjj");
		expected.add("a");
		expected.add("bb");
		expected.add("ccc");
		expected.add("dddd");
		expected.add("eeeee");
		expected.add("ffffff");
		expected.add("ggggggg");
		expected.add("hhhhhhhh");
		expected.add("iiiiiiiii");
		expected.add("jjjjjjjjjj");
		expected.add("a");
		expected.add("bb");
		expected.add("ccc");
		expected.add("dddd");
		expected.add("eeeee");
		expected.add("ffffff");
		expected.add("ggggggg");
		expected.add("hhhhhhhh");
		expected.add("iiiiiiiii");
		expected.add("jjjjjjjjjj");
		Collections.sort(expected, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				if (o1.toString().length() == o2.toString().length()) {
					return o1.toString().compareTo(o2.toString());
				} else {
					return o1.toString().length() - o2.toString().length();
				}
			}
		});
		List<Object> actual = SortedListSum.sortedListSum(lst);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link SortedListSum#sortedListSum(List)} method.
	* The test case checks if the method returns the correct list of strings
	* when the input list contains strings with both even and odd length,
	* and the list contains duplicates.
	*/
	@Test
	void testSortedListSum_6() {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("bb");
		lst.add("ccc");
		lst.add("dddd");
		lst.add("eeeee");
		lst.add("ffffff");
		lst.add("ggggggg");
		