// PairsSumToZeroTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PairsSumToZero}.
* It contains one unit test case for the {@link PairsSumToZero#pairsSumToZero(List)} method.
*/
class PairsSumToZeroTest {

	/**
	  *
	  */
	@Test
	public void shouldPairsSumToZeroTest() {
      //arrange
       
		List<Integer> l = List.of(9, 5, 2);
		
		//act
		boolean result = pairsSumToZero(l);
		//assert
		assertTrue(result);
	}
	
}