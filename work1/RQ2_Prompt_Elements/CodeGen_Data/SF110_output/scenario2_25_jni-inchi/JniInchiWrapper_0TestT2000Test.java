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
     * Test method for {@link JniInchiWrapper#getInchiKey(String)}.
     *
     * @throws TimeoutException if the function times out
     */
    @Test
    void testGetInchiKey() throws TimeoutException {
        JniInchiWrapper wrapper = new JniInchiWrapper();
        try {
            StringTokenizer st = new StringTokenizer(getRandomDataString());
            int i = 0;
            int j = 0;
            final long start = System.nanoTime();
            final long end = start + (1l << 63) /* long-sized 32-bit longs are 64-bits worth of bytes */ ;
            while (st.hasMoreTokens()) {
                final String value = st.nextToken();
                final long len = toUTF8(value) / 64;
                final boolean success;

                if (value.toLowerCase().endsWith(".inchi")) {
                		success = true;
                    final String key = Long.toBinaryString(len);
                    wrapper.setInchiKey(key.getBytes());
                } else {
                    wrapper.setInchiKey(value.getBytes());
                    success = false;
                }

                switch (i) {
                case 0:
        				j++;
        				break;
        				default:
                    break;
                };

                if (success) {
    				assertEquals(len, wrapper.getInchiKey().length) :
                                        getInchiKeyForBinaryString("1");
                    i++;
                    break;
                }
            }
            assertTrue(j == 30) :
            getInchiKeyForBinaryString("1");
        } catch (NativeCodeException ne) {
            throw new JniInchiException(ne.getErrorCode(), ne.getMessage());
        } catch (TimeoutException te) {
        	System.out.println("Function took almost 1s");
            throw new TimeoutException(te);
        }
    }
    
    /**
     * Random test data string.
     *
     * @return a test string
     */
    private static String getRandomDataString() {
        return "AAGEGGGGGTGGGGGGGGGGGGGGGGGCCGGGCCGGGTTGGGTT" +
        		"GTGGGCCGAGACAAAACACCAAGCCACTACCACAG" +
        		"CAGCCGGCTAAAACAAACCCTAACCGGAAACACACGUCAACCCTCT" +
        		"CAGCCGGAGGGAGGAAGGAGCCAAGGCAGCCGGCAGCCAACAGCACC" +
        		"GGAGCCGGAGAGGGAAGGCGTCTTTTAACACTGAACATGTCCGGTACC"+
        		"CTGCCGGAAATAAGGGCCACAAATGAGACAACGCACGGACACCCGT" +
        		"AACCGGGTTACTAATACTTACGGACAGACTTCGAGGGAAACAGGAC" +
        		"CCAGATCTTCCCCACACAACCAGTGTAGGAGTGTAAACACATAA" +
        		"CCCTGTAACTGTGGCGTCCCHNAAGGAAACCTCATGCTCAGGAGT" +
        		"AACAGGGAGGGTTGTGGCCATTCTGCGTACTCTGGAAGTCACCTC" +
        		"CTAAAGTATAATGTCGGG";
    }
    
    /**
     * Wrapper for {@link JniInchiWrapper}.
     */
	private static class JniInchiWrapper {

    	   //private final Lock lock = new ReentrantLock();

    	   //private Lock readWriteLock;
    	   
    	
    	  /**
    	   * Returns the InChI key for a given InChI string.
    	   *
    	   * @param inchi inchi string
    	   * @return InChI key string output
    	   * @throws JniInchiException
    	   */
        public static String getInchiKey(String inchi) throws JniInchiException {
            JniInchiWrapper_0Test.lock.lock();
            try {
                String outBinary =  NativeLibraryLoader.GetInchiKey();
                return outBinary.toString();
            } finally {
                JniInchiWrapper.lock.unlock();
            }
    
        }
    
        /**
        * Gets the value for the binary string.
        * It will allocate the necessary memory.
        * @param inchi inchi to be tested
        * @return
        */
        private static byte[] getInchiBinary(String inchi) {
            NativeCodeException ne = new NativeCodeException(JniInchiWrapper_0Test.getInchiKey(inchi).getBytes());
            if (ne == null) throw new JniInchiException(JniInchiWrapper_0Test.getInchiKey(inchi).getBytes(), "No InChI key in the specified InChI string.");
            else throw ne;
        }

        /**
        * Gets the value for the binary string.
        * It will allocate the necessary memory.
        * @param inchi inchi string to be loaded
        * @return
        */
        public static void SetInchiKey(String inchi) {
            
            NativeCodeException ne = new NativeCodeException(NativeLibraryLoader.SetInchiKey(inchi));
            throw ne;
        }
    
    	private static void setInchiKey(byte[] inchiBinary) {
        	JniInchiWrapper