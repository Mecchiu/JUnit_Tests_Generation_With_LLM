// StartsOneEndsTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartsOneEnds}.
* It contains one unit test case for the {@link StartsOneEnds#startsOneEnds(int)} method.
*/
class StartsOneEndsTest {
/**
		 * Unit test for {@link StartsOneEnds#startsOneEnds(int)}.
		 */
  @Test
    public void testStartsOneEnds() {
		
		assertEquals("startsOneEnds: 1 starts", 1, startsOneEnds(1));
		assertEquals("startsOneEnds: 2 starts", 2, startsOneEnds(2));
		assertEquals("startsOneEnds: 3 starts", 3, startsOneEnds(3));
		assertEquals("startsOneEnds: 4 starts", 4, startsOneEnds(4));
		assertEquals("startsOneEnds: 5 starts", 5, startsOneEnds(5));
		assertEquals("startsOneEnds: 6 starts", 6, startsOneEnds(6));
		
    }

}

// Generated code start ends.java end
