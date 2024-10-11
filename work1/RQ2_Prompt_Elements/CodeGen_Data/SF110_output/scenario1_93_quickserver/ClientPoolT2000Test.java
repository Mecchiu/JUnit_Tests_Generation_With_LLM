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
     * This static inner class contains implementation of
     * {@link ClientPool#ClientPool(PoolConfig, int)} method.
     */
	static class MockClientPool extends ClientPool {
        
		private boolean isClosed;
		
        public MockClientPool(PoolConfig cfg, int maxThreadsForNioWrite) {
            super(cfg, maxThreadsForNioWrite);
        }

        @Override
		protected List<PoolableObjectFactory> createFactoryList() {
            return new ArrayList<PoolableObjectFactory>();
        }
            
        public synchronized boolean isClosed() {
            return isClosed;
        }

		public synchronized void close() {
			isClosed = true;
        }
    }
    
	@Test
	void ClientPool_shouldNioWriteHappen_shouldClose() {
        PoolClientFactory baseF = new MockClientPool(new PoolConfig("base.xml", false), 10000);
        int size = 1000;
        int numOfThreadsCreatedForNioWrite = 20;
        
        int initialThreads = 2;
        int threadsCreatedForNioWrite = numOfThreadsCreatedForNioWrite > size? size : numOfThreadsCreatedForNioWrite;
        PoolClientFactory factory = new MockClientPool(new PoolConfig("base.xml", false), threadsCreatedForNioWrite);

        for(int i = 0; i < numOfThreadsCreatedForNioWrite; i++) {
            ClientPool clientPool = new ClientPool(factory, initialThreads);
            factory.close();
            assertFalse("ClientPool is closed", clientPool.isClosed());
            
            clientPool.close();
            assertTrue("ClientPool is closed", clientPool.isClosed());
        }
	}
}
