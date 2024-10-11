// FlipCaseTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {
			@Test
    void testFlipCase() {
        assertEquals("hELLO wORLD", FlipCase.flipCase("Hello World"));
        assertEquals("hELLO wORLD", FlipCase.flipCase("Hello World"));
        assertEquals("hELLO wORLD", FlipCase.flipCase("Hello World"));
        assertEquals("hELLO wORLD", FlipCase.flipCase("Hello World"));
        assertEquals("hELLO wORLD", FlipCase.flipCase("Hello World"));
        assertEquals("hELLO wORLD", FlipCase.flipCase("Hello World"));
        assertEquals("hELLO wORLD", FlipCase.flipCase("Hello World"));
        assertEquals("hELLO wORLD", FlipCase.flipCase("Hello World"));
        assertEquals("hELLO wORLD", FlipCase.flipCase("Hello World"));
        assertEquals("hELLO wORLD", FlipCase.flipCase("Hello World"));
    }
}