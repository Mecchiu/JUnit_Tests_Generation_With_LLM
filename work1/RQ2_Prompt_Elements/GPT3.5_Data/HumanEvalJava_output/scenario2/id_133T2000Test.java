import java.util.Arrays;
import java.util.List;

class SumSquaresTest {

    @Test
    void testSumSquaresWithEmptyList() {
        List<Number> lst = Arrays.asList();
        int result = SumSquares.sumSquares(lst);
        assertEquals(0, result);
    }

    @Test
    void testSumSquaresWithOneElement() {
        List<Number> lst = Arrays.asList(2);
        int result = SumSquares.sumSquares(lst);
        assertEquals(4, result);
    }

    @Test
    void testSumSquaresWithMultipleElements() {
        List<Number> lst = Arrays.asList(2, 3, 4);
        int result = SumSquares.sumSquares(lst);
        assertEquals(29, result);
    }

    @Test
    void testSumSquaresWithNegativeElements() {
        List<Number> lst = Arrays.asList(-2, -3, -4);
        int result = SumSquares.sumSquares(lst);
        assertEquals(29, result);
    }

    @Test
    void testSumSquaresWithMixedElements() {
        List<Number> lst = Arrays.asList(-2, 3, 4.5);
        int result = SumSquares.sumSquares(lst);
        assertEquals(30, result);
    }

    @Test
    void testSumSquaresWithZeroElement() {
        List<Number> lst = Arrays.asList(0);
        int result = SumSquares.sumSquares(lst);
        assertEquals(0, result);
    }

    @Test
    void testSumSquaresWithLargeElements() {
        List<Number> lst = Arrays.asList(1000000000, 2000000000);
        int result = SumSquares.sumSquares(lst);
        assertEquals(5000000000000000000L, result);
    }

    @Test
    void testSumSquaresWithDecimalElements() {
        List<Number> lst = Arrays.asList(2.5, 3.7, 4.1);
        int result = SumSquares.sumSquares(lst);
        assertEquals(38, result);
    }

    @Test
    void testSumSquaresWithNullList() {
        List<Number> lst = null;
        assertThrows(NullPointerException.class, () -> SumSquares.sumSquares(lst));
    }

    @Test
    void testSumSquaresWithNullElement() {
        List<Number> lst = Arrays.asList(2, null, 4);
        assertThrows(NullPointerException.class, () -> SumSquares.sumSquares(lst));
    }
}