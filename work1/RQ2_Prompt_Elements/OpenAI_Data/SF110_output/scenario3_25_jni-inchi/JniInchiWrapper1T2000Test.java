// JniInchiWrapperTest.java
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
class JniInchiWrapperTest {

	/**
	 * Test case 1:
	 * <p>
	 * Input:
	 * <p>
	 * inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H"
	 * <p>
	 * strict = false
	 * <p>
	 * Expected output:
	 * <p>
	 * INCHI_STATUS.VALID_STANDARD
	 * <p>
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi1() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		boolean strict = false;
		INCHI_STATUS expected = INCHI_STATUS.VALID_STANDARD;
		INCHI_STATUS actual = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 2:
	 * <p>
	 * Input:
	 * <p>
	 * inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H"
	 * <p>
	 * strict = true
	 * <p>
	 * Expected output:
	 * <p>
	 * INCHI_STATUS.VALID_STANDARD
	 * <p>
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi2() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		boolean strict = true;
		INCHI_STATUS expected = INCHI_STATUS.VALID_STANDARD;
		INCHI_STATUS actual = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 3:
	 * <p>
	 * Input:
	 * <p>
	 * inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H"
	 * <p>
	 * strict = false
	 * <p>
	 * Expected output:
	 * <p>
	 * INCHI_STATUS.VALID_STANDARD
	 * <p>
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi3() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		boolean strict = false;
		INCHI_STATUS expected = INCHI_STATUS.VALID_STANDARD;
		INCHI_STATUS actual = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 4:
	 * <p>
	 * Input:
	 * <p>
	 * inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H"
	 * <p>
	 * strict = true
	 * <p>
	 * Expected output:
	 * <p>
	 * INCHI_STATUS.VALID_STANDARD
	 * <p>
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi4() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		boolean strict = true;
		INCHI_STATUS expected = INCHI_STATUS.VALID_STANDARD;
		INCHI_STATUS actual = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 5:
	 * <p>
	 * Input:
	 * <p>
	 * inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H"
	 * <p>
	 * strict = false
	 * <p>
	 * Expected output:
	 * <p>
	 * INCHI_STATUS.VALID_STANDARD
	 * <p>
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi5() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		boolean strict = false;
		INCHI_STATUS expected = INCHI_STATUS.VALID_STANDARD;
		INCHI_STATUS actual = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 6:
	 * <p>
	 * Input:
	 * <p>
	 * inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H"
	 * <p>
	 * strict = true
	 * <p>
	 * Expected output:
	 * <p>
	 * INCHI_STATUS.VALID_STANDARD
	 * <p>
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi6() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		boolean strict = true;
		INCHI_STATUS expected = INCHI_STATUS.VALID_STANDARD;
		INCHI_STATUS actual = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 7:
	 * <p>
	 * Input:
	 * <p>
	 * inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H"
	 * <p>
	 * strict = false
	 * <p>
	 * Expected output:
	 * <p>
	 * INCHI_STATUS.VALID_STANDARD
	 * <p>
	 * @throws JniInchiException
	 */
	@Test
	void testCheckInchi7() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		boolean strict = false;
		INCHI_STATUS expected = INCHI_STATUS.VALID_STANDARD;
		INCHI_STATUS actual = JniInchiWrapper.checkInchi(inchi, strict);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 8:
	 * <p>
	 * Input:
	 * <p>
	 * inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H"
	 * <p>
	 * strict = true
	 * <p>
	 * Expected output:
	 * <