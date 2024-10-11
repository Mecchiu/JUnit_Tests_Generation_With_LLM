// TriplesSumToZeroTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {

	/**
	* Test case 1:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	* Expected output: false
	*/
	@Test
	void test1() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertFalse(TriplesSumToZero.triplesSumToZero(l));
	}
	
	/**
	* Test case 2:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, -10]
	* Expected output: true
	*/
	@Test
	void test2() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	/**
	* Test case 3:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30]
	* Expected output: true
	*/
	@Test
	void test3() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	/**
	* Test case 4:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30, -40, -50, -60]
	* Expected output: true
	*/
	@Test
	void test4() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30, -40, -50, -60);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	/**
	* Test case 5:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30, -40, -50, -60, -70, -80, -90, -100]
	* Expected output: true
	*/
	@Test
	void test5() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30, -40, -50, -60, -70, -80, -90, -100);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	/**
	* Test case 6:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30, -40, -50, -60, -70, -80, -90, -100, -110, -120, -130, -140, -150, -160, -170, -180, -190, -200]
	* Expected output: true
	*/
	@Test
	void test6() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30, -40, -50, -60, -70, -80, -90, -100, -110, -120, -130, -140, -150, -160, -170, -180, -190, -200);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	/**
	* Test case 7:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30, -40, -50, -60, -70, -80, -90, -100, -110, -120, -130, -140, -150, -160, -170, -180, -190, -200, -210, -220, -230, -240, -250, -260, -270, -280, -290, -300]
	* Expected output: true
	*/
	@Test
	void test7() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30, -40, -50, -60, -70, -80, -90, -100, -110, -120, -130, -140, -150, -160, -170, -180, -190, -200, -210, -220, -230, -240, -250, -260, -270, -280, -290, -300);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	/**
	* Test case 8:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30, -40, -50, -60, -70, -80, -90, -100, -110, -120, -130, -140, -150, -160, -170, -180, -190, -200, -210, -220, -230, -240, -250, -260, -270, -280, -290, -300, -310, -320, -330, -340, -350, -360, -370, -380, -390, -400]
	* Expected output: true
	*/
	@Test
	void test8() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30, -40, -50, -60, -70, -80, -90, -100, -110, -120, -130, -140, -150, -160, -170, -180, -190, -200, -210, -220, -230, -240, -250, -260, -270, -280, -290, -300, -310, -320, -330, -340, -350, -360, -370, -380, -390, -400);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	/**
	* Test case 9:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30, -40, -50, -60, -70, -80, -90, -100, -110, -120, -130, -140, -150, -160, -170, -180, -190, -200, -210, -220, -230, -240, -250, -260, -270, -280, -290, -300, -310, -320, -330, -340, -350, -360, -370, -380, -390, -400, -410, -420, -430, -440, -450, -460, -470, -480, -490, -500]
	* Expected output: true
	*/
	@Test
	void test9() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30, -40, -50, -60, -70, -80, -90, -100, -110, -120, -130, -140, -150, -160, -170, -180, -190, -200, -210, -220, -230, -240, -250, -260, -270, -280, -290, -300, -310, -320, -330, -340, -350, -360, -370, -380, -390, -400, -410, -420, -430, -440, -450, -460, -470, -480, -490, -500);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
	
	/**
	* Test case 10:
	* Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30, -40, -50, -60, -70, -80, -90, -100, -110, -120, -130, -140, -150, -160, -170, -180, -190, -200, -210, -220, -230, -240, -250, -260, -270, -280, -290, -300, -310, -320, -330, -340, -350, -360, -370, -380, -390, -400, -410, -420, -430, -440, -450, -460, -470, -480, -490, -500, -510, -520, -530, -540, -550, -560, -570, -580, -590, -600]
	* Expected output: true
	*/
	@Test
	void test10() {
		List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -20, -30, -40, -50, -60, -70, -80, -90, -100, -110, -120, -130, -140, -150, -160, -170, -180, -190, -200, -210, -220, -230, -240, -250, -260, -270, -280, -290, -300, -310, -320, -330, -340, -350, -360, -370, -380, -390, -400, -410, -420, -430, -440, -450, -460, -470, -480, -490, -500, -510, -520, -530, -540, -550, -560, -570, -580, -590, -600);
		assertTrue(TriplesSumToZero.triplesSumToZero(l));
	}
}