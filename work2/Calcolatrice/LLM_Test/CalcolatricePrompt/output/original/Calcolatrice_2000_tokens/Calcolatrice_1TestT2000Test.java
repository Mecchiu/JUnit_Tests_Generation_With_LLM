// Calcolatrice_1Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Calcolatrice}.
* It contains ten unit test cases for the {@link Calcolatrice#subtract(int, int)} method.
*/
class Calcolatrice_1Test {
	@Test
			void testSubtract1() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(2, calcolatrice.subtract(5, 3));
			}

			@Test
			void testSubtract2() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(-2, calcolatrice.subtract(3, 5));
			}

			@Test
			void testSubtract3() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(3, calcolatrice.subtract(3, 0));
			}

			@Test
			void testSubtract4() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(-3, calcolatrice.subtract(0, 3));
			}

			@Test
			void testSubtract5() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(-3, calcolatrice.subtract(-2, 1));
			}

			@Test
			void testSubtract6() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(-3, calcolatrice.subtract(-1, 2));
			}

			@Test
			void testSubtract7() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(3, calcolatrice.subtract(2, -1));
			}

			@Test
			void testSubtract8() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(3, calcolatrice.subtract(1, -2));
			}

			@Test
			void testSubtract9() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(2, calcolatrice.subtract(-3, -5));
			}

			@Test
			void testSubtract10() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(-2, calcolatrice.subtract(-5, -3));
			}
}
