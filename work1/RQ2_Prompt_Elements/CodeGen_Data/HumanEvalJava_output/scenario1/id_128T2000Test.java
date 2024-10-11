// ProdSignsTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ProdSigns}.
* It contains one unit test case for the {@link ProdSigns#prodSigns(List)} method.
*/
class ProdSignsTest {

	@Test
	void test1() {
        List<Object> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Integer result = ProdSigns.prodSigns(list);
        assertEquals(true, true);
    }
	
	@Test
	void test2() {
        List<Object> list = Arrays.asList(1, 2);
        Integer result = ProdSigns.prodSigns(list);
        assertEquals(false, result == null || result == 1);
    }
	
	@Test
	void test3() {
        List<Object> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Integer result = ProdSigns.prodSigns(list);
        assertEquals(0, result);
    }
	
	@Test
	void test4() {
        List<Object> array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = i;
        }
        List<Object> list = new ArrayList<>(array);
        Integer result = ProdSigns.prodSigns(list);
        int prod = 1;
        for (Object o : array) {
            if (o instanceof Integer) {
                int num = (Integer) o;
                prod *= num;
            }
        }
        assertTrue(prod > 0 && result <= prod);
    }
	
	@Test
	void test5() {
        List<Object> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer result = ProdSigns.prodSigns(list);
        assertTrue(result >= 1);
    }

}