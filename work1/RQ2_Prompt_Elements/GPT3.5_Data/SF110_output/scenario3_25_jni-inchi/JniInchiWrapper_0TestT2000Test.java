// JniInchiWrapper.java
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
     * @throws JniInchiException if an error occurs while calculating the InChIKey
     */
    public static JniInchiOutputKey getInchiKey(final String inchi) throws JniInchiException {
        try {
            NativeLibraryLoader.loadLibrary("jniinchi");
        } catch (NativeCodeException e) {
            throw new JniInchiException("Error loading JNI-InChI library", e);
        }

        final Lock lock = new ReentrantLock();
        final JniInchiOutputKey output = new JniInchiOutputKey();

        final Thread thread = new Thread(new Runnable() {
            public void run() {
                lock.lock();
                try {
                    output.setInchiKey(JniInchiWrapperJNI.getInchiKey(inchi));
                } catch (Throwable t) {
                    output.setError(new JniInchiException("Error calculating InChIKey", t));
                } finally {
                    lock.unlock();
                }
            }
        });

        thread.start();

        try {
            if (!lock.tryLock(10, TimeUnit.SECONDS)) {
                throw new TimeoutException("Timeout waiting for InChIKey calculation");
            }
        } catch (InterruptedException e) {
            throw new JniInchiException("Interrupted while waiting for InChIKey calculation", e);
        } catch (TimeoutException e) {
            throw new JniInchiException("Timeout waiting for InChIKey calculation", e);
        }

        final JniInchiException error = output.getError();
        if (error != null) {
            throw error;
        }

        return output;
    }
}

// JniInchiWrapper_0Test.java
package net.sf.jniinchi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiWrapper}.
* It contains ten unit test cases for the {@link JniInchiWrapper#getInchiKey(String)} method.
*/
class JniInchiWrapper_0Test {

    @Test
    void testGetInchiKey() throws JniInchiException {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6-/m0/s1";
        JniInchiOutputKey output = JniInchiWrapper.getInchiKey(inchi);
        assertEquals("WQZGKKKJIJFFOK-PUFCXBJPSA-N", output.getInchiKey());
    }

    @Test
    void testGetInchiKey_EmptyString() {
        assertThrows(JniInchiException.class, () -> {
            JniInchiWrapper.getInchiKey("");
        });
    }

    @Test
    void testGetInchiKey_NullString() {
        assertThrows(NullPointerException.class, () -> {
            JniInchiWrapper.getInchiKey(null);
        });
    }

    @Test
    void testGetInchiKey_InvalidInchi() {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6-";
        assertThrows(JniInchiException.class, () -> {
            JniInchiWrapper.getInchiKey(inchi);
        });
    }

    @Test
    void testGetInchiKey_InvalidInchiKey() {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6-/m0/s1";
        JniInchiOutputKey output = JniInchiWrapper.getInchiKey(inchi);
        assertNotEquals("WQZGKKKJIJFFOK-PUFCXBJPSA", output.getInchiKey());
    }

    @Test
    void testGetInchiKey_InvalidInchiKeyFormat() {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6-/m0/s1";
        JniInchiOutputKey output = JniInchiWrapper.getInchiKey(inchi);
        assertNotEquals("WQZGKKKJIJFFOK-PUFCXBJPSA-N-", output.getInchiKey());
    }

    @Test
    void testGetInchiKey_InvalidInchiKeyLength() {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6-/m0/s1";
        JniInchiOutputKey output = JniInchiWrapper.getInchiKey(inchi);
        assertNotEquals("WQZGKKKJIJFFOK-PUFCXBJPSA-NN", output.getInchiKey());
    }

    @Test
    void testGetInchiKey_InvalidInchiKeyCharacters() {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6-/m0/s1";
        JniInchiOutputKey output = JniInchiWrapper.getInchiKey(inchi);
        assertNotEquals("WQZGKKKJIJFFOK-PUFCXBJPSA-NO", output.getInchiKey());
    }

    @Test
    void testGetInchiKey_InvalidInchiKeyChecksum() {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6-/m0/s1";
        JniInchiOutputKey output = JniInchiWrapper.getInchiKey(inchi);
        assertNotEquals("WQZGKKKJIJFFOK-PUFCXBJPSA-M", output.getInchiKey());
    }

    @Test
    void testGetInchiKey_MultipleThreads() throws InterruptedException {
        String inchi = "InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6-/m0/s1";
        JniInchiOutputKey output1 = new JniInchiOutputKey();
        JniInchiOutputKey output2 = new JniInchiOutputKey();

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                try {
                    output1.setInchiKey(JniInchiWrapper.getInchiKey(inchi).getInchiKey());
                } catch (JniInchiException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                try {
                    output2.setInchiKey(JniInchiWrapper.getInchiKey(inchi).getInchiKey());
                } catch (JniInchiException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

       