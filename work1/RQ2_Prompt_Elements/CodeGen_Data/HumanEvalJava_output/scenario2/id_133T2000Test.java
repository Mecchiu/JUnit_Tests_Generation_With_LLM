// SumSquaresTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares}.
* It contains one unit test case for the {@link SumSquares#sumSquares(List)} method.
*/
class SumSquaresTest {

	/**
	* Test for {@link SumSquares#sumSquares(List)}.
	*/
	@Test
	public void testSumSquares() {
		
		Number first = number("998877666577887786");
		Number second = number("998888888888888888");
		
		// sumSquares(List)
		// 0x4E84524
		assertEquals(0x4E84524, sumSquares(List.of(first, second)));
		assertEquals(0x4E84524, sumSquares(List.of(first.add(second), second)));
		assertEquals(0x4E84524, sumSquares(List.of(first, second.add(second))));
		assertEquals(0x04E84524, sumSquares(List.of(first.add(first), second)));
		assertEquals(0x4E84524, sumSquares(List.of(first.add(first).add(second), second)));
		assertEquals(0x4E84524, sumSquares(List.of(first, first.add(second))));
		assertEquals(0x04E84524, sumSquares(List.of(first.add(first).add(first), second)));

		
		// Addition of lists of different sizes in addition.
		// 0x4E84524 + 0x4E8448888888888888 + 0x4E844888888888888  [0x0E84524]
		assertEquals(0x4E84524, sumSquares(List.of(first, second)));
		assertEquals(0x4E84524 + 0x0E8448888888888888, sumSquares(List.of(first.add(second), second)));
		assertEquals(0x0E84524 + 0x4E8448888888888888, sumSquares(List.of(first.add(first).add(second), second)));

			
		// Addition of lists of sizes with the same second element add up to the other sizes
		// 0x4E855345345345345 + 0x4E844888888888888  [0x0E825553453453453]
		assertEquals(0x4E84520, sumSquares(List.of(first, second)));
		assertEquals(0x0E825553453453453, sumSquares(List.of(first.add(second), second)));

			

		// Addition of lists with two different second elements add up to one third
		// 0x4E845263535353536 + 0x4E8448888888888888 + 0x4E844888888888888  [0x08E825553453453]
		assertEquals(0x4E84520, sumSquares(List.of(first, second)));
		assertEquals(0x1E825553453453, sumSquares(List.of(first, first.add(second), second)));

			

		// Addition of lists with elements equal to the other lists add up to either of the lists
		// 0x04E84526353535351 + 0x4E844888888888888  [0x08E8473035353536]
		assertEquals(0x04E84520, sumSquares(List.of(first, second)));
		assertEquals(0x08E8473035353536, sumSquares(List.of(first, first.add(second), second)));

	}
	
	private Number number(String s){
		return new Number(s);
	}

}
