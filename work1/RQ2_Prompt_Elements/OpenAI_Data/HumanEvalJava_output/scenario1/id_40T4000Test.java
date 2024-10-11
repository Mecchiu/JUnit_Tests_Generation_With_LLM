// TriplesSumToZeroTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {

	@Test
	void testTriplesSumToZero_1() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertFalse(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_2() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_3() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -9);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_4() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -8);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_5() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -7);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_6() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -6);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_7() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -5);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_8() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -4);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_9() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -3);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_10() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -2);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
}

// TriplesSumToZeroTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {
		
	@Test
	void testTriplesSumToZero_1() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertFalse(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_2() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_3() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -9);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_4() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -8);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_5() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -7);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_6() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -6);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_7() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -5);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_8() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -4);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_9() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -3);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_10() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -2);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
}

// TriplesSumToZeroTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {
		
	@Test
	void testTriplesSumToZero_1() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertFalse(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_2() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_3() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -9);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_4() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -8);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_5() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -7);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_6() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -6);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_7() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -5);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_8() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -4);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_9() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -3);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_10() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -2);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
}

// TriplesSumToZeroTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {
		
	@Test
	void testTriplesSumToZero_1() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertFalse(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_2() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_3() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -9);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_4() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -8);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_5() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -7);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_6() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -6);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_7() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -5);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_8() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -4);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_9() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -3);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_10() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -2);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
}

// TriplesSumToZeroTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {
		
	@Test
	void testTriplesSumToZero_1() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertFalse(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_2() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_3() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -9);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_4() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -8);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_5() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -7);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_6() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -6);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	@Test
	void testTriplesSumToZero_7() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6