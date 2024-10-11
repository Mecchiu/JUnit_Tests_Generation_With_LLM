// JniInchiWrapper_0Test.java
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
* It contains ten unit test cases for the {@link JniInchiWrapper#getInchiKey(String)} method.
*/
class JniInchiWrapper_0Test {

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_0() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_1() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_2() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_3() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_4() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_5() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_6() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_7() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_8() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_9() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}
}

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
* It contains ten unit test cases for the {@link JniInchiWrapper#getInchiKey(String)} method.
*/
class JniInchiWrapper_1Test {
		
	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_0() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_1() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_2() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_3() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_4() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_5() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniInchiException
	 */
	@Test
	void testGetInchiKey_6() throws JniInchiException {
		String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H";
		String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
		String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
		assertEquals(expected, actual);
	}

	/**
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Test case for method: {@link JniInchiWrapper#getInchiKey(String)}
	 * <p>
	 * Case: Valid InChIKey
	 *
	 * @throws JniIn