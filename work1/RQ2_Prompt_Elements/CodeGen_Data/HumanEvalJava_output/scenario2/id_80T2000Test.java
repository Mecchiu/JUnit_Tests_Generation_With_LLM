// IsHappyTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains one unit test case for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {

    @Test
    public void test() {
        assertEquals(true, IsHappy.isHappy("Happy"));
    }
}