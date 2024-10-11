// IsPrimeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsPrime}.
* It contains one unit test case for the {@link IsPrime#isPrime(int)} method.
*/
class IsPrimeTest {

	/**
     * 
     * 
     * Test method for {@link IsPrime#isPrime(int)}
     *
     * <td>The {@link IsPrime#isPrime(int)} method should produce <code>true</code>.</td>
     *
     * <tr>
     * <td>5</td><td>Returns true</td>
     * </tr>
     *
     * <tr>
     * <td>10</td><td>Returns false</td>
     * </tr>
     *
     * <tr>
     * <td>101</td><td>Returns false</td>
     * </tr>
     *
     * <tr>
     * <td>13441</td><td>Returns true</td>
     * </tr>
     *
     * <tr>
     * <td>61</td><td>Returns false</td>
     * </tr>
     *
     * <tr>
     * <td>11</td><td>Returns false</td>
     * </tr>
     *
     * <tr>
     * <td>17</td><td>Returns false</td>
     * </tr>
     *
     * <tr>
     * <td>85</td><td>Returns false</td>
     * </tr>
     *
     * <tr>
     * <td>77</td><td>Returns false</td>
     * </tr>
     *
     * <tr>
     * <td>255379</td><td>Should produce <code>false</code>.</td>
     * </tr>
     *
     * </table>
     */
    @Test
    public void testIsPrime() {
        Boolean retVal = IsPrime.isPrime(5);
        assertFalse(retVal.booleanValue());
        assertEquals(10, retVal.intValue());
        retVal = IsPrime.isPrime(10);
        assertTrue(retVal.booleanValue());
        assertEquals(100, retVal.intValue());
        

    }

}


// IsPrime.java
