
package scenario1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SpecialFactorialTest {
    @Test
    void testSpecialFactorial1() {
        assertEquals(1, SpecialFactorial.specialFactorial(0));
    }
    @Test
    void testSpecialFactorial2() {
        assertEquals(1, SpecialFactorial.specialFactorial(1));
    }
    @Test
    void testSpecialFactorial3() {
        assertEquals(2, SpecialFactorial.specialFactorial(2));
    }
    @Test
    void testSpecialFactorial4() {
        assertEquals(12, SpecialFactorial.specialFactorial(3));
    }
    @Test
    void testSpecialFactorial5() {
        assertEquals(288, SpecialFactorial.specialFactorial(4));
    }
    @Test
    void testSpecialFactorial6() {
        assertEquals(34560, SpecialFactorial.specialFactorial(5));
    }
    @Test
    void testSpecialFactorial7() {
        assertEquals(24883200, SpecialFactorial.specialFactorial(6));
    }
    @Test
    void testSpecialFactorial8() {
        assertEquals(Long.parseLong("125411328000"), SpecialFactorial.specialFactorial(7));
    }
    @Test
    void testSpecialFactorial9() {
        assertEquals(Long.parseLong("5_056_896_000_000"), SpecialFactorial.specialFactorial(8));
    }
    @Test
    void testSpecialFactorial10() {
        assertEquals(Long.parseLong("1_551_121_004_032_000"), SpecialFactorial.specialFactorial(9));
    }
}