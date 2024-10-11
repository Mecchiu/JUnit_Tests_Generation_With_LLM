import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibfibTest {

    @Test
    void testFibfib0() {
        assertEquals(0, Fibfib.fibfib(0));
    }

    @Test
    void testFibfib1() {
        assertEquals(0, Fibfib.fibfib(1));
    }

    @Test
    void testFibfib2() {
        assertEquals(1, Fibfib.fibfib(2));
    }

    @Test
    void testFibfib3() {
        assertEquals(1, Fibfib.fibfib(3));
    }

    @Test
    void testFibfib4() {
        assertEquals(2, Fibfib.fibfib(4));
    }

    @Test
    void testFibfib5() {
        assertEquals(4, Fibfib.fibfib(5));
    }

    @Test
    void testFibfib6() {
        assertEquals(7, Fibfib.fibfib(6));
    }

    @Test
    void testFibfib7() {
        assertEquals(13, Fibfib.fibfib(7));
    }

    @Test
    void testFibfib8() {
        assertEquals(24, Fibfib.fibfib(8));
    }

    @Test
    void testFibfib9() {
        assertEquals(44, Fibfib.fibfib(9));
    }
}