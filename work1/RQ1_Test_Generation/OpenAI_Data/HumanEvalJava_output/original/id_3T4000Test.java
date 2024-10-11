// BelowZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {

	@Test
	void testBelowZero() {
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, 3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0)));
		assertFalse(BelowZero.belowZero(List.of()));
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, -3.0, 1.0, 2.0, -3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0, 6.0)));
		assertFalse(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -5.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -2.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertFalse(BelowZero.belowZero(List.of(1, 2, 3)));
		assertTrue(BelowZero.belowZero(List.of(1, 2, -4, 5)));
	}
}

// BelowZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {
		
	@Test
	void testBelowZero() {
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, 3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0)));
		assertFalse(BelowZero.belowZero(List.of()));
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, -3.0, 1.0, 2.0, -3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0, 6.0)));
		assertFalse(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -5.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -2.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertFalse(BelowZero.belowZero(List.of(1, 2, 3)));
		assertTrue(BelowZero.belowZero(List.of(1, 2, -4, 5)));
	}
}

// BelowZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {
		
	@Test
	void testBelowZero() {
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, 3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0)));
		assertFalse(BelowZero.belowZero(List.of()));
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, -3.0, 1.0, 2.0, -3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0, 6.0)));
		assertFalse(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -5.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -2.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertFalse(BelowZero.belowZero(List.of(1, 2, 3)));
		assertTrue(BelowZero.belowZero(List.of(1, 2, -4, 5)));
	}
}

// BelowZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {
		
	@Test
	void testBelowZero() {
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, 3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0)));
		assertFalse(BelowZero.belowZero(List.of()));
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, -3.0, 1.0, 2.0, -3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0, 6.0)));
		assertFalse(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -5.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -2.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertFalse(BelowZero.belowZero(List.of(1, 2, 3)));
		assertTrue(BelowZero.belowZero(List.of(1, 2, -4, 5)));
	}
}

// BelowZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {
		
	@Test
	void testBelowZero() {
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, 3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0)));
		assertFalse(BelowZero.belowZero(List.of()));
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, -3.0, 1.0, 2.0, -3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0, 6.0)));
		assertFalse(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -5.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -2.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertFalse(BelowZero.belowZero(List.of(1, 2, 3)));
		assertTrue(BelowZero.belowZero(List.of(1, 2, -4, 5)));
	}
}

// BelowZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {
		
	@Test
	void testBelowZero() {
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, 3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0)));
		assertFalse(BelowZero.belowZero(List.of()));
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, -3.0, 1.0, 2.0, -3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0, 6.0)));
		assertFalse(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -5.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -2.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertFalse(BelowZero.belowZero(List.of(1, 2, 3)));
		assertTrue(BelowZero.belowZero(List.of(1, 2, -4, 5)));
	}
}

// BelowZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {
		
	@Test
	void testBelowZero() {
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, 3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0)));
		assertFalse(BelowZero.belowZero(List.of()));
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, -3.0, 1.0, 2.0, -3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0, 6.0)));
		assertFalse(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -5.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -2.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertFalse(BelowZero.belowZero(List.of(1, 2, 3)));
		assertTrue(BelowZero.belowZero(List.of(1, 2, -4, 5)));
	}
}

// BelowZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {
		
	@Test
	void testBelowZero() {
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, 3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0)));
		assertFalse(BelowZero.belowZero(List.of()));
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, -3.0, 1.0, 2.0, -3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0, 6.0)));
		assertFalse(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -1.0, 2.0, -2.0, 5.0, -5.0, 4.0, -5.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, -2.0, 2.0, -2.0, 5.0, -5.0, 4.0, -4.0)));
		assertFalse(BelowZero.belowZero(List.of(1, 2, 3)));
		assertTrue(BelowZero.belowZero(List.of(1, 2, -4, 5)));
	}
}

// BelowZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {
		
	@Test
	void testBelowZero() {
		assertFalse(BelowZero.belowZero(List.of(1.0, 2.0, 3.0)));
		assertTrue(BelowZero.belowZero(List.of(1.0, 2.0, -4.0, 5.0)));
		assertFalse(BelowZero.belowZero(List.of()));
		assertFalse(BelowZero.belowZero(