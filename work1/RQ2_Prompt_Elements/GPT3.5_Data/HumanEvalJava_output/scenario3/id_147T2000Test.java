// GetMaxTriples.java
package scenario3;

class GetMaxTriples {

    /**
     * * You are given a positive integer n. You have to create an integer array a of length n.
     * For each i (1 ≤ i ≤ n), the value of a[i] = i * i - i + 1.
     * Return the number of triples (a[i], a[j], a[k]) of a where i < j < k,
     * and a[i] + a[j] + a[k] is a multiple of 3.
     *
     * Example :
     * Input: n = 5
     * Output: 1
     * Explanation:
     * a = [1, 3, 7, 13, 21]
     * The only valid triple is (1, 7, 13).
     *
     * > getMaxTriples(5)
     * 1
     * > getMaxTriples(6)
     * 4
     * > getMaxTriples(10)
     * 36
     * > getMaxTriples(100)
     * 53361
     */
    public static int getMaxTriples(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i * i - i + 1;
        }
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((a[i] + a[j] + a[k]) % 3 == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

// GetMaxTriplesTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetMaxTriples}.
* It contains ten unit test cases for the {@link GetMaxTriples#getMaxTriples(int)} method.
*/
class GetMaxTriplesTest {
    @Test
    void testGetMaxTriples1() {
        assertEquals(1, GetMaxTriples.getMaxTriples(5));
    }

    @Test
    void testGetMaxTriples2() {
        assertEquals(4, GetMaxTriples.getMaxTriples(6));
    }

    @Test
    void testGetMaxTriples3() {
        assertEquals(36, GetMaxTriples.getMaxTriples(10));
    }

    @Test
    void testGetMaxTriples4() {
        assertEquals(53361, GetMaxTriples.getMaxTriples(100));
    }

    @Test
    void testGetMaxTriples5() {
        assertEquals(0, GetMaxTriples.getMaxTriples(1));
    }

    @Test
    void testGetMaxTriples6() {
        assertEquals(0, GetMaxTriples.getMaxTriples(2));
    }

    @Test
    void testGetMaxTriples7() {
        assertEquals(0, GetMaxTriples.getMaxTriples(3));
    }

    @Test
    void testGetMaxTriples8() {
        assertEquals(0, GetMaxTriples.getMaxTriples(4));
    }

    @Test
    void testGetMaxTriples9() {
        assertEquals(0, GetMaxTriples.getMaxTriples(7));
    }

    @Test
    void testGetMaxTriples10() {
        assertEquals(0, GetMaxTriples.getMaxTriples(8));
    }
}