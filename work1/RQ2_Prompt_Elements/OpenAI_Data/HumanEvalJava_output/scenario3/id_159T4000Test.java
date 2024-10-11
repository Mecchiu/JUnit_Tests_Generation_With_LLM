// EatTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Eat}.
* It contains ten unit test cases for the {@link Eat#eat(int, int, int)} method.
*/
class EatTest {

	@Test
	void test1() {
		List<Integer> result = Eat.eat(5, 6, 10);
		assertEquals(11, result.get(0));
		assertEquals(4, result.get(1));
	}
	
	@Test
	void test2() {
		List<Integer> result = Eat.eat(4, 8, 9);
		assertEquals(12, result.get(0));
		assertEquals(1, result.get(1));
	}
	
	@Test
	void test3() {
		List<Integer> result = Eat.eat(1, 10, 10);
		assertEquals(11, result.get(0));
		assertEquals(0, result.get(1));
	}
	
	@Test
	void test4() {
		List<Integer> result = Eat.eat(2, 11, 5);
		assertEquals(7, result.get(0));
		assertEquals(0, result.get(1));
	}
	
	@Test
	void test5() {
		List<Integer> result = Eat.eat(4, 5, 7);
		assertEquals(9, result.get(0));
		assertEquals(2, result.get(1));
	}
	
	@Test
	void test6() {
		List<Integer> result = Eat.eat(4, 5, 1);
		assertEquals(5, result.get(0));
		assertEquals(0, result.get(1));
	}
	
	@Test
	void test7() {
		List<Integer> result = Eat.eat(0, 0, 0);
		assertEquals(0, result.get(0));
		assertEquals(0, result.get(1));
	}
	
	@Test
	void test8() {
		List<Integer> result = Eat.eat(0, 0, 1);
		assertEquals(0, result.get(0));
		assertEquals(1, result.get(1));
	}
	
	@Test
	void test9() {
		List<Integer> result = Eat.eat(0, 1, 0);
		assertEquals(1, result.get(0));
		assertEquals(0, result.get(1));
	}
	
	@Test
	void test10() {
		List<Integer> result = Eat.eat(0, 1, 1);
		assertEquals(1, result.get(0));
		assertEquals(0, result.get(1));
	}
}