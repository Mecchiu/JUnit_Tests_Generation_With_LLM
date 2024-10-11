```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChooseNumTest {

    @Test
    void testChooseNum_Example1() {
        assertEquals(14, ChooseNum.chooseNum(12, 15));
    }

    @Test
    void testChooseNum_Example2() {
        assertEquals(-1, ChooseNum.chooseNum(13, 12));
    }

    @Test
    void testChooseNum_LowerBound() {
        assertEquals(12354, ChooseNum.chooseNum(33, 12354));
    }

    @Test
    void testChooseNum_NoEvenNumberInRange() {
        assertEquals(-1, ChooseNum.chooseNum(5234, 5233));
    }

    @Test
    void testChooseNum_MaxEvenNumberInRange() {
        assertEquals(28, ChooseNum.chooseNum(6, 29));
    }

    @Test
    void testChooseNum_NoEvenNumberInRange2() {
        assertEquals(-1, ChooseNum.chooseNum(27, 10));
    }

    @Test
    void testChooseNum_SingleNumber() {
        assertEquals(-1, ChooseNum.chooseNum(7, 7));
    }

    @Test
    void testChooseNum_SameNumbers() {
        assertEquals(546, ChooseNum.chooseNum(546, 546));
    }

    @Test
    void testChooseNum_LowerBoundWithEvenNumber() {
        assertEquals(6, ChooseNum.chooseNum(6, 7));
    }

    @Test
    void testChooseNum_LowerBoundWithOddNumber() {
        assertEquals(6, ChooseNum.chooseNum(5, 7));
    }
}
```
