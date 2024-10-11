public class IsMultiplyPrimeTest {

    @Test
    void testIsMultiplyPrimeWithValidInput() {
        assertTrue(IsMultiplyPrime.isMultiplyPrime(2 * 3 * 5));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(2 * 7 * 11));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(3 * 5 * 13));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(2 * 2 * 13 * 19));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(2 * 3 * 5 * 7 * 11));
    }

    @Test
    void testIsMultiplyPrimeWithInvalidInput() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(2 * 3 * 4));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(2 * 7 * 8));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(3 * 5 * 7));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(2 * 2 * 13 * 17));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(2 * 3 * 5 * 7 * 13));
    }

    @Test
    void testIsMultiplyPrimeWithZero() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(0));
    }

    @Test
    void testIsMultiplyPrimeWithOne() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(1));
    }

    @Test
    void testIsMultiplyPrimeWithNegativeInput() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(-10));
    }

    @Test
    void testIsMultiplyPrimeWithLargeInput() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(101 * 103 * 107));
    }

    @Test
    void testIsMultiplyPrimeWithPrimeInput() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(2 * 3 * 5 * 7));
    }

    @Test
    void testIsMultiplyPrimeWithTwoPrimes() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(2 * 3));
    }

    @Test
    void testIsMultiplyPrimeWithThreePrimesAndOneNonPrime() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(2 * 3 * 5 * 4));
    }

    @Test
    void testIsMultiplyPrimeWithThreePrimesAndTwoNonPrimes() {
        assertFalse(IsMultiplyPrime.isMultiplyPrime(2 * 3 * 5 * 4 * 6));
    }
}