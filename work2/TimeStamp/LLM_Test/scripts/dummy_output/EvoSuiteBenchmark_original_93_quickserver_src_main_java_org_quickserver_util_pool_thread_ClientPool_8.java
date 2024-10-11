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
		
	static final SimplePoolConfig CONST_SIZE  = new SimplePoolConfig("CLIENT_POOL_CONST_SIZE", "0");

	public static final String TEST_PATH = "tmp/ClientPool_Test";

	public static final String TEST_TYPE = "test";

	private ConnectionManager manager = new InMemConnectorPoolManager(1, CONST_SIZE);

	@Test
	public void testShouldNioWriteHappen()
		throws SQLException {
		
		PoolPoolThread thread = manager.getPool(TEST_TYPE, 10, 10000, 10, false, true);
		try {
			PoolConfig config = new PoolConfig("CLIENT_POOL_TEST_CONFIG_PROPERTIES");
			config.setProperty("pool.nio.write.handling", "nio.write.exception.handling");
			config.setProperty("pool.thread.nio.writer.maxsize", "1000");
			config.setProperty("pool.thread.nio.writer.type", "tcp.socket");

			connectionCreation(config, manager, thread);

			// wait for the request being processed
			Thread.sleep(5000);

			assertTrue(thread.isNioWriteHappen());

			// shutdown the pool
			shutdown(manager, 30);

			// the write test can only be executed as single thread
			assertFalse(thread.isNioWriteHappen());
			
			// shut down the manager
			shutdown(manager, 30);

			// resetting the manager to initial state
			manager = new InMemConnectorPoolManager(1, CONST_SIZE);

			assertEquals(manager.getState(), 0);
		} finally {
			thread.validate();
		}
	}

	private Set<Thread> threads;
	
    public ClientPoolTest() {
        threads = Collections.synchronizedSet(new HashSet<Thread>());
    }
    

	protected static void connectionCreation(PoolConfig config, ConnectionManager pool, PoolPoolThread thread) {
		PoolConnection poolConn = pool.createEmpty();
		setUpDefaultThread(config, poolConn);
		thread.setPoolConn(poolConn);
		thread.validate();
		thread.start();
		thread.waitUntilStarted();
	}

	protected static void shutdown(PoolPoolThread thread, int time) {
		thread.cancel(true);
		if (time > 0) Thread.sleep(time);
		thread.validate();
	}

	protected static void setUpDefaultThread(PoolConfig config, PoolConnection pool) {
		new Thread(new Thread() {
			public void run() {
				setUpDefaultThreadImpl(config, pool);
				threads.add(this);
			}
		}).start();
	}

	protected static void setUpDefaultThreadImpl(PoolConfig config, PoolConnection pool) {
		pool.createInnerTransactionCommit(true);
		for (int i = 0; i < 10; i++)
			new Thread(new Thread() {
				public void run() {
					Thread.sleep(10);
					try {
						Thread.sleep(400);
					} catch(Exception e) {
					}
					
					ConnectionPoolThread thread = pool.get(config);
						thread.beforeConnection();
						thread.validate();
					}
				}).start();
	}

	protected void validate() {
		assertNotNull(threads);
		assertTrue(threads.isEmpty());
		
	}

	protected static String poolCreateType(PoolPoolThread thread) {
		return (thread.poolConn.getType().startsWith("TCP") &&!thread.poolConn.isConnected()? "" : "not connected. ");
	}
}