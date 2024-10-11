// Calcolatrice_0Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Calcolatrice}.
* It contains ten unit test cases for the {@link Calcolatrice#add(int, int)} method.
*/
class Calcolatrice_0Test {
	@Test
			void testAdd1() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals("3", calcolatrice.add(1, 2));
			}

			@Test
			void testAdd2() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals("3", calcolatrice.add(2, 1));
			}

			@Test
			void testAdd3() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals("18", calcolatrice.add(20, -2));
			}

			@Test
			void testAdd4() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals("-1", calcolatrice.add(2, -3));
			}

			@Test
			void testAdd5() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals("1", calcolatrice.add(-2, 3));
			}

			@Test
			void testAdd6() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals("-18", calcolatrice.add(-20, 2));
			}

			@Test
			void testAdd7() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals("-3", calcolatrice.add(-1, -2));
			}

			@Test
			void testAdd8() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals("-3", calcolatrice.add(-2, -1));
			}

			@Test
			void testAdd9() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals("1", calcolatrice.add(1, 0));
			}

			@Test
			void testAdd10() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals("1", calcolatrice.add(0, 1));
			}

			@Test
			void testAdd11() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals("0", calcolatrice.add(0, 0));
			}

			@Test
			void testAdd12() {
				Calcolatrice calcolatrice = new Calcolatrice();
				assertEquals("0", calcolatrice.add(1, -1));
			}
}