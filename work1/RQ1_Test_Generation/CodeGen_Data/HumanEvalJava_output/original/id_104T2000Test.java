// UniqueDigitsTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains one unit test case for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {

	//Test Data
	ArrayList<Integer> input = new ArrayList<>();
    ArrayList<Integer> expected = new ArrayList<>();
	
	public UniqueDigitsTest() {
		
		//This is an internal test class.
        InputValidator 
	}
	
	public List<Integer> 
    calculate(int xMax, int yMax) {
        List<Integer> result = new ArrayList<>();
        
		for (int i = 0; i < xMax; i++) {
			input.add(i);
		}			
		for (int j = 0; j < yMax; j++) {
			for (int i = 0; i < xMax; i++) {
				if (i!= xMax - 1) {				
					int newElement = input.get(i).charAt(0) - 2;
					if (newElement < 0 || xMax - i + newElement >= input.size()) {
						assertTrue(false);
					} else {
						result.add(xMax - i + newElement);
					}
				}
			}
		}
			
		return result;
	}
	
	/**
	* Test method for {@link UniqueDigits#uniqueDigits(List)}.
	*/
	@Test
	public void
		test() {
		test(expected, input);
	}
	
	/**
	* Test method for {@link UniqueDigits#uniqueDigits(List)}.
	*/
	@Test
	public void
		test1() {
	
		expected = new ArrayList<>();
		expected.add(7);
	
		test(expected, input);
	}
}

//class UniqueDigitsTest.java
