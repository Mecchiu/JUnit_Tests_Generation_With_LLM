// SumSquaresTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares}.
* It contains one unit test case for the {@link SumSquares#sumSquares(List)} method.
*/
class SumSquaresTest {

    @Test
    public void testSumSquares() {
	
        // For lst of size 5:
        // lst should have the following:
        //     13
        //     16
        //     17
        //     14
        //     18
        
        System.out.println(sumSquares([13, 16, 17, 14, 17]));
        assertEquals(16, sumSquares([13, 16, 17, 14, 17]));
    }
	
	
    @Test
    public void testSumSquaresList() {
	
        // For lst of size 5:
        // lst should have the following:
        //     13
        //     16
        //     17
        //     14
        //     18
        
        System.out.println(sumSquares([13, 19, 13, 16, 26]));
        assertEquals(26, sumSquares([13, 19, 13, 16, 25]));
    }
	
	
    @Test
    public void testSumSquaresWithEmptyList() {
	
        // For lst of size 5:
	// lst should have the following:
	//     14
	//     16
	//     17
	//     18
	//     27
	
        assertNull(sumSquares([]));
    }
	
	
    @Test
    public void testSumSquaresWithNegativeList() {
	
        // For lst of size 5:
	// lst should have the following:
	//     -4
	//     -6
	//     -7
	//     -6
	//     -4
	//     27
	
        assertEquals(0, sumSquares([-4]));
    }
	
	
    @Test
    public void testSumSquaresWithNonEmptyList() {
	
        // For lst of size 5:
	// lst should have the following:
	//     16.01
	//     19.99
	//     16.08
	//     13.88
	
	System.out.println(sumSquares([16.01, 15, 19.99, 16.07, 22]));
	assertEquals(22, sumSquares([16.01, 16.07, 16.08, 15.88, 19.99]));
    }

	
}
