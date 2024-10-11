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
* It contains one unit test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
*/
class JniInchiWrapper_0Test {
		private static final JniInchiWrapper_0Test testObject;
		public static final String INCHI;
		static {
			// create instance of <code>JniInchiWrapper</code>
			if (null == testObject) {
			testObject = new JniInchiWrapper_0Test();
			INCHI = "1234567890";
				}
		}
		/**
			Constructs a new JniInchiWrapper-Object.
			@throws InchiException
		*/
	private JniInchiWrapper_0Test() throws InchiException {
			inchiWrapper = new JniInchiWrapper("", null, INCHI);
}
		private final String inchi;
	private final JniInchiWrapper innchiWrapper;
	private Object lock;
	/**
	 * JniInchiWrapper_0Test.java
	 * Test case for {@link JniInchiWrapper#getInchiKey(String)} using the {@link JniInchiWrapper#addAtom addAtom} method.
	 */
	@Test public void testGetInchioAddAtom() throws JniInchiException, InterruptedException {
		System.out.println("==> JniInchiWrapper_0Test.testGetInchioAddAtom()");
		
		// try to add a single atom
		inchi = "1";
		try {
			assertTrue(testObject.addAtom(inchi));
		} catch (JniInchiException e) {
			throw e;
		} 
			}
	private final Lock lock;
private JniInchiWrapper testObject;

	private JniInchiWrapper() throws InchiException {
			inchiWrapper = new JniInchiWrapper("", null, INCHI);
				}
		public JniInchiWrapper(final String inchi, final JniInchiWrapper inchiWrapper, final String inchiKey) throws InchiException {
			lock = new Lock();
			this.inchi = inchi;
			testObject = inchiWrapper;
		}
	public Object getLock() {
		return lock;
	}
	public String getInchi() {
		return INCHI;
	}
	public Object addAtom(final String inchi) {

			// lock the object
			lock.lock();
			try {
			// try and create an atom in the InChi wrapper
			assertTrue(testObject.addAtom(inchi));
			} catch (NativeCodeException e) {
			throw e;
		} 

		return null;
	}
	public JniInchiWrapper getInchiWrapper() {
		return innchiWrapper;
	}
	/**
	 * Test of {@link JniInchiWrapper#getInchiKey(String) - getInchiKey}{@literal <} getInchiKey(String)
	 * @throws TimeoutException
         */
 public final void testGetInchiKey() throws TimeoutException, JniInchiException {
	lock.lock();
			try {
			assertEquals("Failed to obtain an InChI key for given InChI string.", INCHI, innchiWrapper.getInchiKey(INCHI));
		} catch (TimeoutException e) {
			throw e;
		} 
	}
}