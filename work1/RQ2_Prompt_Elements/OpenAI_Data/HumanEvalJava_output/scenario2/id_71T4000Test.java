// TriangleArea1Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea1}.
* It contains ten unit test cases for the {@link TriangleArea1#triangleArea(int, int, int)} method.
*/
class TriangleArea1Test {

	@Test
	void testTriangleArea1() {
		assertEquals(6.00, TriangleArea1.triangleArea(3, 4, 5));
	}
	
	@Test
	void testTriangleArea2() {
		assertEquals(6.00, TriangleArea1.triangleArea(3, 5, 4));
	}
	
	@Test
	void testTriangleArea3() {
		assertEquals(6.00, TriangleArea1.triangleArea(4, 3, 5));
	}
	
	@Test
	void testTriangleArea4() {
		assertEquals(6.00, TriangleArea1.triangleArea(4, 5, 3));
	}
	
	@Test
	void testTriangleArea5() {
		assertEquals(6.00, TriangleArea1.triangleArea(5, 3, 4));
	}
	
	@Test
	void testTriangleArea6() {
		assertEquals(6.00, TriangleArea1.triangleArea(5, 4, 3));
	}
	
	@Test
	void testTriangleArea7() {
		assertEquals(-1, TriangleArea1.triangleArea(1, 1, 3));
	}
	
	@Test
	void testTriangleArea8() {
		assertEquals(-1, TriangleArea1.triangleArea(1, 3, 1));
	}
	
	@Test
	void testTriangleArea9() {
		assertEquals(-1, TriangleArea1.triangleArea(3, 1, 1));
	}
	
	@Test
	void testTriangleArea10() {
		assertEquals(-1, TriangleArea1.triangleArea(0, 0, 0));
	}
}

// TriangleArea2.java
package scenario2;

class TriangleArea2 {

    /**
     * * Given the lengths of the three sides of a triangle. Return the area of
     * the triangle rounded to 2 decimal points if the three sides form a valid triangle.
     * Otherwise return -1
     * Three sides make a valid triangle when the sum of any two sides is greater
     * than the third side.
     */
    public static Number triangleArea(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return -1;
        }
        double p = (a + b + c) / 2.0;
        return Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)) * 100.0) / 100.0;
    }
}

// TriangleArea2Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea2}.
* It contains ten unit test cases for the {@link TriangleArea2#triangleArea(int, int, int)} method.
*/
class TriangleArea2Test {
		
	@Test
	void testTriangleArea1() {
		assertEquals(6.00, TriangleArea2.triangleArea(3, 4, 5));
	}
	
	@Test
	void testTriangleArea2() {
		assertEquals(6.00, TriangleArea2.triangleArea(3, 5, 4));
	}
	
	@Test
	void testTriangleArea3() {
		assertEquals(6.00, TriangleArea2.triangleArea(4, 3, 5));
	}
	
	@Test
	void testTriangleArea4() {
		assertEquals(6.00, TriangleArea2.triangleArea(4, 5, 3));
	}
	
	@Test
	void testTriangleArea5() {
		assertEquals(6.00, TriangleArea2.triangleArea(5, 3, 4));
	}
	
	@Test
	void testTriangleArea6() {
		assertEquals(6.00, TriangleArea2.triangleArea(5, 4, 3));
	}
	
	@Test
	void testTriangleArea7() {
		assertEquals(-1, TriangleArea2.triangleArea(1, 1, 3));
	}
	
	@Test
	void testTriangleArea8() {
		assertEquals(-1, TriangleArea2.triangleArea(1, 3, 1));
	}
	
	@Test
	void testTriangleArea9() {
		assertEquals(-1, TriangleArea2.triangleArea(3, 1, 1));
	}
	
	@Test
	void testTriangleArea10() {
		assertEquals(-1, TriangleArea2.triangleArea(0, 0, 0));
	}
}

// TriangleArea3.java
package scenario2;

class TriangleArea3 {

    /**
     * * Given the lengths of the three sides of a triangle. Return the area of
     * the triangle rounded to 2 decimal points if the three sides form a valid triangle.
     * Otherwise return -1
     * Three sides make a valid triangle when the sum of any two sides is greater
     * than the third side.
     */
    public static Number triangleArea(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return -1;
        }
        double p = (a + b + c) / 2.0;
        return Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)) * 100.0) / 100.0;
    }
}

// TriangleArea3Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea3}.
* It contains ten unit test cases for the {@link TriangleArea3#triangleArea(int, int, int)} method.
*/
class TriangleArea3Test {
		
	@Test
	void testTriangleArea1() {
		assertEquals(6.00, TriangleArea3.triangleArea(3, 4, 5));
	}
	
	@Test
	void testTriangleArea2() {
		assertEquals(6.00, TriangleArea3.triangleArea(3, 5, 4));
	}
	
	@Test
	void testTriangleArea3() {
		assertEquals(6.00, TriangleArea3.triangleArea(4, 3, 5));
	}
	
	@Test
	void testTriangleArea4() {
		assertEquals(6.00, TriangleArea3.triangleArea(4, 5, 3));
	}
	
	@Test
	void testTriangleArea5() {
		assertEquals(6.00, TriangleArea3.triangleArea(5, 3, 4));
	}
	
	@Test
	void testTriangleArea6() {
		assertEquals(6.00, TriangleArea3.triangleArea(5, 4, 3));
	}
	
	@Test
	void testTriangleArea7() {
		assertEquals(-1, TriangleArea3.triangleArea(1, 1, 3));
	}
	
	@Test
	void testTriangleArea8() {
		assertEquals(-1, TriangleArea3.triangleArea(1, 3, 1));
	}
	
	@Test
	void testTriangleArea9() {
		assertEquals(-1, TriangleArea3.triangleArea(3, 1, 1));
	}
	
	@Test
	void testTriangleArea10() {
		assertEquals(-1, TriangleArea3.triangleArea(0, 0, 0));
	}
}

// TriangleArea4.java
package scenario2;

class TriangleArea4 {

    /**
     * * Given the lengths of the three sides of a triangle. Return the area of
     * the triangle rounded to 2 decimal points if the three sides form a valid triangle.
     * Otherwise return -1
     * Three sides make a valid triangle when the sum of any two sides is greater
     * than the third side.
     */
    public static Number triangleArea(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return -1;
        }
        double p = (a + b + c) / 2.0;
        return Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)) * 100.0) / 100.0;
    }
}

// TriangleArea4Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea4}.
* It contains ten unit test cases for the {@link TriangleArea4#triangleArea(int, int, int)} method.
*/
class TriangleArea4Test {
		
	@Test
	void testTriangleArea1() {
		assertEquals(6.00, TriangleArea4.triangleArea(3, 4, 5));
	}
	
	@Test
	void testTriangleArea2() {
		assertEquals(6.00, TriangleArea4.triangleArea(3, 5, 4));
	}
	
	@Test
	void testTriangleArea3() {
		assertEquals(6.00, TriangleArea4.triangleArea(4, 3, 5));
	}
	
	@Test
	void testTriangleArea4() {
		assertEquals(6.00, TriangleArea4.triangleArea(4, 5, 3));
	}
	
	@Test
	void testTriangleArea5() {
		assertEquals(6.00, TriangleArea4.triangleArea(5, 3, 4));
	}
	
	@Test
	void testTriangleArea6() {
		assertEquals(6.00, TriangleArea4.triangleArea(5, 4, 3));
	}
	
	@Test
	void testTriangleArea7() {
		assertEquals(-1, TriangleArea4.triangleArea(1, 1, 3));
	}
	
	@Test
	void testTriangleArea8() {
		assertEquals(-1, TriangleArea4.triangleArea(1, 3, 1));
	}
	
	@Test
	void testTriangleArea9() {
		assertEquals(-1, TriangleArea4.triangleArea(3, 1, 1));
	}
	
	@Test
	void testTriangleArea10() {
		assertEquals(-1, TriangleArea4.triangleArea(0, 0, 0));
	}
}

// TriangleArea5.java
package scenario2;

class TriangleArea5 {

    /**
     * * Given the lengths of the three sides of a triangle. Return the area of
     * the triangle rounded to 2 decimal points if the three sides form a valid triangle.
     * Otherwise return -1
     * Three sides make a valid triangle when the sum of any two sides is greater
     * than the third side.
     */
    public static Number triangleArea(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return -1;
        }
        double p = (a + b + c) / 2.0;
        return Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)) * 100.0) / 100.0;
    }
}

// TriangleArea5Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea5}.
* It contains ten unit test cases for the {@link TriangleArea5#triangleArea(int, int, int)} method.
*/
class TriangleArea5Test {
		
	@Test
	void testTriangleArea1() {
		assertEquals(6.00, TriangleArea5.triangleArea(3, 4, 5));
	}
	
	@Test
	void testTriangleArea2() {
		assertEquals(6.00, TriangleArea5.triangleArea(3, 5, 4));
	}
	
	@Test
	void testTriangleArea3() {
		assertEquals(6.00, TriangleArea5.triangleArea(4, 3, 5));
	}
	
	@Test
	void testTriangleArea4() {
		assertEquals(6.00, TriangleArea5.triangleArea(4, 5, 3));
	}
	
	@Test
	void testTriangleArea5() {
		assertEquals(6.00, TriangleArea5.triangleArea(5, 3, 4));
	}
	
	@Test
	void testTriangleArea6() {
		assertEquals(6.00, TriangleArea5.triangleArea(5, 4, 3));
	}
	
	@Test
	void testTriangleArea7() {
		assertEquals(-1, TriangleArea5.triangleArea(1, 1, 3));
	}
	
	@Test
	void testTriangleArea8() {
		assertEquals(-1, TriangleArea5.triangleArea(1, 3, 1));
	}
	
	@Test
	void testTriangleArea9() {
		assertEquals(-1, TriangleArea5.triangleArea(3, 1, 1));
	}
	
	@Test
	void testTriangleArea10() {
		assertEquals(-1, TriangleArea5.triangleArea(0, 0, 0));
	}
}

// TriangleArea6.java
package scenario2;

class TriangleArea6 {

    /**
     * * Given the lengths of the three sides of a triangle. Return the area of
     * the triangle rounded to 2 decimal points if the three sides form a valid triangle.
     * Otherwise return -1
     * Three sides make a valid triangle when the sum of any two sides is greater
     * than the third side.
     */
    public static Number triangleArea(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return -1;
        }
        double p = (a + b + c) / 2.0;
        return Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)) * 100.0) / 100.0;
    }
}

// TriangleArea6Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea6}.
* It contains ten unit test cases for the {@link TriangleArea6#triangleArea(int, int, int)} method.
*/
class TriangleArea6Test {
		
	@Test
	void testTriangleArea1() {
		assertEquals(6.00, TriangleArea6.triangleArea(3, 4, 5));
	}
	
	@Test
	void testTriangleArea2() {
		assertEquals(6.00, TriangleArea6.triangleArea(3, 5, 4));
	}
	
	@Test
	void testTriangleArea3() {
		assertEquals(6.00, TriangleArea6.triangleArea(4, 3, 5));
	}
	
	@Test
	void testTriangleArea4() {
		assertEquals(6.00, TriangleArea6.triangleArea(4, 5, 3));
	}
	
	@Test
	void testTriangleArea5() {
		assertEquals(6.00, TriangleArea6.triangleArea(5, 3, 4));
	}
	
	@Test
	void testTriangleArea6() {
		assertEquals(6.00, TriangleArea6.triangleArea(5, 4, 3));
	}
	
	@Test
	void testTriangleArea