// EatTest.java
package original;

import java.util.Arrays;
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
		List<Integer> expected = Arrays.asList(11, 4);
		List<Integer> actual = Eat.eat(5, 6, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		List<Integer> expected = Arrays.asList(12, 1);
		List<Integer> actual = Eat.eat(4, 8, 9);
		assertEquals(expected, actual);
	}
	
	@Test
	void test3() {
		List<Integer> expected = Arrays.asList(11, 0);
		List<Integer> actual = Eat.eat(1, 10, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void test4() {
		List<Integer> expected = Arrays.asList(7, 0);
		List<Integer> actual = Eat.eat(2, 11, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	void test5() {
		List<Integer> expected = Arrays.asList(9, 2);
		List<Integer> actual = Eat.eat(4, 5, 7);
		assertEquals(expected, actual);
	}
	
	@Test
	void test6() {
		List<Integer> expected = Arrays.asList(5, 0);
		List<Integer> actual = Eat.eat(4, 5, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void test7() {
		List<Integer> expected = Arrays.asList(0, 0);
		List<Integer> actual = Eat.eat(0, 0, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void test8() {
		List<Integer> expected = Arrays.asList(1000, 0);
		List<Integer> actual = Eat.eat(0, 1000, 1000);
		assertEquals(expected, actual);
	}
	
	@Test
	void test9() {
		List<Integer> expected = Arrays.asList(1000, 0);
		List<Integer> actual = Eat.eat(1000, 0, 1000);
		assertEquals(expected, actual);
	}
	
	@Test
	void test10() {
		List<Integer> expected = Arrays.asList(1000, 0);
		List<Integer> actual = Eat.eat(1000, 1000, 0);
		assertEquals(expected, actual);
	}
}

// EatTest.java
package original;

import java.util.Arrays;
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
		List<Integer> expected = Arrays.asList(11, 4);
		List<Integer> actual = Eat.eat(5, 6, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		List<Integer> expected = Arrays.asList(12, 1);
		List<Integer> actual = Eat.eat(4, 8, 9);
		assertEquals(expected, actual);
	}
	
	@Test
	void test3() {
		List<Integer> expected = Arrays.asList(11, 0);
		List<Integer> actual = Eat.eat(1, 10, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void test4() {
		List<Integer> expected = Arrays.asList(7, 0);
		List<Integer> actual = Eat.eat(2, 11, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	void test5() {
		List<Integer> expected = Arrays.asList(9, 2);
		List<Integer> actual = Eat.eat(4, 5, 7);
		assertEquals(expected, actual);
	}
	
	@Test
	void test6() {
		List<Integer> expected = Arrays.asList(5, 0);
		List<Integer> actual = Eat.eat(4, 5, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void test7() {
		List<Integer> expected = Arrays.asList(0, 0);
		List<Integer> actual = Eat.eat(0, 0, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void test8() {
		List<Integer> expected = Arrays.asList(1000, 0);
		List<Integer> actual = Eat.eat(0, 1000, 1000);
		assertEquals(expected, actual);
	}
	
	@Test
	void test9() {
		List<Integer> expected = Arrays.asList(1000, 0);
		List<Integer> actual = Eat.eat(1000, 0, 1000);
		assertEquals(expected, actual);
	}
	
	@Test
	void test10() {
		List<Integer> expected = Arrays.asList(1000, 0);
		List<Integer> actual = Eat.eat(1000, 1000, 0);
		assertEquals(expected, actual);
	}
}

// EatTest.java
package original;

import java.util.Arrays;
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
		List<Integer> expected = Arrays.asList(11, 4);
		List<Integer> actual = Eat.eat(5, 6, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		List<Integer> expected = Arrays.asList(12, 1);
		List<Integer> actual = Eat.eat(4, 8, 9);
		assertEquals(expected, actual);
	}
	
	@Test
	void test3() {
		List<Integer> expected = Arrays.asList(11, 0);
		List<Integer> actual = Eat.eat(1, 10, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void test4() {
		List<Integer> expected = Arrays.asList(7, 0);
		List<Integer> actual = Eat.eat(2, 11, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	void test5() {
		List<Integer> expected = Arrays.asList(9, 2);
		List<Integer> actual = Eat.eat(4, 5, 7);
		assertEquals(expected, actual);
	}
	
	@Test
	void test6() {
		List<Integer> expected = Arrays.asList(5, 0);
		List<Integer> actual = Eat.eat(4, 5, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void test7() {
		List<Integer> expected = Arrays.asList(0, 0);
		List<Integer> actual = Eat.eat(0, 0, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void test8() {
		List<Integer> expected = Arrays.asList(1000, 0);
		List<Integer> actual = Eat.eat(0, 1000, 1000);
		assertEquals(expected, actual);
	}
	
	@Test
	void test9() {
		List<Integer> expected = Arrays.asList(1000, 0);
		List<Integer> actual = Eat.eat(1000, 0, 1000);
		assertEquals(expected, actual);
	}
	
	@Test
	void test10() {
		List<Integer> expected = Arrays.asList(1000, 0);
		List<Integer> actual = Eat.eat(1000, 1000, 0);
		assertEquals(expected, actual);
	}
}

// EatTest.java
package original;

import java.util.Arrays;
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
		List<Integer> expected = Arrays.asList(11, 4);
		List<Integer> actual = Eat.eat(5, 6, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		List<Integer> expected = Arrays.asList(12, 1);
		List<Integer> actual = Eat.eat(4, 8, 9);
		assertEquals(expected, actual);
	}
	
	@Test
	void test3() {
		List<Integer> expected = Arrays.asList(11, 0);
		List<Integer> actual = Eat.eat(1, 10, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void test4() {
		List<Integer> expected = Arrays.asList(7, 0);
		List<Integer> actual = Eat.eat(2, 11, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	void test5() {
		List<Integer> expected = Arrays.asList(9, 2);
		List<Integer> actual = Eat.eat(4, 5, 7);
		assertEquals(expected, actual);
	}
	
	@Test
	void test6() {
		List<Integer> expected = Arrays.asList(5, 0);
		List<Integer> actual = Eat.eat(4, 5, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void test7() {
		List<Integer> expected = Arrays.asList(0, 0);
		List<Integer> actual = Eat.eat(0, 0, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void test8() {
		List<Integer> expected = Arrays.asList(1000, 0);
		List<Integer> actual = Eat.eat(0, 1000, 1000);
		assertEquals(expected, actual);
	}
	
	@Test
	void test9() {
		List<Integer> expected = Arrays.asList(1000, 0);
		List<Integer> actual = Eat.eat(1000, 0, 1000);
		assertEquals(expected, actual);
	}
	
	@Test
	void test10() {
		List<Integer> expected = Arrays.asList(1000, 0);
		List<Integer> actual = Eat.eat(1000, 1000, 0);
		assertEquals(expected, actual);
	}
}

// EatTest.java
package original;

import java.util.Arrays;
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
		List<Integer> expected = Arrays.asList(11, 4);
		List<Integer> actual = Eat.eat(5, 6, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		List<Integer> expected = Arrays.asList(12, 1);
		List<Integer> actual = Eat.eat(4, 8, 9);
		assertEquals(expected, actual);
	}
	
	@Test
	void test3() {
		List<Integer> expected = Arrays.asList(11, 0);
		List<Integer> actual = Eat.eat(1, 10, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void test4() {
		List<Integer> expected = Arrays.asList(7, 0);
		List<Integer> actual = Eat.eat(2, 11, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	void test5() {
		List<Integer> expected = Arrays.asList(9, 2);
		List<Integer> actual = Eat.eat(4, 5, 7);
		assertEquals(expected, actual);
	}
	
	@Test
	void test6() {
		List<Integer> expected = Arrays.asList(5, 0);
		List<Integer> actual = Eat.eat(4, 5, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void test7() {
		List<Integer> expected = Arrays.asList(0, 0);
		List<Integer> actual = Eat.eat(0, 0, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void test8() {
		List<Integer> expected = Arrays.asList(1000, 0);
		List<Integer> actual = Eat.eat(0, 1000, 1000);
		assertEquals(expected, actual);
	}
	
	@Test
	void test9() {
		List<Integer> expected = Arrays.asList(1000, 0);
		List<Integer> actual = Eat.eat(1000, 0, 1000);
		assertEquals(expected, actual);
	}
	
	@Test
	void test10() {
		List<Integer> expected = Arrays.asList(1000, 0);
		List<Integer> actual = Eat.eat(1000, 1000, 0);
		assertEquals(expected, actual);
	}
}

// EatTest.java
package original;

import java.util.Arrays;
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
		List<Integer> expected = Arrays.asList(11, 4);
		List<Integer> actual = Eat.eat(5, 6, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		List<Integer> expected = Arrays.asList(12, 1);
		List<Integer> actual = Eat.eat(4, 8, 9);
		assertEquals(expected, actual);
	}
	
	@Test
	void test3() {
		List<Integer> expected = Arrays.asList(11, 0);
		List<Integer> actual = Eat.eat(1, 10, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void test4()