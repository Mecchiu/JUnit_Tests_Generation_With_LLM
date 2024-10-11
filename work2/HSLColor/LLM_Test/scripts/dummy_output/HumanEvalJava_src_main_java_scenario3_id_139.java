
package scenario3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SpecialFactorialTest {
   @Test
   void testSpecialFactorial() {
    assertEquals(288, SpecialFactorial.specialFactorial(4));
    assertEquals(34560, SpecialFactorial.specialFactorial(5));
    assertEquals(Long.parseLong("125411328000"), SpecialFactorial.specialFactorial(7));
    assertEquals(1, SpecialFactorial.specialFactorial(1));
    assertEquals(1, SpecialFactorial.specialFactorial(0));
    assertEquals(1, SpecialFactorial.specialFactorial(-1));
    assertEquals(1, SpecialFactorial.specialFactorial(-2));
    assertEquals(1, SpecialFactorial.specialFactorial(-3));
    assertEquals(1, SpecialFactorial.specialFactorial(-4));
    assertEquals(1, SpecialFactorial.specialFactorial(-5));
   }
}