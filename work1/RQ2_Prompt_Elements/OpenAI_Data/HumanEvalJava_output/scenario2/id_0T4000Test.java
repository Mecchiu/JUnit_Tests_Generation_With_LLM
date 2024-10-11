// HasCloseElementsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {

	@Test
	void testHasCloseElements_1() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 0.5;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_2() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 1.0;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_3() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 1.5;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_4() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 2.0;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_5() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 2.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_6() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 3.0;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_7() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 3.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_8() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 4.0;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_9() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 4.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_10() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 5.0;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
}

// HasCloseElementsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {
		
	@Test
	void testHasCloseElements_1() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 0.5;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_2() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 1.0;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_3() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 1.5;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_4() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 2.0;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_5() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 2.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_6() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 3.0;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_7() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 3.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_8() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 4.0;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_9() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 4.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_10() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 5.0;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
}

// HasCloseElementsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {
		
	@Test
	void testHasCloseElements_1() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 0.5;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_2() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 1.0;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_3() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 1.5;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_4() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 2.0;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_5() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 2.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_6() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 3.0;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_7() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 3.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_8() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 4.0;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_9() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 4.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_10() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 5.0;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
}

// HasCloseElementsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {
		
	@Test
	void testHasCloseElements_1() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 0.5;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_2() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 1.0;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_3() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 1.5;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_4() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 2.0;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_5() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 2.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_6() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 3.0;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_7() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 3.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_8() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 4.0;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_9() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 4.5;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_10() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 5.0;
		assertFalse(HasCloseElements.hasCloseElements(numbers, threshold));
	}
}

// HasCloseElementsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains ten unit test cases for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {
		
	@Test
	void testHasCloseElements_1() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 0.5;
		assertTrue(HasCloseElements.hasCloseElements(numbers, threshold));
	}
	
	@Test
	void testHasCloseElements_2() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		Double threshold = 1.0;