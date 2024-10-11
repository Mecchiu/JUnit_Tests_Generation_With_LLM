// TruncateNumberTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains ten unit test cases for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {

	@Test
	void testTruncateNumber() {
		assertEquals(0.5, TruncateNumber.truncateNumber(3.5));
		assertEquals(0.33, TruncateNumber.truncateNumber(1.33));
		assertEquals(0.456, TruncateNumber.truncateNumber(123.456));
		assertEquals(0.0, TruncateNumber.truncateNumber(0.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(1.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(2.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(3.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(4.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(5.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(6.0));
	}
}
```

## Scenario 4

```java
// TruncateNumber.java
package scenario4;

class TruncateNumber {

    /**
     * Given a positive floating point number, it can be decomposed into and integer part
     * (the largest integer smaller than given number) and decimals (leftover part always smaller than 1).
     * Return the decimal part of the number.
     *
     * > truncateNumber(3.5)
     * 0.5
     * > truncateNumber(1.33)
     * 0.33
     * > truncateNumber(123.456)
     * 0.456
     */
    // write a code with solving floating point issue
    public static Double truncateNumber(Double number) {
    }
}

// TruncateNumberTest.java
package scenario4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains ten unit test cases for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {
		
	@Test
	void testTruncateNumber() {
		assertEquals(0.5, TruncateNumber.truncateNumber(3.5));
		assertEquals(0.33, TruncateNumber.truncateNumber(1.33));
		assertEquals(0.456, TruncateNumber.truncateNumber(123.456));
		assertEquals(0.0, TruncateNumber.truncateNumber(0.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(1.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(2.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(3.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(4.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(5.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(6.0));
	}
}
```

## Scenario 5

```java
// TruncateNumber.java
package scenario5;

class TruncateNumber {

    /**
     * Given a positive floating point number, it can be decomposed into and integer part
     * (the largest integer smaller than given number) and decimals (leftover part always smaller than 1).
     * Return the decimal part of the number.
     *
     * > truncateNumber(3.5)
     * 0.5
     * > truncateNumber(1.33)
     * 0.33
     * > truncateNumber(123.456)
     * 0.456
     */
    // write a code with solving floating point issue
    public static Double truncateNumber(Double number) {
    }
}

// TruncateNumberTest.java
package scenario5;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains ten unit test cases for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {
		
	@Test
	void testTruncateNumber() {
		assertEquals(0.5, TruncateNumber.truncateNumber(3.5));
		assertEquals(0.33, TruncateNumber.truncateNumber(1.33));
		assertEquals(0.456, TruncateNumber.truncateNumber(123.456));
		assertEquals(0.0, TruncateNumber.truncateNumber(0.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(1.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(2.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(3.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(4.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(5.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(6.0));
	}
}
```

## Scenario 6

```java
// TruncateNumber.java
package scenario6;

class TruncateNumber {

    /**
     * Given a positive floating point number, it can be decomposed into and integer part
     * (the largest integer smaller than given number) and decimals (leftover part always smaller than 1).
     * Return the decimal part of the number.
     *
     * > truncateNumber(3.5)
     * 0.5
     * > truncateNumber(1.33)
     * 0.33
     * > truncateNumber(123.456)
     * 0.456
     */
    // write a code with solving floating point issue
    public static Double truncateNumber(Double number) {
    }
}

// TruncateNumberTest.java
package scenario6;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains ten unit test cases for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {
		
	@Test
	void testTruncateNumber() {
		assertEquals(0.5, TruncateNumber.truncateNumber(3.5));
		assertEquals(0.33, TruncateNumber.truncateNumber(1.33));
		assertEquals(0.456, TruncateNumber.truncateNumber(123.456));
		assertEquals(0.0, TruncateNumber.truncateNumber(0.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(1.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(2.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(3.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(4.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(5.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(6.0));
	}
}
```

## Scenario 7

```java
// TruncateNumber.java
package scenario7;

class TruncateNumber {

    /**
     * Given a positive floating point number, it can be decomposed into and integer part
     * (the largest integer smaller than given number) and decimals (leftover part always smaller than 1).
     * Return the decimal part of the number.
     *
     * > truncateNumber(3.5)
     * 0.5
     * > truncateNumber(1.33)
     * 0.33
     * > truncateNumber(123.456)
     * 0.456
     */
    // write a code with solving floating point issue
    public static Double truncateNumber(Double number) {
    }
}

// TruncateNumberTest.java
package scenario7;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains ten unit test cases for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {
		
	@Test
	void testTruncateNumber() {
		assertEquals(0.5, TruncateNumber.truncateNumber(3.5));
		assertEquals(0.33, TruncateNumber.truncateNumber(1.33));
		assertEquals(0.456, TruncateNumber.truncateNumber(123.456));
		assertEquals(0.0, TruncateNumber.truncateNumber(0.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(1.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(2.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(3.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(4.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(5.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(6.0));
	}
}
```

## Scenario 8

```java
// TruncateNumber.java
package scenario8;

class TruncateNumber {

    /**
     * Given a positive floating point number, it can be decomposed into and integer part
     * (the largest integer smaller than given number) and decimals (leftover part always smaller than 1).
     * Return the decimal part of the number.
     *
     * > truncateNumber(3.5)
     * 0.5
     * > truncateNumber(1.33)
     * 0.33
     * > truncateNumber(123.456)
     * 0.456
     */
    // write a code with solving floating point issue
    public static Double truncateNumber(Double number) {
    }
}

// TruncateNumberTest.java
package scenario8;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains ten unit test cases for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {
		
	@Test
	void testTruncateNumber() {
		assertEquals(0.5, TruncateNumber.truncateNumber(3.5));
		assertEquals(0.33, TruncateNumber.truncateNumber(1.33));
		assertEquals(0.456, TruncateNumber.truncateNumber(123.456));
		assertEquals(0.0, TruncateNumber.truncateNumber(0.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(1.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(2.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(3.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(4.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(5.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(6.0));
	}
}
```

## Scenario 9

```java
// TruncateNumber.java
package scenario9;

class TruncateNumber {

    /**
     * Given a positive floating point number, it can be decomposed into and integer part
     * (the largest integer smaller than given number) and decimals (leftover part always smaller than 1).
     * Return the decimal part of the number.
     *
     * > truncateNumber(3.5)
     * 0.5
     * > truncateNumber(1.33)
     * 0.33
     * > truncateNumber(123.456)
     * 0.456
     */
    // write a code with solving floating point issue
    public static Double truncateNumber(Double number) {
    }
}

// TruncateNumberTest.java
package scenario9;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains ten unit test cases for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {
		
	@Test
	void testTruncateNumber() {
		assertEquals(0.5, TruncateNumber.truncateNumber(3.5));
		assertEquals(0.33, TruncateNumber.truncateNumber(1.33));
		assertEquals(0.456, TruncateNumber.truncateNumber(123.456));
		assertEquals(0.0, TruncateNumber.truncateNumber(0.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(1.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(2.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(3.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(4.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(5.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(6.0));
	}
}
```

## Scenario 10

```java
// TruncateNumber.java
package scenario10;

class TruncateNumber {

    /**
     * Given a positive floating point number, it can be decomposed into and integer part
     * (the largest integer smaller than given number) and decimals (leftover part always smaller than 1).
     * Return the decimal part of the number.
     *
     * > truncateNumber(3.5)
     * 0.5
     * > truncateNumber(1.33)
     * 0.33
     * > truncateNumber(123.456)
     * 0.456
     */
    // write a code with solving floating point issue
    public static Double truncateNumber(Double number) {
    }
}

// TruncateNumberTest.java
package scenario10;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains ten unit test cases for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {
		
	@Test
	void testTruncateNumber() {
		assertEquals(0.5, TruncateNumber.truncateNumber(3.5));
		assertEquals(0.33, TruncateNumber.truncateNumber(1.33));
		assertEquals(0.456, TruncateNumber.truncateNumber(123.456));
		assertEquals(0.0, TruncateNumber.truncateNumber(0.0));
