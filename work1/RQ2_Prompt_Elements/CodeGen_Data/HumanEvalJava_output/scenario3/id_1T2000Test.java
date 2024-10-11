// SeparateParenGroupsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SeparateParenGroups}.
* It contains one unit test case for the {@link SeparateParenGroups#separateParenGroups(String)} method.
*/
class SeparateParenGroupsTest {

	/**
    * Test method for {@link SeparateParenGroups#separateParenGroups(String)}.
    */
    @Test
    public void testSeparateParenGroups() {
        List<String> list = SeparateParenGroups.separateParenGroups("()");
        assertEquals("", list);
        list = SeparateParenGroups.separateParenGroups("()()()()()()()()()()()()()()()())" );
        assertEquals("()()()(),()()", list);
        list = SeparateParenGroups.separateParenGroups("()     ()()()()()()()()()()");
        assertEquals("", list);
        list = SeparateParenGroups.sameParenGroups(SeparateParenGroups.separateParenGroups("()    (), ()       (),()"));
        assertEquals("", list);
        list = SeparateParenGroups.separateParenGroups("()()()()()()()()()()()()()()()()()()()()()()()())";
        assertEquals("()()()()()(),()()", list);
        list = SeparateParenGroups.separateParenGroups("()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()");
        assertEquals("()()()()()(),()()", list);
    }

}