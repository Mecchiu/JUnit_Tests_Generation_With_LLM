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
		//JniInchiWrapper_1Test is just a utility class, not a sub-class so that it can be used as a test class without including any jni unit tests.
	/**
	  * Constructs a new InchiWrapper instance, using the specified
	  * string as the initial parameter to the 'addAtom()' method of
	  * {@link JniInchiWrapper} class.
	  */
	public JniInchiWrapper_1Test() {
	}
	//JniInchiWrapper_1Test is just a utility class, not a sub-class so that it can be used as a test class without including any jni unit tests.
	@Test public void test() throws NativeLibraryLoader.NativeLibraryLoadableException, INCHI_STATUS, NativeCodeException {
		String value = "This is a test string";
		System.out.println("Starting Inchi wrapper for string = " + value);
		final JniInchiWrapper jniWrapper = new JniInchiWrapper();
		jniWrapper.addAtom(value);
	}
}
//JniInchiWrapper.java