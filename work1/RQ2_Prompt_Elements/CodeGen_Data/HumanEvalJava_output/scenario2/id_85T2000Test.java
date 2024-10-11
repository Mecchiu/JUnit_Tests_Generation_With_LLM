// Add1Test.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add1}.
* It contains one unit test case for the {@link Add1#add(List)} method.
*/
class Add1Test {
/**
		 * Constructor of this class.
		 */
		public Add1Test() {
			  
		}
        @Test (expected=IndexOutOfBoundsException.class)
		public void testAdd() {
            List<Integer> list = new Add1().add(new Integer[] {5, 2});
           	assertNotNull(list);
           	assertEquals(5, list.size());
           	assertEquals(2, list.get(0));
    	}
        @Test(expected=ArrayIndexOutOfBoundsException.class)
		public void testAddWithSizeNegative() throws IndexOutOfBoundsException {
           	List<Integer> list = new Add1().add((Integer[]) null);
    	
           	assertNotNull(list);
           	assertEquals(9, list.size());
    	}
        @Test(expected=ArrayIndexOutOfBoundsException.class)
		public void testAddWithSizeZeroAndIndexNegative() throws IndexOutOfBoundsException {
           	List<Integer> list = new Add1().add(new Integer[] {});
    	
           	assertNotNull(list);
           	assertEquals(9, list.size());
    	}

}
