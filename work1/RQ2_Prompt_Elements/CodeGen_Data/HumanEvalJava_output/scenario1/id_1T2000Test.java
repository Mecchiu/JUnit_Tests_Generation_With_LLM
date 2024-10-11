// SeparateParenGroupsTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SeparateParenGroups}.
* It contains one unit test case for the {@link SeparateParenGroups#separateParenGroups(String)} method.
*/
class SeparateParenGroupsTest {

  
  @Test
  void separateParenGroupsTest() {
      
    assertEquals(3, splitInt("(((((())))()()()()()()(()())))").size());
    assertEquals(2, splitInt("(((()()))()()()()()()())()()()()()()()()()())"));
    assertEquals(1, splitInt("()()()()()()()()"));
    assertEquals(1, splitInt("()()()()()()()"));
	
  }
}
