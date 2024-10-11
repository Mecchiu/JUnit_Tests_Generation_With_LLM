// AddTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add}.
* It contains ten unit test cases for the {@link Add#add(int, int)} method.
*/
class AddTest {

		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are positive.
		*/
		@Test
		void testAddPositivePositive() {
				assertEquals(5, Add.add(2, 3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is negative.
		*/
		@Test
		void testAddNegativePositive() {
				assertEquals(-1, Add.add(-2, 1));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is negative.
		*/
		@Test
		void testAddPositiveNegative() {
				assertEquals(-1, Add.add(2, -3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are negative.
		*/
		@Test
		void testAddNegativeNegative() {
				assertEquals(-5, Add.add(-2, -3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are zero.
		*/
		@Test
		void testAddZeroZero() {
				assertEquals(0, Add.add(0, 0));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero.
		*/
		@Test
		void testAddZeroPositive() {
				assertEquals(3, Add.add(0, 3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is zero.
		*/
		@Test
		void testAddPositiveZero() {
				assertEquals(3, Add.add(3, 0));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero.
		*/
		@Test
		void testAddZeroNegative() {
				assertEquals(-3, Add.add(0, -3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is zero.
		*/
		@Test
		void testAddNegativeZero() {
				assertEquals(-3, Add.add(-3, 0));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are the maximum integer value.
		*/
		@Test
		void testAddMaxMax() {
				assertEquals(-2, Add.add(Integer.MAX_VALUE, Integer.MAX_VALUE));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are the minimum integer value.
		*/
		@Test
		void testAddMinMin() {
				assertEquals(0, Add.add(Integer.MIN_VALUE, Integer.MIN_VALUE));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the maximum integer value.
		*/
		@Test
		void testAddMaxPositive() {
				assertEquals(-2147483648, Add.add(Integer.MAX_VALUE, 1));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is the maximum integer value.
		*/
		@Test
		void testAddPositiveMax() {
				assertEquals(-2147483648, Add.add(1, Integer.MAX_VALUE));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the minimum integer value.
		*/
		@Test
		void testAddMinPositive() {
				assertEquals(-2147483647, Add.add(Integer.MIN_VALUE, 1));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is the minimum integer value.
		*/
		@Test
		void testAddPositiveMin() {
				assertEquals(-2147483647, Add.add(1, Integer.MIN_VALUE));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the maximum integer value.
		*/
		@Test
		void testAddMaxNegative() {
				assertEquals(2147483647, Add.add(Integer.MAX_VALUE, -1));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is the maximum integer value.
		*/
		@Test
		void testAddNegativeMax() {
				assertEquals(2147483647, Add.add(-1, Integer.MAX_VALUE));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the minimum integer value.
		*/
		@Test
		void testAddMinNegative() {
				assertEquals(2147483646, Add.add(Integer.MIN_VALUE, -1));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is the minimum integer value.
		*/
		@Test
		void testAddNegativeMin() {
				assertEquals(2147483646, Add.add(-1, Integer.MIN_VALUE));
		}
}

// Sub.java
package scenario2;

class Sub {

    public static int sub(int x, int y) {
        return x - y;
    }
}

// SubTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Sub}.
* It contains ten unit test cases for the {@link Sub#sub(int, int)} method.
*/
class SubTest {
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are positive.
		*/
		@Test
		void testSubPositivePositive() {
				assertEquals(-1, Sub.sub(2, 3));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is negative.
		*/
		@Test
		void testSubNegativePositive() {
				assertEquals(-3, Sub.sub(-2, 1));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is negative.
		*/
		@Test
		void testSubPositiveNegative() {
				assertEquals(5, Sub.sub(2, -3));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are negative.
		*/
		@Test
		void testSubNegativeNegative() {
				assertEquals(1, Sub.sub(-2, -3));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are zero.
		*/
		@Test
		void testSubZeroZero() {
				assertEquals(0, Sub.sub(0, 0));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero.
		*/
		@Test
		void testSubZeroPositive() {
				assertEquals(-3, Sub.sub(0, 3));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is zero.
		*/
		@Test
		void testSubPositiveZero() {
				assertEquals(3, Sub.sub(3, 0));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero.
		*/
		@Test
		void testSubZeroNegative() {
				assertEquals(3, Sub.sub(0, -3));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is zero.
		*/
		@Test
		void testSubNegativeZero() {
				assertEquals(-3, Sub.sub(-3, 0));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are the maximum integer value.
		*/
		@Test
		void testSubMaxMax() {
				assertEquals(0, Sub.sub(Integer.MAX_VALUE, Integer.MAX_VALUE));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are the minimum integer value.
		*/
		@Test
		void testSubMinMin() {
				assertEquals(0, Sub.sub(Integer.MIN_VALUE, Integer.MIN_VALUE));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the maximum integer value.
		*/
		@Test
		void testSubMaxPositive() {
				assertEquals(2147483646, Sub.sub(Integer.MAX_VALUE, 1));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is the maximum integer value.
		*/
		@Test
		void testSubPositiveMax() {
				assertEquals(-2147483648, Sub.sub(1, Integer.MAX_VALUE));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the minimum integer value.
		*/
		@Test
		void testSubMinPositive() {
				assertEquals(-2147483648, Sub.sub(Integer.MIN_VALUE, 1));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is the minimum integer value.
		*/
		@Test
		void testSubPositiveMin() {
				assertEquals(2147483647, Sub.sub(1, Integer.MIN_VALUE));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the maximum integer value.
		*/
		@Test
		void testSubMaxNegative() {
				assertEquals(2147483647, Sub.sub(Integer.MAX_VALUE, -1));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is the maximum integer value.
		*/
		@Test
		void testSubNegativeMax() {
				assertEquals(-2147483647, Sub.sub(-1, Integer.MAX_VALUE));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the minimum integer value.
		*/
		@Test
		void testSubMinNegative() {
				assertEquals(-2147483647, Sub.sub(Integer.MIN_VALUE, -1));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the second parameter is the minimum integer value.
		*/
		@Test
		void testSubNegativeMin() {
				assertEquals(2147483646, Sub.sub(-1, Integer.MIN_VALUE));
		}
}

// Mul.java
package scenario3;

class Mul {

    public static int mul(int x, int y) {
        return x * y;
    }
}

// MulTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Mul}.
* It contains ten unit test cases for the {@link Mul#mul(int, int)} method.
*/
class MulTest {
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are positive.
		*/
		@Test
		void testMulPositivePositive() {
				assertEquals(6, Mul.mul(