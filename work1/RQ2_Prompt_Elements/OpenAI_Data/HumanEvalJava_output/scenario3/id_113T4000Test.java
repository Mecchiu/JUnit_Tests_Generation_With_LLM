// OddCountTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains ten unit test cases for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {

	@Test
	void testOddCount() {
		List<String> lst = List.of("1234567");
		List<String> expected = List.of("the number of odd elements 4n the str4ng 4 of the 4nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	@Test
	void testOddCount2() {
		List<String> lst = List.of("3", "11111111");
		List<String> expected = List.of("the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 8n the str8ng 8 of the 8nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	@Test
	void testOddCount3() {
		List<String> lst = List.of("271", "137", "314");
		List<String> expected = List.of("the number of odd elements 2n the str2ng 2 of the 2nput.", "the number of odd elements 3n the str3ng 3 of the 3nput.", "the number of odd elements 2n the str2ng 2 of the 2nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	@Test
	void testOddCount4() {
		List<String> lst = List.of("123456789");
		List<String> expected = List.of("the number of odd elements 5n the str5ng 5 of the 5nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	@Test
	void testOddCount5() {
		List<String> lst = List.of("123456789", "123456789");
		List<String> expected = List.of("the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	@Test
	void testOddCount6() {
		List<String> lst = List.of("123456789", "123456789", "123456789");
		List<String> expected = List.of("the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	@Test
	void testOddCount7() {
		List<String> lst = List.of("123456789", "123456789", "123456789", "123456789");
		List<String> expected = List.of("the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	@Test
	void testOddCount8() {
		List<String> lst = List.of("123456789", "123456789", "123456789", "123456789", "123456789");
		List<String> expected = List.of("the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	@Test
	void testOddCount9() {
		List<String> lst = List.of("123456789", "123456789", "123456789", "123456789", "123456789", "123456789");
		List<String> expected = List.of("the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	@Test
	void testOddCount10() {
		List<String> lst = List.of("123456789", "123456789", "123456789", "123456789", "123456789", "123456789", "123456789");
		List<String> expected = List.of("the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
}