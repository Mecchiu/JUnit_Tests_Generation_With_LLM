// TriTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Tri}.
* It contains one unit test case for the {@link Tri#tri(int)} method.
*/
class TriTest {

  private final static String[] TEST_DETAILS = { "", "1" };
	

    @org.junit.jupiter.api.Test
    void testTri(@org.junit.jupiter.api.ParameterizedTest @org.junit.jupiter.api.TestParametrized @OverrideClass {
		{true}
    }.asList(TEST_DETAILS);

  @Test
  public void testTestTri() {
	  
    List<Object> expected = Arrays.asList(new Object[] {1});
	  
    assertEquals(expected, new Tri().tri(1));
  }
  

}
