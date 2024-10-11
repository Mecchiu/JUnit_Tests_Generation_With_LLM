// MonotonicTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {

	@Test
	void testMonotonic() {
		List<Integer> l1 = List.of(1, 2, 4, 10);
		assertTrue(Monotonic.monotonic(l1));
		List<Integer> l2 = List.of(1, 2, 4, 20);
		assertTrue(Monotonic.monotonic(l2));
		List<Integer> l3 = List.of(1, 20, 4, 10);
		assertFalse(Monotonic.monotonic(l3));
		List<Integer> l4 = List.of(4, 1, 0, -10);
		assertTrue(Monotonic.monotonic(l4));
		List<Integer> l5 = List.of(4, 1, 1, 0);
		assertTrue(Monotonic.monotonic(l5));
		List<Integer> l6 = List.of(1, 2, 3, 2, 5, 60);
		assertFalse(Monotonic.monotonic(l6));
		List<Integer> l7 = List.of(1, 2, 3, 4, 5, 60);
		assertTrue(Monotonic.monotonic(l7));
		List<Integer> l8 = List.of(9, 9, 9, 9);
		assertTrue(Monotonic.monotonic(l8));
		List<Integer> l9 = List.of(1);
		assertTrue(Monotonic.monotonic(l9));
		List<Integer> l10 = List.of();
		assertTrue(Monotonic.monotonic(l10));
	}
}

// MonotonicTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {
		
	@Test
	void testMonotonic() {
		List<Integer> l1 = List.of(1, 2, 4, 10);
		assertTrue(Monotonic.monotonic(l1));
		List<Integer> l2 = List.of(1, 2, 4, 20);
		assertTrue(Monotonic.monotonic(l2));
		List<Integer> l3 = List.of(1, 20, 4, 10);
		assertFalse(Monotonic.monotonic(l3));
		List<Integer> l4 = List.of(4, 1, 0, -10);
		assertTrue(Monotonic.monotonic(l4));
		List<Integer> l5 = List.of(4, 1, 1, 0);
		assertTrue(Monotonic.monotonic(l5));
		List<Integer> l6 = List.of(1, 2, 3, 2, 5, 60);
		assertFalse(Monotonic.monotonic(l6));
		List<Integer> l7 = List.of(1, 2, 3, 4, 5, 60);
		assertTrue(Monotonic.monotonic(l7));
		List<Integer> l8 = List.of(9, 9, 9, 9);
		assertTrue(Monotonic.monotonic(l8));
		List<Integer> l9 = List.of(1);
		assertTrue(Monotonic.monotonic(l9));
		List<Integer> l10 = List.of();
		assertTrue(Monotonic.monotonic(l10));
	}
}

// MonotonicTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {
		
	@Test
	void testMonotonic() {
		List<Integer> l1 = List.of(1, 2, 4, 10);
		assertTrue(Monotonic.monotonic(l1));
		List<Integer> l2 = List.of(1, 2, 4, 20);
		assertTrue(Monotonic.monotonic(l2));
		List<Integer> l3 = List.of(1, 20, 4, 10);
		assertFalse(Monotonic.monotonic(l3));
		List<Integer> l4 = List.of(4, 1, 0, -10);
		assertTrue(Monotonic.monotonic(l4));
		List<Integer> l5 = List.of(4, 1, 1, 0);
		assertTrue(Monotonic.monotonic(l5));
		List<Integer> l6 = List.of(1, 2, 3, 2, 5, 60);
		assertFalse(Monotonic.monotonic(l6));
		List<Integer> l7 = List.of(1, 2, 3, 4, 5, 60);
		assertTrue(Monotonic.monotonic(l7));
		List<Integer> l8 = List.of(9, 9, 9, 9);
		assertTrue(Monotonic.monotonic(l8));
		List<Integer> l9 = List.of(1);
		assertTrue(Monotonic.monotonic(l9));
		List<Integer> l10 = List.of();
		assertTrue(Monotonic.monotonic(l10));
	}
}

// MonotonicTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {
		
	@Test
	void testMonotonic() {
		List<Integer> l1 = List.of(1, 2, 4, 10);
		assertTrue(Monotonic.monotonic(l1));
		List<Integer> l2 = List.of(1, 2, 4, 20);
		assertTrue(Monotonic.monotonic(l2));
		List<Integer> l3 = List.of(1, 20, 4, 10);
		assertFalse(Monotonic.monotonic(l3));
		List<Integer> l4 = List.of(4, 1, 0, -10);
		assertTrue(Monotonic.monotonic(l4));
		List<Integer> l5 = List.of(4, 1, 1, 0);
		assertTrue(Monotonic.monotonic(l5));
		List<Integer> l6 = List.of(1, 2, 3, 2, 5, 60);
		assertFalse(Monotonic.monotonic(l6));
		List<Integer> l7 = List.of(1, 2, 3, 4, 5, 60);
		assertTrue(Monotonic.monotonic(l7));
		List<Integer> l8 = List.of(9, 9, 9, 9);
		assertTrue(Monotonic.monotonic(l8));
		List<Integer> l9 = List.of(1);
		assertTrue(Monotonic.monotonic(l9));
		List<Integer> l10 = List.of();
		assertTrue(Monotonic.monotonic(l10));
	}
}

// MonotonicTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {
		
	@Test
	void testMonotonic() {
		List<Integer> l1 = List.of(1, 2, 4, 10);
		assertTrue(Monotonic.monotonic(l1));
		List<Integer> l2 = List.of(1, 2, 4, 20);
		assertTrue(Monotonic.monotonic(l2));
		List<Integer> l3 = List.of(1, 20, 4, 10);
		assertFalse(Monotonic.monotonic(l3));
		List<Integer> l4 = List.of(4, 1, 0, -10);
		assertTrue(Monotonic.monotonic(l4));
		List<Integer> l5 = List.of(4, 1, 1, 0);
		assertTrue(Monotonic.monotonic(l5));
		List<Integer> l6 = List.of(1, 2, 3, 2, 5, 60);
		assertFalse(Monotonic.monotonic(l6));
		List<Integer> l7 = List.of(1, 2, 3, 4, 5, 60);
		assertTrue(Monotonic.monotonic(l7));
		List<Integer> l8 = List.of(9, 9, 9, 9);
		assertTrue(Monotonic.monotonic(l8));
		List<Integer> l9 = List.of(1);
		assertTrue(Monotonic.monotonic(l9));
		List<Integer> l10 = List.of();
		assertTrue(Monotonic.monotonic(l10));
	}
}

// MonotonicTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {
		
	@Test
	void testMonotonic() {
		List<Integer> l1 = List.of(1, 2, 4, 10);
		assertTrue(Monotonic.monotonic(l1));
		List<Integer> l2 = List.of(1, 2, 4, 20);
		assertTrue(Monotonic.monotonic(l2));
		List<Integer> l3 = List.of(1, 20, 4, 10);
		assertFalse(Monotonic.monotonic(l3));
		List<Integer> l4 = List.of(4, 1, 0, -10);
		assertTrue(Monotonic.monotonic(l4));
		List<Integer> l5 = List.of(4, 1, 1, 0);
		assertTrue(Monotonic.monotonic(l5));
		List<Integer> l6 = List.of(1, 2, 3, 2, 5, 60);
		assertFalse(Monotonic.monotonic(l6));
		List<Integer> l7 = List.of(1, 2, 3, 4, 5, 60);
		assertTrue(Monotonic.monotonic(l7));
		List<Integer> l8 = List.of(9, 9, 9, 9);
		assertTrue(Monotonic.monotonic(l8));
		List<Integer> l9 = List.of(1);
		assertTrue(Monotonic.monotonic(l9));
		List<Integer> l10 = List.of();
		assertTrue(Monotonic.monotonic(l10));
	}
}

// MonotonicTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {
		
	@Test
	void testMonotonic() {
		List<Integer> l1 = List.of(1, 2, 4, 10);
		assertTrue(Monotonic.monotonic(l1));
		List<Integer> l2 = List.of(1, 2, 4, 20);
		assertTrue(Monotonic.monotonic(l2));
		List<Integer> l3 = List.of(1, 20, 4, 10);
		assertFalse(Monotonic.monotonic(l3));
		List<Integer> l4 = List.of(4, 1, 0, -10);
		assertTrue(Monotonic.monotonic(l4));
		List<Integer> l5 = List.of(4, 1, 1, 0);
		assertTrue(Monotonic.monotonic(l5));
		List<Integer> l6 = List.of(1, 2, 3, 2, 5, 60);
		assertFalse(Monotonic.monotonic(l6));
		List<Integer> l7 = List.of(1, 2, 3, 4, 5, 60);
		assertTrue(Monotonic.monotonic(l7));
		List<Integer> l8 = List.of(9, 9, 9, 9);
		assertTrue(Monotonic.monotonic(l8));
		List<Integer> l9 = List.of(1);
		assertTrue(Monotonic.monotonic(l9));
		List<Integer> l10 = List.of();
		assertTrue(Monotonic.monotonic(l10));
	}
}

// MonotonicTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains ten unit test cases for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {
		
	@Test
	void testMonotonic() {
		List<Integer> l1 = List.of(1, 2, 4, 10);
		assertTrue(Monotonic.monotonic(l1));
		List<Integer> l2 = List.of(1, 2, 4, 20);
		assertTrue(Monotonic.monotonic(l2));
		List<Integer> l3 = List.of(1, 20, 4, 10);
		assertFalse(Monotonic.monotonic(l3));
		List<Integer> l4 = List.of(4, 1, 0, -10);
		assertTrue(Monotonic.monotonic(l4));
		List<Integer> l5 = List.of(4, 1, 1, 0);
		assertTrue(Monotonic.monotonic(l5));
		List<Integer> l6 = List.of(1, 2, 3, 2, 5, 60);
		assertFalse(Monotonic.monotonic(l6));
		List<Integer> l7 = List.of(1, 2, 3, 4, 5, 60);
		assertTrue(Monotonic.monotonic(l7));
		List<Integer> l8 = List.of(9, 9, 9, 9);
		assertTrue(Monotonic.monotonic(l8));
		List<Integer> l9 = List.of(1);
		assertTrue(Monotonic.monotonic(l9));
		List<Integer> l10 = List.of();
		assertTrue(Monotonic.monotonic(l10));
	}
}

// MonotonicTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.