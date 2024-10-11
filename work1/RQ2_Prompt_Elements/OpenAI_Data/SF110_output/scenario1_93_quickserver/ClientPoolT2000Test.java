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
* It contains ten unit test cases for the {@link ClientPool#shouldNioWriteHappen()} method.
*/
class ClientPoolTest {

	@Test
	void testShouldNioWriteHappen() {
		ClientPool clientPool = new ClientPool();
		clientPool.maxThreadsForNioWrite = 0;
		clientPool.countNioWriteThreads = 0;
		assertFalse(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 1;
		clientPool.countNioWriteThreads = 0;
		assertTrue(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 1;
		clientPool.countNioWriteThreads = 1;
		assertFalse(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 2;
		clientPool.countNioWriteThreads = 1;
		assertTrue(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 2;
		clientPool.countNioWriteThreads = 2;
		assertFalse(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 3;
		clientPool.countNioWriteThreads = 2;
		assertTrue(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 3;
		clientPool.countNioWriteThreads = 3;
		assertFalse(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 4;
		clientPool.countNioWriteThreads = 3;
		assertTrue(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 4;
		clientPool.countNioWriteThreads = 4;
		assertFalse(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 5;
		clientPool.countNioWriteThreads = 4;
		assertTrue(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 5;
		clientPool.countNioWriteThreads = 5;
		assertFalse(clientPool.shouldNioWriteHappen());
	}
}