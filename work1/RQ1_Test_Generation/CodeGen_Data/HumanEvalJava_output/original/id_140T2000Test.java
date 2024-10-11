// FixSpacesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains one unit test case for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
/**
		 * Test to ensure {@link FixSpaces#fixSpaces(String)} method returns given value unchanged.
		 */
    @Test
    void testFixSpaces1() {
        String text = "Example";
        System.out.println(fixSpaces(text));
        assertEquals("Example", fixSpaces(text));
    }
		/**
		 * Test to ensure {@link FixSpaces#fixSpaces(String)} method returns given value unchanged.
		 */
    @Test
    void testFixSpaces2() {
        String text = "Example-1";
        System.out.println(fixSpaces(text));
        assertEquals("_Example-1______", fixSpaces(text));
    }
		/**
		 * Test to ensure {@link FixSpaces#fixSpaces(String)} method returns given value unchanged.
		 */
    @Test
    void testFixSpaces3() {
        String text = " Example2";
        System.out.println(fixSpaces(text));
        assertEquals("Exa 2 2 _Exa_2_", fixSpaces(text));
    }
		/**
		 * Test to ensure {@link FixSpaces#fixSpaces(String)} method returns given value unchanged.
		 */
    @Test
    void testFixSpaces4() {
        String text = " Example  fellow";
        System.out.println(fixSpaces(text));
        assertEquals("Exa 1 1 -Exa_1_fellow-", fixSpaces(text));
    }
		/**
		 * Test to ensure {@link FixSpaces#fixSpaces(String)} method does not return given value unchanged.
		 */
    @Test
    void testFixSpaces5() {
        String text = " Exa  fellow";
        System.out.println(fixSpaces(text));
        assertEquals("Exa 1 1 -Exa_1_fellow", fixSpaces(text));
    }
		/**
		 * Test to ensure {@link FixSpaces#fixSpaces(String)} method does not return given value unchanged.
		 */
    @Test
    void testFixSpaces6() {
        String text = "   Exa1   fellow";
        System.out.println(fixSpaces(text));
        assertEquals("-Exa1_-_fellow_-", fixSpaces(text));
    }
		/**
		 * Test to ensure {@link FixSpaces#fixSpaces(String)} method returns given value unchanged if given string is empty or null.
		 */
    @Test
    void testFixSpaces7() {
        String empty = "";
        assertEquals("", fixSpaces(empty));
    }

}