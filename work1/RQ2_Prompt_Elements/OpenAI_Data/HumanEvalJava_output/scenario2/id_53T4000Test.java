// AddTest.java
package scenario2;


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
		void testAddPositive() {
				assertEquals(5, Add.add(2, 3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are negative.
		*/
		@Test
		void testAddNegative() {
				assertEquals(-5, Add.add(-2, -3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is positive and the second is negative.
		*/
		@Test
		void testAddPositiveNegative() {
				assertEquals(-1, Add.add(2, -3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is negative and the second is positive.
		*/
		@Test
		void testAddNegativePositive() {
				assertEquals(1, Add.add(-2, 3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero and the second is positive.
		*/
		@Test
		void testAddZeroPositive() {
				assertEquals(3, Add.add(0, 3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero and the second is negative.
		*/
		@Test
		void testAddZeroNegative() {
				assertEquals(-3, Add.add(0, -3));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is positive and the second is zero.
		*/
		@Test
		void testAddPositiveZero() {
				assertEquals(3, Add.add(3, 0));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is negative and the second is zero.
		*/
		@Test
		void testAddNegativeZero() {
				assertEquals(-3, Add.add(-3, 0));
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
		* It checks if the method returns the correct value when the first parameter is the maximum integer value and the second is the minimum integer value.
		*/
		@Test
		void testAddMaxMin() {
				assertEquals(-1, Add.add(Integer.MAX_VALUE, Integer.MIN_VALUE));
		}
		
		/**
		* Test case for {@link Add#add(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the minimum integer value and the second is the maximum integer value.
		*/
		@Test
		void testAddMinMax() {
				assertEquals(-1, Add.add(Integer.MIN_VALUE, Integer.MAX_VALUE));
		}
}

// Sub.java
package scenario2;

class Sub {

    /**
     * Subtract two numbers x and y
     */
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
		void testSubPositive() {
				assertEquals(-1, Sub.sub(2, 3));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are negative.
		*/
		@Test
		void testSubNegative() {
				assertEquals(1, Sub.sub(-2, -3));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is positive and the second is negative.
		*/
		@Test
		void testSubPositiveNegative() {
				assertEquals(5, Sub.sub(2, -3));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is negative and the second is positive.
		*/
		@Test
		void testSubNegativePositive() {
				assertEquals(-5, Sub.sub(-2, 3));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero and the second is positive.
		*/
		@Test
		void testSubZeroPositive() {
				assertEquals(-3, Sub.sub(0, 3));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero and the second is negative.
		*/
		@Test
		void testSubZeroNegative() {
				assertEquals(3, Sub.sub(0, -3));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is positive and the second is zero.
		*/
		@Test
		void testSubPositiveZero() {
				assertEquals(3, Sub.sub(3, 0));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is negative and the second is zero.
		*/
		@Test
		void testSubNegativeZero() {
				assertEquals(-3, Sub.sub(-3, 0));
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
		* It checks if the method returns the correct value when the first parameter is the maximum integer value and the second is the minimum integer value.
		*/
		@Test
		void testSubMaxMin() {
				assertEquals(-1, Sub.sub(Integer.MAX_VALUE, Integer.MIN_VALUE));
		}
		
		/**
		* Test case for {@link Sub#sub(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the minimum integer value and the second is the maximum integer value.
		*/
		@Test
		void testSubMinMax() {
				assertEquals(1, Sub.sub(Integer.MIN_VALUE, Integer.MAX_VALUE));
		}
}

// Mul.java
package scenario2;

class Mul {

    /**
     * Multiply two numbers x and y
     */
    public static int mul(int x, int y) {
        return x * y;
    }
}

// MulTest.java
package scenario2;


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
		void testMulPositive() {
				assertEquals(6, Mul.mul(2, 3));
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are negative.
		*/
		@Test
		void testMulNegative() {
				assertEquals(6, Mul.mul(-2, -3));
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is positive and the second is negative.
		*/
		@Test
		void testMulPositiveNegative() {
				assertEquals(-6, Mul.mul(2, -3));
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is negative and the second is positive.
		*/
		@Test
		void testMulNegativePositive() {
				assertEquals(-6, Mul.mul(-2, 3));
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero and the second is positive.
		*/
		@Test
		void testMulZeroPositive() {
				assertEquals(0, Mul.mul(0, 3));
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is zero and the second is negative.
		*/
		@Test
		void testMulZeroNegative() {
				assertEquals(0, Mul.mul(0, -3));
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is positive and the second is zero.
		*/
		@Test
		void testMulPositiveZero() {
				assertEquals(0, Mul.mul(3, 0));
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is negative and the second is zero.
		*/
		@Test
		void testMulNegativeZero() {
				assertEquals(0, Mul.mul(-3, 0));
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are zero.
		*/
		@Test
		void testMulZeroZero() {
				assertEquals(0, Mul.mul(0, 0));
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are the maximum integer value.
		*/
		@Test
		void testMulMaxMax() {
				assertEquals(1, Mul.mul(Integer.MAX_VALUE, Integer.MAX_VALUE));
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the two parameters are the minimum integer value.
		*/
		@Test
		void testMulMinMin() {
				assertEquals(1, Mul.mul(Integer.MIN_VALUE, Integer.MIN_VALUE));
		}
		
		/**
		* Test case for {@link Mul#mul(int, int)} method.
		* It checks if the method returns the correct value when the first parameter is the maximum integer value and the second is the minimum integer value.
		*/
		@Test
		void testMulMaxMin() {
				assertEquals(-1, Mul.mul(Integer.MAX_VALUE, Integer.MIN_VALUE));
		}
	