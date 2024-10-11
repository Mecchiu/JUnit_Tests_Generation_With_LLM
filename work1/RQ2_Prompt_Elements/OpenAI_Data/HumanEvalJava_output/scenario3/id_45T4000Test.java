// TriangleAreaTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {

	@Test
	void testTriangleArea() {
		assertEquals(7.5, TriangleArea.triangleArea(5, 3));
		assertEquals(2.0, TriangleArea.triangleArea(2, 2));
		assertEquals(40.0, TriangleArea.triangleArea(10, 8));
		assertEquals(0.0, TriangleArea.triangleArea(0, 0));
		assertEquals(0.0, TriangleArea.triangleArea(0, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 0));
		assertEquals(0.0, TriangleArea.triangleArea(-1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(-1, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 1));
	}
}
```

## Scenario 4

```java
// TriangleArea.java
package scenario4;

class TriangleArea {

    /**
     * Given length of a side and high return area for a triangle.
     *
     * > triangleArea(5, 3)
     * 7.5
     * > triangleArea(2, 2)
     * 2.0
     * > triangleArea(10, 8)
     * 40.0
     */
    public static Double triangleArea(int a, int h) {
        if (a <= 0 || h <= 0) {
            return 0.0;
        }
        return (a * h) / 2.0;
    }
}

// TriangleAreaTest.java
package scenario4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {
		
	@Test
	void testTriangleArea() {
		assertEquals(7.5, TriangleArea.triangleArea(5, 3));
		assertEquals(2.0, TriangleArea.triangleArea(2, 2));
		assertEquals(40.0, TriangleArea.triangleArea(10, 8));
		assertEquals(0.0, TriangleArea.triangleArea(0, 0));
		assertEquals(0.0, TriangleArea.triangleArea(0, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 0));
		assertEquals(0.0, TriangleArea.triangleArea(-1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(-1, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 1));
	}
}
```

## Scenario 5

```java
// TriangleArea.java
package scenario5;

class TriangleArea {

    /**
     * Given length of a side and high return area for a triangle.
     *
     * > triangleArea(5, 3)
     * 7.5
     * > triangleArea(2, 2)
     * 2.0
     * > triangleArea(10, 8)
     * 40.0
     */
    public static Double triangleArea(int a, int h) {
        if (a <= 0 || h <= 0) {
            return 0.0;
        }
        return (a * h) / 2.0;
    }
}

// TriangleAreaTest.java
package scenario5;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {
		
	@Test
	void testTriangleArea() {
		assertEquals(7.5, TriangleArea.triangleArea(5, 3));
		assertEquals(2.0, TriangleArea.triangleArea(2, 2));
		assertEquals(40.0, TriangleArea.triangleArea(10, 8));
		assertEquals(0.0, TriangleArea.triangleArea(0, 0));
		assertEquals(0.0, TriangleArea.triangleArea(0, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 0));
		assertEquals(0.0, TriangleArea.triangleArea(-1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(-1, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 1));
	}
}
```

## Scenario 6

```java
// TriangleArea.java
package scenario6;

class TriangleArea {

    /**
     * Given length of a side and high return area for a triangle.
     *
     * > triangleArea(5, 3)
     * 7.5
     * > triangleArea(2, 2)
     * 2.0
     * > triangleArea(10, 8)
     * 40.0
     */
    public static Double triangleArea(int a, int h) {
        if (a <= 0 || h <= 0) {
            return 0.0;
        }
        return (a * h) / 2.0;
    }
}

// TriangleAreaTest.java
package scenario6;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {
		
	@Test
	void testTriangleArea() {
		assertEquals(7.5, TriangleArea.triangleArea(5, 3));
		assertEquals(2.0, TriangleArea.triangleArea(2, 2));
		assertEquals(40.0, TriangleArea.triangleArea(10, 8));
		assertEquals(0.0, TriangleArea.triangleArea(0, 0));
		assertEquals(0.0, TriangleArea.triangleArea(0, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 0));
		assertEquals(0.0, TriangleArea.triangleArea(-1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(-1, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 1));
	}
}
```

## Scenario 7

```java
// TriangleArea.java
package scenario7;

class TriangleArea {

    /**
     * Given length of a side and high return area for a triangle.
     *
     * > triangleArea(5, 3)
     * 7.5
     * > triangleArea(2, 2)
     * 2.0
     * > triangleArea(10, 8)
     * 40.0
     */
    public static Double triangleArea(int a, int h) {
        if (a <= 0 || h <= 0) {
            return 0.0;
        }
        return (a * h) / 2.0;
    }
}

// TriangleAreaTest.java
package scenario7;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {
		
	@Test
	void testTriangleArea() {
		assertEquals(7.5, TriangleArea.triangleArea(5, 3));
		assertEquals(2.0, TriangleArea.triangleArea(2, 2));
		assertEquals(40.0, TriangleArea.triangleArea(10, 8));
		assertEquals(0.0, TriangleArea.triangleArea(0, 0));
		assertEquals(0.0, TriangleArea.triangleArea(0, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 0));
		assertEquals(0.0, TriangleArea.triangleArea(-1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(-1, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 1));
	}
}
```

## Scenario 8

```java
// TriangleArea.java
package scenario8;

class TriangleArea {

    /**
     * Given length of a side and high return area for a triangle.
     *
     * > triangleArea(5, 3)
     * 7.5
     * > triangleArea(2, 2)
     * 2.0
     * > triangleArea(10, 8)
     * 40.0
     */
    public static Double triangleArea(int a, int h) {
        if (a <= 0 || h <= 0) {
            return 0.0;
        }
        return (a * h) / 2.0;
    }
}

// TriangleAreaTest.java
package scenario8;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {
		
	@Test
	void testTriangleArea() {
		assertEquals(7.5, TriangleArea.triangleArea(5, 3));
		assertEquals(2.0, TriangleArea.triangleArea(2, 2));
		assertEquals(40.0, TriangleArea.triangleArea(10, 8));
		assertEquals(0.0, TriangleArea.triangleArea(0, 0));
		assertEquals(0.0, TriangleArea.triangleArea(0, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 0));
		assertEquals(0.0, TriangleArea.triangleArea(-1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(-1, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 1));
	}
}
```

## Scenario 9

```java
// TriangleArea.java
package scenario9;

class TriangleArea {

    /**
     * Given length of a side and high return area for a triangle.
     *
     * > triangleArea(5, 3)
     * 7.5
     * > triangleArea(2, 2)
     * 2.0
     * > triangleArea(10, 8)
     * 40.0
     */
    public static Double triangleArea(int a, int h) {
        if (a <= 0 || h <= 0) {
            return 0.0;
        }
        return (a * h) / 2.0;
    }
}

// TriangleAreaTest.java
package scenario9;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {
		
	@Test
	void testTriangleArea() {
		assertEquals(7.5, TriangleArea.triangleArea(5, 3));
		assertEquals(2.0, TriangleArea.triangleArea(2, 2));
		assertEquals(40.0, TriangleArea.triangleArea(10, 8));
		assertEquals(0.0, TriangleArea.triangleArea(0, 0));
		assertEquals(0.0, TriangleArea.triangleArea(0, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 0));
		assertEquals(0.0, TriangleArea.triangleArea(-1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(-1, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 1));
	}
}
```

## Scenario 10

```java
// TriangleArea.java
package scenario10;

class TriangleArea {

    /**
     * Given length of a side and high return area for a triangle.
     *
     * > triangleArea(5, 3)
     * 7.5
     * > triangleArea(2, 2)
     * 2.0
     * > triangleArea(10, 8)
     * 40.0
     */
    public static Double triangleArea(int a, int h) {
        if (a <= 0 || h <= 0) {
            return 0.0;
        }
        return (a * h) / 2.0;
    }
}

// TriangleAreaTest.java
package scenario10;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {
		
	@Test
	void testTriangleArea() {
		assertEquals(7.5, TriangleArea.triangleArea(5, 3));
		assertEquals(2.0, TriangleArea.triangleArea(2, 2));
		assertEquals(40.0, TriangleArea.triangleArea(10, 8));
		assertEquals(0.0, TriangleArea.triangleArea(0, 0));
		assertEquals(0.0, TriangleArea.triangleArea(0, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 0));
		assertEquals(0.0, TriangleArea.triangleArea(-1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(-1, 1));
		assertEquals(0.0, TriangleArea.triangleArea(1, -1));
		assertEquals(0.0, TriangleArea.triangleArea(1, 1));
	}
}
```

## Scenario 11

```java
// TriangleArea.java
package scenario11;

class TriangleArea {

    /**
     * Given length of a side and high return area for a triangle.
     *
     * > triangleArea(5, 3)
     * 7.5
     * > triangleArea(2, 2)
     * 2.0
     * > triangleArea(10, 8)
     * 40.0
     */
    public static Double triangleArea(int a, int h) {
        if (a <= 0 || h <= 0) {
            return 0.0;
        }
        return (a * h) / 2.0;
    }
}

// TriangleAreaTest.java
package scenario11;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains ten unit test cases for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {
		