// CompareTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Compare}.
* It contains ten unit test cases for the {@link Compare#compare(List, List)} method.
*/
class CompareTest {

	/**
	* Test case 1.
	* The method should return an empty list if the input lists are empty.
	*/
	@Test
	void test1() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* The method should return a list of zeros if the input lists are equal.
	*/
	@Test
	void test2() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		guess.add(1);
		guess.add(2);
		guess.add(3);
		List<Integer> expected = new ArrayList<>();
		expected.add(0);
		expected.add(0);
		expected.add(0);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* The method should return a list of absolute differences if the input lists are not equal.
	*/
	@Test
	void test3() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		guess.add(2);
		guess.add(3);
		guess.add(4);
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(1);
		expected.add(1);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* The method should return a list of absolute differences if the input lists are not equal.
	*/
	@Test
	void test4() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		guess.add(0);
		guess.add(1);
		guess.add(2);
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(1);
		expected.add(1);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* The method should return a list of absolute differences if the input lists are not equal.
	*/
	@Test
	void test5() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		guess.add(2);
		guess.add(1);
		guess.add(0);
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(1);
		expected.add(3);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* The method should return a list of absolute differences if the input lists are not equal.
	*/
	@Test
	void test6() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		guess.add(0);
		guess.add(0);
		guess.add(0);
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* The method should return a list of absolute differences if the input lists are not equal.
	*/
	@Test
	void test7() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		guess.add(3);
		guess.add(2);
		guess.add(1);
		List<Integer> expected = new ArrayList<>();
		expected.add(2);
		expected.add(0);
		expected.add(2);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* The method should return a list of absolute differences if the input lists are not equal.
	*/
	@Test
	void test8() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		guess.add(3);
		guess.add(3);
		guess.add(3);
		List<Integer> expected = new ArrayList<>();
		expected.add(2);
		expected.add(1);
		expected.add(0);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* The method should return a list of absolute differences if the input lists are not equal.
	*/
	@Test
	void test9() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		guess.add(0);
		guess.add(0);
		guess.add(0);
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10.
	* The method should return a list of absolute differences if the input lists are not equal.
	*/
	@Test
	void test10() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		game.add(1);
		game.add(2);
		game.add(3);
		guess.add(3);
		guess.add(2);
		guess.add(1);
		List<Integer> expected = new ArrayList<>();
		expected.add(2);
		expected.add(0);
		expected.add(2);
		List<Integer> actual = Compare.compare(game, guess);
		assertEquals(expected, actual);
	}
}