// GenerateIntegersTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains one unit test case for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {

	/**
	* The two integer values to be validated.
	*/
	private final int[] values1;
    /**
     * The two integer values to be validated.
     */
    private final int[] values2;
        
	/**
	* Instantiates a new
	* 
	* @param val1 the integer values to be validated
	* @param val2 the integer values to be validated
	* @throws IllegalArgumentException 
	* @throws NullPointerException 
	*/	
	public GenerateIntegersTest(int[] val1, int[] val2) throws IllegalArgumentException, NullPointerException {
		if (val1 == null) {
			throw new NullPointerException("The two integer values to be validated argument cannot be null.");
		}
                if (val2 == null) {
                    throw new NullPointerException("The two integer values to be validated argument cannot be null.");
                }
        	
        	this.values1 = val1;
        	this.values2 = val2;
        }
        
	/**
	* Tests the {@link GenerateIntegers#generateIntegers(int, int)} method
	* with the three given integer values.
	*/
	@Test
	public void test_generateIntegers_generateIntegers() {

        int count = values1.length + values2.length + 4;
        List<List<Integer>> tests = GenerateIntegers.generateIntegers(count, 0);
        
        if (tests == null) {
            fail("Can not create Test list. ");
        }
        List<Integer> result = new ArrayList<>();
        for (List<Integer> element : tests) {
            for (int i = 0; i < element.size(); i++) {
                if (i == 0 || i + 1 == element.size()) {
                    result.add(element.get(i));
                } else {
                    result.add(element.get(i), element.get(i + 1));
                }
            }
        }
        assertTrue("Invalid result. ", result.size() == values1.length * values2[0]* values2[1]);
	}
	
}
