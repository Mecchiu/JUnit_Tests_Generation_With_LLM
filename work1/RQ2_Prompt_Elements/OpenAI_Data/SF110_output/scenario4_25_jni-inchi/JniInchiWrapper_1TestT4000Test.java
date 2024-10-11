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
	 * Test case for {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	 * It tests the case when the input string is null.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_1() throws JniInchiException {
		String inchi = null;
		boolean strict = false;
		INCHI_STATUS expResult = INCHI_STATUS.INCHI_INVALID_INCHI;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	 * It tests the case when the input string is empty.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_2() throws JniInchiException {
		String inchi = "";
		boolean strict = false;
		INCHI_STATUS expResult = INCHI_STATUS.INCHI_INVALID_INCHI;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	 * It tests the case when the input string is not a valid InChI.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_3() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		boolean strict = false;
		INCHI_STATUS expResult = INCHI_STATUS.INCHI_INVALID_INCHI;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	 * It tests the case when the input string is a valid InChI.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_4() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+";
		boolean strict = false;
		INCHI_STATUS expResult = INCHI_STATUS.INCHI_VALID_STANDARD;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	 * It tests the case when the input string is a valid InChI.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_5() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+";
		boolean strict = true;
		INCHI_STATUS expResult = INCHI_STATUS.INCHI_VALID_STANDARD;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	 * It tests the case when the input string is a valid InChI.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_6() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+";
		boolean strict = false;
		INCHI_STATUS expResult = INCHI_STATUS.INCHI_VALID_STANDARD;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	 * It tests the case when the input string is a valid InChI.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_7() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+";
		boolean strict = true;
		INCHI_STATUS expResult = INCHI_STATUS.INCHI_VALID_STANDARD;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	 * It tests the case when the input string is a valid InChI.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_8() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+";
		boolean strict = false;
		INCHI_STATUS expResult = INCHI_STATUS.INCHI_VALID_STANDARD;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	 * It tests the case when the input string is a valid InChI.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_9() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+";
		boolean strict = true;
		INCHI_STATUS expResult = INCHI_STATUS.INCHI_VALID_STANDARD;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	 * It tests the case when the input string is a valid InChI.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi_10() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+";
		boolean strict = false;
		INCHI_STATUS expResult = INCHI_STATUS.INCHI_VALID_STANDARD;
		INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expResult, result);
	}
}

// JniInchiWrapper_2Test.java
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
* It contains ten unit test cases for the {@link JniInchiWrapper#checkInchiKey(String)} method.
*/
class JniInchiWrapper_2Test {
		
	/**
	 * Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
	 * It tests the case when the input string is null.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchiKey_1() throws JniInchiException {
		String key = null;
		INCHI_KEY_STATUS expResult = INCHI_KEY_STATUS.INCHIKEY_INVALID_LENGTH;
		INCHI_KEY_STATUS result = JniInchiWrapper.checkInchiKey(key);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
	 * It tests the case when the input string is empty.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchiKey_2() throws JniInchiException {
		String key = "";
		INCHI_KEY_STATUS expResult = INCHI_KEY_STATUS.INCHIKEY_INVALID_LENGTH;
		INCHI_KEY_STATUS result = JniInchiWrapper.checkInchiKey(key);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
	 * It tests the case when the input string is not a valid InChIKey.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchiKey_3() throws JniInchiException {
		String key = "InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N";
		INCHI_KEY_STATUS expResult = INCHI_KEY_STATUS.INCHIKEY_INVALID_LAYOUT;
		INCHI_KEY_STATUS result = JniInchiWrapper.checkInchiKey(key);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
	 * It tests the case when the input string is a valid InChIKey.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchiKey_4() throws JniInchiException {
		String key = "InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N";
		INCHI_KEY_STATUS expResult = INCHI_KEY_STATUS.INCHIKEY_VALID_STANDARD;
		INCHI_KEY_STATUS result = JniInchiWrapper.checkInchiKey(key);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
	 * It tests the case when the input string is a valid InChIKey.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchiKey_5() throws JniInchiException {
		String key = "InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N";
		INCHI_KEY_STATUS expResult = INCHI_KEY_STATUS.INCHIKEY_VALID_STANDARD;
		INCHI_KEY_STATUS result = JniInchiWrapper.checkInchiKey(key);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
	 * It tests the case when the input string is a valid InChIKey.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchiKey_6() throws JniInchiException {
		String key = "InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N";
		INCHI_KEY_STATUS expResult = INCHI_KEY_STATUS.INCHIKEY_VALID_STANDARD;
		INCHI_KEY_STATUS result = JniInchiWrapper.checkInchiKey(key);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
	 * It tests the case when the input string is a valid InChIKey.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchiKey_7() throws JniInchiException {
		String key = "InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N";
		INCHI_KEY_STATUS expResult = INCHI_KEY_STATUS.INCHIKEY_VALID_STANDARD;
		INCHI_KEY_STATUS result = JniInchiWrapper.checkInchiKey(key);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
	 * It tests the case when the input string is a valid InChIKey.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchiKey_8() throws JniInchiException {
		String key = "InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N";
		INCHI_KEY_STATUS expResult = INCHI_KEY_STATUS.INCHIKEY_VALID_STANDARD;
		INCHI_KEY_STATUS result = JniInchiWrapper.checkInchiKey(key);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
	 * It tests the case when the input string is a valid InChIKey.
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchiKey_9() throws JniInchiException {
		String key = "InChIKey=UHOVQNZJYSORNB-UHFFFAOYSA-N";
		INCHI_KEY_STATUS expResult = INCHI_KEY_STATUS.INCHIKEY_VALID_STANDARD;
		INCHI_KEY_STATUS result = JniInchiWrapper.checkInchiKey(key);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test case for {@link JniInchiWrapper#checkInchiKey(String)} method.
	 *