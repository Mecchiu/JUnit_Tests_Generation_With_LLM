// Calcolatrice_2Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Calcolatrice}.
* It contains ten unit test cases for the {@link Calcolatrice#multiply(int, int)} method.
*/
class Calcolatrice_2Test {
	@Test
			void testMultiply() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(0, calcolatrice.multiply(0, 0));
			}

			@Test
			void testMultiply2() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(0, calcolatrice.multiply(0, 1));
			}

			@Test
			void testMultiply3() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(0, calcolatrice.multiply(1, 0));
			}

			@Test
			void testMultiply4() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(1, calcolatrice.multiply(1, 1));
			}

			@Test
			void testMultiply5() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(2, calcolatrice.multiply(1, 2));
			}

			@Test
			void testMultiply6() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(2, calcolatrice.multiply(2, 1));
			}

			@Test
			void testMultiply7() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(4, calcolatrice.multiply(2, 2));
			}

			@Test
			void testMultiply8() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(6, calcolatrice.multiply(2, 3));
			}

			@Test
			void testMultiply9() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(6, calcolatrice.multiply(3, 2));
			}

			@Test
			void testMultiply10() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(9, calcolatrice.multiply(3, 3));
			}
}