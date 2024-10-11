// Add1Test.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add1}.
* It contains one unit test case for the {@link Add1#add(List)} method.
*/
class Add1Test {

    @Test
    void testAdd1() {
        System.out.println(new Add1().add(Arrays.asList(-1, -5, 21)));
    }

}