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
	 * Test method for {@link JniInchiWrapper#checkInchi(String, boolean)}.
	 * @throws JniInchiException
	 */
	@Test
    public void checkInchiException() throws JniInchiException {
    assertNull("", checkInchi(null, false));
		}
	
	/**
	 * Test method for {@link JniInchiWrapper#checkInchi(String, boolean)}.
    * Note: since InChI2InChI test does not pass through get(), getAll() and others, this tests
    * the behaviour of the call.
	 * @throws JniInchiException
	 */
    @Test
    public void checkInchi2Exception() throws JniInchiException, InterruptedException, NativeCodeException, TimeoutException, ClassNotFoundException,
	JniInchiWrapperException {
        checkInchi(new String(new byte[]{23, 0, 1, 2, 4, 5, 6, 30}), true);	// This should fail
    }
}
// JniInchiWrapper_1Test.java