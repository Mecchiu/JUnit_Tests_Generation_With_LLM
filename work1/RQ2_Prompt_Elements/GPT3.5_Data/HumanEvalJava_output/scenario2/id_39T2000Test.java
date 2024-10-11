import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeFibTest {

    @Test
    void testPrimeFib() {
        assertEquals(2, PrimeFib.primeFib(1));
        assertEquals(3, PrimeFib.primeFib(2));
        assertEquals(5, PrimeFib.primeFib(3));
        assertEquals(13, PrimeFib.primeFib(4));
        assertEquals(89, PrimeFib.primeFib(6));
        assertEquals(233, PrimeFib.primeFib(7));
        assertEquals(1597, PrimeFib.primeFib(11));
        assertEquals(28657, PrimeFib.primeFib(23));
        assertEquals(514229, PrimeFib.primeFib(29));
        assertEquals(433494437, PrimeFib.primeFib(43));
    }
}