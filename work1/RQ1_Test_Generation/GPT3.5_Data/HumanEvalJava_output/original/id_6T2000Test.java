```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParseNestedParensTest {

    @Test
    void testParseNestedParens1() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(1);
        expected.add(3);
        assertEquals(expected, ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())"));
    }

    @Test
    void testParseNestedParens2() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        assertEquals(expected, ParseNestedParens.parseNestedParens("() (()) ((())) (((())))"));
    }

    @Test
    void testParseNestedParens3() {
        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        assertEquals(expected, ParseNestedParens.parseNestedParens("(()(())((())))"));
    }
}
```
```java
package original;

import java.util.ArrayList;
import java.util.List;

class ParseNestedParens {

    public static List<Integer> parseNestedParens(String parenString) {
        List<Integer> result = new ArrayList<>();
        int count = 0;
        int maximum_depth = 0;
        for (int i = 0; i < parenString.length(); i++) {
            if (parenString.charAt(i) == '(') {
                count++;
                maximum_depth = Math.max(maximum_depth, count);
            } else if (parenString.charAt(i) == ')') {
                count--;
                if (count == 0) {
                    result.add(maximum_depth);
                    maximum_depth = 0;
                }
            }
        }
        return result;
    }
}
```