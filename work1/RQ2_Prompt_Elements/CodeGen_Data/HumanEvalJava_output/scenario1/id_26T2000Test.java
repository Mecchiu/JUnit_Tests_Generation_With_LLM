// RemoveDuplicatesTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveDuplicates}.
* It contains one unit test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
*/
class RemoveDuplicatesTest {

	/**
	* It contains one unit test in which array of objects is expected and is created.
	*/
	List<Object> arrayOfObjects = new ArrayList<Object>();
	
	/**
	* It contains one unit test in which array of objects is expected and is created.
	*/
	List<Object> arrayOfObjects2 = new ArrayList<Object>();
	
	public RemoveDuplicatesTest() {}
	
    /**
	* Runs the test.
	*/
    @Test
    public void test() {
        // Create an array containing array of objects
        for (int i = 0; i < 3; i++) {
            arrayOfObjects.add("Object" + i);
            arrayOfObjects2.add(arrayOfObjects.get(i));
        }
        
        // Remove duplicates of the list of numbers
        numbers = RemoveDuplicates.removeDuplicates(arrayOfObjects);
        
        // Check whether the array contains any duplicates of numbers
        assertTrue(arrayOfObjects.containsAll(numbers));
        
        assertTrue(numbers.removeAll(arrayOfObjects));
    }
}