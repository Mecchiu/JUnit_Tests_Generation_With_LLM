// IsBoredTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains one unit test case for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {

    int m_count;

    /**
     * Constructor for the class
     */
    public IsBoredTest() {
        m_count = 0;
    }

    /**
     * 
     * @param args
     */
    @Test
    public void isBoredTest() {
        assertEquals(true, IsBored.isBored("I"));
        assertEquals(true, IsBored.isBored("I"));
        assertEquals(true, IsBored.isBored("I"));
        assertEquals(true, IsBored.isBored("Is the sky"));
        assertEquals(false, IsBored.isBored("bIt"));
        assertEquals(true, IsBored.isBored("I, that's not cool, that's cool"));
        assertEquals(true, IsBored.isBored("I"));
        assertEquals(false, IsBored.isBored("He is so bad"));
    }
}
