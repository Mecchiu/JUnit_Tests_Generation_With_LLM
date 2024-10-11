import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CycpatternCheckTest {

    @Test
    void testCycpatternCheck() {
        assertTrue(CycpatternCheck.cycpatternCheck("hello", "lohel"));
        assertTrue(CycpatternCheck.cycpatternCheck("world", "ldwor"));
        assertTrue(CycpatternCheck.cycpatternCheck("coding", "ingcod"));
        assertTrue(CycpatternCheck.cycpatternCheck("java", "avaj"));
        assertTrue(CycpatternCheck.cycpatternCheck("python", "thonpy"));
        assertFalse(CycpatternCheck.cycpatternCheck("hello", "world"));
        assertFalse(CycpatternCheck.cycpatternCheck("coding", "codingcoding"));
        assertFalse(CycpatternCheck.cycpatternCheck("java", "javajava"));
        assertFalse(CycpatternCheck.cycpatternCheck("python", "pythonton"));
        assertFalse(CycpatternCheck.cycpatternCheck("hello", "lohle"));
    }
}