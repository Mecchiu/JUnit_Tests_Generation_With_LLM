```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

class Maximum1Test {

    @Test
    void testMaximum1() {
        List<Integer> input1 = Arrays.asList(-3, -4, 5);
        List<Integer> output1 = Arrays.asList(-4, -3, 5);
        assertEquals(output1, Maximum1.maximum(input1, 3));

        List<Integer> input2 = Arrays.asList(4, -4, 4);
        List<Integer> output2 = Arrays.asList(4, 4);
        assertEquals(output2, Maximum1.maximum(input2, 2));

        List<Integer> input3 = Arrays.asList(-3, 2, 1, 2, -1, -2, 1);
        List<Integer> output3 = Collections.singletonList(2);
        assertEquals(output3, Maximum1.maximum(input3, 1));

        List<Integer> input4 = Arrays.asList(123, -123, 20, 0, 1, 2, -3);
        List<Integer> output4 = Arrays.asList(2, 20, 123);
        assertEquals(output4, Maximum1.maximum(input4, 3));

        List<Integer> input5 = Arrays.asList(-123, 20, 0, 1, 2, -3);
        List<Integer> output5 = Arrays.asList(0, 1, 2, 20);
        assertEquals(output5, Maximum1.maximum(input5, 4));

        List<Integer> input6 = Arrays.asList(5, 15, 0, 3, -13, -8, 0);
        List<Integer> output6 = Arrays.asList(-13, -8, 0, 0, 3, 5, 15);
        assertEquals(output6, Maximum1.maximum(input6, 7));

        List<Integer> input7 = Arrays.asList(-1, 0, 2, 5, 3, -10);
        List<Integer> output7 = Arrays.asList(3, 5);
        assertEquals(output7, Maximum1.maximum(input7, 2));

        List<Integer> input8 = Arrays.asList(1, 0, 5, -7);
        List<Integer> output8 = Collections.singletonList(5);
        assertEquals(output8, Maximum1.maximum(input8, 1));

        List<Integer> input9 = Arrays.asList(4, -4);
        List<Integer> output9 = Arrays.asList(-4, 4);
        assertEquals(output9, Maximum1.maximum(input9, 2));

        List<Integer> input10 = Arrays.asList(-10, 10);
        List<Integer> output10 = Arrays.asList(-10, 10);
        assertEquals(output10, Maximum1.maximum(input10, 2));

        List<Integer> input11 = Arrays.asList(1, 2, 3, -23, 243, -400, 0);
        List<Integer> output11 = Collections.emptyList();
        assertEquals(output11, Maximum1.maximum(input11, 0));
    }
}
```
