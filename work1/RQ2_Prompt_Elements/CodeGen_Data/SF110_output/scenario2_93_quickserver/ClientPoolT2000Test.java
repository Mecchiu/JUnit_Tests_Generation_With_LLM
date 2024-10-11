// ClientPoolTest.java
package org.quickserver.util.pool.thread;

import java.util.*;
import org.quickserver.util.pool.*;
import org.apache.commons.pool.*;
import org.quickserver.net.server.*;
import org.quickserver.util.xmlreader.PoolConfig;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientPool}.
* It contains one unit test case for the {@link ClientPool#shouldNioWriteHappen()} method.
*/
class ClientPoolTest {
/**
		* Test {@link ClientPool#shouldNioWriteHappen()} method.
		* It should throw AssertException when
		* maxThreadsForNioWrite is not greater than 0.
		* As a return, this method exits and returns {@code true} if
		* there are no more pooled instances or an error happened
		* during the test. Otherwise, it will throw AssertException
		* and does not exit when there is no pool instance.
		*
		* @param maxThreadsForNioWrite Maximum allowed value for num of threads
		*           in which there is some object left in the pool
		*           <br>If not set value is set to 1.
		* @since 1.4.6
		*/
    @Test(expected = AssertException.class)
	public void doesNotFitNioWrite() throws Exception {
		final int numberOfAvailableThreadsForNioWrite = 10;
		final ClientPool instance = new ClientPool(numberOfAvailableThreadsForNioWrite);
		final int numberOfObtainedThreads = instance.numberOfObtainedThreads;
		assertTrue(numberOfAvailableThreadsForNioWrite > 0);
		assertEquals(numberOfAvailableThreadsForNioWrite, numberOfObtainedThreads);
		instance.shouldNioWriteHappen();
    }
}