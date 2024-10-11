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
		static final long TIMEOUT = TimeUnit.MINUTES.toMillis(2) * 1000L;
	/**
	 * JniInchiWrapper subclasses are not obliged to access an instance
	 * variable.  I am not sure when or if this can be, but for this class
	 * should always remain up to date.
	 */
	@Test
	public void shouldCallGetInChIKey_withoutException1() throws JniInchiException {
		JniInchiWrapper wrapper = new JniInchiWrapper();
		try {
			assertEquals(null, wrapper.getInchiKey(null));
		} catch (NativeCodeException e) {
			fail();
		}
	}
    @Test
    public void shouldBeAbleToLoadMoreThanOneInputAtOnce() throws JniInchiException {
        try {
            List<String> inchiList = NativeLibraryLoader.getInstance().getLibrary("inchi").getInputList();
            assertEquals("There should be 1 input for aninchi.", 1, inchiList.size());
            String c = inchiList.get(0);
            int i = NativeLibraryLoader.getInstance().getLibrary("inchi").getInchiValue(c);
            assertEquals(i, 8); // 8 should be inchi's identity.
        }
    }
	@Test
	public void shouldBeAbleToLoadMoreThanOneInputAtOnceWithDelay() throws JniInchiException {
		List<String> inchiList = NativeLibraryLoader.getInstance().getLibrary("inchi").getInputList();
		try {
			Thread.sleep(3);
			String c = inchiList.get(0);
			int i = NativeLibraryLoader.getInstance().getLibrary("inchi").getInchiValue(c);
			assertEquals(i, 8); // 8 should be inchi's identity.
		} 
		catch (TimeoutException e) {
			assertTrue(e.getMessage().contains("The operation did not take to any value of time"));
		} catch (NativeCodeException e) {
			fail();
		}
	}
}