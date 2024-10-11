// SmallestChangeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains one unit test case for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {

/**
 * This is a test case for the {@link SmallestChange#smallestChange(List)} method.
 */
@Test
public class SmallestChangeTest {
 
	/**
	 * Test method for {@link smallestChange#smallestChange(List)}.
	 */
	@Test
    public void testSmallestChange() {
        List<Integer> array = buildIntList(new int[] {1, 2, 3, 5, 4, 7, 9, 6, 3});
        assertEquals(buildIntList(new int[] {1, 2, 3, 5, 4, 7, 9, 6}), smallestChange(array));         
    }
	
	@Test
	public void testSmallestChange2() {
		List<Integer> array = buildIntList(new int[] {1, 2, 3, 5, 4, 7, 9, 6, 3});
		List<Integer> expected_ = buildIntList(new int[] {1, 2, 3, 5, 4, 7, 9, 2});
		List<Integer> actual_ = smallestChange(array);
		assertEquals(expected_, actual_);
		
	}
	
	/**
	 * This is a test case for the {@link smallestChange()} method of the class.
	 */
    @Test
    public void testSmallestChange3(){
        List<Integer> array = buildIntList(new int[] {1,2,3,5,4,7,9,6,3});
        assertEquals(buildIntList(new int[] {1,2,3,5,4,7,9,6}), 
        				smallestChange(array));
    }
	
}
