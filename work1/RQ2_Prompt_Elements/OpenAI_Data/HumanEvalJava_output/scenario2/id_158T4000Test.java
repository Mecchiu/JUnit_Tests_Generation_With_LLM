// FindMaxTest.java
package scenario2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains ten unit test cases for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {

	@Test
	void testFindMax_null() {
		assertNull(FindMax.findMax(null));
	}
	
	@Test
	void testFindMax_empty() {
		assertNull(FindMax.findMax(List.of()));
	}
	
	@Test
	void testFindMax_oneWord() {
		assertEquals("abc", FindMax.findMax(List.of("abc")));
	}
	
	@Test
	void testFindMax_twoWords() {
		assertEquals("abc", FindMax.findMax(List.of("abc", "def")));
	}
	
	@Test
	void testFindMax_threeWords() {
		assertEquals("abc", FindMax.findMax(List.of("abc", "def", "ghi")));
	}
	
	@Test
	void testFindMax_fourWords() {
		assertEquals("abc", FindMax.findMax(List.of("abc", "def", "ghi", "jkl")));
	}
	
	@Test
	void testFindMax_fiveWords() {
		assertEquals("abc", FindMax.findMax(List.of("abc", "def", "ghi", "jkl", "mno")));
	}
	
	@Test
	void testFindMax_sixWords() {
		assertEquals("abc", FindMax.findMax(List.of("abc", "def", "ghi", "jkl", "mno", "pqr")));
	}
	
	@Test
	void testFindMax_sevenWords() {
		assertEquals("abc", FindMax.findMax(List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu")));
	}
	
	@Test
	void testFindMax_eightWords() {
		assertEquals("abc", FindMax.findMax(List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx")));
	}
	
	@Test
	void testFindMax_nineWords() {
		assertEquals("abc", FindMax.findMax(List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz")));
	}
	
	@Test
	void testFindMax_tenWords() {
		assertEquals("abc", FindMax.findMax(List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz", "123")));
	}
}