// Calcolatrice_0Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Calcolatrice}.
* It contains ten unit test cases for the {@link Calcolatrice#add(int, int)} method.
*/
class Calcolatrice_0Test {
	@Test
			void testAdd() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(5, calcolatrice.add(2, 3));
			}

			@Test
			void testAddNegative() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(-5, calcolatrice.add(-2, -3));
			}

			@Test
			void testAddZero() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(0, calcolatrice.add(0, 0));
			}

			@Test
			void testAddPositiveNegative() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(-1, calcolatrice.add(2, -3));
			}

			@Test
			void testAddPositiveZero() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(2, calcolatrice.add(2, 0));
			}

			@Test
			void testAddNegativeZero() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(-2, calcolatrice.add(-2, 0));
			}

			@Test
			void testAddMaxValue() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(Integer.MAX_VALUE, calcolatrice.add(Integer.MAX_VALUE, 0));
			}

			@Test
			void testAddMinValue() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(Integer.MIN_VALUE, calcolatrice.add(Integer.MIN_VALUE, 0));
			}

			@Test
			void testAddMaxValueNegative() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(Integer.MAX_VALUE - 1, calcolatrice.add(Integer.MAX_VALUE, -1));
			}

			@Test
			void testAddMinValuePositive() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(Integer.MIN_VALUE + 1, calcolatrice.add(Integer.MIN_VALUE, 1));
			}
		}