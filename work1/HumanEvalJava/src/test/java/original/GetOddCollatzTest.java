
package original;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class GetOddCollatzTest {
   @Test
   void testGetOddCollatz1() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    assertEquals(expected, GetOddCollatz.getOddCollatz(1));
   }
   @Test
   void testGetOddCollatz2() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(5);
    assertEquals(expected, GetOddCollatz.getOddCollatz(5));
   }
   @Test
   void testGetOddCollatz3() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(3);
    expected.add(5);
    assertEquals(expected, GetOddCollatz.getOddCollatz(12));
   }
   @Test
   void testGetOddCollatz4() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(5);
    expected.add(7);
    expected.add(11);
    expected.add(13);
    expected.add(17);
    assertEquals(expected, GetOddCollatz.getOddCollatz(14));
   }
}