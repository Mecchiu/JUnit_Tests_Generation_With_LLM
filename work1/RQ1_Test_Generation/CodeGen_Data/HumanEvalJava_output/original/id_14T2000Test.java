// AllPrefixesTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AllPrefixes}.
* It contains one unit test case for the {@link AllPrefixes#allPrefixes(String)} method.
*/
class AllPrefixesTest {

    @Test
    void test(){
        AllPrefixes e = new AllPrefixes();
        List<Object> list = e.allPrefixes("b");
        assertTrue(list.size() == 4);
        assertFalse(list.contains("d"));
    }

}