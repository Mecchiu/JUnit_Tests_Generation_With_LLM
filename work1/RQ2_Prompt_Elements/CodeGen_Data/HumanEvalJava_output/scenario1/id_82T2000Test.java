// PrimeLengthTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeLength}.
* It contains one unit test case for the {@link PrimeLength#primeLength(String)} method.
*/
class PrimeLengthTest {

	final private int N; /// @SelfParameter

	final private int K;

	/**
	* Constructor of {@link PrimeLengthTest}.
	* @param N the number of elements.
	* @param K the size of the array.
	*/
	PrimeLengthTest(int N, int K) {
		this.N = N;
		this.K = K;
	}
	
	/**
	* Test the given {@link int} value of the given {@link String}.
	*/
	@Test
	public void test() {

		final char[] table = new char[N + 2];
		IntIterator it = new IntIterator();
		it.next();
		for (int i = 0; i < N; ) {
			it.next();
			table[i] = (char) (it.index() + '0');
			i ++;
		}

    // Verify
    if (table[N] == '-') {
      assertEquals(N, primeLength(table));
    } else if (table[N] == '0') {
      for (int i = 0; i < N; i++) {
        assertEquals("" + (char) (i + '0'), table[i]);
      }
    }

    // Fill it
    while (k--!= 0) {
      table[N] = '0';
      N++;
    }

    // Verify
    if (N == 0) {
      assertEquals(N, primeLength(table));
    } else if (table[N] == '-') {
      assertEquals(N, primeLength(table));
    } else if (table[N] == '0') {
      for (int i = 0; i < N; i++) {
        assertEquals("" + (char) (i + '0'), table[i]);
      }
    } else {
      for (int i = 0; i < N; i++) {
        assertEquals("" + (char) (i + '0'), table[i]);
      }
    }
  }
// End class PrimeLengthTest.java
}