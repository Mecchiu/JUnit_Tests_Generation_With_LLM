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
		private static final InChI INCHI_1 = new InChI("InChI 1");
		private static final String INCHI1 = "InChI 1";

		private static final JNI_INCHI_WRAPPER NWR = new JNI_INCHI_WRAPPER(INCHI_1) {

			@Override
			public INCHI_STATUS checkInchi(String inchi, boolean strict) {
				assertNotNull(NWR);
				assertSame(INCHI_1, NWR.getInchi());
				assertTrue(strict);
				return JniInchiWrapper_1Test.this.checkInchi(inchi, strict);
			}
		};
		/**
		 * Test method of {@link JniInchiWrapper_1Test#checkInchi(String, boolean)}.
		* @throws JniInchiException if InChI contains wrong format or version string.
		* @throws NativeCodeException if InChI conversion failed or cannot be run.
		* @throws TimeoutException if the JNI API cannot be reached in order to perform the JNI conversion.
		*/
		@Test
		void checkInchi_1() throws JniInchiException, NativeCodeException, TimeoutException {
			String inchi1 = NWR.getInchi();
			assertTrue(NWR.checkInchi(INCHI1, false));
			assertFalse(NWR.checkInchiReformat("-1.999.999.999", false));
			assertFalse(NWR.checkInchiReformat("-1.999.999.999", true));
			assertFalse(NWR.checkInchiFormats("-1.999.999.999", false));
			
			try {
				JniInchiWrapper_1Test.NWR.getInchi();
				fail("should have thrown an exception as there is no converter for "+INCHI_1);
			} catch (JniInchiException | NativeCodeException | TimeoutException e) {
				// success
			}
			
			try {
				List<String> convertedVers = NWR.getVersionList("-1.999.999.999");
				assertNotEmpty(convertedVers);
				assertTrue(convertedVers.size() > 7);
			}
			catch (Exception e) { assertTrue(false); }
			
			try {
				List<String> convertedVers = NWR.getVersionList(InChI.getInchi());
				fail("should have thrown a JNIInchiException as the converted version is invalid");
			} catch (JNIInchiException e) { assertTrue(true); }

			// now test without strict conversion
			NWR.getInchi();
		}

		/**
		 * Test method of {@link JniInchiWrapper_1Test#generateInchi(String)}.
		 * @throws NativeCodeException if generating/decoding fails.
		* @throws TimeoutException if there is no connection.
		*/
		@Test
		void generateInchi_1() throws NativeCodeException, TimeoutException {
			try {
				assertNotNull(NWR.generateInchi(INCHI1));
			}
			catch(TimeoutException exception) {
				assertTrue(false);
			}
		}
	}
