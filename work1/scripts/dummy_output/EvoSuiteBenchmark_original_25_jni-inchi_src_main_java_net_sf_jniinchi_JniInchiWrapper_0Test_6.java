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
		/**
	* Constructs a new JniInchiWrapper object from its class name.
	*
	* @param testcaseClassName the name of the class
	* @return JniInchiWrapper object
	* @throws net.sf.jniinchi.NativeInchiException
	* @throws net.sf.jnati.deploy.NativeCodeException
	*/
	@Test
    public static JniInchiWrapper newInstance(final String testcaseClassName){
        try{
			return new JniInchiWrapper(testcaseClassName);
		}
		catch(final ClassNotFoundException e){
			throw new NativeCodeException(e);
		}
        catch(final TimeoutException e){
            throw new NativeCodeException(e);
        }
        catch(final ClassCastException e){
            throw new JniInchiException(e);
        }
        catch(final Exception e){
            throw new NativeCodeException(e);
        }
    }
}