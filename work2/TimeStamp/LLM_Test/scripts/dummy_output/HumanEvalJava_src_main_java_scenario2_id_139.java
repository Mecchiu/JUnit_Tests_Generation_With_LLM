
package scenario2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SpecialFactorialTest {
   @Test
   void testSpecialFactorial() {
    assertEquals(1, SpecialFactorial.specialFactorial(1));
    assertEquals(2, SpecialFactorial.specialFactorial(2));
    assertEquals(12, SpecialFactorial.specialFactorial(3));
    assertEquals(288, SpecialFactorial.specialFactorial(4));
    assertEquals(34560, SpecialFactorial.specialFactorial(5));
    assertEquals(24883200, SpecialFactorial.specialFactorial(6));
    assertEquals(Long.parseLong("1254113280000"), SpecialFactorial.specialFactorial(7));
    assertEquals(Long.parseLong("523069747200000"), SpecialFactorial.specialFactorial(8));
    assertEquals(Long.parseLong("188305108992000000"), SpecialFactorial.specialFactorial(9));
    assertEquals(Long.parseLong("6082818640344576000"), SpecialFactorial.specialFactorial(10));
   }
}