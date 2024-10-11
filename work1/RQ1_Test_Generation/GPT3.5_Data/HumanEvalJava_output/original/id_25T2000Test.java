```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

class FactorizeTest {

    @Test
    void testFactorize8() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(2);
        assertEquals(expected, Factorize.factorize(8));
    }

    @Test
    void testFactorize25() {
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(5);
        assertEquals(expected, Factorize.factorize(25));
    }

    @Test
    void testFactorize70() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(5);
        expected.add(7);
        assertEquals(expected, Factorize.factorize(70));
    }

    @Test
    void testFactorize2() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        assertEquals(expected, Factorize.factorize(2));
    }

    @Test
    void testFactorize4() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        assertEquals(expected, Factorize.factorize(4));
    }

    @Test
    void testFactorize57() {
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(19);
        assertEquals(expected, Factorize.factorize(57));
    }

    @Test
    void testFactorize3249() {
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(3);
        expected.add(19);
        expected.add(19);
        assertEquals(expected, Factorize.factorize(3249));
    }

    @Test
    void testFactorize185193() {
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(3);
        expected.add(3);
        expected.add(19);
        expected.add(19);
        expected.add(19);
        assertEquals(expected, Factorize.factorize(185193));
    }

    @Test
    void testFactorize20577() {
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(19);
        expected.add(19);
        expected.add(19);
        assertEquals(expected, Factorize.factorize(20577));
    }

    @Test
    void testFactorize18() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(3);
        assertEquals(expected, Factorize.factorize(18));
    }
}
```
