// OddCountTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains ten unit test cases for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {

	/**
	* Test case for {@link OddCount#oddCount(List)} method.
	* It tests the method with a list of one string.
	*/
	@Test
	void testOddCount_1() {
		List<String> lst = new ArrayList<String>();
		lst.add("1234567");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	/**
	* Test case for {@link OddCount#oddCount(List)} method.
	* It tests the method with a list of two strings.
	*/
	@Test
	void testOddCount_2() {
		List<String> lst = new ArrayList<String>();
		lst.add("3");
		lst.add("11111111");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 1n the str1ng 1 of the 1nput.");
		expected.add("the number of odd elements 8n the str8ng 8 of the 8nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	/**
	* Test case for {@link OddCount#oddCount(List)} method.
	* It tests the method with a list of three strings.
	*/
	@Test
	void testOddCount_3() {
		List<String> lst = new ArrayList<String>();
		lst.add("271");
		lst.add("137");
		lst.add("314");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 2n the str2ng 2 of the 2nput.");
		expected.add("the number of odd elements 3n the str3ng 3 of the 3nput.");
		expected.add("the number of odd elements 2n the str2ng 2 of the 2nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	/**
	* Test case for {@link OddCount#oddCount(List)} method.
	* It tests the method with a list of four strings.
	*/
	@Test
	void testOddCount_4() {
		List<String> lst = new ArrayList<String>();
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	/**
	* Test case for {@link OddCount#oddCount(List)} method.
	* It tests the method with a list of five strings.
	*/
	@Test
	void testOddCount_5() {
		List<String> lst = new ArrayList<String>();
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	/**
	* Test case for {@link OddCount#oddCount(List)} method.
	* It tests the method with a list of six strings.
	*/
	@Test
	void testOddCount_6() {
		List<String> lst = new ArrayList<String>();
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	/**
	* Test case for {@link OddCount#oddCount(List)} method.
	* It tests the method with a list of seven strings.
	*/
	@Test
	void testOddCount_7() {
		List<String> lst = new ArrayList<String>();
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	/**
	* Test case for {@link OddCount#oddCount(List)} method.
	* It tests the method with a list of eight strings.
	*/
	@Test
	void testOddCount_8() {
		List<String> lst = new ArrayList<String>();
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	/**
	* Test case for {@link OddCount#oddCount(List)} method.
	* It tests the method with a list of nine strings.
	*/
	@Test
	void testOddCount_9() {
		List<String> lst = new ArrayList<String>();
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
	
	/**
	* Test case for {@link OddCount#oddCount(List)} method.
	* It tests the method with a list of ten strings.
	*/
	@Test
	void testOddCount_10() {
		List<String> lst = new ArrayList<String>();
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		lst.add("123456789");
		List<String> expected = new ArrayList<String>();
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		expected.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
		assertEquals(expected, OddCount.oddCount(lst));
	}
}