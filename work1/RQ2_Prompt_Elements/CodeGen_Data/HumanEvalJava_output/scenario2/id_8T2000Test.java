// SumProductTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains one unit test case for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {
// @fixme
    @Parameterized.Parameters
    public static List<Object[]> parameters()
    {
            final Object[][] data =
                    new Object[][] {
                            {new int[] {0}, new int[] {0}},
                            {new int[] {0, 1}, new int[] {0}},
                            {new int[] {0, 1, 2}, new int[] {1, 2}{}}
                    };
            return data;
    }
    
    // @fixme
    // public Test case 1: sumProduct with non-empty numbers
    @Test
    public void test() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(new int[] {0});
        numbers.add(new int[] {0, 1});
        numbers.add(new int[] {0, 0});
        // For each tuple
        numbers = SumProduct.sumProduct(numbers.iterator());
        assertEquals("A sum is equal to zero", 0, numbers.get(0));
        assertEquals("A product of one entry is equal to one", 1, numbers.get(1));
        assertEquals("A sum is equal to zero", 0, numbers.get(2));
    }
    
}