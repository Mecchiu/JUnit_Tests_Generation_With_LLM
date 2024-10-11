// RoundedAvgTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RoundedAvg}.
* It contains ten unit test cases for the {@link RoundedAvg#roundedAvg(int, int)} method.
*/
class RoundedAvgTest {

	@Test
	void test1() {
		assertEquals("0b11", RoundedAvg.roundedAvg(1, 5));
	}
	
	@Test
	void test2() {
		assertEquals("0b1010", RoundedAvg.roundedAvg(7, 13));
	}
	
	@Test
	void test3() {
		assertEquals("0b1111001010", RoundedAvg.roundedAvg(964, 977));
	}
	
	@Test
	void test4() {
		assertEquals("0b1111100100", RoundedAvg.roundedAvg(996, 997));
	}
	
	@Test
	void test5() {
		assertEquals("0b1011000010", RoundedAvg.roundedAvg(560, 851));
	}
	
	@Test
	void test6() {
		assertEquals("0b101101110", RoundedAvg.roundedAvg(185, 546));
	}
	
	@Test
	void test7() {
		assertEquals("0b110101101", RoundedAvg.roundedAvg(362, 496));
	}
	
	@Test
	void test8() {
		assertEquals("0b1001110010", RoundedAvg.roundedAvg(350, 902));
	}
	
	@Test
	void test9() {
		assertEquals("0b11010111", RoundedAvg.roundedAvg(197, 233));
	}
	
	@Test
	void test10() {
		assertEquals(-1, RoundedAvg.roundedAvg(7, 5));
	}
}