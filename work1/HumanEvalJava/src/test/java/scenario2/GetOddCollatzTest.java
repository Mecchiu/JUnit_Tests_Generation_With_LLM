
package scenario2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class GetOddCollatzTest {
   @Test
   void testGetOddCollatz() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    assertEquals(expected, GetOddCollatz.getOddCollatz(1));
   }
}