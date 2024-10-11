// GetPositiveTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {

	@Test
	void testGetPositive() {
		List<Object> l1 = List.of(-1, 2, -4, 5, 6);
		List<Object> l2 = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
		List<Object> l3 = List.of(-1, -2, 4, 5, 6);
		List<Object> l4 = List.of(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10);
		List<Object> l5 = List.of(-1, -2);
		List<Object> l6 = List.of();
		
		List<Object> r1 = List.of(2, 5, 6);
		List<Object> r2 = List.of(5, 3, 2, 3, 9, 123, 1);
		List<Object> r3 = List.of(4, 5, 6);
		List<Object> r4 = List.of(5, 3, 2, 3, 3, 9, 123, 1);
		List<Object> r5 = List.of();
		List<Object> r6 = List.of();
		
		assertEquals(r1, GetPositive.getPositive(l1));
		assertEquals(r2, GetPositive.getPositive(l2));
		assertEquals(r3, GetPositive.getPositive(l3));
		assertEquals(r4, GetPositive.getPositive(l4));
		assertEquals(r5, GetPositive.getPositive(l5));
		assertEquals(r6, GetPositive.getPositive(l6));
	}
}

// GetPositiveTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {
		
	@Test
	void testGetPositive() {
		List<Object> l1 = List.of(-1, 2, -4, 5, 6);
		List<Object> l2 = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
		List<Object> l3 = List.of(-1, -2, 4, 5, 6);
		List<Object> l4 = List.of(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10);
		List<Object> l5 = List.of(-1, -2);
		List<Object> l6 = List.of();
		
		List<Object> r1 = List.of(2, 5, 6);
		List<Object> r2 = List.of(5, 3, 2, 3, 9, 123, 1);
		List<Object> r3 = List.of(4, 5, 6);
		List<Object> r4 = List.of(5, 3, 2, 3, 3, 9, 123, 1);
		List<Object> r5 = List.of();
		List<Object> r6 = List.of();
		
		assertEquals(r1, GetPositive.getPositive(l1));
		assertEquals(r2, GetPositive.getPositive(l2));
		assertEquals(r3, GetPositive.getPositive(l3));
		assertEquals(r4, GetPositive.getPositive(l4));
		assertEquals(r5, GetPositive.getPositive(l5));
		assertEquals(r6, GetPositive.getPositive(l6));
	}
}

// GetPositiveTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {
		
	@Test
	void testGetPositive() {
		List<Object> l1 = List.of(-1, 2, -4, 5, 6);
		List<Object> l2 = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
		List<Object> l3 = List.of(-1, -2, 4, 5, 6);
		List<Object> l4 = List.of(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10);
		List<Object> l5 = List.of(-1, -2);
		List<Object> l6 = List.of();
		
		List<Object> r1 = List.of(2, 5, 6);
		List<Object> r2 = List.of(5, 3, 2, 3, 9, 123, 1);
		List<Object> r3 = List.of(4, 5, 6);
		List<Object> r4 = List.of(5, 3, 2, 3, 3, 9, 123, 1);
		List<Object> r5 = List.of();
		List<Object> r6 = List.of();
		
		assertEquals(r1, GetPositive.getPositive(l1));
		assertEquals(r2, GetPositive.getPositive(l2));
		assertEquals(r3, GetPositive.getPositive(l3));
		assertEquals(r4, GetPositive.getPositive(l4));
		assertEquals(r5, GetPositive.getPositive(l5));
		assertEquals(r6, GetPositive.getPositive(l6));
	}
}

// GetPositiveTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {
		
	@Test
	void testGetPositive() {
		List<Object> l1 = List.of(-1, 2, -4, 5, 6);
		List<Object> l2 = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
		List<Object> l3 = List.of(-1, -2, 4, 5, 6);
		List<Object> l4 = List.of(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10);
		List<Object> l5 = List.of(-1, -2);
		List<Object> l6 = List.of();
		
		List<Object> r1 = List.of(2, 5, 6);
		List<Object> r2 = List.of(5, 3, 2, 3, 9, 123, 1);
		List<Object> r3 = List.of(4, 5, 6);
		List<Object> r4 = List.of(5, 3, 2, 3, 3, 9, 123, 1);
		List<Object> r5 = List.of();
		List<Object> r6 = List.of();
		
		assertEquals(r1, GetPositive.getPositive(l1));
		assertEquals(r2, GetPositive.getPositive(l2));
		assertEquals(r3, GetPositive.getPositive(l3));
		assertEquals(r4, GetPositive.getPositive(l4));
		assertEquals(r5, GetPositive.getPositive(l5));
		assertEquals(r6, GetPositive.getPositive(l6));
	}
}

// GetPositiveTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {
		
	@Test
	void testGetPositive() {
		List<Object> l1 = List.of(-1, 2, -4, 5, 6);
		List<Object> l2 = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
		List<Object> l3 = List.of(-1, -2, 4, 5, 6);
		List<Object> l4 = List.of(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10);
		List<Object> l5 = List.of(-1, -2);
		List<Object> l6 = List.of();
		
		List<Object> r1 = List.of(2, 5, 6);
		List<Object> r2 = List.of(5, 3, 2, 3, 9, 123, 1);
		List<Object> r3 = List.of(4, 5, 6);
		List<Object> r4 = List.of(5, 3, 2, 3, 3, 9, 123, 1);
		List<Object> r5 = List.of();
		List<Object> r6 = List.of();
		
		assertEquals(r1, GetPositive.getPositive(l1));
		assertEquals(r2, GetPositive.getPositive(l2));
		assertEquals(r3, GetPositive.getPositive(l3));
		assertEquals(r4, GetPositive.getPositive(l4));
		assertEquals(r5, GetPositive.getPositive(l5));
		assertEquals(r6, GetPositive.getPositive(l6));
	}
}

// GetPositiveTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {
		
	@Test
	void testGetPositive() {
		List<Object> l1 = List.of(-1, 2, -4, 5, 6);
		List<Object> l2 = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
		List<Object> l3 = List.of(-1, -2, 4, 5, 6);
		List<Object> l4 = List.of(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10);
		List<Object> l5 = List.of(-1, -2);
		List<Object> l6 = List.of();
		
		List<Object> r1 = List.of(2, 5, 6);
		List<Object> r2 = List.of(5, 3, 2, 3, 9, 123, 1);
		List<Object> r3 = List.of(4, 5, 6);
		List<Object> r4 = List.of(5, 3, 2, 3, 3, 9, 123, 1);
		List<Object> r5 = List.of();
		List<Object> r6 = List.of();
		
		assertEquals(r1, GetPositive.getPositive(l1));
		assertEquals(r2, GetPositive.getPositive(l2));
		assertEquals(r3, GetPositive.getPositive(l3));
		assertEquals(r4, GetPositive.getPositive(l4));
		assertEquals(r5, GetPositive.getPositive(l5));
		assertEquals(r6, GetPositive.getPositive(l6));
	}
}

// GetPositiveTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {
		
	@Test
	void testGetPositive() {
		List<Object> l1 = List.of(-1, 2, -4, 5, 6);
		List<Object> l2 = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
		List<Object> l3 = List.of(-1, -2, 4, 5, 6);
		List<Object> l4 = List.of(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10);
		List<Object> l5 = List.of(-1, -2);
		List<Object> l6 = List.of();
		
		List<Object> r1 = List.of(2, 5, 6);
		List<Object> r2 = List.of(5, 3, 2, 3, 9, 123, 1);
		List<Object> r3 = List.of(4, 5, 6);
		List<Object> r4 = List.of(5, 3, 2, 3, 3, 9, 123, 1);
		List<Object> r5 = List.of();
		List<Object> r6 = List.of();
		
		assertEquals(r1, GetPositive.getPositive(l1));
		assertEquals(r2, GetPositive.getPositive(l2));
		assertEquals(r3, GetPositive.getPositive(l3));
		assertEquals(r4, GetPositive.getPositive(l4));
		assertEquals(r5, GetPositive.getPositive(l5));
		assertEquals(r6, GetPositive.getPositive(l6));
	}
}

// GetPositiveTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {
		
	@Test
	void testGetPositive() {
		List<Object> l1 = List.of(-1, 2, -4, 5, 6);
		List<Object> l2 = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
		List<Object> l3 = List.of(-1, -2, 4, 5, 6);
		List<Object> l4 = List.of(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10);
		List<Object> l5 = List.of(-1, -2);
		List<Object> l6 = List.of();
		
		List<Object> r1 = List.of(2, 5, 6);
		