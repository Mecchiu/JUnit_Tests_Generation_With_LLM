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
String testString;
		/**
		 * Creates this object using {@link JniInchiWrapper_1Test#createTestString()}
		*/
    public JniInchiWrapper_1Test() {
        testString = createTestString();
    }

    private static final String createTestString() {
        String testString = "JNIO";
        StringTokenizer st = new StringTokenizer(testString, ":");
        testString = ":";

        while (st.hasMoreTokens()) {
            testString += st.nextToken();
        }
        
        return testString;
    }
	/**
	* @return {@link JniInchiWrapper_1Test#createTestString()}
	*/
	public String getTestString() {
		return testString;
	}
	/**
	 * Create a JniInchi wrapper object using {@link JniInchiWrapper_1Test#createTestString()}
	 * and checks if correct result is returned
	 */
	
    public static INCHI_STATUS checkInchi(String inchi) throws JniInchiException {
        InchiWrapper.checkInchi(inchi, true);

        return JniInchiWrapper.checkInchi(inchi);
    }

    /**
    * @return valid result
    *
    */
    public static INCHI_STATUS checkInchi(String inchi, boolean strict) throws JniInchiException{
            return JniInchiWrapper.checkInchi(inchi, strict, 0, 2000);
    }


    /**
    * @return a result object with the proper layout, with proper exception handling.
    *
    */
    public static INCHI_STATUS checkInchiL(String inchi, int maxTries) throws JniInchiException, NativeCodeException {
                INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, true);

                assertTrue("Result is true", result.equals(INCHI_STATUS.SUCCESS));
                
                return result;
    }

    public static INCHI_STATUS checkInchiLT(String inchi, boolean strict, int maxTries) throws JniInchiException, NativeCodeException {

                final INCHI_STATUS result = JniInchiWrapper.checkInchi(inchi, strict, maxTries);

                assertTrue(result == INCHI_STATUS.UNTESTED);

                // test that maxTries is not reached in the case of a failure
                return result;
               }

    // ***********************************************************************
	private static INCHI_STATUS checkInchi(String inchi, boolean strict, long maxTries) throws JniInchiException {
        JniInchiWrapper.checkInchi(inchi, strict, maxTries);
        return inchi;
	}

	// ***********************************************************************

    public static void main(String[] args) {
       if (args.length > 0) test(args[0]); // tests for all supported formats
       else test(JniInchiWrapper.createTestString());
    }

	public static void test(String inchi) throws JniInchiException {
		INCHI = new JniInchiWrapper();
	}
}