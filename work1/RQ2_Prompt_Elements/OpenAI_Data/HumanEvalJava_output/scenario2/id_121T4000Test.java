// SolutionTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains ten unit test cases for the {@link Solution#solution(List)} method.
*/
class SolutionTest {

	@Test
	void testSolution() {
		assertEquals(0, Solution.solution(List.of()));
		assertEquals(0, Solution.solution(List.of(1)));
		assertEquals(1, Solution.solution(List.of(1, 2)));
		assertEquals(1, Solution.solution(List.of(2, 1)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4, 5)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4, 5)));
	}
}
```

## Scenario 3

```java
// Solution.java
package scenario3;

import java.util.List;

class Solution {

    /**
     * Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.
     */
    public static int solution(List<Integer> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (i % 2 == 0 && lst.get(i) % 2 == 1) {
                sum += lst.get(i);
            }
        }
        return sum;
    }
}

// SolutionTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains ten unit test cases for the {@link Solution#solution(List)} method.
*/
class SolutionTest {
		
	@Test
	void testSolution() {
		assertEquals(0, Solution.solution(List.of()));
		assertEquals(0, Solution.solution(List.of(1)));
		assertEquals(1, Solution.solution(List.of(1, 2)));
		assertEquals(1, Solution.solution(List.of(2, 1)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4, 5)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4, 5)));
	}
}
```

## Scenario 4

```java
// Solution.java
package scenario4;

import java.util.List;

class Solution {

    /**
     * Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.
     */
    public static int solution(List<Integer> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (i % 2 == 0 && lst.get(i) % 2 == 1) {
                sum += lst.get(i);
            }
        }
        return sum;
    }
}

// SolutionTest.java
package scenario4;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains ten unit test cases for the {@link Solution#solution(List)} method.
*/
class SolutionTest {
		
	@Test
	void testSolution() {
		assertEquals(0, Solution.solution(List.of()));
		assertEquals(0, Solution.solution(List.of(1)));
		assertEquals(1, Solution.solution(List.of(1, 2)));
		assertEquals(1, Solution.solution(List.of(2, 1)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4, 5)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4, 5)));
	}
}
```

## Scenario 5

```java
// Solution.java
package scenario5;

import java.util.List;

class Solution {

    /**
     * Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.
     */
    public static int solution(List<Integer> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (i % 2 == 0 && lst.get(i) % 2 == 1) {
                sum += lst.get(i);
            }
        }
        return sum;
    }
}

// SolutionTest.java
package scenario5;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains ten unit test cases for the {@link Solution#solution(List)} method.
*/
class SolutionTest {
		
	@Test
	void testSolution() {
		assertEquals(0, Solution.solution(List.of()));
		assertEquals(0, Solution.solution(List.of(1)));
		assertEquals(1, Solution.solution(List.of(1, 2)));
		assertEquals(1, Solution.solution(List.of(2, 1)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4, 5)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4, 5)));
	}
}
```

## Scenario 6

```java
// Solution.java
package scenario6;

import java.util.List;

class Solution {

    /**
     * Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.
     */
    public static int solution(List<Integer> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (i % 2 == 0 && lst.get(i) % 2 == 1) {
                sum += lst.get(i);
            }
        }
        return sum;
    }
}

// SolutionTest.java
package scenario6;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains ten unit test cases for the {@link Solution#solution(List)} method.
*/
class SolutionTest {
		
	@Test
	void testSolution() {
		assertEquals(0, Solution.solution(List.of()));
		assertEquals(0, Solution.solution(List.of(1)));
		assertEquals(1, Solution.solution(List.of(1, 2)));
		assertEquals(1, Solution.solution(List.of(2, 1)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4, 5)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4, 5)));
	}
}
```

## Scenario 7

```java
// Solution.java
package scenario7;

import java.util.List;

class Solution {

    /**
     * Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.
     */
    public static int solution(List<Integer> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (i % 2 == 0 && lst.get(i) % 2 == 1) {
                sum += lst.get(i);
            }
        }
        return sum;
    }
}

// SolutionTest.java
package scenario7;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains ten unit test cases for the {@link Solution#solution(List)} method.
*/
class SolutionTest {
		
	@Test
	void testSolution() {
		assertEquals(0, Solution.solution(List.of()));
		assertEquals(0, Solution.solution(List.of(1)));
		assertEquals(1, Solution.solution(List.of(1, 2)));
		assertEquals(1, Solution.solution(List.of(2, 1)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4, 5)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4, 5)));
	}
}
```

## Scenario 8

```java
// Solution.java
package scenario8;

import java.util.List;

class Solution {

    /**
     * Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.
     */
    public static int solution(List<Integer> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (i % 2 == 0 && lst.get(i) % 2 == 1) {
                sum += lst.get(i);
            }
        }
        return sum;
    }
}

// SolutionTest.java
package scenario8;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains ten unit test cases for the {@link Solution#solution(List)} method.
*/
class SolutionTest {
		
	@Test
	void testSolution() {
		assertEquals(0, Solution.solution(List.of()));
		assertEquals(0, Solution.solution(List.of(1)));
		assertEquals(1, Solution.solution(List.of(1, 2)));
		assertEquals(1, Solution.solution(List.of(2, 1)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4, 5)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4, 5)));
	}
}
```

## Scenario 9

```java
// Solution.java
package scenario9;

import java.util.List;

class Solution {

    /**
     * Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.
     */
    public static int solution(List<Integer> lst) {
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (i % 2 == 0 && lst.get(i) % 2 == 1) {
                sum += lst.get(i);
            }
        }
        return sum;
    }
}

// SolutionTest.java
package scenario9;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains ten unit test cases for the {@link Solution#solution(List)} method.
*/
class SolutionTest {
		
	@Test
	void testSolution() {
		assertEquals(0, Solution.solution(List.of()));
		assertEquals(0, Solution.solution(List.of(1)));
		assertEquals(1, Solution.solution(List.of(1, 2)));
		assertEquals(1, Solution.solution(List.of(2, 1)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4)));
		assertEquals(1, Solution.solution(List.of(1, 2, 3, 4, 5)));
		assertEquals(1, Solution.solution(List.of(2, 1, 3, 4, 5)));
	}
}
```

## Scenario 10

```java
// Solution.java
package scenario10;

import java.util.List;

class Solution {

    /**
     * Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.