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
* It contains one unit test case for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
*/
class JniInchiWrapper_1Test {
		/**
		 * Constructs a new test object.
		 *
		 * @throws NativeCodeException
		 */
	public JniInchiWrapper_1Test() throws NativeCodeException {
	}

	/**
	 * Test method of {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 *
	 * @throws NativeCodeException
	 */
	@Test(expected = JniInchiException.class)
	public void checkInchi_1Test() throws NativeCodeException {
	//TODO: checkInchi(TEST_INCHI, true) throws NativeCodeException
	}

	/**
	 * Test method of {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 *
	 * @throws NativeCodeException
	 * @throws TimeoutException
	 */
	@Test(expected = TimeoutException.class)
	public void checkInchi_2Test() throws JniInchiException, NativeCodeException, TimeoutException {

			assertFalse(checkInchi("MOL ", true));
	}

	/**
	 * Test method of {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 *
	 * @throws NativeCodeException
	 */
	@Test public void checkInchi_3Test() throws JniInchiException, NativeCodeException {
			assertEquals("FAILED", checkInchi("MOL ", true));
	}

	/**
	 * Test method of {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 *
	 * @throws NativeCodeException
	 */
	@Test public void checkInchi_1Test_1() throws NativeCodeException {
		assertEquals("FAILED", checkInchi("MOL ", true));
	}

	/**
	 * Test method of {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 *
	 * @throws NativeCodeException
	 * @throws TimeoutException
	 */
	@Test(expected = JniInchiException.class)
	public void checkInchi_4_1Test() throws NativeCodeException, TimeoutException {
		assertEquals("FAILED", checkInchi("MOL ", true));
	}

	/**
	 * Test method of {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 *
	 * @throws NativeCodeException
	 */
	@Test(expected = NativeCodeException.class)
	public void checkInchi_1Test_2() throws NativeCodeException {
			assertEquals("FAILED", checkInchi("MOL ", true));
	}

	/**
	 * Test method of {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 *
	 * @throws NativeCodeException
	 */
	@Test public void checkInchi_5Test() throws JniInchiException, NativeCodeException {
			List<String> results = NativeLibraryLoader.getInstance().loadInChIs();
			if (results.size() < 5)
				return;

			for (String result : results) {
				List<String> tStrs = result.split(" ");
				String mOL = tStrs.get(0);
				String eOL = tStrs.get(1);
				String dOH = tStrs.get(2);

				String sTmp = NativeLibraryLoader.getInstance().loadInChI(mOL);
				String sEOL = NativeLibraryLoader.getInstance().loadInChI(eOL);
				String sDOH = NativeLibraryLoader.getInstance().loadInChI(dOH);
				
				assertTrue(sTmp.contains(sEOL));
				assertTrue(sTmp.contains(sDOH));
			}
	}

	/**
	 * Test method of {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 *
	 * @throws NativeCodeException
	 * @throws TimeoutException
	 */
	@Test public void checkInchi_5_1Test() throws JniInchiException, NativeCodeException, TimeoutException {
			List<String> results = NativeLibraryLoader.getInstance().loadInChIs();
			if (results.size() < 5)
				return;

			for (String result : results) {
				List<String> tStrs = result.split(" ");
				String mOL = tStrs.get(0);
				String eOL = tStrs.get(1);
				String dOH = tStrs.get(2);

				String sTmp = checkInchi(mOL, true);
				String sEOL = checkInchi(eOL, true);
				String sDOH = checkInchi(dOH, true);

				assertEquals(sTmp, sEOL);
				assertEquals(sTmp, sDOH);
			}
	}

	/**
	 * Test method of {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 *
	 * @throws NativeCodeException
	 * @throws TimeoutException
	 * @throws NativeCodeException
	 */
	@Test public void checkInchi_1Test_7() throws NativeCodeException, TimeoutException, NativeCodeException {
		Lock lock = new ReentrantLock();
			lock.lock();

}
}