// CycpatternCheckTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains one unit test case for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {
private final String A = "123456789";
		private final String B = "1234567";
		private final String C = "xyz4567";
		private final String D = "12345678";

    @Test
    void testCycpatternCheck(){
        assertEquals(true, CycpatternCheck.cycpatternCheck(A, B));
         assertEquals(true, CycpatternCheck.cycpatternCheck(C, D));
        assertEquals(false, CycpatternCheck.cycpatternCheck(A, D));
        assertEquals(false, CycpatternCheck.cycpatternCheck(B, A));
    }	
}
