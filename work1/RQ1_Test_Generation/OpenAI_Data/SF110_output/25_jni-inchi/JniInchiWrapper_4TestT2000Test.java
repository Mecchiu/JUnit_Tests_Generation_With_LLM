// JniInchiWrapper_4Test.java
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
class JniInchiWrapper_4Test {

		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
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
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey_2() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey_3() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey_4() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey_5() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1/p-1";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey_6() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1/p-1/t2-,4+/m0/s1";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey_7() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1/p-1/t2-,4+/m1/s1";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey_8() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1/p-1/t2-,4+/m1/s1/i2+1";
				String expected = "UHOVQNZJYSORNB-UHFFFAOYSA-N";
				String actual = JniInchiWrapper.getInchiKey(inchi).getKey();
				assertEquals(expected, actual);
		}
		
		/**
		 * Test case for {@link JniInchiWrapper#getInchiKey(String)} method.
		 * It tests the method with a valid InChI string.
		 * @throws JniInchiException
		 */
		@Test
		void testGetInchiKey_9() throws JniInchiException {
				String inchi = "InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/b2-1-,4-3+/f/h2H/q+1/p-1/t2-,4+/m1/s1/i2+1/c2-1";
				String expected = "UHOVQNZJYSORNB