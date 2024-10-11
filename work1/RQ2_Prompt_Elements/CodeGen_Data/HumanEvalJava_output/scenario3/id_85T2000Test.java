// Add1Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add1}.
* It contains one unit test case for the {@link Add1#add(List)} method.
*/
class Add1Test {

    /**
     * Checks if the method {@code add} works with non-empty lists.
     */
    @Test public void add_nonEmpty_list() {
    	int x2 = 9;
    	assertEquals(x2, 2, "add should return 0 if the first input doesn't have odd indices.");
    }
    
    /**
     * Checks if the method {@code add} works with empty lists.
     */
    @Test public void add_empty_list() {
    	List<Integer> list = null;
    	int x2 = 9;
    	assertEquals(x2, 0, "add should return 0 if the first input doesn't have odd indices.");
    }
    
    /**
     * Checks if the method {@code add} works with other types.
     */
    @Test public void add_other() throws Exception {
    	List<Integer> list1 = null;
    	float f = 666.0;
    	list1 = new FloatList(new float[]{f});
    	int x2 = 100;
    	float f2 = 666.0f;
    	add(list1);
    	add(f2);
    }
    
}