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
		clientPool.countNioWriteThreads = 0;
		assertTrue(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 2;
		clientPool.countNioWriteThreads = 1;
		assertTrue(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 2;
		clientPool.countNioWriteThreads = 2;
		assertFalse(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 3;
		clientPool.countNioWriteThreads = 0;
		assertTrue(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 3;
		clientPool.countNioWriteThreads = 1;
		assertTrue(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 3;
		clientPool.countNioWriteThreads = 2;
		assertTrue(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 3;
		clientPool.countNioWriteThreads = 3;
		assertFalse(clientPool.shouldNioWriteHappen());
	}
}

// ClientPool.java
package org.quickserver.util.pool.thread;

import java.util.*;
import org.quickserver.util.pool.*;
import org.apache.commons.pool.*;
import org.quickserver.net.server.*;
import org.quickserver.util.xmlreader.PoolConfig;
import java.util.logging.*;

/**
 * This is a class for managing the pool of threads for
 * handling clients.
 *
 * @author Akshathkumar Shetty
 * @since 1.3
 */
public class ClientPool {

    /**
     * Method to suggest if nio write should be sent for processing.
     *
     * @since 1.4.6
     */
    public boolean shouldNioWriteHappen() {
        if (maxThreadsForNioWrite <= 0 || countNioWriteThreads < maxThreadsForNioWrite) {
            return true;
        } else {
            return false;
        }
    }
}

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
		clientPool.countNioWriteThreads = 0;
		assertTrue(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 2;
		clientPool.countNioWriteThreads = 1;
		assertTrue(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 2;
		clientPool.countNioWriteThreads = 2;
		assertFalse(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 3;
		clientPool.countNioWriteThreads = 0;
		assertTrue(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 3;
		clientPool.countNioWriteThreads = 1;
		assertTrue(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 3;
		clientPool.countNioWriteThreads = 2;
		assertTrue(clientPool.shouldNioWriteHappen());
		
		clientPool.maxThreadsForNioWrite = 3;
		clientPool.countNioWriteThreads = 3;
		assertFalse(clientPool.shouldNioWriteHappen());
	}
}

// ClientPool.java
package org.quickserver.util.pool.thread;

import java.util.*;
import org.quickserver.util.pool.*;
import org.apache.commons.pool.*;
import org.quickserver.net.server.*;
import org.quickserver.util.xmlreader.PoolConfig;
import java.util.logging.*;

/**
 * This is a class for managing the pool of threads for
 * handling clients.
 *
 * @author Akshathkumar Shetty
 * @since 1.3
 */
public class ClientPool {

    /**
     * Method to suggest if nio write should be sent for processing.
     *
     * @since 1.4.6
     */
    public boolean shouldNioWriteHappen() {
        if (maxThreadsForNioWrite <= 0 || countNioWriteThreads < maxThreadsForNioWrite) {
            return true;
        } else {
            return false;
        }
    }
}

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
		assertFalse(clientPool.shouldNioWriteHappen