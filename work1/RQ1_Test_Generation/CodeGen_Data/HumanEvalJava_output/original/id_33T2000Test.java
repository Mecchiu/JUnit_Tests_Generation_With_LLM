// SortThirdTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains one unit test case for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {

	/**
	* This test method checks the {@link SortThird#sortThird(List)}.
	* The method first checks if the size of the list is set correctly.
	* The test uses a generator function to generate the correct values.
	* The values of the indices are set as {@link List} of integers and then checks if
	* the {@link SortThird#sortThird(List)} method has values.
	*/
	@Test
	void test() {

        new SortThird().sortThird(new ArrayList<Integer>(Collections.nCopies(10,  10)));
        checkValues("SortThird", 0, 2, 10,  0,  10);

        int indices[] = {2, 6, 3, 4, 8, 9};
        new SortThird().sortThird(new ArrayList<Integer>(Collections.nCopies(indices.length, 0)));
        List<Integer> output = new SortThird().sortThird(Collections.nCopies(indices.length,0));
        checkValues(output,0, 1, 2, 2, 0);
        
        output = new SortThird().sortThird(new ArrayList<Integer>());
        checkValues(output,0, 0, 0, 0, 0);
		
	}
	
	/**
	* Check the values of the {@link SortThird#sortThird(List)} method.
	* First checks if the size of the list is set correctly.
	* Next test the values of the indices.
	* Finally checks if the values of {@link SortThird#sortThird(List)} method has values.
	*/
	private void checkValues(List<Integer> output, int index, int divisor, int total, int divisor1, int divisor2) {

        assertEquals(output.get(index-1), total / divisor3, "The previous value of " + output.get(index-1) + " was " + (total/(divisor3)));
        assertEquals(output.get(index), divisor / divisor1, "The index (" + index + ") of " + output.get(index) + " was " + (divisor / divisor1));
        assertEquals(output.get((index+1)), total / divisor2, "The index (" + index + ") of " + output.get((index+1) + ") was " + (total/(divisor2)));
        assertEquals(inputToString(output), "SortThird()");
        
	}

	/**
	* This function will output the string. 
	* @return String output 
	*/
	private String inputToString(List<Integer> output) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < output.size(); i++) {
			builder.append(output.get(i).toString()); 
			builder.append(", ");
		}

		return builder.toString(); 
	}
}