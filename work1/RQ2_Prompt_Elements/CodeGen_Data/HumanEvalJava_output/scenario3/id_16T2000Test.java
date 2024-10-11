// CountDistinctCharactersTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains one unit test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {

    /**
     * Test method for {@link CountDistinctCharacters#countDistinctCharacters(String)}.
     */
    @Test
    public void testCountDistinctCharacters1() {
        assertEquals(0, new CountDistinctCharacters().countDistinctCharacters(""));
        assertEquals(0, new CountDistinctCharacters().countDistinctCharacters("a"));
        assertEquals(0, new CountDistinctCharacters().countDistinctCharacters("b"));
        assertEquals(0, new CountDistinctCharacters().countDistinctCharacters(" "));
        assertEquals(0, new CountDistinctCharacters().countDistinctCharacters("cde"));
    }

    /**
     * Test method for {@link CountDistinctCharacters#countDistinctCharacters(String)}.
     * <p> This should be equal to {@link Number#toString(short)}'s {@link Number#toString(Byte)},
     * <ul>
     * <li> {@link Short#toString(short)} for a short {@code s} whose value is equal only to one of: "<code>".
     * <li> {@link Integer#toString(int)} for an integer {@code x} whose value is equal only to one of: "<code>",
     *     <code>'9'</code> and {@code 'x'}, for a value {@code x} with length greater than one:
     *         <ul>
     *             <li> <code>'11' [...]</code>
     *             <li> <code>'111' [...]</code>
     *             <li> <code>'111x' [...]</code>
     *         </ul>
     * </ul>
     */
    @Test
    public void testCountDistinctCharacters2() {
        assertEquals("", new CountDistinctCharacters().countDistinctCharacters(""));
        assertEquals("", new CountDistinctCharacters().countDistinctCharacters("a"));
        assertEquals("", new CountDistinctCharacters().countDistinctCharacters("b"));
        assertEquals("", new CountDistinctCharacters().countDistinctCharacters(" "));
        assertEquals("", new CountDistinctCharacters().countDistinctCharacters("cde"));
    }

    /**
     * Test method for {@link CountDistinctCharacters#countDistinctCharacters(String)}.
     * <p> This should be equal to {@link Number#toString(short)}'s {@link Number#toString(Byte)},
     * <ul>
     * <li> {@link Short#toString(short)} for a short {@code s} whose value is equal only to one of: "<code>".
     * <li> {@link Integer#toString(int)} for an integer {@code x} whose value is equal only to one of: "<code>",
     *     <code>'9'</code> and {@code 'x'}, for a value {@code x} with length greater than one:
     *         <ul>
     *             <li> <code>'11' [...]</code>
     *             <li> <code>'111' [...]</code>
     *             <li> <code>'111x' [...]</code>
     *         </ul>
     * </ul>
     */
    @Test
    public void testCountDistinctCharacters3() {
        assertEquals("", new CountDistinctCharacters().countDistinctCharacters(""));
        assertEquals("", new CountDistinctCharacters().countDistinctCharacters("a"));
        assertEquals("", new CountDistinctCharacters().countDistinctCharacters("b"));
        assertEquals("", new CountDistinctCharacters().countDistinctCharacters(" "));
        assertEquals("", new CountDistinctCharacters().countDistinctCharacters("cde"));
    }
}
