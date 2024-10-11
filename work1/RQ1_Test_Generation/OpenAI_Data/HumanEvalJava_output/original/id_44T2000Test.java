// ChangeBaseTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeBase}.
* It contains ten unit test cases for the {@link ChangeBase#changeBase(int, int)} method.
*/
class ChangeBaseTest {
	/**
			* Test case for {@link ChangeBase#changeBase(int, int)}.
			* It tests the conversion of 8 to base 3.
			*/
			@Test
			void testChangeBase1() {
				String result = ChangeBase.changeBase(8, 3);
				assertEquals("22", result);
			}
			
			/**
			* Test case for {@link ChangeBase#changeBase(int, int)}.
			* It tests the conversion of 8 to base 2.
			*/
			@Test
			void testChangeBase2() {
				String result = ChangeBase.changeBase(8, 2);
				assertEquals("1000", result);
			}
			
			/**
			* Test case for {@link ChangeBase#changeBase(int, int)}.
			* It tests the conversion of 7 to base 2.
			*/
			@Test
			void testChangeBase3() {
				String result = ChangeBase.changeBase(7, 2);
				assertEquals("111", result);
			}
			
			/**
			* Test case for {@link ChangeBase#changeBase(int, int)}.
			* It tests the conversion of 8 to base 3.
			*/
			@Test
			void testChangeBase4() {
				String result = ChangeBase.changeBase(8, 3);
				assertEquals("22", result);
			}
			
			/**
			* Test case for {@link ChangeBase#changeBase(int, int)}.
			* It tests the conversion of 9 to base 3.
			*/
			@Test
			void testChangeBase5() {
				String result = ChangeBase.changeBase(9, 3);
				assertEquals("100", result);
			}
			
			/**
			* Test case for {@link ChangeBase#changeBase(int, int)}.
			* It tests the conversion of 234 to base 2.
			*/
			@Test
			void testChangeBase6() {
				String result = ChangeBase.changeBase(234, 2);
				assertEquals("11101010", result);
			}
			
			/**
			* Test case for {@link ChangeBase#changeBase(int, int)}.
			* It tests the conversion of 16 to base 2.
			*/
			@Test
			void testChangeBase7() {
				String result = ChangeBase.changeBase(16, 2);
				assertEquals("10000", result);
			}
			
			/**
			* Test case for {@link ChangeBase#changeBase(int, int)}.
			* It tests the conversion of 8 to base 2.
			*/
			@Test
			void testChangeBase8() {
				String result = ChangeBase.changeBase(8, 2);
				assertEquals("1000", result);
			}
			
			/**
			* Test case for {@link ChangeBase#changeBase(int, int)}.
			* It tests the conversion of 7 to base 2.
			*/
			@Test
			void testChangeBase9() {
				String result = ChangeBase.changeBase(7, 2);
				assertEquals("111", result);
			}
			
			/**
			* Test case for {@link ChangeBase#changeBase(int, int)}.
			* It tests the conversion of 2 to base 3.
			*/
			@Test
			void testChangeBase10() {
				String result = ChangeBase.changeBase(2, 3);
				assertEquals("2", result);
			}
			
			/**
			* Test case for {@link ChangeBase#changeBase(int, int)}.
			* It tests the conversion of 3 to base 4.
			*/
			@Test
			void testChangeBase11() {
				String result = ChangeBase.changeBase(3, 4);
				assertEquals("3", result);
			}
			
			/**
			* Test case for {@link ChangeBase#changeBase(int, int)}.
			* It tests the conversion of 4 to base 5.
			*/
			@Test
			void testChangeBase12() {
				String result = ChangeBase.changeBase(4, 5);
				assertEquals("4", result);
			}
			
			/**
			* Test case for {@link ChangeBase#changeBase(int, int)}.
			* It tests the conversion of 5 to base 6.
			*/
			@Test
			void testChangeBase13() {
				String result = ChangeBase.changeBase(5, 6);
				assertEquals("5", result);
			}
			
			/**
			* Test case for {@link ChangeBase#changeBase(int, int)}.
			* It tests the conversion of 6 to base 7.
			*/
			@Test
			void testChangeBase14() {
				String result = ChangeBase.changeBase(6, 7);
				assertEquals("6", result);
			}
			
			/**
			* Test case for {@link ChangeBase#changeBase(int, int)}.
			* It tests the conversion of 7 to base 8.
			*/
			@Test
			void testChangeBase15() {
				String result = ChangeBase.changeBase(7, 8);
				assertEquals("7", result);
			}
}