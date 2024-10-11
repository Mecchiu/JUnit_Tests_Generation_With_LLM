// Calcolatrice_4Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Calcolatrice}.
* It contains ten unit test cases for the {@link Calcolatrice#factorial(int)} method.
*/
class Calcolatrice_4Test {
	@Test
			void testFactorial() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals(120, calcolatrice.factorial(5));
				assertEquals(40320, calcolatrice.factorial(8));
				assertEquals(2, calcolatrice.factorial(2));
				assertEquals(6, calcolatrice.factorial(3));
				assertEquals(1, calcolatrice.factorial(1));
				assertEquals(1, calcolatrice.factorial(0));
				assertThrows(IllegalArgumentException.class, () -> calcolatrice.factorial(-5));
				assertThrows(IllegalArgumentException.class, () -> calcolatrice.factorial(-1));
			}
}
