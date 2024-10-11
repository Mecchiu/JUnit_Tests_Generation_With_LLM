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
     * Test that getInchiKey returns its own object
     */
    @Test
    void getInchiKeyReturnsOwnObject() {
        JniInchiOutputKey output = 
        		JniInchiWrapper.getInchiKey("CooG_A:A_COOG_A.cio");

        assertEquals(output, new JniInchiOutputKey("CooG_A:A_COOG_A.cio"));
    }

    /**
     * Test that getInchiKey does not return null or empty
     * because the output property is not set
     */
    @Test
    void getInchiKeyReturnsExceptionIfPropertyNotSet() {

        try {

            JniInchiOutputKey output = 
                JniInchiWrapper.getInchiKey(""); // This will throw exception of not-set-property
            fail("Exception expected");
        }
        catch (JniInchiException e) {
            // Expected exception
        }
    }

    /**
     * Test that getInchiKey fails if an invalid input is provided
     */
    @Test
    void getInchiKeyFailsIfInvalidStringProvided() {

        String invalidString = "CooG:CooG"; // This will fail with invalid.
        try {

            JniInchiOutputKey output = 
                JniInchiWrapper.getInchiKey(invalidString);

            fail("Invalid input was not correctly converted to valid InChI");
        }
        catch (JniInchiException e) {
            // Exception expected
            String errorText = "Cannot parse error message";

            System.err.println(errorText);

            if (output!= null) {
                throw new JniInchiException(errorText);
            }
        }
    }

    /**
     * Test that getInchiKey is thread safe if multiple threads are running
     */
    @Test
    void threadSafeOnMultipleThreadsGetInchiKey() throws InterruptedException, JniInchiException {

	    final String baseInchi = "COOG_A:A_COOG_A.cio";
	    final JniInchiOutputKey  output = JniInchiWrapper.getInchiKey(baseInchi);

	    final JniInchiOutputKey  outputBeforeThread =
				getInchiKey(baseInchi);

	    Thread outputThread1 = new Thread("output thread 1") {

		@Override
		public void run() {

		    try {

			    Thread.sleep(500);
			}
			catch (InterruptedException e) {
			}

			getInchiKey(baseInchi);
		}
	    };
	    outputThread1.start();

	    Thread outputThread2 = new Thread("output thread 2") {
		@Override
		public void run() {

			try {

				Thread.sleep(500);
			}
			catch (InterruptedException e) {
			}

			getInchiKey(baseInchi);
		}
	    };
	    outputThread2.start();

	    Thread.sleep(5000);

	    outputThread2.join();
	    outputThread1.join();
	    System.err.println(outputBeforeThread.toString());

	    assertEqualObjects(output,outputBeforeThread);
    }

    /**
     * Test that getInchiKey is thread safe if only one thread is running
     */
    @Test
    void threadSafeWithSingleThreadGetInchiKey() throws InterruptedException, JniInchiException {

	    final String baseInchi = "COOG_A:A_COOG_A.cio";
	    final JniInchiOutputKey  output = JniInchiWrapper.getInchiKey(baseInchi);

	    final JniInchiOutputKey outputBeforeThread =
				JniInchiWrapper.getInchiKey(baseInchi);

	    Thread outputThread1 = new Thread("output thread 1") {

		@Override
		public void run() {

		    try {

			    Thread.sleep(500);
			}
			catch (InterruptedException e) {
			}

			getInchiKey(baseInchi);
		}
	    };
	    outputThread1.start();

	    Thread outputThread2 = new Thread("output thread 2") {
		@Override
		public void run() {

			try {

				Thread.sleep(500);
			}
			catch (InterruptedException e) {
			}

			getInchiKey(baseInchi);
		}
	    };
	    outputThread2.start();

	    Thread.sleep(5000);

	    outputThread2.join();
	    outputThread1.join();
	    System.err.println(outputBeforeThread.toString());

	    assertEqualObjects(output,outputBeforeThread);
    }

    private void assertEqualObjects(final Object o1, final Object o2) {
        assertEquals(o1.getClass().getName(), o2.getClass().getName());
        assertEquals(o1.hashCode(), o2.hashCode());
        assertEquals(o1, o2);
    }
}