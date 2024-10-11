// CompareTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Compare}.
* It contains ten unit test cases for the {@link Compare#compare(List, List)} method.
*/
class CompareTest {

	@Test
	void testCompare() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		game.add(5);
		game.add(1);
		
		guess.add(1);
		guess.add(2);
		guess.add(3);
		guess.add(4);
		guess.add(2);
		guess.add(-2);
		
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(3);
		expected.add(3);
		
		assertEquals(expected, Compare.compare(game, guess));
	}
	
	@Test
	void testCompare2() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		
		game.add(0);
		game.add(5);
		game.add(0);
		game.add(0);
		game.add(0);
		game.add(4);
		
		guess.add(4);
		guess.add(1);
		guess.add(1);
		guess.add(0);
		guess.add(0);
		guess.add(-2);
		
		expected.add(4);
		expected.add(4);
		expected.add(1);
		expected.add(0);
		expected.add(0);
		expected.add(6);
		
		assertEquals(expected, Compare.compare(game, guess));
	}
	
	@Test
	void testCompare3() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		
		game.add(1);
		game.add(2);
		game.add(3);
		
		guess.add(-1);
		guess.add(-2);
		guess.add(-3);
		
		expected.add(2);
		expected.add(4);
		expected.add(6);
		
		assertEquals(expected, Compare.compare(game, guess));
	}
	
	@Test
	void testCompare4() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(5);
		
		guess.add(-1);
		guess.add(2);
		guess.add(3);
		guess.add(4);
		
		expected.add(2);
		expected.add(0);
		expected.add(0);
		expected.add(1);
		
		assertEquals(expected, Compare.compare(game, guess));
	}
	
	@Test
	void testCompare5() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		game.add(5);
		game.add(6);
		
		guess.add(1);
		guess.add(2);
		guess.add(3);
		guess.add(4);
		guess.add(5);
		guess.add(6);
		
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		
		assertEquals(expected, Compare.compare(game, guess));
	}
	
	@Test
	void testCompare6() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		game.add(5);
		game.add(6);
		
		guess.add(1);
		guess.add(2);
		guess.add(3);
		guess.add(4);
		guess.add(5);
		guess.add(7);
		
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(1);
		
		assertEquals(expected, Compare.compare(game, guess));
	}
	
	@Test
	void testCompare7() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		game.add(5);
		game.add(6);
		
		guess.add(1);
		guess.add(2);
		guess.add(3);
		guess.add(4);
		guess.add(5);
		guess.add(8);
		
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(2);
		
		assertEquals(expected, Compare.compare(game, guess));
	}
	
	@Test
	void testCompare8() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		game.add(5);
		game.add(6);
		
		guess.add(1);
		guess.add(2);
		guess.add(3);
		guess.add(4);
		guess.add(5);
		guess.add(9);
		
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(3);
		
		assertEquals(expected, Compare.compare(game, guess));
	}
	
	@Test
	void testCompare9() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		game.add(5);
		game.add(6);
		
		guess.add(1);
		guess.add(2);
		guess.add(3);
		guess.add(4);
		guess.add(5);
		guess.add(10);
		
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(4);
		
		assertEquals(expected, Compare.compare(game, guess));
	}
	
	@Test
	void testCompare10() {
		List<Integer> game = new ArrayList<>();
		List<Integer> guess = new ArrayList<>();
		List<Integer> expected = new ArrayList<>();
		
		game.add(1);
		game.add(2);
		game.add(3);
		game.add(4);
		game.add(5);
		game.add(6);
		
		guess.add(1);
		guess.add(2);
		guess.add(3);
		guess.add(4);
		guess.add(5);
		guess.add(11);
		
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(0);
		expected.add(5);
		
		assertEquals(expected, Compare.compare(game, guess));
	}
}