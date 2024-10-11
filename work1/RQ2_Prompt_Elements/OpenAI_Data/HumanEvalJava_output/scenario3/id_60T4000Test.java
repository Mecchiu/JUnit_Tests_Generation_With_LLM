// SumToNTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {

	@Test
	void testSumToN_1() {
		assertEquals(1, SumToN.sumToN(1));
	}
	
	@Test
	void testSumToN_2() {
		assertEquals(3, SumToN.sumToN(2));
	}
	
	@Test
	void testSumToN_3() {
		assertEquals(6, SumToN.sumToN(3));
	}
	
	@Test
	void testSumToN_4() {
		assertEquals(10, SumToN.sumToN(4));
	}
	
	@Test
	void testSumToN_5() {
		assertEquals(15, SumToN.sumToN(5));
	}
	
	@Test
	void testSumToN_6() {
		assertEquals(21, SumToN.sumToN(6));
	}
	
	@Test
	void testSumToN_7() {
		assertEquals(28, SumToN.sumToN(7));
	}
	
	@Test
	void testSumToN_8() {
		assertEquals(36, SumToN.sumToN(8));
	}
	
	@Test
	void testSumToN_9() {
		assertEquals(45, SumToN.sumToN(9));
	}
	
	@Test
	void testSumToN_10() {
		assertEquals(55, SumToN.sumToN(10));
	}
}

// SumToN.java
package scenario3;

class SumToN {

    /**
     * sumToN is a function that sums numbers from 1 to n.
     *
     * > sumToN(5)
     * 15
     * > sumToN(10)
     * 55
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
		
	@Test
	void testSumToN_1() {
		assertEquals(1, SumToN.sumToN(1));
	}
	
	@Test
	void testSumToN_2() {
		assertEquals(3, SumToN.sumToN(2));
	}
	
	@Test
	void testSumToN_3() {
		assertEquals(6, SumToN.sumToN(3));
	}
	
	@Test
	void testSumToN_4() {
		assertEquals(10, SumToN.sumToN(4));
	}
	
	@Test
	void testSumToN_5() {
		assertEquals(15, SumToN.sumToN(5));
	}
	
	@Test
	void testSumToN_6() {
		assertEquals(21, SumToN.sumToN(6));
	}
	
	@Test
	void testSumToN_7() {
		assertEquals(28, SumToN.sumToN(7));
	}
	
	@Test
	void testSumToN_8() {
		assertEquals(36, SumToN.sumToN(8));
	}
	
	@Test
	void testSumToN_9() {
		assertEquals(45, SumToN.sumToN(9));
	}
	
	@Test
	void testSumToN_10() {
		assertEquals(55, SumToN.sumToN(10));
	}
}

// SumToN.java
package scenario3;

class SumToN {

    /**
     * sumToN is a function that sums numbers from 1 to n.
     *
     * > sumToN(5)
     * 15
     * > sumToN(10)
     * 55
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
		
	@Test
	void testSumToN_1() {
		assertEquals(1, SumToN.sumToN(1));
	}
	
	@Test
	void testSumToN_2() {
		assertEquals(3, SumToN.sumToN(2));
	}
	
	@Test
	void testSumToN_3() {
		assertEquals(6, SumToN.sumToN(3));
	}
	
	@Test
	void testSumToN_4() {
		assertEquals(10, SumToN.sumToN(4));
	}
	
	@Test
	void testSumToN_5() {
		assertEquals(15, SumToN.sumToN(5));
	}
	
	@Test
	void testSumToN_6() {
		assertEquals(21, SumToN.sumToN(6));
	}
	
	@Test
	void testSumToN_7() {
		assertEquals(28, SumToN.sumToN(7));
	}
	
	@Test
	void testSumToN_8() {
		assertEquals(36, SumToN.sumToN(8));
	}
	
	@Test
	void testSumToN_9() {
		assertEquals(45, SumToN.sumToN(9));
	}
	
	@Test
	void testSumToN_10() {
		assertEquals(55, SumToN.sumToN(10));
	}
}

// SumToN.java
package scenario3;

class SumToN {

    /**
     * sumToN is a function that sums numbers from 1 to n.
     *
     * > sumToN(5)
     * 15
     * > sumToN(10)
     * 55
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
		
	@Test
	void testSumToN_1() {
		assertEquals(1, SumToN.sumToN(1));
	}
	
	@Test
	void testSumToN_2() {
		assertEquals(3, SumToN.sumToN(2));
	}
	
	@Test
	void testSumToN_3() {
		assertEquals(6, SumToN.sumToN(3));
	}
	
	@Test
	void testSumToN_4() {
		assertEquals(10, SumToN.sumToN(4));
	}
	
	@Test
	void testSumToN_5() {
		assertEquals(15, SumToN.sumToN(5));
	}
	
	@Test
	void testSumToN_6() {
		assertEquals(21, SumToN.sumToN(6));
	}
	
	@Test
	void testSumToN_7() {
		assertEquals(28, SumToN.sumToN(7));
	}
	
	@Test
	void testSumToN_8() {
		assertEquals(36, SumToN.sumToN(8));
	}
	
	@Test
	void testSumToN_9() {
		assertEquals(45, SumToN.sumToN(9));
	}
	
	@Test
	void testSumToN_10() {
		assertEquals(55, SumToN.sumToN(10));
	}
}

// SumToN.java
package scenario3;

class SumToN {

    /**
     * sumToN is a function that sums numbers from 1 to n.
     *
     * > sumToN(5)
     * 15
     * > sumToN(10)
     * 55
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
		
	@Test
	void testSumToN_1() {
		assertEquals(1, SumToN.sumToN(1));
	}
	
	@Test
	void testSumToN_2() {
		assertEquals(3, SumToN.sumToN(2));
	}
	
	@Test
	void testSumToN_3() {
		assertEquals(6, SumToN.sumToN(3));
	}
	
	@Test
	void testSumToN_4() {
		assertEquals(10, SumToN.sumToN(4));
	}
	
	@Test
	void testSumToN_5() {
		assertEquals(15, SumToN.sumToN(5));
	}
	
	@Test
	void testSumToN_6() {
		assertEquals(21, SumToN.sumToN(6));
	}
	
	@Test
	void testSumToN_7() {
		assertEquals(28, SumToN.sumToN(7));
	}
	
	@Test
	void testSumToN_8() {
		assertEquals(36, SumToN.sumToN(8));
	}
	
	@Test
	void testSumToN_9() {
		assertEquals(45, SumToN.sumToN(9));
	}
	
	@Test
	void testSumToN_10() {
		assertEquals(55, SumToN.sumToN(10));
	}
}

// SumToN.java
package scenario3;

class SumToN {

    /**
     * sumToN is a function that sums numbers from 1 to n.
     *
     * > sumToN(5)
     * 15
     * > sumToN(10)
     * 55
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumToN}.
* It contains ten unit test cases for the {@link SumToN#sumToN(int)} method.
*/
class SumToNTest {
		
	@Test
	void testSumToN_1() {
		assertEquals(1, SumToN.sumToN(1));
	}
	
	@Test
	void testSumToN_2() {
		assertEquals(3, SumToN.sumToN(2));
	}
	
	@Test
	void testSumToN_3() {
		assertEquals(6, SumToN.sumToN(3));
	}
	
	@Test
	void testSumToN_4() {
		assertEquals(10, SumToN.sumToN(4));
	}
	
	@Test
	void testSumToN_5() {
		assertEquals(15, SumToN.sumToN(5));
	}
	
	@Test
	void testSumToN_6() {
		assertEquals(21, SumToN.sumToN(6));
	}
	
	@Test
	void testSumToN_7() {
		assertEquals(28, SumToN.sumToN(7));
	}
	
	@Test
	void testSumToN_8() {
		assertEquals(36, SumToN.sumToN(8));
	}
	
	@Test
	void testSumToN_9() {
		assertEquals(45, SumToN.sumToN(9));
	}
	
	@Test
	void testSumToN_10() {
		assertEquals(55, SumToN.sumToN(10));
	}
}

// SumToN.java
package scenario3;

class SumToN {

    /**
     * sumToN is a function that sums numbers from 1 to n.
     *
     * > sumToN(5)
     * 15
     * > sumToN(10)
     * 55
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        int sum = 0;