// RescaleToUnitTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains ten unit test cases for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {

	@Test
	void testRescaleToUnit_1() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		List<Double> expected = List.of(0.0, 0.25, 0.5, 0.75, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_2() {
		List<Double> numbers = List.of(2.0, 49.9);
		List<Double> expected = List.of(0.0, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_3() {
		List<Double> numbers = List.of(100.0, 49.9);
		List<Double> expected = List.of(1.0, 0.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_4() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		List<Double> expected = List.of(0.0, 0.25, 0.5, 0.75, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_5() {
		List<Double> numbers = List.of(2.0, 1.0, 5.0, 3.0, 4.0);
		List<Double> expected = List.of(0.25, 0.0, 1.0, 0.5, 0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_6() {
		List<Double> numbers = List.of(12.0, 11.0, 15.0, 13.0, 14.0);
		List<Double> expected = List.of(0.25, 0.0, 1.0, 0.5, 0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_7() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		List<Double> expected = List.of(0.0, 0.25, 0.5, 0.75, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_8() {
		List<Double> numbers = List.of(2.0, 1.0, 5.0, 3.0, 4.0);
		List<Double> expected = List.of(0.25, 0.0, 1.0, 0.5, 0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_9() {
		List<Double> numbers = List.of(12.0, 11.0, 15.0, 13.0, 14.0);
		List<Double> expected = List.of(0.25, 0.0, 1.0, 0.5, 0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_10() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		List<Double> expected = List.of(0.0, 0.25, 0.5, 0.75, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
}

// RescaleToUnitTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains ten unit test cases for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {
		
	@Test
	void testRescaleToUnit_1() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		List<Double> expected = List.of(0.0, 0.25, 0.5, 0.75, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_2() {
		List<Double> numbers = List.of(2.0, 49.9);
		List<Double> expected = List.of(0.0, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_3() {
		List<Double> numbers = List.of(100.0, 49.9);
		List<Double> expected = List.of(1.0, 0.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_4() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		List<Double> expected = List.of(0.0, 0.25, 0.5, 0.75, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_5() {
		List<Double> numbers = List.of(2.0, 1.0, 5.0, 3.0, 4.0);
		List<Double> expected = List.of(0.25, 0.0, 1.0, 0.5, 0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_6() {
		List<Double> numbers = List.of(12.0, 11.0, 15.0, 13.0, 14.0);
		List<Double> expected = List.of(0.25, 0.0, 1.0, 0.5, 0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_7() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		List<Double> expected = List.of(0.0, 0.25, 0.5, 0.75, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_8() {
		List<Double> numbers = List.of(2.0, 1.0, 5.0, 3.0, 4.0);
		List<Double> expected = List.of(0.25, 0.0, 1.0, 0.5, 0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_9() {
		List<Double> numbers = List.of(12.0, 11.0, 15.0, 13.0, 14.0);
		List<Double> expected = List.of(0.25, 0.0, 1.0, 0.5, 0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_10() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		List<Double> expected = List.of(0.0, 0.25, 0.5, 0.75, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
}

// RescaleToUnitTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains ten unit test cases for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {
		
	@Test
	void testRescaleToUnit_1() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		List<Double> expected = List.of(0.0, 0.25, 0.5, 0.75, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_2() {
		List<Double> numbers = List.of(2.0, 49.9);
		List<Double> expected = List.of(0.0, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_3() {
		List<Double> numbers = List.of(100.0, 49.9);
		List<Double> expected = List.of(1.0, 0.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_4() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		List<Double> expected = List.of(0.0, 0.25, 0.5, 0.75, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_5() {
		List<Double> numbers = List.of(2.0, 1.0, 5.0, 3.0, 4.0);
		List<Double> expected = List.of(0.25, 0.0, 1.0, 0.5, 0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_6() {
		List<Double> numbers = List.of(12.0, 11.0, 15.0, 13.0, 14.0);
		List<Double> expected = List.of(0.25, 0.0, 1.0, 0.5, 0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_7() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		List<Double> expected = List.of(0.0, 0.25, 0.5, 0.75, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_8() {
		List<Double> numbers = List.of(2.0, 1.0, 5.0, 3.0, 4.0);
		List<Double> expected = List.of(0.25, 0.0, 1.0, 0.5, 0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_9() {
		List<Double> numbers = List.of(12.0, 11.0, 15.0, 13.0, 14.0);
		List<Double> expected = List.of(0.25, 0.0, 1.0, 0.5, 0.75);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_10() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		List<Double> expected = List.of(0.0, 0.25, 0.5, 0.75, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
}

// RescaleToUnitTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains ten unit test cases for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {
		
	@Test
	void testRescaleToUnit_1() {
		List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		List<Double> expected = List.of(0.0, 0.25, 0.5, 0.75, 1.0);
		List<Double> actual = RescaleToUnit.rescaleToUnit(numbers);
		assertEquals(expected, actual);
	}
	
	@Test
	void testRescaleToUnit_2() {
		List<Double> numbers = List.of(2.0, 49.9);
		List<Double> expected = List.of(0.0, 1.