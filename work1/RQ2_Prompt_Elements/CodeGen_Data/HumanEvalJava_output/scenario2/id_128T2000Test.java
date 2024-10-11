// ProdSignsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ProdSigns}.
* It contains one unit test case for the {@link ProdSigns#prodSigns(List)} method.
*/
class ProdSignsTest {
 
    @Test
    public void prodSigns_withEmptyArray() {
        Integer prod = new ProdSigns().prodSigns(new List[0]);
        assertEquals(0, prod);
    }
	 
    @Test
    public void prodSigns_withSingleElement() {
        List<Integer> arr = new List[] {1, -1};
        Integer prod = new ProdSigns().prodSigns(arr);
        assertEquals(1, prod);
    }
    
    @Test
    public void prodSigns_withMultipleElements() {
        List<Integer> arr = new List[] {1, 1, -2, -2};
        Integer prod1 = new ProdSigns().prodSigns(arr);
        assertEquals(3, prod1);
        // If prod is odd, it should return -2 for all elements, otherwise it should return -1
        List<Integer> arr2 = new List[] {0, 1, 2, -2};
        prod1 = new ProdSigns().prodSigns(arr2);
        assertEquals(-2, prod1);
    }
    
    @Test
    public void prodSigns_withSameElements() {
        List<Integer> arr = new List[] {1, 1, -2, -2};
        Integer prod1 = new ProdSigns().prodSigns(arr);
        assertEquals(2, prod1);
    }

}