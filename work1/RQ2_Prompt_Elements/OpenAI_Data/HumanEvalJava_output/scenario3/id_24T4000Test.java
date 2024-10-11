// LargestDivisorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {

	@Test
	void testLargestDivisor() {
		assertEquals(5, LargestDivisor.largestDivisor(15));
		assertEquals(1, LargestDivisor.largestDivisor(3));
		assertEquals(1, LargestDivisor.largestDivisor(7));
		assertEquals(5, LargestDivisor.largestDivisor(10));
		assertEquals(50, LargestDivisor.largestDivisor(100));
		assertEquals(7, LargestDivisor.largestDivisor(49));
		assertEquals(1, LargestDivisor.largestDivisor(1));
		assertEquals(2, LargestDivisor.largestDivisor(2));
		assertEquals(2, LargestDivisor.largestDivisor(4));
		assertEquals(3, LargestDivisor.largestDivisor(9));
	}
}
```

## Scenario 4

```java
// LargestDivisor.java
package scenario4;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     *
     * > largestDivisor(15)
     * 5
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
     */
    public static int largestDivisor(int n) {
        int largestDivisor = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                largestDivisor = i;
            }
        }
        return largestDivisor;
    }
}

// LargestDivisorTest.java
package scenario4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
		
	@Test
	void testLargestDivisor() {
		assertEquals(5, LargestDivisor.largestDivisor(15));
		assertEquals(1, LargestDivisor.largestDivisor(3));
		assertEquals(1, LargestDivisor.largestDivisor(7));
		assertEquals(5, LargestDivisor.largestDivisor(10));
		assertEquals(50, LargestDivisor.largestDivisor(100));
		assertEquals(7, LargestDivisor.largestDivisor(49));
		assertEquals(1, LargestDivisor.largestDivisor(1));
		assertEquals(2, LargestDivisor.largestDivisor(2));
		assertEquals(2, LargestDivisor.largestDivisor(4));
		assertEquals(3, LargestDivisor.largestDivisor(9));
	}
}
```

## Scenario 5

```java
// LargestDivisor.java
package scenario5;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     *
     * > largestDivisor(15)
     * 5
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
     */
    public static int largestDivisor(int n) {
        int largestDivisor = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                largestDivisor = i;
            }
        }
        return largestDivisor;
    }
}

// LargestDivisorTest.java
package scenario5;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
		
	@Test
	void testLargestDivisor() {
		assertEquals(5, LargestDivisor.largestDivisor(15));
		assertEquals(1, LargestDivisor.largestDivisor(3));
		assertEquals(1, LargestDivisor.largestDivisor(7));
		assertEquals(5, LargestDivisor.largestDivisor(10));
		assertEquals(50, LargestDivisor.largestDivisor(100));
		assertEquals(7, LargestDivisor.largestDivisor(49));
		assertEquals(1, LargestDivisor.largestDivisor(1));
		assertEquals(2, LargestDivisor.largestDivisor(2));
		assertEquals(2, LargestDivisor.largestDivisor(4));
		assertEquals(3, LargestDivisor.largestDivisor(9));
	}
}
```

## Scenario 6

```java
// LargestDivisor.java
package scenario6;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     *
     * > largestDivisor(15)
     * 5
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
     */
    public static int largestDivisor(int n) {
        int largestDivisor = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                largestDivisor = i;
            }
        }
        return largestDivisor;
    }
}

// LargestDivisorTest.java
package scenario6;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
		
	@Test
	void testLargestDivisor() {
		assertEquals(5, LargestDivisor.largestDivisor(15));
		assertEquals(1, LargestDivisor.largestDivisor(3));
		assertEquals(1, LargestDivisor.largestDivisor(7));
		assertEquals(5, LargestDivisor.largestDivisor(10));
		assertEquals(50, LargestDivisor.largestDivisor(100));
		assertEquals(7, LargestDivisor.largestDivisor(49));
		assertEquals(1, LargestDivisor.largestDivisor(1));
		assertEquals(2, LargestDivisor.largestDivisor(2));
		assertEquals(2, LargestDivisor.largestDivisor(4));
		assertEquals(3, LargestDivisor.largestDivisor(9));
	}
}
```

## Scenario 7

```java
// LargestDivisor.java
package scenario7;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     *
     * > largestDivisor(15)
     * 5
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
     */
    public static int largestDivisor(int n) {
        int largestDivisor = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                largestDivisor = i;
            }
        }
        return largestDivisor;
    }
}

// LargestDivisorTest.java
package scenario7;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
		
	@Test
	void testLargestDivisor() {
		assertEquals(5, LargestDivisor.largestDivisor(15));
		assertEquals(1, LargestDivisor.largestDivisor(3));
		assertEquals(1, LargestDivisor.largestDivisor(7));
		assertEquals(5, LargestDivisor.largestDivisor(10));
		assertEquals(50, LargestDivisor.largestDivisor(100));
		assertEquals(7, LargestDivisor.largestDivisor(49));
		assertEquals(1, LargestDivisor.largestDivisor(1));
		assertEquals(2, LargestDivisor.largestDivisor(2));
		assertEquals(2, LargestDivisor.largestDivisor(4));
		assertEquals(3, LargestDivisor.largestDivisor(9));
	}
}
```

## Scenario 8

```java
// LargestDivisor.java
package scenario8;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     *
     * > largestDivisor(15)
     * 5
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
     */
    public static int largestDivisor(int n) {
        int largestDivisor = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                largestDivisor = i;
            }
        }
        return largestDivisor;
    }
}

// LargestDivisorTest.java
package scenario8;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
		
	@Test
	void testLargestDivisor() {
		assertEquals(5, LargestDivisor.largestDivisor(15));
		assertEquals(1, LargestDivisor.largestDivisor(3));
		assertEquals(1, LargestDivisor.largestDivisor(7));
		assertEquals(5, LargestDivisor.largestDivisor(10));
		assertEquals(50, LargestDivisor.largestDivisor(100));
		assertEquals(7, LargestDivisor.largestDivisor(49));
		assertEquals(1, LargestDivisor.largestDivisor(1));
		assertEquals(2, LargestDivisor.largestDivisor(2));
		assertEquals(2, LargestDivisor.largestDivisor(4));
		assertEquals(3, LargestDivisor.largestDivisor(9));
	}
}
```

## Scenario 9

```java
// LargestDivisor.java
package scenario9;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     *
     * > largestDivisor(15)
     * 5
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
     */
    public static int largestDivisor(int n) {
        int largestDivisor = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                largestDivisor = i;
            }
        }
        return largestDivisor;
    }
}

// LargestDivisorTest.java
package scenario9;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
		
	@Test
	void testLargestDivisor() {
		assertEquals(5, LargestDivisor.largestDivisor(15));
		assertEquals(1, LargestDivisor.largestDivisor(3));
		assertEquals(1, LargestDivisor.largestDivisor(7));
		assertEquals(5, LargestDivisor.largestDivisor(10));
		assertEquals(50, LargestDivisor.largestDivisor(100));
		assertEquals(7, LargestDivisor.largestDivisor(49));
		assertEquals(1, LargestDivisor.largestDivisor(1));
		assertEquals(2, LargestDivisor.largestDivisor(2));
		assertEquals(2, LargestDivisor.largestDivisor(4));
		assertEquals(3, LargestDivisor.largestDivisor(9));
	}
}
```

## Scenario 10

```java
// LargestDivisor.java
package scenario10;

class LargestDivisor {

    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     *
     * > largestDivisor(15)
     * 5
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
    