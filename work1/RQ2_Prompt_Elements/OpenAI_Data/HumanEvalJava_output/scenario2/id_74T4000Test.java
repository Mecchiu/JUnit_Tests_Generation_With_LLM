// TotalMatchTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TotalMatch}.
* It contains ten unit test cases for the {@link TotalMatch#totalMatch(List, List)} method.
*/
class TotalMatchTest {

	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* Both lists are empty.
	*/
	@Test
	void testTotalMatch_BothListsEmpty() {
		List<Object> lst1 = List.of();
		List<Object> lst2 = List.of();
		List<Object> expected = List.of();
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* First list is empty.
	*/
	@Test
	void testTotalMatch_FirstListEmpty() {
		List<Object> lst1 = List.of();
		List<Object> lst2 = List.of("a", "b", "c");
		List<Object> expected = List.of();
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* Second list is empty.
	*/
	@Test
	void testTotalMatch_SecondListEmpty() {
		List<Object> lst1 = List.of("a", "b", "c");
		List<Object> lst2 = List.of();
		List<Object> expected = List.of("a", "b", "c");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* Both lists have same number of chars.
	*/
	@Test
	void testTotalMatch_BothListsSameNumberOfChars() {
		List<Object> lst1 = List.of("a", "b", "c");
		List<Object> lst2 = List.of("d", "e", "f");
		List<Object> expected = List.of("a", "b", "c");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* First list has more number of chars.
	*/
	@Test
	void testTotalMatch_FirstListMoreNumberOfChars() {
		List<Object> lst1 = List.of("a", "b", "c");
		List<Object> lst2 = List.of("d", "e");
		List<Object> expected = List.of("d", "e");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* Second list has more number of chars.
	*/
	@Test
	void testTotalMatch_SecondListMoreNumberOfChars() {
		List<Object> lst1 = List.of("a", "b");
		List<Object> lst2 = List.of("d", "e", "f");
		List<Object> expected = List.of("a", "b");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* First list has more number of chars.
	* Both lists have same number of elements.
	*/
	@Test
	void testTotalMatch_FirstListMoreNumberOfChars_BothListsSameNumberOfElements() {
		List<Object> lst1 = List.of("a", "b", "c");
		List<Object> lst2 = List.of("d", "e");
		List<Object> expected = List.of("d", "e");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* Second list has more number of chars.
	* Both lists have same number of elements.
	*/
	@Test
	void testTotalMatch_SecondListMoreNumberOfChars_BothListsSameNumberOfElements() {
		List<Object> lst1 = List.of("a", "b");
		List<Object> lst2 = List.of("d", "e", "f");
		List<Object> expected = List.of("a", "b");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* First list has more number of chars.
	* Both lists have different number of elements.
	*/
	@Test
	void testTotalMatch_FirstListMoreNumberOfChars_BothListsDifferentNumberOfElements() {
		List<Object> lst1 = List.of("a", "b", "c", "d");
		List<Object> lst2 = List.of("e", "f");
		List<Object> expected = List.of("e", "f");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link TotalMatch#totalMatch(List, List)} method.
	* Second list has more number of chars.
	* Both lists have different number of elements.
	*/
	@Test
	void testTotalMatch_SecondListMoreNumberOfChars_BothListsDifferentNumberOfElements() {
		List<Object> lst1 = List.of("a", "b");
		List<Object> lst2 = List.of("c", "d", "e", "f");
		List<Object> expected = List.of("a", "b");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
}