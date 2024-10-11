// EvenOddCountTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains ten unit test cases for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {

	@Test
	void testEvenOddCount() {
		assertEquals(List.of(1, 1), EvenOddCount.evenOddCount(-12));
		assertEquals(List.of(1, 2), EvenOddCount.evenOddCount(123));
		assertEquals(List.of(0, 1), EvenOddCount.evenOddCount(7));
		assertEquals(List.of(1, 1), EvenOddCount.evenOddCount(-78));
		assertEquals(List.of(2, 2), EvenOddCount.evenOddCount(3452));
		assertEquals(List.of(3, 3), EvenOddCount.evenOddCount(346211));
		assertEquals(List.of(3, 3), EvenOddCount.evenOddCount(-345821));
		assertEquals(List.of(1, 0), EvenOddCount.evenOddCount(-2));
		assertEquals(List.of(2, 3), EvenOddCount.evenOddCount(-45347));
		assertEquals(List.of(1, 0), EvenOddCount.evenOddCount(0));
	}
}
```

## Scenario 4

```java
// EvenOddCount.java
package scenario4;

import java.util.List;

class EvenOddCount {

    /**
     * Given an integer. return a tuple that has the number of even and odd digits respectively.
     *
     * Example:
     * evenOddCount(-12) ==> (1, 1)
     * evenOddCount(123) ==> (1, 2)
     *
     * > evenOddCount(7)
     * [0, 1]
     * > evenOddCount(-78)
     * [1, 1]
     * > evenOddCount(3452)
     * [2, 2]
     * > evenOddCount(346211)
     * [3, 3]
     * > evenOddCount(-345821)
     * [3, 3]
     * > evenOddCount(-2)
     * [1, 0]
     * > evenOddCount(-45347)
     * [2, 3]
     * > evenOddCount(0)
     * [1, 0]
     */
    public static List<Integer> evenOddCount(int num) {
    }
}

// EvenOddCountTest.java
package scenario4;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains ten unit test cases for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
		
	@Test
	void testEvenOddCount() {
		assertEquals(List.of(1, 1), EvenOddCount.evenOddCount(-12));
		assertEquals(List.of(1, 2), EvenOddCount.evenOddCount(123));
		assertEquals(List.of(0, 1), EvenOddCount.evenOddCount(7));
		assertEquals(List.of(1, 1), EvenOddCount.evenOddCount(-78));
		assertEquals(List.of(2, 2), EvenOddCount.evenOddCount(3452));
		assertEquals(List.of(3, 3), EvenOddCount.evenOddCount(346211));
		assertEquals(List.of(3, 3), EvenOddCount.evenOddCount(-345821));
		assertEquals(List.of(1, 0), EvenOddCount.evenOddCount(-2));
		assertEquals(List.of(2, 3), EvenOddCount.evenOddCount(-45347));
		assertEquals(List.of(1, 0), EvenOddCount.evenOddCount(0));
	}
}
```

## Scenario 5

```java
// EvenOddCount.java
package scenario5;

import java.util.List;

class EvenOddCount {

    /**
     * Given an integer. return a tuple that has the number of even and odd digits respectively.
     *
     * Example:
     * evenOddCount(-12) ==> (1, 1)
     * evenOddCount(123) ==> (1, 2)
     *
     * > evenOddCount(7)
     * [0, 1]
     * > evenOddCount(-78)
     * [1, 1]
     * > evenOddCount(3452)
     * [2, 2]
     * > evenOddCount(346211)
     * [3, 3]
     * > evenOddCount(-345821)
     * [3, 3]
     * > evenOddCount(-2)
     * [1, 0]
     * > evenOddCount(-45347)
     * [2, 3]
     * > evenOddCount(0)
     * [1, 0]
     */
    public static List<Integer> evenOddCount(int num) {
    }
}

// EvenOddCountTest.java
package scenario5;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains ten unit test cases for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
		
	@Test
	void testEvenOddCount() {
		assertEquals(List.of(1, 1), EvenOddCount.evenOddCount(-12));
		assertEquals(List.of(1, 2), EvenOddCount.evenOddCount(123));
		assertEquals(List.of(0, 1), EvenOddCount.evenOddCount(7));
		assertEquals(List.of(1, 1), EvenOddCount.evenOddCount(-78));
		assertEquals(List.of(2, 2), EvenOddCount.evenOddCount(3452));
		assertEquals(List.of(3, 3), EvenOddCount.evenOddCount(346211));
		assertEquals(List.of(3, 3), EvenOddCount.evenOddCount(-345821));
		assertEquals(List.of(1, 0), EvenOddCount.evenOddCount(-2));
		assertEquals(List.of(2, 3), EvenOddCount.evenOddCount(-45347));
		assertEquals(List.of(1, 0), EvenOddCount.evenOddCount(0));
	}
}
```

## Scenario 6

```java
// EvenOddCount.java
package scenario6;

import java.util.List;

class EvenOddCount {

    /**
     * Given an integer. return a tuple that has the number of even and odd digits respectively.
     *
     * Example:
     * evenOddCount(-12) ==> (1, 1)
     * evenOddCount(123) ==> (1, 2)
     *
     * > evenOddCount(7)
     * [0, 1]
     * > evenOddCount(-78)
     * [1, 1]
     * > evenOddCount(3452)
     * [2, 2]
     * > evenOddCount(346211)
     * [3, 3]
     * > evenOddCount(-345821)
     * [3, 3]
     * > evenOddCount(-2)
     * [1, 0]
     * > evenOddCount(-45347)
     * [2, 3]
     * > evenOddCount(0)
     * [1, 0]
     */
    public static List<Integer> evenOddCount(int num) {
    }
}

// EvenOddCountTest.java
package scenario6;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains ten unit test cases for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
		
	@Test
	void testEvenOddCount() {
		assertEquals(List.of(1, 1), EvenOddCount.evenOddCount(-12));
		assertEquals(List.of(1, 2), EvenOddCount.evenOddCount(123));
		assertEquals(List.of(0, 1), EvenOddCount.evenOddCount(7));
		assertEquals(List.of(1, 1), EvenOddCount.evenOddCount(-78));
		assertEquals(List.of(2, 2), EvenOddCount.evenOddCount(3452));
		assertEquals(List.of(3, 3), EvenOddCount.evenOddCount(346211));
		assertEquals(List.of(3, 3), EvenOddCount.evenOddCount(-345821));
		assertEquals(List.of(1, 0), EvenOddCount.evenOddCount(-2));
		assertEquals(List.of(2, 3), EvenOddCount.evenOddCount(-45347));
		assertEquals(List.of(1, 0), EvenOddCount.evenOddCount(0));
	}
}
```

## Scenario 7

```java
// EvenOddCount.java
package scenario7;

import java.util.List;

class EvenOddCount {

    /**
     * Given an integer. return a tuple that has the number of even and odd digits respectively.
     *
     * Example:
     * evenOddCount(-12) ==> (1, 1)
     * evenOddCount(123) ==> (1, 2)
     *
     * > evenOddCount(7)
     * [0, 1]
     * > evenOddCount(-78)
     * [1, 1]
     * > evenOddCount(3452)
     * [2, 2]
     * > evenOddCount(346211)
     * [3, 3]
     * > evenOddCount(-345821)
     * [3, 3]
     * > evenOddCount(-2)
     * [1, 0]
     * > evenOddCount(-45347)
     * [2, 3]
     * > evenOddCount(0)
     * [1, 0]
     */
    public static List<Integer> evenOddCount(int num) {
    }
}

// EvenOddCountTest.java
package scenario7;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains ten unit test cases for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
		
	@Test
	void testEvenOddCount() {
		assertEquals(List.of(1, 1), EvenOddCount.evenOddCount(-12));
		assertEquals(List.of(1, 2), EvenOddCount.evenOddCount(123));
		assertEquals(List.of(0, 1), EvenOddCount.evenOddCount(7));
		assertEquals(List.of(1, 1), EvenOddCount.evenOddCount(-78));
		assertEquals(List.of(2, 2), EvenOddCount.evenOddCount(3452));
		assertEquals(List.of(3, 3), EvenOddCount.evenOddCount(346211));
		assertEquals(List.of(3, 3), EvenOddCount.evenOddCount(-345821));
		assertEquals(List.of(1, 0), EvenOddCount.evenOddCount(-2));
		assertEquals(List.of(2, 3), EvenOddCount.evenOddCount(-45347));
		assertEquals(List.of(1, 0), EvenOddCount.evenOddCount(0));
	}
}
```

## Scenario 8

```java
// EvenOddCount.java
package scenario8;

import java.util.List;

class EvenOddCount {

    /**
     * Given an integer. return a tuple that has the number of even and odd digits respectively.
     *
     * Example:
     * evenOddCount(-12) ==> (1, 1)
     * evenOddCount(123) ==> (1, 2)
     *
     * > evenOddCount(7)
     * [0, 1]
     * > evenOddCount(-78)
     * [1, 1]
     * > evenOddCount(3452)
     * [2, 2]
     * > evenOddCount(346211)
     * [3, 3]
     * > evenOddCount(-345821)
     * [3, 3]
     * > evenOddCount(-2)
     * [1, 0]
     * > evenOddCount(-45347)
     * [2, 3]
     * > evenOddCount(0)
     * [1, 0]
     */
    public static List<Integer> evenOddCount(int num) {
    }
}

// EvenOddCountTest.java
package scenario8;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddCount}.
* It contains ten unit test cases for the {@link EvenOddCount#evenOddCount(int)} method.
*/
class EvenOddCountTest {
		
	@Test
	void testEvenOddCount() {
		assertEquals(List.of(1, 1), EvenOddCount.evenOddCount(-12));
		assertEquals(List.of(1, 2), EvenOddCount.evenOddCount(123));
		assertEquals(List.of(0, 1), EvenOddCount.evenOddCount(7));
		assertEquals(List.of(1, 1), EvenOddCount.evenOddCount(-78));
		assertEquals(List.of(2, 2), EvenOddCount.evenOddCount(3452));
		assertEquals(List.of(3, 3), EvenOddCount.evenOddCount(346211));
		assertEquals(List.of(3, 3), EvenOddCount.evenOddCount(-345821));
		assertEquals(List.of(1, 0), EvenOddCount.evenOddCount(-2));
		assertEquals(List.of(2, 3), EvenOddCount.evenOddCount(-45347));
		assertEquals(List.of(1, 0), EvenOddCount.evenOddCount(0));
	}
}
```

## Scenario 9

```java
// EvenOddCount.java
package scenario9;

import java.util.List;

class EvenOddCount {

    /**
     * Given an integer. return a tuple that has the number of even and odd digits respectively.
     *
     * Example:
     * evenOddCount(-12) ==> (1, 1)
     * evenOddCount(123) ==> (1, 2)
     *
     * > evenOddCount(7)
     * [0, 1]
     * > evenOddCount(-78)
     * [1, 1]
     * > evenOddCount(3452)
     * [2, 2]
     * > evenOddCount(346211)
     * [3,