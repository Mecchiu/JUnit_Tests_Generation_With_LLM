// RoundedAvgTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RoundedAvg}.
* It contains ten unit test cases for the {@link RoundedAvg#roundedAvg(int, int)} method.
*/
class RoundedAvgTest {
			/**
			* Test case for the {@link RoundedAvg#roundedAvg(int, int)} method.
			* It checks if the method returns the correct binary representation of the rounded average.
			*/
			@Test
			void testRoundedAvg() {
						assertEquals("0b11", RoundedAvg.roundedAvg(1, 5));
						assertEquals("0b1010", RoundedAvg.roundedAvg(7, 13));
						assertEquals("0b1111001010", RoundedAvg.roundedAvg(964, 977));
						assertEquals("0b1111100100", RoundedAvg.roundedAvg(996, 997));
						assertEquals("0b1011000010", RoundedAvg.roundedAvg(560, 851));
						assertEquals("0b101101110", RoundedAvg.roundedAvg(185, 546));
						assertEquals("0b110101101", RoundedAvg.roundedAvg(362, 496));
						assertEquals("0b1001110010", RoundedAvg.roundedAvg(350, 902));
						assertEquals("0b11010111", RoundedAvg.roundedAvg(197, 233));
						assertEquals("0b101", RoundedAvg.roundedAvg(5, 5));
			}

			/**
			* Test case for the {@link RoundedAvg#roundedAvg(int, int)} method.
			* It checks if the method returns -1 when the first argument is greater than the second one.
			*/
			@Test
			void testRoundedAvgWhenFirstArgumentIsGreaterThanSecondOne() {
						assertEquals(-1, RoundedAvg.roundedAvg(7, 5));
						assertEquals(-1, RoundedAvg.roundedAvg(5, 1));
			}
}