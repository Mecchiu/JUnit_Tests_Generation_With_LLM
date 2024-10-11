// TriplesSumToZeroTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains one unit test case for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {
@Test
		public final void test_1() {
		// System.out.println("##################################");
		
		// list containing three elements: i = 0 & j = 1 & k = 2
		// the number of distinct elements in the range 0 & i,j,k = 1
		
		// The sum that is obtained from the above range [0.0, 1.0]: i = i + j * k, j = -j, k = -k  
		
		assertEquals("triples sum to zero (contains three distinct elements)", 3.0,
                                TriplesSumToZero.triplesSumToZero((List<Integer> ){0,1,2}));
		
		//System.out.println("##################################");		
		
		assertEquals("triples sum to zero with empty parameter list", 1, 
                                TriplesSumToZero.triplesSumToZero(()));
		
		
		}

}
