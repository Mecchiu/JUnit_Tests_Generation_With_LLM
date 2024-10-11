```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

class GetPositiveTest {

    @Test
    void testGetPositive() {
        List<Object> input1 = new ArrayList<>();
        input1.add(-1);
        input1.add(2);
        input1.add(-4);
        input1.add(5);
        input1.add(6);
        List<Object> expected1 = new ArrayList<>();
        expected1.add(2);
        expected1.add(5);
        expected1.add(6);
        assertEquals(expected1, GetPositive.getPositive(input1));

        List<Object> input2 = new ArrayList<>();
        input2.add(5);
        input2.add(3);
        input2.add(-5);
        input2.add(2);
        input2.add(-3);
        input2.add(3);
        input2.add(9);
        input2.add(0);
        input2.add(123);
        input2.add(1);
        input2.add(-10);
        List<Object> expected2 = new ArrayList<>();
        expected2.add(5);
        expected2.add(3);
        expected2.add(2);
        expected2.add(3);
        expected2.add(9);
        expected2.add(123);
        expected2.add(1);
        assertEquals(expected2, GetPositive.getPositive(input2));

        List<Object> input3 = new ArrayList<>();
        input3.add(-1);
        input3.add(-2);
        input3.add(4);
        input3.add(5);
        input3.add(6);
        List<Object> expected3 = new ArrayList<>();
        expected3.add(4);
        expected3.add(5);
        expected3.add(6);
        assertEquals(expected3, GetPositive.getPositive(input3));

        List<Object> input4 = new ArrayList<>();
        input4.add(5);
        input4.add(3);
        input4.add(-5);
        input4.add(2);
        input4.add(3);
        input4.add(3);
        input4.add(9);
        input4.add(0);
        input4.add(123);
        input4.add(1);
        input4.add(-10);
        List<Object> expected4 = new ArrayList<>();
        expected4.add(5);
        expected4.add(3);
        expected4.add(2);
        expected4.add(3);
        expected4.add(3);
        expected4.add(9);
        expected4.add(123);
        expected4.add(1);
        assertEquals(expected4, GetPositive.getPositive(input4));

        List<Object> input5 = new ArrayList<>();
        input5.add(-1);
        input5.add(-2);
        List<Object> expected5 = new ArrayList<>();
        assertEquals(expected5, GetPositive.getPositive(input5));

        List<Object> input6 = new ArrayList<>();
        List<Object> expected6 = new ArrayList<>();
        assertEquals(expected6, GetPositive.getPositive(input6));
    }
}
```
