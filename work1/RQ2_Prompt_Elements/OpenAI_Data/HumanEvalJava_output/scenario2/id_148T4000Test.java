// BfTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains ten unit test cases for the {@link Bf#bf(String, String)} method.
*/
class BfTest {

	/**
	* Test case 1.
	* The method should return an empty tuple if planet1 or planet2 are not correct planet names.
	*/
	@Test
	void test1() {
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Bf.bf("Mercury", "Pluto");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The method should return an empty tuple if planet1 or planet2 are not correct planet names.
	*/
	@Test
	void test2() {
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Bf.bf("Pluto", "Mercury");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The method should return an empty tuple if planet1 or planet2 are not correct planet names.
	*/
	@Test
	void test3() {
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Bf.bf("Pluto", "Pluto");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The method should return an empty tuple if planet1 or planet2 are not correct planet names.
	*/
	@Test
	void test4() {
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = Bf.bf("Mercury", "Mercury");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The method should return a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
	*/
	@Test
	void test5() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		expected.add("Earth");
		expected.add("Mars");
		List<Object> actual = Bf.bf("Mercury", "Jupiter");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The method should return a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
	*/
	@Test
	void test6() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		expected.add("Earth");
		expected.add("Mars");
		List<Object> actual = Bf.bf("Jupiter", "Mercury");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The method should return a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
	*/
	@Test
	void test7() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		expected.add("Earth");
		expected.add("Mars");
		expected.add("Jupiter");
		expected.add("Saturn");
		expected.add("Uranus");
		expected.add("Neptune");
		List<Object> actual = Bf.bf("Mercury", "Neptune");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The method should return a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
	*/
	@Test
	void test8() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		expected.add("Earth");
		expected.add("Mars");
		expected.add("Jupiter");
		expected.add("Saturn");
		expected.add("Uranus");
		expected.add("Neptune");
		List<Object> actual = Bf.bf("Neptune", "Mercury");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The method should return a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
	*/
	@Test
	void test9() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		expected.add("Earth");
		expected.add("Mars");
		expected.add("Jupiter");
		expected.add("Saturn");
		expected.add("Uranus");
		expected.add("Neptune");
		List<Object> actual = Bf.bf("Neptune", "Neptune");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The method should return a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
	*/
	@Test
	void test10() {
		List<Object> expected = new ArrayList<Object>();
		expected.add("Venus");
		expected.add("Earth");
		expected.add("Mars");
		expected.add("Jupiter");
		expected.add("Saturn");
		expected.add("Uranus");
		expected.add("Neptune");
		List<Object> actual = Bf.bf("Mercury", "Mercury");
		assertEquals(expected, actual);
	}
}