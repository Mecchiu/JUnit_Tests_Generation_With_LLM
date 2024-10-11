// MaxElementTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains ten unit test cases for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {

	@Test
	void testMaxElement1() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement2() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
		assertEquals(123, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement3() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement4() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10);
		assertEquals(124, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement5() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement6() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 125, 1, -10);
		assertEquals(125, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement7() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement8() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 126, 1, -10);
		assertEquals(126, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement9() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement10() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 127, 1, -10);
		assertEquals(127, MaxElement.maxElement(l));
	}
}
```

## Scenario 4

```java
// MaxElement.java
package scenario4;

import java.util.List;

class MaxElement {

    /**
     * Return the maximum element in the list.
     *
     * > maxElement([1, 2, 3])
     * 3
     * > maxElement([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
     * 123
     * > maxElement([1, 2, 3])
     * 3
     * > maxElement([5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10])
     * 124
     */
    public static int maxElement(List<Integer> l) {
    }
}

// MaxElementTest.java
package scenario4;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains ten unit test cases for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {
		
	@Test
	void testMaxElement1() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement2() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
		assertEquals(123, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement3() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement4() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10);
		assertEquals(124, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement5() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement6() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 125, 1, -10);
		assertEquals(125, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement7() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement8() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 126, 1, -10);
		assertEquals(126, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement9() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement10() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 127, 1, -10);
		assertEquals(127, MaxElement.maxElement(l));
	}
}
```

## Scenario 5

```java
// MaxElement.java
package scenario5;

import java.util.List;

class MaxElement {

    /**
     * Return the maximum element in the list.
     *
     * > maxElement([1, 2, 3])
     * 3
     * > maxElement([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
     * 123
     * > maxElement([1, 2, 3])
     * 3
     * > maxElement([5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10])
     * 124
     */
    public static int maxElement(List<Integer> l) {
    }
}

// MaxElementTest.java
package scenario5;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains ten unit test cases for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {
		
	@Test
	void testMaxElement1() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement2() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
		assertEquals(123, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement3() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement4() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10);
		assertEquals(124, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement5() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement6() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 125, 1, -10);
		assertEquals(125, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement7() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement8() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 126, 1, -10);
		assertEquals(126, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement9() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement10() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 127, 1, -10);
		assertEquals(127, MaxElement.maxElement(l));
	}
}
```

## Scenario 6

```java
// MaxElement.java
package scenario6;

import java.util.List;

class MaxElement {

    /**
     * Return the maximum element in the list.
     *
     * > maxElement([1, 2, 3])
     * 3
     * > maxElement([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
     * 123
     * > maxElement([1, 2, 3])
     * 3
     * > maxElement([5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10])
     * 124
     */
    public static int maxElement(List<Integer> l) {
    }
}

// MaxElementTest.java
package scenario6;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains ten unit test cases for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {
		
	@Test
	void testMaxElement1() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement2() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
		assertEquals(123, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement3() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement4() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10);
		assertEquals(124, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement5() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement6() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 125, 1, -10);
		assertEquals(125, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement7() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement8() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 126, 1, -10);
		assertEquals(126, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement9() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement10() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 127, 1, -10);
		assertEquals(127, MaxElement.maxElement(l));
	}
}
```

## Scenario 7

```java
// MaxElement.java
package scenario7;

import java.util.List;

class MaxElement {

    /**
     * Return the maximum element in the list.
     *
     * > maxElement([1, 2, 3])
     * 3
     * > maxElement([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
     * 123
     * > maxElement([1, 2, 3])
     * 3
     * > maxElement([5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10])
     * 124
     */
    public static int maxElement(List<Integer> l) {
    }
}

// MaxElementTest.java
package scenario7;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains ten unit test cases for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {
		
	@Test
	void testMaxElement1() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement2() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
		assertEquals(123, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement3() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement4() {
		List<Integer> l = List.of(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10);
		assertEquals(124, MaxElement.maxElement(l));
	}
	
	@Test
	void testMaxElement5() {
		List<Integer> l = List.of(1, 2, 3);
		assertEquals(3, MaxElement.maxElement(l));
	}
	