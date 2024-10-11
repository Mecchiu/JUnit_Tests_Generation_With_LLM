// Calcolatrice_0Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Calcolatrice}.
* It contains ten unit test cases for the {@link Calcolatrice#add(int, int)} method.
*/
class Calcolatrice_0Test {
	// Test case #1
			@Test
			void testAdd1() {
				Calcolatrice calc = new Calcolatrice();
				int result = calc.add(1, 1);
				assertEquals(2, result);
			}

			// Test case #2
			@Test
			void testAdd2() {
				Calcolatrice calc = new Calcolatrice();
				int result = calc.add(0, 0);
				assertEquals(0, result);
			}

			// Test case #3
			@Test
			void testAdd3() {
				Calcolatrice calc = new Calcolatrice();
				int result = calc.add(-1, -1);
				assertEquals(-2, result);
			}

			// Test case #4
			@Test
			void testAdd4() {
				Calcolatrice calc = new Calcolatrice();
				int result = calc.add(1, -1);
				assertEquals(0, result);
			}

			// Test case #5
			@Test
			void testAdd5() {
				Calcolatrice calc = new Calcolatrice();
				int result = calc.add(-1, 1);
				assertEquals(0, result);
			}

			// Test case #6
			@Test
			void testAdd6() {
				Calcolatrice calc = new Calcolatrice();
				int result = calc.add(0, 1);
				assertEquals(1, result);
			}

			// Test case #7
			@Test
			void testAdd7() {
				Calcolatrice calc = new Calcolatrice();
				int result = calc.add(1, 0);
				assertEquals(1, result);
			}

			// Test case #8
			@Test
			void testAdd8() {
				Calcolatrice calc = new Calcolatrice();
				int result = calc.add(0, -1);
				assertEquals(-1, result);
			}

			// Test case #9
			@Test
			void testAdd9() {
				Calcolatrice calc = new Calcolatrice();
				int result = calc.add(-1, 0);
				assertEquals(-1, result);
			}

			// Test case #10
			@Test
			void testAdd10() {
				Calcolatrice calc = new Calcolatrice();
				int result = calc.add(-1, 1);
				assertEquals(0, result);
			}
}