// Solve1Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains ten unit test cases for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {

	@Test
	void testSolve1() {
		assertEquals("11", Solve1.solve(1));
	}
	
	@Test
	void testSolve2() {
		assertEquals("11", Solve1.solve(2));
	}
	
	@Test
	void testSolve3() {
		assertEquals("11", Solve1.solve(3));
	}
	
	@Test
	void testSolve4() {
		assertEquals("100", Solve1.solve(4));
	}
	
	@Test
	void testSolve5() {
		assertEquals("101", Solve1.solve(5));
	}
	
	@Test
	void testSolve6() {
		assertEquals("110", Solve1.solve(6));
	}
	
	@Test
	void testSolve7() {
		assertEquals("111", Solve1.solve(7));
	}
	
	@Test
	void testSolve8() {
		assertEquals("1000", Solve1.solve(8));
	}
	
	@Test
	void testSolve9() {
		assertEquals("1001", Solve1.solve(9));
	}
	
	@Test
	void testSolve10() {
		assertEquals("1010", Solve1.solve(10));
	}
}

// Solve2.java
package scenario2;

class Solve2 {

    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve2Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve2}.
* It contains ten unit test cases for the {@link Solve2#solve(int)} method.
*/
class Solve2Test {
		
	@Test
	void testSolve1() {
		assertEquals("11", Solve2.solve(1));
	}
	
	@Test
	void testSolve2() {
		assertEquals("11", Solve2.solve(2));
	}
	
	@Test
	void testSolve3() {
		assertEquals("11", Solve2.solve(3));
	}
	
	@Test
	void testSolve4() {
		assertEquals("100", Solve2.solve(4));
	}
	
	@Test
	void testSolve5() {
		assertEquals("101", Solve2.solve(5));
	}
	
	@Test
	void testSolve6() {
		assertEquals("110", Solve2.solve(6));
	}
	
	@Test
	void testSolve7() {
		assertEquals("111", Solve2.solve(7));
	}
	
	@Test
	void testSolve8() {
		assertEquals("1000", Solve2.solve(8));
	}
	
	@Test
	void testSolve9() {
		assertEquals("1001", Solve2.solve(9));
	}
	
	@Test
	void testSolve10() {
		assertEquals("1010", Solve2.solve(10));
	}
}

// Solve3.java
package scenario3;

class Solve3 {

    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve3Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve3}.
* It contains ten unit test cases for the {@link Solve3#solve(int)} method.
*/
class Solve3Test {
		
	@Test
	void testSolve1() {
		assertEquals("11", Solve3.solve(1));
	}
	
	@Test
	void testSolve2() {
		assertEquals("11", Solve3.solve(2));
	}
	
	@Test
	void testSolve3() {
		assertEquals("11", Solve3.solve(3));
	}
	
	@Test
	void testSolve4() {
		assertEquals("100", Solve3.solve(4));
	}
	
	@Test
	void testSolve5() {
		assertEquals("101", Solve3.solve(5));
	}
	
	@Test
	void testSolve6() {
		assertEquals("110", Solve3.solve(6));
	}
	
	@Test
	void testSolve7() {
		assertEquals("111", Solve3.solve(7));
	}
	
	@Test
	void testSolve8() {
		assertEquals("1000", Solve3.solve(8));
	}
	
	@Test
	void testSolve9() {
		assertEquals("1001", Solve3.solve(9));
	}
	
	@Test
	void testSolve10() {
		assertEquals("1010", Solve3.solve(10));
	}
}

// Solve4.java
package scenario4;

class Solve4 {

    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve4Test.java
package scenario4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve4}.
* It contains ten unit test cases for the {@link Solve4#solve(int)} method.
*/
class Solve4Test {
		
	@Test
	void testSolve1() {
		assertEquals("11", Solve4.solve(1));
	}
	
	@Test
	void testSolve2() {
		assertEquals("11", Solve4.solve(2));
	}
	
	@Test
	void testSolve3() {
		assertEquals("11", Solve4.solve(3));
	}
	
	@Test
	void testSolve4() {
		assertEquals("100", Solve4.solve(4));
	}
	
	@Test
	void testSolve5() {
		assertEquals("101", Solve4.solve(5));
	}
	
	@Test
	void testSolve6() {
		assertEquals("110", Solve4.solve(6));
	}
	
	@Test
	void testSolve7() {
		assertEquals("111", Solve4.solve(7));
	}
	
	@Test
	void testSolve8() {
		assertEquals("1000", Solve4.solve(8));
	}
	
	@Test
	void testSolve9() {
		assertEquals("1001", Solve4.solve(9));
	}
	
	@Test
	void testSolve10() {
		assertEquals("1010", Solve4.solve(10));
	}
}

// Solve5.java
package scenario5;

class Solve5 {

    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve5Test.java
package scenario5;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve5}.
* It contains ten unit test cases for the {@link Solve5#solve(int)} method.
*/
class Solve5Test {
		
	@Test
	void testSolve1() {
		assertEquals("11", Solve5.solve(1));
	}
	
	@Test
	void testSolve2() {
		assertEquals("11", Solve5.solve(2));
	}
	
	@Test
	void testSolve3() {
		assertEquals("11", Solve5.solve(3));
	}
	
	@Test
	void testSolve4() {
		assertEquals("100", Solve5.solve(4));
	}
	
	@Test
	void testSolve5() {
		assertEquals("101", Solve5.solve(5));
	}
	
	@Test
	void testSolve6() {
		assertEquals("110", Solve5.solve(6));
	}
	
	@Test
	void testSolve7() {
		assertEquals("111", Solve5.solve(7));
	}
	
	@Test
	void testSolve8() {
		assertEquals("1000", Solve5.solve(8));
	}
	
	@Test
	void testSolve9() {
		assertEquals("1001", Solve5.solve(9));
	}
	
	@Test
	void testSolve10() {
		assertEquals("1010", Solve5.solve(10));
	}
}

// Solve6.java
package scenario6;

class Solve6 {

    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve6Test.java
package scenario6;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve6}.
* It contains ten unit test cases for the {@link Solve6#solve(int)} method.
*/
class Solve6Test {
		
	@Test
	void testSolve1() {
		assertEquals("11", Solve6.solve(1));
	}
	
	@Test
	void testSolve2() {
		assertEquals("11", Solve6.solve(2));
	}
	
	@Test
	void testSolve3() {
		assertEquals("11", Solve6.solve(3));
	}
	
	@Test
	void testSolve4() {
		assertEquals("100", Solve6.solve(4));
	}
	
	@Test
	void testSolve5() {
		assertEquals("101", Solve6.solve(5));
	}
	
	@Test
	void testSolve6() {
		assertEquals("110", Solve6.solve(6));
	}
	
	@Test
	void testSolve7() {
		assertEquals("111", Solve6.solve(7));
	}
	
	@Test
	void testSolve8() {
		assertEquals("1000", Solve6.solve(8));
	}
	
	@Test
	void testSolve9() {
		assertEquals("1001", Solve6.solve(9));
	}
	
	@Test
	void testSolve10() {
		assertEquals("1010", Solve6.solve(10));
	}
}

// Solve7.java
package scenario7;

class Solve7 {

    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve7Test.java
package scenario7;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve7}.
* It contains ten unit test cases for the {@link Solve7#solve(int)} method.
*/
class Solve7Test {
		
	@Test
	void testSolve1() {
		assertEquals("11", Solve7.solve(1));
	}
	
	@Test
	void testSolve2() {
		assertEquals("11", Solve7.solve(2));
	}
	
	@Test
	void testSolve3() {
		assertEquals("11", Solve7.solve(3));
	}
	
	@Test
	void testSolve4() {
		assertEquals("100", Solve7.solve(4));
	}
	
	@Test
	void testSolve5() {
		assertEquals("101", Solve7.solve(5));
	}
	
	@Test
	void testSolve6() {
		assertEquals("110", Solve7.solve(6));
	}
	
	@Test
	void testSolve7() {
		assertEquals("111", Solve7.solve(7));
	}
	
	@Test
	void testSolve8() {
		assertEquals("1000", Solve7.solve(8));
	}
	
	@Test
	void testSolve9() {
		assertEquals("1001", Solve7.solve(9));
	}
	
	@Test
	void testSolve10() {
		assertEquals("1010", Solve7.solve(10));
	}
}

// Solve8.java
package scenario8;

class Solve8 {

    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve8Test.java
package scenario8;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve8}.
* It contains ten unit test cases for the {@link Solve8#solve(int)} method.
*/
class Solve8Test {
		
	@Test
	void testSolve1() {
		assertEquals("11", Solve8.solve(1));
	}
	
	@Test
	void testSolve2() {
		assertEquals("11", Solve8.solve(2));
	}
	
	@Test
	void testSolve3() {
		assertEquals("11", Solve8.solve(3));
	}
	
	@Test
	void testSolve4() {
		assertEquals("100", Solve8.solve(4));
	}
	
	@Test
	void testSolve5() {
		assertEquals("101", Solve8.solve(5));
	}
	
	@Test
	void testSolve6() {
		assertEquals("110", Solve8.solve(6));
	