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
				Calcolatrice_1 calcolatrice = new Calcolatrice_1();
				assertEquals("2", calcolatrice.subtract(5, 3));
			}
			
			@Test
			void testSubtract2() {
				Calcolatrice_1 calcolatrice = new Calcolatrice_1();
				assertEquals("-2", calcolatrice.subtract(3, 5));
			}
			
			@Test
			void testSubtract3() {
				Calcolatrice_1 calcolatrice = new Calcolatrice_1();
				assertEquals("3", calcolatrice.subtract(3, 0));
			}
			
			@Test
			void testSubtract4() {
				Calcolatrice_1 calcolatrice = new Calcolatrice_1();
				assertEquals("-3", calcolatrice.subtract(0, 3));
			}
			
			@Test
			void testSubtract5() {
				Calcolatrice_1 calcolatrice = new Calcolatrice_1();
				assertEquals("-3", calcolatrice.subtract(-2, 1));
			}
			
			@Test
			void testSubtract6() {
				Calcolatrice_1 calcolatrice = new Calcolatrice_1();
				assertEquals("-3", calcolatrice.subtract(-1, 2));
			}
			
			@Test
			void testSubtract7() {
				Calcolatrice_1 calcolatrice = new Calcolatrice_1();
				assertEquals("3", calcolatrice.subtract(2, -1));
			}
			
			@Test
			void testSubtract8() {
				Calcolatrice_1 calcolatrice = new Calcolatrice_1();
				assertEquals("3", calcolatrice.subtract(1, -2));
			}
			
			@Test
			void testSubtract9() {
				Calcolatrice_1 calcolatrice = new Calcolatrice_1();
				assertEquals("2", calcolatrice.subtract(-3, -5));
			}
			
			@Test
			void testSubtract10() {
				Calcolatrice_1 calcolatrice = new Calcolatrice_1();
				assertEquals("-2", calcolatrice.subtract(-5, -3));
			}
			
			@Test
			void testSubtract11() {
				Calcolatrice_1 calcolatrice = new Calcolatrice_1();
				assertEquals("0", calcolatrice.subtract(5, 5));
			}
			
			@Test
			void testSubtract12() {
				Calcolatrice_1 calcolatrice = new Calcolatrice_1();
				assertEquals("0", calcolatrice.subtract(0, 0));
			}
}