// JniInchiWrapperTest.java
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
class JniInchiWrapperTest {

	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is null.
	*/
	@Test
	void testGetInchiKey_1() {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey(null);
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is empty.
	*/
	@Test
	void testGetInchiKey_2() {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey("");
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a space.
	*/
	@Test
	void testGetInchiKey_3() {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey(" ");
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a tab.
	*/
	@Test
	void testGetInchiKey_4() {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey("\t");
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a new line.
	*/
	@Test
	void testGetInchiKey_5() {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey("\n");
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a carriage return.
	*/
	@Test
	void testGetInchiKey_6() {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey("\r");
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a form feed.
	*/
	@Test
	void testGetInchiKey_7() {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey("\f");
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a valid InChI string.
	*/
	@Test
	void testGetInchiKey_8() {
		assertEquals("QQQQQQQQQQQQQQ-QQ", JniInchiWrapper.getInchiKey("InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6-/m1/s1"));
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a valid InChI string.
	*/
	@Test
	void testGetInchiKey_9() {
		assertEquals("QQQQQQQQQQQQQQ-QQ", JniInchiWrapper.getInchiKey("InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6-/m1/s1"));
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a valid InChI string.
	*/
	@Test
	void testGetInchiKey_10() {
		assertEquals("QQQQQQQQQQQQQQ-QQ", JniInchiWrapper.getInchiKey("InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6-/m1/s1"));
	}
}

// JniInchiOutput.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>JNI Wrapper for International Chemical Identifier (InChI) C++ library.
 *
 * <p>This class is not intended to be used directly, but should be accessed
 * through subclasses that read data formats and load them into the InChI
 * data structures.
 *
 * <p>Subclasses should load data through the addAtom, addBond and addParity
 * methods. Once the molecule is fully loaded then the generateInchi method
 * should be called. Ideally this should all take place within the subclass's
 * constructor. The public get methods will all return null until this has
 * happened.
 *
 * <p>See <tt>inchi_api.h</tt>.
 *
 * @author Sam Adams
 */
public class JniInchiWrapper {

    /**
     * Calculates the InChIKey for an InChI string.
     *
     * @param inchi source InChI string
     * @return InChIKey output
     * @throws JniInchiException
     */
    public static JniInchiOutputKey getInchiKey(final String inchi) throws JniInchiException {
        if (inchi == null) {
            throw new IllegalArgumentException("Null InChI");
        }
        JniInchiWrapper wrapper = getWrapper();
        wrapper.getLock();
        try {
            return wrapper.GetINCHIKeyFromINCHI(inchi);
        } finally {
            lock.unlock();
        }
    }
}

// JniInchiOutputKey.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>JNI Wrapper for International Chemical Identifier (InChI) C++ library.
 *
 * <p>This class is not intended to be used directly, but should be accessed
 * through subclasses that read data formats and load them into the InChI
 * data structures.
 *
 * <p>Subclasses should load data through the addAtom, addBond and addParity
 * methods. Once the molecule is fully loaded then the generateInchi method
 * should be called. Ideally this should all take place within the subclass's
 * constructor. The public get methods will all return null until this has
 * happened.
 *
 * <p>See <tt>inchi_api.h</tt>.
 *
 * @author Sam Adams
 */
public class JniInchiWrapper {

    /**
     * Calculates the InChIKey for an InChI string.
     *
     * @param inchi source InChI string
     * @return InChIKey output
     * @throws JniInchiException
     */
    public static JniInchiOutputKey getInchiKey(final String inchi) throws JniInchiException {
        if (inchi == null) {
            throw new IllegalArgumentException("Null InChI");
        }
        JniInchiWrapper wrapper = getWrapper();
        wrapper.getLock();
        try {
            return wrapper.GetINCHIKeyFromINCHI(inchi);
        } finally {
            lock.unlock();
        }
    }
}

// JniInchiOutputStructure.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>JNI Wrapper for International Chemical Identifier (InChI) C++ library.
 *
 * <p>This class is not intended to be used directly, but should be accessed
 * through subclasses that read data formats and load them into the InChI
 * data structures.
 *
 * <p>Subclasses should load data through the addAtom, addBond and addParity
 * methods. Once the molecule is fully loaded then the generateInchi method
 * should be called. Ideally this should all take place within the subclass's
 * constructor. The public get methods will all return null until this has
 * happened.
 *
 * <p>See <tt>inchi_api.h</tt>.
 *
 * @author Sam Adams
 */
public class JniInchiWrapper {

    /**
     * Calculates the InChIKey for an InChI string.
     *
     * @param inchi source InChI string
     * @return InChIKey output
     * @throws JniInchiException
     */
    public static JniInchiOutputKey getInchiKey(final String inchi) throws JniInchiException {
        if (inchi == null) {
            throw new IllegalArgumentException("Null InChI");
        }
        JniInchiWrapper wrapper = getWrapper();
        wrapper.getLock();
        try {
            return wrapper.GetINCHIKeyFromINCHI(inchi);
        } finally {
            lock.unlock();
        }
    }
}

// JniInchiStereo0D.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>JNI Wrapper for International Chemical Identifier (InChI) C++ library.
 *
 * <p>This class is not intended to be used directly, but should be accessed
 * through subclasses that read data formats and load them into the InChI
 * data structures.
 *
 * <p>Subclasses should load data through the addAtom, addBond and addParity
 * methods. Once the molecule is fully loaded then the generateInchi method
 * should be called. Ideally this should all take place within the subclass's
 * constructor. The public get methods will all return null until this has
 * happened.
 *
 * <p>See <tt>inchi_api.h</tt>.
 *
 * @author Sam Adams
 */
public class JniInchiWrapper {

    /**
     * Calculates the InChIKey for an InChI string.
     *
     * @param inchi source InChI string
     * @return InChIKey output
     * @throws JniInchiException
     */
    public static JniInchiOutputKey getInchiKey(final String inchi) throws JniInchiException {
        if (inchi == null) {
            throw new IllegalArgumentException("Null InChI");
        }
        JniInchiWrapper wrapper = getWrapper();
        wrapper.getLock();
        try {
            return wrapper.GetINCHIKeyFromINCHI(inchi);
        } finally {
            lock.unlock();
        }
    }
}

// JniInchiStereo0D.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>JNI Wrapper for International Chemical Identifier (InChI) C++ library.
 *
 * <p>This class is not intended to be used directly, but should be accessed
 * through subclasses that read data formats and load them into the InChI
 * data structures.
 *
 * <p>Subclasses should load data through the addAtom, addBond and addParity
 * methods. Once the molecule is fully loaded then the generateInchi method
 * should be called. Ideally this should all take place within the subclass's
 * constructor. The public get methods will all return null until this has
 * happened.
 *
 * <p>See <tt>inchi_api.h</tt>.
 *
 * @author Sam Adams
 */
public class JniInchiWrapper {

    /**
     * Calculates the InChIKey for an InChI string.
     *
     * @param inchi source InChI string
     * @return InChIKey output
     * @throws JniInchiException
     */
    public static JniInchiOutputKey getInchiKey(final String inchi) throws JniInchiException {
        if (inchi == null) {
            throw new IllegalArgumentException("Null InChI");
        }
        JniInchiWrapper wrapper = getWrapper();
        wrapper.getLock();
        try {
            return wrapper.GetINCHIKeyFromINCHI(inchi);
        } finally {
            lock.unlock();
        }
    }
}

// JniInchiStereo0D.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>JNI Wrapper for International Chemical Identifier (InChI) C++ library.
 *
 * <p>This class is not intended to be used directly, but should be accessed
 * through subclasses that read data formats and load them into the InChI
 * data structures.
 *
 * <p>Subclasses should load data through the addAtom, addBond and addParity
 * methods. Once the molecule is fully loaded then the generateInchi method
 * should be called. Ideally this should all take place within the subclass's
 * constructor. The public get methods will all return null until this has
 * happened.
 *
 * <p>