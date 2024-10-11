// JniInchiWrapper_1Test.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiWrapper}.
* It contains ten unit test cases for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
*/
class JniInchiWrapper_1Test {

	/**
	 * Test case 1 for method {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 * <p>
	 * Test case 1 checks the method with a valid InChI string.
	 * The expected result is {@link INCHI_STATUS#VALID_STANDARD}.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_1() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		boolean strict = false;
		INCHI_STATUS expResult = INCHI_STATUS.VALID_STANDARD;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case 2 for method {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 * <p>
	 * Test case 2 checks the method with a valid InChI string.
	 * The expected result is {@link INCHI_STATUS#VALID_NON_STANDARD}.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_2() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+";
		boolean strict = false;
		INCHI_STATUS expResult = INCHI_STATUS.VALID_NON_STANDARD;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case 3 for method {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 * <p>
	 * Test case 3 checks the method with a valid InChI string.
	 * The expected result is {@link INCHI_STATUS#VALID_NON_STANDARD}.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_3() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H";
		boolean strict = false;
		INCHI_STATUS expResult = INCHI_STATUS.VALID_NON_STANDARD;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case 4 for method {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 * <p>
	 * Test case 4 checks the method with a valid InChI string.
	 * The expected result is {@link INCHI_STATUS#VALID_NON_STANDARD}.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_4() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1";
		boolean strict = false;
		INCHI_STATUS expResult = INCHI_STATUS.VALID_NON_STANDARD;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case 5 for method {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 * <p>
	 * Test case 5 checks the method with a valid InChI string.
	 * The expected result is {@link INCHI_STATUS#VALID_NON_STANDARD}.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_5() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1/p-1";
		boolean strict = false;
		INCHI_STATUS expResult = INCHI_STATUS.VALID_NON_STANDARD;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case 6 for method {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 * <p>
	 * Test case 6 checks the method with a valid InChI string.
	 * The expected result is {@link INCHI_STATUS#VALID_NON_STANDARD}.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_6() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1/p-1/t2-,4+";
		boolean strict = false;
		INCHI_STATUS expResult = INCHI_STATUS.VALID_NON_STANDARD;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case 7 for method {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 * <p>
	 * Test case 7 checks the method with a valid InChI string.
	 * The expected result is {@link INCHI_STATUS#VALID_NON_STANDARD}.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_7() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1/p-1/t2-,4+/m1/s1";
		boolean strict = false;
		INCHI_STATUS expResult = INCHI_STATUS.VALID_NON_STANDARD;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case 8 for method {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 * <p>
	 * Test case 8 checks the method with a valid InChI string.
	 * The expected result is {@link INCHI_STATUS#VALID_NON_STANDARD}.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_8() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1/p-1/t2-,4+/m1/s1/i2-1";
		boolean strict =