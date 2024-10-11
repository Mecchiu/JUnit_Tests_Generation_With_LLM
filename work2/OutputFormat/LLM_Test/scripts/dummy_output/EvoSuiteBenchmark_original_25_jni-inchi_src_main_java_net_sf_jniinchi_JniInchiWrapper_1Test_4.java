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
		final static String PREC = "PREC=";
		final static String INCHI = "INCHI=";
	
	/**
     * Create a new default test of {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	*
	* @param inchi string to test for.
	*
	* @return a {@link JniInchiWrapper} that indicates the results of the test by its return value.
	*/
	protected static JniInchiWrapper create(String inchi)
	    throws JniInchiException {
		final JniInchiWrapper wrapper;
		
		try {
			wrapper = new JniInchiWrapper(inchi);
			assertTrue(PREC + String.valueOf(wrapper.getPreambleSize()), PREC + inchi);
			assertTrue(INCHI + String.valueOf(wrapper.getInchiSize()), String.valueOf(wrapper.getInchiSize()));
		}
		catch (NativeCodeException ie) {
					throw new JniInchiException(ine.getMessage());
			}
		return wrapper;
	}
	
	/**
	 * Create a new default test of {@link JniInchiWrapper#checkInchi(String, boolean)} method with a
	 * large value.
	*
	* @param inchi string to test for.
	* @param value an arbitrary large value.
	*
	* @return a {@link JniInchiWrapper} that indicates the results of the test by its return value.
	*/
	protected static JniInchiWrapper createLarge(String inchi, byte value)
	    throws JniInchiException {
		final JniInchiWrapper wrapper;
		
		try {
			wrapper = new JniInchiWrapper(inchi);
			wrapper.setPreambleSize(wrapper.getPreambleSize() + value);
			assertTrue(INCHI + String.valueOf(wrapper.getInchiSize()), String.valueOf(wrapper.getInchiSize()));
		}
		catch (NativeCodeException ie) {
					throw new JniInchiException(ine.getMessage());
			}
		return wrapper;
	}
	
	/**
	 * Create a new default test of {@link JniInchiWrapper#checkInchi(String, boolean)} method with a
	 * large value.
	*
	* @param inchi string to test for.
	*
	* @return a {@link JniInchiWrapper} that indicates the results of the test by its return value.
	*/
	protected static JniInchiWrapper createLarge(String inchi)
	    throws JniInchiException {
		return createLarge(inchi, (byte) 0xff);
	}
	
	/**
	 * create a new default test of {@link JniInchiWrapper#checkInchi(String, boolean)} method with a large value.
	*
	* @param inchi string to test for.
	*
	* @return a {@link JniInchiWrapper} that indicates the results of the test by its return value.
	*/
	protected static JniInchiWrapper createLarge(String inchi, short value)
	    throws JniInchiException {
		final JniInchiWrapper wrapper;
		
		try {
			wrapper = new JniInchiWrapper(inchi);
			wrapper.setPreambleSize(wrapper.getPreambleSize() + value);
			assertTrue(INCHI + String.valueOf(wrapper.getInchiSize()), String.valueOf(wrapper.getInchiSize()));
		}
		catch (NativeCodeException ie) {
					throw new JniInchiException(ine.getMessage());
			}
		return wrapper;
	}
	
	/**
	 * Create a new default test of {@link JniInchiWrapper#checkInchi(String, boolean)} method with a large value.
	*
	* @param inchi string to test for.
	*
	* @return a {@link JniInchiWrapper} that indicates the results of the test by its return value.
	*/
	protected static JniInchiWrapper createLarge(String inchi, int value)
	    throws JniInchiException {
		final JniInchiWrapper wrapper;
		
		try {
			wrapper = new JniInchiWrapper(inchi);
			wrapper.setPreambleSize(wrapper.getPreambleSize() + value);
			assertTrue(INCHI + String.valueOf(wrapper.getInchiSize()), String.valueOf(wrapper.getInchiSize()));
		}
		catch (NativeCodeException ie) {
					throw new JniInchiException(ine.getMessage());
			}
		return wrapper;
	}
	
	/**
	 * Read data into InChI buffer.
	*
	* @return the full InChI string in buffer.
	*/
	public String getInchi() {
		final StringBuilder builder = new StringBuilder();
		final List<String> line = new StringTokenizer(PREC, " \t\n");
		final int count = line.size();
		for (int i = 0; i < count; i++) {
			if (i!= 0) builder.append(PREC);
			builder.append(line.get(i).trim());
			builder.append(SEP);
		}
}
}