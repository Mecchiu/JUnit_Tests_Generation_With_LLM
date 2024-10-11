
package scenario1;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FTest {
    @Test
    void testF1() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        List<Integer> actual = F.f(10);
        assertEquals(expected, actual);
    }
    @Test
    void testF2() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        List<Integer> actual = F.f(11);
        assertEquals(expected, actual);
    }
    @Test
    void testF3() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        List<Integer> actual = F.f(12);
        assertEquals(expected, actual);
    }
    @Test
    void testF4() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        expected.add(479001600);
        List<Integer> actual = F.f(13);
        assertEquals(expected, actual);
    }
    @Test
    void testF5() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        expected.add(479001600);
        expected.add(14);
        List<Integer> actual = F.f(14);
        assertEquals(expected, actual);
    }
    @Test
    void testF6() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        expected.add(479001600);
        expected.add(14);
        expected.add(Long.parseLong("6227020800"));
        List<Integer> actual = F.f(15);
        assertEquals(expected, actual);
    }
    @Test
    void testF7() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        expected.add(479001600);
        expected.add(14);
        expected.add(Long.parseLong("6227020800"));
        expected.add(16);
        List<Integer> actual = F.f(16);
        assertEquals(expected, actual);
    }
    @Test
    void testF8() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        expected.add(479001600);
        expected.add(14);
        expected.add(Long.parseLong("6227020800"));
        expected.add(16);
        expected.add(Long.parseLong("87178291200"));
        List<Integer> actual = F.f(17);
        assertEquals(expected, actual);
    }
    @Test
    void testF9() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        expected.add(479001600);
        expected.add(14);
        expected.add(Long.parseLong("6227020800"));
        expected.add(16);
        expected.add(Long.parseLong("87178291200"));
        expected.add(18);
        List<Integer> actual = F.f(18);
        assertEquals(expected, actual);
    }
    @Test
    void testF10() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(120);
        expected.add(6);
        expected.add(720);
        expected.add(8);
        expected.add(40320);
        expected.add(10);
        expected.add(3628800);
        expected.add(12);
        expected.add(479001600);
        expected.add(14);
        expected.add(Long.parseLong("6227020800"));
        expected.add(16);
        expected.add(Long.parseLong("87178291200"));
        expected.add(18);
        expected.add(Long.parseLong("1307674368000"));
        List<Integer> actual = F.f(19);
        assertEquals(expected, actual);
    }
}