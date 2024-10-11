// LongestTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains one unit test case for the {@link Longest#longest(List)} method.
*/
class LongestTest {

    @Test
    void test() {
        List<Object> strings = List.of("abc", "def", "ghi", "klm");
        System.out.println(Longest.longest(strings).toString());
    }
}