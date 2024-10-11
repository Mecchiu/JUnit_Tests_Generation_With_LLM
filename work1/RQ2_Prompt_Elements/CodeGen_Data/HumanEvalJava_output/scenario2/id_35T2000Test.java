// MaxElementTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains one unit test case for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {

	/**
	 * Initialize the new instance of the class MaxElementTest.
	*/
	@Test
  void initTest() {
//		MaxElement maxElement = new MaxElement();
//		assertNotNull("maxElement can not be null");
	}

	/**
	 * Test the {@link MaxElement#maxElement(List)} method.
	 * @throws ParseException if input list for element is not valid.
	 */
  void maxElementListInput() throws ParseException {
//		List<Integer> list = new ArrayList<>();
		List<Integer> l;
		assertNotNull("empty list");
		l = new MaxElement().maxElement(new ArrayList<>());
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)!= (Integer.MIN_VALUE + 1)) {
				System.out.printf("max: %d  list: (%s): %d\n",
						i,list.getClass().getSimpleName(), list.get(i));
				break;
			}
		}
		assertEquals("list size", 0, list.size());
		
		// Initialize the list as an empty list.
		list.clear();

		l = new MaxElement().maxElement(list);
		
		// Check the element
		System.out.printf("max: %d  list: (%s) size: %d\n",
				i,list.getClass().getSimpleName(), 
				list.size());
		
		// Check the list length
		assertEquals("list capacity", 0, list.size());
		
		// Check that the actual list size is equal to the one inserted.
		assertEquals("max element size", 1, l.size());
		
		// Check the actual list element at index 0.
		assertEquals("max element", (Integer.MIN_VALUE + 1), l.get(0));
		
		// Iterate list again to check actual value of the second element.
		list = new MaxElement().maxElement(list);
		
		// Ensure that 1 element.
		assertEquals("list size", 1, list.size());
		
		// Check the first element.
		assertEquals("max element value", (Integer.MIN_VALUE + 1), l.get(0));
		
		}
	} // end of test method.

/**
* Sub test for the {@link MaxElement#maxElement(List, Comparable)}.
* This test will verify that the method {@link MaxElement#maxElement(List, Comparable)}
* returns correct result when the specified elements are found to be equal.
*/
	@Test
  void subTestMaxElementDoubleComparison() {
		if (! System.getProperty("os.name").toLowerCase().contains("win")) {
			System.err.println("Not running tests for Win32 platforms");
			// System.getProperty("os.name").toLowerCase().contains("win")
			System.out.println("Tests will not run for platforms with a Windows build");
			return;
	    }
	    
		List<Integer> l = new MinMaxArrayListIteratorTest().getInputList("list.in.txt");

		MaxElement maxElement = new MaxElement();
		List<Integer> list = new MaxElement().maxElement(new ArrayList<>(l));
		//System.err.println("list size: " + list.getClass().getSimpleName());
		
		assertEquals("List size", l.size(), list.size());
		
		int index = 0;
		for (int i : l) {
			assertEquals("lstains.int", (Integer.MIN_VALUE + 1), i);
			if (index == 0) {
				assertEquals("lstains position", index + 1, list.get(i));
			}
			index++;
		}
		
		l = new MaxElement().maxElement(list);
		//System.err.println("list size: " + list.getClass().getSimpleName());
		assertEquals("List size", l.getClass().getSimpleName(), list.getClass().getSimpleName());
		
		assertEquals("Max element value", 
				(Integer.MIN_VALUE + 1), l.get(0));
		
		return;
	}

	private static int i;

	static final class MinMaxArrayListIteratorTest implements Runnable {
    	private List<Integer> list = new ArrayList<>();
    	MinMaxArrayListIteratorTest() {
    	        
    	    }

    	public void run() {
		//	try {
 
		list = new MinMaxArrayListIteratorTest().listIterator();
			
		//	} catch (NullPointerException npe) {
		//		System.err.println("NPE: " + npe.getMessage());
		//	}
        } // end of run method

  		@Override
  		public void run() {
//	    	while (true) {
//	    		i++;
//	    		//System.out.println(i);
//	    		//System.out.println(list);
//	    		if (list.get(i) == (Integer.MIN_VALUE + 1)) {
//	    			if (i == 0) {
//	    				throw new RuntimeException("List element "
//	    						+ "doesn't exist");
//	    			}
//	    		}
//	    		assertNotNull("list == null", list);
//	    		assertEquals("list size", 1, list.size());
//	    		
//	    	}
//	    	
//	    	*/
//	    	return;
  		}
    	}
		}
	
}
					 
