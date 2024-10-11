// TotalMatchTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TotalMatch}.
* It contains ten unit test cases for the {@link TotalMatch#totalMatch(List, List)} method.
*/
class TotalMatchTest {

	/**
	* Test case 1.
	* The method {@link TotalMatch#totalMatch(List, List)} should return the first list.
	*/
	@Test
	void testTotalMatch1() {
		List<Object> lst1 = List.of("a", "b", "c");
		List<Object> lst2 = List.of(1, 2, 3);
		List<Object> expected = List.of("a", "b", "c");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The method {@link TotalMatch#totalMatch(List, List)} should return the second list.
	*/
	@Test
	void testTotalMatch2() {
		List<Object> lst1 = List.of(1, 2, 3);
		List<Object> lst2 = List.of("a", "b", "c");
		List<Object> expected = List.of("a", "b", "c");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The method {@link TotalMatch#totalMatch(List, List)} should return the first list.
	*/
	@Test
	void testTotalMatch3() {
		List<Object> lst1 = List.of("a", "b", "c");
		List<Object> lst2 = List.of("d", "e", "f");
		List<Object> expected = List.of("a", "b", "c");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The method {@link TotalMatch#totalMatch(List, List)} should return the second list.
	*/
	@Test
	void testTotalMatch4() {
		List<Object> lst1 = List.of("d", "e", "f");
		List<Object> lst2 = List.of("a", "b", "c");
		List<Object> expected = List.of("a", "b", "c");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The method {@link TotalMatch#totalMatch(List, List)} should return the first list.
	*/
	@Test
	void testTotalMatch5() {
		List<Object> lst1 = List.of("a", "b", "c");
		List<Object> lst2 = List.of("a", "b", "c");
		List<Object> expected = List.of("a", "b", "c");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The method {@link TotalMatch#totalMatch(List, List)} should return the first list.
	*/
	@Test
	void testTotalMatch6() {
		List<Object> lst1 = List.of("a", "b", "c");
		List<Object> lst2 = List.of("a", "b", "c", "d");
		List<Object> expected = List.of("a", "b", "c");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The method {@link TotalMatch#totalMatch(List, List)} should return the second list.
	*/
	@Test
	void testTotalMatch7() {
		List<Object> lst1 = List.of("a", "b", "c", "d");
		List<Object> lst2 = List.of("a", "b", "c");
		List<Object> expected = List.of("a", "b", "c");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The method {@link TotalMatch#totalMatch(List, List)} should return the first list.
	*/
	@Test
	void testTotalMatch8() {
		List<Object> lst1 = List.of("a", "b", "c", "d");
		List<Object> lst2 = List.of("a", "b", "c", "d");
		List<Object> expected = List.of("a", "b", "c", "d");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The method {@link TotalMatch#totalMatch(List, List)} should return the first list.
	*/
	@Test
	void testTotalMatch9() {
		List<Object> lst1 = List.of("a", "b", "c", "d");
		List<Object> lst2 = List.of("a", "b", "c", "d", "e");
		List<Object> expected = List.of("a", "b", "c", "d");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The method {@link TotalMatch#totalMatch(List, List)} should return the second list.
	*/
	@Test
	void testTotalMatch10() {
		List<Object> lst1 = List.of("a", "b", "c", "d", "e");
		List<Object> lst2 = List.of("a", "b", "c", "d");
		List<Object> expected = List.of("a", "b", "c", "d");
		List<Object> actual = TotalMatch.totalMatch(lst1, lst2);
		assertEquals(expected, actual);
	}
}