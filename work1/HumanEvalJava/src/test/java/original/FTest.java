
package original;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FTest {
   @Test
   void testF() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(2);
    expected.add(6);
    expected.add(24);
    expected.add(15);
    assertEquals(expected, F.f(5));
   }
   @Test
   void testF2() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(2);
    expected.add(6);
    expected.add(24);
    expected.add(15);
    expected.add(720);
    expected.add(28);
    assertEquals(expected, F.f(7));
   }
   @Test
   void testF3() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    assertEquals(expected, F.f(1));
   }
   @Test
   void testF4() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(2);
    expected.add(6);
    assertEquals(expected, F.f(3));
   }
   @Test
   void testF5() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(2);
    expected.add(6);
    expected.add(24);
    expected.add(120);
    expected.add(720);
    expected.add(5040);
    expected.add(40320);
    expected.add(362880);
    expected.add(3628800);
    assertEquals(expected, F.f(10));
   }
   @Test
   void testF6() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(2);
    expected.add(6);
    expected.add(24);
    expected.add(15);
    expected.add(720);
    expected.add(28);
    expected.add(40320);
    expected.add(362880);
    expected.add(3628800);
    assertEquals(expected, F.f(10));
   }
   @Test
   void testF7() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(2);
    expected.add(6);
    expected.add(24);
    expected.add(15);
    expected.add(720);
    expected.add(28);
    expected.add(40320);
    expected.add(362880);
    expected.add(3628800);
    expected.add(39916800);
    expected.add(479001600);
    assertEquals(expected, F.f(12));
   }
}