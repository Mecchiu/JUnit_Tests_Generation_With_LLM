// IsSortedTest.java
package original;

import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains one unit test case for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {

    /**
     * Test case with simple array list.
     */
    @Test
    void test() {
        List<Integer> simpleList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            simpleList.add(i);
            simpleList.add(i - 1);
            simpleList.add(i + 1);
        }
        System.out.println(new IsSorted<Integer>().isSorted(simpleList)
                          .getReturnValue());
    }

    /**
     * Test case with duplicated values in the the array list.
     */
    @Test
    void testRepeated() {
        List<Integer> list = new ArrayList<>();
        int size = 1;
        for (int i = 0; i < size - 1; i++) {
            int value = (int) (i % size == 0? i : (i + 1/size)) * size;
            list.add(value);
            list.add(value + 1);
            list.add(value - 1);
        }
        System.out.println(new IsSorted<Integer>(list).isSorted(list)
                          .getReturnValue());
    }

    /**
     * Test case with an int array.
     */
    @Test
    void testArray() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(new IsSorted<Integer>(list).isSorted(list)
                          .getReturnValue());
    }
	
	/**
	 * @deprecated Use {@link IsSorted#testRepeated()} instead.
	 */
    @Test
    @Deprecated
    void testRepeated2() {
		System.out.println("@Deprecated testRepeated2");
		List<Integer> list = new ArrayList<>();
        int size = 5;
        for (int i = 0; i < size; i++) {
            int value = (int) (i % size == 0? i : (i + 1/size)) * size;
            list.add(value);
            list.add(value - 1);
            list.add(value + 1);
        }
        System.out.println(new IsSorted<Integer>(list).isSorted(list)
                          .getReturnValue());
    }

    /**
     * @deprecated Use {@link IsSorted#testRepeated()} instead.
     */
    @Test
    @Deprecated
    void testRepeated3() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(new IsSorted<Integer>(list).isSorted(list)
                          .getReturnValue());
    }
}