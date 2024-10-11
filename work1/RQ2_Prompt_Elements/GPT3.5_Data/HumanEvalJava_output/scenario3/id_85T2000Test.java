// Add1.java
package scenario3;

import java.util.List;

class Add1 {

    /**
     * Given a non-empty list of integers lst. add the even elements that are at odd indices..
     *
     * Examples:
     * add([4, 2, 6, 7]) ==> 2
     *
     * > add([4, 88])
     * 88
     * > add([4, 5, 6, 7, 2, 122])
     * 122
     * > add([4, 0, 6, 7])
     * 0
     * > add([4, 4, 6, 8])
     * 12
     */
    public static int add(List<Integer> lst) {
        int sum = 0;
        for (int i = 1; i < lst.size(); i += 2) {
            if (lst.get(i) % 2 == 0) {
                sum += lst.get(i);
            }
        }
        return sum;
    }
}

// Add1Test.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add1}.
* It contains ten unit test cases for the {@link Add1#add(List)} method.
*/
class Add1Test {
    @Test
    void testAdd1() {
        List<Integer> lst = Arrays.asList(4, 2, 6, 7);
        assertEquals(2, Add1.add(lst));
    }

    @Test
    void testAdd2() {
        List<Integer> lst = Arrays.asList(4, 88);
        assertEquals(88, Add1.add(lst));
    }

    @Test
    void testAdd3() {
        List<Integer> lst = Arrays.asList(4, 5, 6, 7, 2, 122);
        assertEquals(122, Add1.add(lst));
    }

    @Test
    void testAdd4() {
        List<Integer> lst = Arrays.asList(4, 0, 6, 7);
        assertEquals(0, Add1.add(lst));
    }

    @Test
    void testAdd5() {
        List<Integer> lst = Arrays.asList(4, 4, 6, 8);
        assertEquals(12, Add1.add(lst));
    }

    @Test
    void testAdd6() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(18, Add1.add(lst));
    }

    @Test
    void testAdd7() {
        List<Integer> lst = Arrays.asList(1, 3, 5, 7, 9);
        assertEquals(0, Add1.add(lst));
    }

    @Test
    void testAdd8() {
        List<Integer> lst = Arrays.asList(2, 4, 6, 8, 10);
        assertEquals(0, Add1.add(lst));
    }

    @Test
    void testAdd9() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(12, Add1.add(lst));
    }

    @Test
    void testAdd10() {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(18, Add1.add(lst));
    }
}