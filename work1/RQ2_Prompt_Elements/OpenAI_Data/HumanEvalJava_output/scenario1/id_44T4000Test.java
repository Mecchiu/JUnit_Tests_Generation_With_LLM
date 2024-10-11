// ChangeBaseTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeBase}.
* It contains ten unit test cases for the {@link ChangeBase#changeBase(int, int)} method.
*/
class ChangeBaseTest {

		/**
		* Test case 1.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 10</li>
		* <li>base = 2</li>
		* </ul>
		* The expected result is "1010".
		*/
		@Test
		void testCase1() {
				assertEquals("1010", ChangeBase.changeBase(10, 2));
		}
		
		/**
		* Test case 2.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 10</li>
		* <li>base = 3</li>
		* </ul>
		* The expected result is "101".
		*/
		@Test
		void testCase2() {
				assertEquals("101", ChangeBase.changeBase(10, 3));
		}
		
		/**
		* Test case 3.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 10</li>
		* <li>base = 4</li>
		* </ul>
		* The expected result is "22".
		*/
		@Test
		void testCase3() {
				assertEquals("22", ChangeBase.changeBase(10, 4));
		}
		
		/**
		* Test case 4.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 10</li>
		* <li>base = 5</li>
		* </ul>
		* The expected result is "20".
		*/
		@Test
		void testCase4() {
				assertEquals("20", ChangeBase.changeBase(10, 5));
		}
		
		/**
		* Test case 5.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 10</li>
		* <li>base = 6</li>
		* </ul>
		* The expected result is "14".
		*/
		@Test
		void testCase5() {
				assertEquals("14", ChangeBase.changeBase(10, 6));
		}
		
		/**
		* Test case 6.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 10</li>
		* <li>base = 7</li>
		* </ul>
		* The expected result is "13".
		*/
		@Test
		void testCase6() {
				assertEquals("13", ChangeBase.changeBase(10, 7));
		}
		
		/**
		* Test case 7.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 10</li>
		* <li>base = 8</li>
		* </ul>
		* The expected result is "12".
		*/
		@Test
		void testCase7() {
				assertEquals("12", ChangeBase.changeBase(10, 8));
		}
		
		/**
		* Test case 8.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 10</li>
		* <li>base = 9</li>
		* </ul>
		* The expected result is "11".
		*/
		@Test
		void testCase8() {
				assertEquals("11", ChangeBase.changeBase(10, 9));
		}
		
		/**
		* Test case 9.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 10</li>
		* <li>base = 10</li>
		* </ul>
		* The expected result is "10".
		*/
		@Test
		void testCase9() {
				assertEquals("10", ChangeBase.changeBase(10, 10));
		}
		
		/**
		* Test case 10.
		* The method {@link ChangeBase#changeBase(int, int)} is tested with the following parameters:
		* <ul>
		* <li>x = 10</li>
		* <li>base = 11</li>
		* </ul>
		* The expected result is "A".
		*/
		@Test
		void testCase10() {
				assertEquals("A", ChangeBase.changeBase(10, 11));
		}
}