
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
   @Test
   void testGetOddCollatz5() {
    List<Integer> expected = new ArrayList<Integer>();
    expected.add(1);
    expected.add(5);
    expected.add(7);
    expected.add(11);
    expected.add(13);
    expected.add(17);
    expected.add(19);
    expected.add(23);
    expected.add(27);
    expected.add(31);
    expected.add(41);
    expected.add(47);
    expected.add(55);
    expected.add(71);
    expected.add(83);
    expected.add(95);
    expected.add(111);
    expected.add(123);
    expected.add(143);
    expected.add(167);
    expected.add(195);
    expected.add(227);
    expected.add(263);
    expected.add(307);
    expected.add(359);
    expected.add(419);
    expected.add(487);
    expected.add(567);
    expected.add(663);
    expected.add(775);
    expected.add(903);
    expected.add(1055);
    expected.add(1231);
    expected.add(1439);
    expected.add(1671);
    expected.add(1951);
    expected.add(2271);
    expected.add(2639);
    expected.add(3071);
    expected.add(3591);
    expected.add(4191);
    expected.add(4871);
    expected.add(5671);
    expected.add(6631);
    expected.add(7751);
    expected.add(9031);
    expected.add(10551);
    expected.add(12311);
    expected.add(14391);
    expected.add(16711);
    expected.add(19511);
    expected.add(22711);
    expected.add(26391);
    expected.add(30711);
    expected.add(35911);
    expected.add(41911);
    expected.add(48711);
    expected.add(56711);
    expected.add(66311);
    expected.add(77511);
    expected.add(90311);
    expected.add(105551);
    expected.add(123111);
    expected.add(143911);
    expected.add(167111);
    expected.add(195111);
    expected.add(227111);
    expected.add(263911);
    expected.add(307111);
    expected.add(359111);
    expected.add(419111);
    expected.add(487111);
    expected.add(567111);
    expected.add(663111);
    expected.add(775111);
    expected.add(903111);
    expected.add(1055551);
    expected.add(1231111);
    expected.add(1439111);
    expected.add(1671111);
    expected.add(1951111);
    expected.add(2271111);
    expected.add(2639111);
    expected.add(3071111);
    expected.add(3591111);
    expected.add(4191111);
    expected.add(4871111);
    expected.add(5671111);
    expected.add(6631111);
    expected.add(7751111);
    expected.add(9031111);
    expected.add(10555551);
    expected.add(12311111);
    expected.add(14391111);
    expected.add(16711111);
    expected.add(19511111);
    expected.add(22711111);
    expected.add(26391111);
    expected.add(30711111);
    expected.add(35911111);
    expected.add(41911111);
    expected.add(48711111);
    expected.add(56711111);
    expected.add(66311111);
    expected.add(77511111);
    expected.add(90311111);
    expected.add(105555551);
    expected.add(123111111);
    expected.add(143911111);
    expected.add(167111111);
    expected.add(195111111);
    expected.add(227111111);
    expected.add(263911111);
    expected.add(307111111);
    expected.add(359111111);
    expected.add(419111111);
    expected.add(487111111);
    expected.add(567111111);
    expected.add(663111111);
    expected.add(775111111);
    expected.add(903111111);
    expected.add(1055555551);
    expected.add(1231111111);
    expected.add(1439111111);
    expected.add(1671111111);
    expected.add(1951111111);
    expected.add(Integer.parseInt("2271111111"));
    expected.add(Long.parseLong("2639111111"));
    expected.add(Long.parseLong("3071111111"));
    expected.add(Long.parseLong("3591111111"));
    expected.add(Long.parseLong("4191111111"));
    expected.add(Long.parseLong("4871111111"));
    expected.add(Long.parseLong("5671111111"));
    expected.add(Long.parseLong("6631111111"));
    expected.add(Long.parseLong("7751111111"));
    expected.add(Long.parseLong("9031111111"));
    expected.add(Long.parseLong("10555555551"));
    expected.add(Long.parseLong("12311111111"));
    expected.add(Long.parseLong("14391111111"));
    expected.add(Long.parseLong("16711111111"));
    expected.add(Long.parseLong("19511111111"));
    expected.add(Long.parseLong("22711111111"));
    expected.add(Long.parseLong("26391111111"));
    expected.add(Long.parseLong("30711111111"));
    expected.add(Long.parseLong("35911111111"));
    expected.add(Long.parseLong("41911111111"));
    expected.add(Long.parseLong("48711111111"));
    expected.add(Long.parseLong("56711111111"));
    expected.add(Long.parseLong("66311111111"));
    expected.add(Long.parseLong("77511111111"));
    expected.add(Long.parseLong("90311111111"));
    expected.add(Long.parseLong("105555555551"));
    expected.add(Long.parseLong("123111111111"));
    expected.add(Long.parseLong("143911111111"));
    expected.add(Long.parseLong("167111111111"));
    expected.add(Long.parseLong("195111111111"));
    expected.add(Long.parseLong("227111111111"));
    expected.add(Long.parseLong("263911111111"));
    expected.add(Long.parseLong("307111111111"));
    expected.add(Long.parseLong("359111111111"));
    expected.add(Long.parseLong("419111111111"));
    expected.add(Long.parseLong("487111111111"));
    expected.add(Long.parseLong("567111111111"));
    expected.add(Long.parseLong("663111111111"));
    expected.add(Long.parseLong("775111111111"));
    expected.add(Long.parseLong("903111111111"));
    expected.add(Long.parseLong("1055555555551"));
    expected.add(Long.parseLong("1231111111111"));
    expected.add(Long.parseLong("1439111111111"));
    expected.add(Long.parseLong("1671111111111"));
    expected.add(Long.parseLong("1951111111111"));
    expected.add(Long.parseLong("2271111111111"));
    expected.add(Long.parseLong("2639111111111"));
    expected.add(Long.parseLong("3071111111111"));
    expected.add(Long.parseLong("3591111111111"));
    expected.add(Long.parseLong("4191111111111"));
    expected.add(Long.parseLong("4871111111111"));
    expected.add(Long.parseLong("5671111111111"));
    expected.add(Long.parseLong("6631111111111"));
    expected.add(Long.parseLong("7751111111111"));
    expected.add(Long.parseLong("9031111111111"));
    expected.add(Long.parseLong("10555555555551"));
    expected.add(Long.parseLong("12311111111111"));
    expected.add(Long.parseLong("14391111111111"));
}
}