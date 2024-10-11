public class SkjkasdkdTest {

    @Test
    void testEmptyList() {
        List<Integer> lst = List.of();
        assertEquals(0, Skjkasdkd.skjkasdkd(lst));
    }

    @Test
    void testNoPrime() {
        List<Integer> lst = List.of(4, 6, 8, 9);
        assertEquals(0, Skjkasdkd.skjkasdkd(lst));
    }

    @Test
    void testOnePrime() {
        List<Integer> lst = List.of(4, 6, 8, 9, 11);
        assertEquals(2, Skjkasdkd.skjkasdkd(lst));
    }

    @Test
    void testMultiplePrimes() {
        List<Integer> lst = List.of(4, 6, 8, 9, 11, 13, 17, 19);
        assertEquals(10, Skjkasdkd.skjkasdkd(lst));
    }

    @Test
    void testNegativeNumbers() {
        List<Integer> lst = List.of(-4, -6, -8, -9, -11, -13, -17, -19);
        assertEquals(0, Skjkasdkd.skjkasdkd(lst));
    }

    @Test
    void testMixedNumbers() {
        List<Integer> lst = List.of(-4, 6, -8, 9, 11, -13, 17, -19);
        assertEquals(8, Skjkasdkd.skjkasdkd(lst));
    }

    @Test
    void testLargeNumbers() {
        List<Integer> lst = List.of(100, 200, 300, 400, 500, 600, 700, 800, 900, 997);
        assertEquals(31, Skjkasdkd.skjkasdkd(lst));
    }

    @Test
    void testDuplicatePrimes() {
        List<Integer> lst = List.of(2, 3, 5, 7, 7, 11, 13, 13, 17, 19);
        assertEquals(18, Skjkasdkd.skjkasdkd(lst));
    }

    @Test
    void testAllPrimes() {
        List<Integer> lst = List.of(2, 3, 5, 7, 11, 13, 17, 19);
        assertEquals(20, Skjkasdkd.skjkasdkd(lst));
    }

    @Test
    void testLargeList() {
        List<Integer> lst = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199);
        assertEquals(19, Skjkasdkd.skjkasdkd(lst));
    }
}