// Calcolatrice_2Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Calcolatrice}.
* It contains ten unit test cases for the {@link Calcolatrice#multiply(int, int)} method.
*/
class Calcolatrice_2Test {
	@Test
			void testMultiply1() {
				Calcolatrice_2 calcolatrice = new Calcolatrice_2();
				assertEquals(6, calcolatrice.multiply(2, 3));
			}
			
			@Test
			void testMultiply2() {
				Calcolatrice_2 calcolatrice = new Calcolatrice_2();
				assertEquals(6, calcolatrice.multiply(3, 2));
			}
			
			@Test
			void testMultiply3() {
				Calcolatrice_2 calcolatrice = new Calcolatrice_2();
				assertEquals(0, calcolatrice.multiply(2, 0));
			}
			
			@Test
			void testMultiply4() {
				Calcolatrice_2 calcolatrice = new Calcolatrice_2();
				assertEquals(0, calcolatrice.multiply(0, 2));
			}
			
			@Test
			void testMultiply5() {
				Calcolatrice_2 calcolatrice = new Calcolatrice_2();
				assertEquals(-8, calcolatrice.multiply(2, -4));
			}
			
			@Test
			void testMultiply6() {
				Calcolatrice_2 calcolatrice = new Calcolatrice_2();
				assertEquals(-8, calcolatrice.multiply(4, -2));
			}
			
			@Test
			void testMultiply7() {
				Calcolatrice_2 calcolatrice = new Calcolatrice_2();
				assertEquals(-15, calcolatrice.multiply(-3, 5));
			}
			
			@Test
			void testMultiply8() {
				Calcolatrice_2 calcolatrice = new Calcolatrice_2();
				assertEquals(-15, calcolatrice.multiply(-5, 3));
			}
			
			@Test
			void testMultiply9() {
				Calcolatrice_2 calcolatrice = new Calcolatrice_2();
				assertEquals(12, calcolatrice.multiply(-4, -3));
			}
			
			@Test
			void testMultiply10() {
				Calcolatrice_2 calcolatrice = new Calcolatrice_2();
				assertEquals(12, calcolatrice.multiply(-3, -4));
			}
}
