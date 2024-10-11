// BelowThresholdTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {

	@Test
	void testBelowThreshold() {
		List<Integer> l = List.of(1, 2, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 100));
		l = List.of(1, 20, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 5));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 21));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 22));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 11));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 10));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 9));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 8));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 7));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 6));
	}
}

// BelowThresholdTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
		
	@Test
	void testBelowThreshold() {
		List<Integer> l = List.of(1, 2, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 100));
		l = List.of(1, 20, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 5));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 21));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 22));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 11));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 10));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 9));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 8));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 7));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 6));
	}
}

// BelowThresholdTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
		
	@Test
	void testBelowThreshold() {
		List<Integer> l = List.of(1, 2, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 100));
		l = List.of(1, 20, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 5));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 21));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 22));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 11));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 10));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 9));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 8));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 7));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 6));
	}
}

// BelowThresholdTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
		
	@Test
	void testBelowThreshold() {
		List<Integer> l = List.of(1, 2, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 100));
		l = List.of(1, 20, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 5));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 21));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 22));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 11));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 10));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 9));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 8));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 7));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 6));
	}
}

// BelowThresholdTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
		
	@Test
	void testBelowThreshold() {
		List<Integer> l = List.of(1, 2, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 100));
		l = List.of(1, 20, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 5));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 21));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 22));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 11));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 10));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 9));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 8));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 7));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 6));
	}
}

// BelowThresholdTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
		
	@Test
	void testBelowThreshold() {
		List<Integer> l = List.of(1, 2, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 100));
		l = List.of(1, 20, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 5));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 21));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 22));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 11));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 10));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 9));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 8));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 7));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 6));
	}
}

// BelowThresholdTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
		
	@Test
	void testBelowThreshold() {
		List<Integer> l = List.of(1, 2, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 100));
		l = List.of(1, 20, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 5));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 21));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 22));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 11));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 10));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 9));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 8));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 7));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 6));
	}
}

// BelowThresholdTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
		
	@Test
	void testBelowThreshold() {
		List<Integer> l = List.of(1, 2, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 100));
		l = List.of(1, 20, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 5));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 21));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 22));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 11));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 10));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 9));
		l = List.of(1, 8, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 8));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 7));
		l = List.of(1, 8, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 6));
	}
}

// BelowThresholdTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowThreshold}.
* It contains ten unit test cases for the {@link BelowThreshold#belowThreshold(List, int)} method.
*/
class BelowThresholdTest {
		
	@Test
	void testBelowThreshold() {
		List<Integer> l = List.of(1, 2, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 100));
		l = List.of(1, 20, 4, 10);
		assertFalse(BelowThreshold.belowThreshold(l, 5));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 21));
		l = List.of(1, 20, 4, 10);
		assertTrue(BelowThreshold.belowThreshold(l, 22));
		