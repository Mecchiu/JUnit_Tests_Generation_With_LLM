// BelowZeroTest.java
package scenario3;

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
		assertFalse(BelowZero.belowZero(List.of(1, 2, 3)));
		assertTrue(BelowZero.belowZero(List.of(1, 2, -4, 5)));
		assertFalse(BelowZero.belowZero(List.of()));
		assertFalse(BelowZero.belowZero(List.of(1, 2, -3, 1, 2, -3)));
		assertTrue(BelowZero.belowZero(List.of(1, 2, -4, 5, 6)));
		assertFalse(BelowZero.belowZero(List.of(1, -1, 2, -2, 5, -5, 4, -4)));
		assertTrue(BelowZero.belowZero(List.of(1, -1, 2, -2, 5, -5, 4, -5)));
		assertTrue(BelowZero.belowZero(List.of(1, -2, 2, -2, 5, -5, 4, -4)));
	}
}
```

## Scenario 4

```java
// SumOfDigits.java
package scenario4;

import java.util.List;

class SumOfDigits {

    /**
     * You're given a list of numbers. Your task is to return the sum of all digits in the list.
     *
     * > sumOfDigits([1, 2, 3])
     * 6
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9])
     * 45
     * > sumOfDigits([])
     * 0
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
     * 55
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])
     * 66
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12])
     * 78
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13])
     * 91
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14])
     * 105
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])
     * 120
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16])
     * 136
     */
    public static Integer sumOfDigits(List<Object> numbers) {
    }
}

// SumOfDigitsTest.java
package scenario4;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumOfDigits}.
* It contains ten unit test cases for the {@link SumOfDigits#sumOfDigits(List)} method.
*/
class SumOfDigitsTest {
		
	@Test
	void testSumOfDigits() {
		assertEquals(6, SumOfDigits.sumOfDigits(List.of(1, 2, 3)));
		assertEquals(45, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));
		assertEquals(0, SumOfDigits.sumOfDigits(List.of()));
		assertEquals(55, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
		assertEquals(66, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)));
		assertEquals(78, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)));
		assertEquals(91, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)));
		assertEquals(105, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)));
		assertEquals(120, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)));
		assertEquals(136, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)));
	}
}
```

## Scenario 5

```java
// SumOfDigits.java
package scenario5;

import java.util.List;

class SumOfDigits {

    /**
     * You're given a list of numbers. Your task is to return the sum of all digits in the list.
     *
     * > sumOfDigits([1, 2, 3])
     * 6
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9])
     * 45
     * > sumOfDigits([])
     * 0
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
     * 55
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])
     * 66
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12])
     * 78
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13])
     * 91
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14])
     * 105
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])
     * 120
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16])
     * 136
     */
    public static Integer sumOfDigits(List<Object> numbers) {
    }
}

// SumOfDigitsTest.java
package scenario5;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumOfDigits}.
* It contains ten unit test cases for the {@link SumOfDigits#sumOfDigits(List)} method.
*/
class SumOfDigitsTest {
		
	@Test
	void testSumOfDigits() {
		assertEquals(6, SumOfDigits.sumOfDigits(List.of(1, 2, 3)));
		assertEquals(45, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));
		assertEquals(0, SumOfDigits.sumOfDigits(List.of()));
		assertEquals(55, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
		assertEquals(66, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)));
		assertEquals(78, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)));
		assertEquals(91, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)));
		assertEquals(105, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)));
		assertEquals(120, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)));
		assertEquals(136, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)));
	}
}
```

## Scenario 6

```java
// SumOfDigits.java
package scenario6;

import java.util.List;

class SumOfDigits {

    /**
     * You're given a list of numbers. Your task is to return the sum of all digits in the list.
     *
     * > sumOfDigits([1, 2, 3])
     * 6
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9])
     * 45
     * > sumOfDigits([])
     * 0
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
     * 55
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])
     * 66
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12])
     * 78
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13])
     * 91
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14])
     * 105
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])
     * 120
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16])
     * 136
     */
    public static Integer sumOfDigits(List<Object> numbers) {
    }
}

// SumOfDigitsTest.java
package scenario6;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumOfDigits}.
* It contains ten unit test cases for the {@link SumOfDigits#sumOfDigits(List)} method.
*/
class SumOfDigitsTest {
		
	@Test
	void testSumOfDigits() {
		assertEquals(6, SumOfDigits.sumOfDigits(List.of(1, 2, 3)));
		assertEquals(45, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));
		assertEquals(0, SumOfDigits.sumOfDigits(List.of()));
		assertEquals(55, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
		assertEquals(66, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)));
		assertEquals(78, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)));
		assertEquals(91, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)));
		assertEquals(105, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)));
		assertEquals(120, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)));
		assertEquals(136, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)));
	}
}
```

## Scenario 7

```java
// SumOfDigits.java
package scenario7;

import java.util.List;

class SumOfDigits {

    /**
     * You're given a list of numbers. Your task is to return the sum of all digits in the list.
     *
     * > sumOfDigits([1, 2, 3])
     * 6
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9])
     * 45
     * > sumOfDigits([])
     * 0
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
     * 55
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11])
     * 66
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12])
     * 78
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13])
     * 91
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14])
     * 105
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])
     * 120
     * > sumOfDigits([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16])
     * 136
     */
    public static Integer sumOfDigits(List<Object> numbers) {
    }
}

// SumOfDigitsTest.java
package scenario7;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumOfDigits}.
* It contains ten unit test cases for the {@link SumOfDigits#sumOfDigits(List)} method.
*/
class SumOfDigitsTest {
		
	@Test
	void testSumOfDigits() {
		assertEquals(6, SumOfDigits.sumOfDigits(List.of(1, 2, 3)));
		assertEquals(45, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));
		assertEquals(0, SumOfDigits.sumOfDigits(List.of()));
		assertEquals(55, SumOfDigits.sumOfDigits(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
	