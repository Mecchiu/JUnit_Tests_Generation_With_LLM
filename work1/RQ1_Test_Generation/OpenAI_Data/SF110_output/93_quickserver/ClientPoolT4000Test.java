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

		private static final Logger logger = Logger.getLogger(ClientPoolTest.class.getName());
		
		private ClientPool clientPool;
		
		private PoolConfig poolConfig;
		
		private QSObjectPool objectPool;
		
		private ClientThread clientThread;
		
		private Runnable runnable;
		
		private int maxThreadsForNioWrite;
		
		private int countNioWriteThreads;
		
		private boolean shouldNioWriteHappen;
		
		private void setUp() {
				poolConfig = new PoolConfig();
				objectPool = new QSObjectPool(poolConfig);
				clientPool = new ClientPool(objectPool, poolConfig);
				clientThread = new ClientThread(clientPool);
				runnable = new Runnable() {
						public void run() {
								logger.info("Runnable");
						}
				};
		}
		
		@Test
		void testShouldNioWriteHappen() {
				setUp();
				maxThreadsForNioWrite = 10;
				countNioWriteThreads = 0;
				shouldNioWriteHappen = true;
				assertEquals(shouldNioWriteHappen, clientPool.shouldNioWriteHappen());
				
				setUp();
				maxThreadsForNioWrite = 10;
				countNioWriteThreads = 10;
				shouldNioWriteHappen = false;
				assertEquals(shouldNioWriteHappen, clientPool.shouldNioWriteHappen());
				
				setUp();
				maxThreadsForNioWrite = 10;
				countNioWriteThreads = 11;
				shouldNioWriteHappen = false;
				assertEquals(shouldNioWriteHappen, clientPool.shouldNioWriteHappen());
				
				setUp();
				maxThreadsForNioWrite = 0;
				countNioWriteThreads = 0;
				shouldNioWriteHappen = true;
				assertEquals(shouldNioWriteHappen, clientPool.shouldNioWriteHappen());
				
				setUp();
				maxThreadsForNioWrite = 0;
				countNioWriteThreads = 10;
				shouldNioWriteHappen = true;
				assertEquals(shouldNioWriteHappen, clientPool.shouldNioWriteHappen());
				
				setUp();
				maxThreadsForNioWrite = -1;
				countNioWriteThreads = 0;
				shouldNioWriteHappen = true;
				assertEquals(shouldNioWriteHappen, clientPool.shouldNioWriteHappen());
				
				setUp();
				maxThreadsForNioWrite = -1;
				countNioWriteThreads = 10;
				shouldNioWriteHappen = true;
				assertEquals(shouldNioWriteHappen, clientPool.shouldNioWriteHappen());
				
				setUp();
				maxThreadsForNioWrite = -10;
				countNioWriteThreads = 0;
				shouldNioWriteHappen = true;
				assertEquals(shouldNioWriteHappen, clientPool.shouldNioWriteHappen());
				
				setUp();
				maxThreadsForNioWrite = -10;
				countNioWriteThreads = 10;
				shouldNioWriteHappen = true;
				assertEquals(shouldNioWriteHappen, clientPool.shouldNioWriteHappen());
				
				setUp();
				maxThreadsForNioWrite = 10;
				countNioWriteThreads = -1;
				shouldNioWriteHappen = true;
				assertEquals(shouldNioWriteHappen, clientPool.shouldNioWriteHappen());
		}
}

// ClientThread.java
/*
 * This file is part of the QuickServer library 
 * Copyright (C) QuickServer.org
 *
 * Use, modification, copying and distribution of this software is subject to
 * the terms and conditions of the GNU Lesser General Public License. 
 * You should have received a copy of the GNU LGP License along with this 
 * library; if not, you can download a copy from <http://www.quickserver.org/>.
 *
 * For questions, suggestions, bug-reports, enhancement-requests etc.
 * visit http://www.quickserver.org
 *
 */
package org.quickserver.util.pool.thread;

import java.util.*;
import org.quickserver.util.pool.*;
import org.apache.commons.pool.*;
import org.quickserver.net.server.*;
import org.quickserver.util.xmlreader.PoolConfig;
import java.util.logging.*;

/**
 * This is a class for handling clients.
 * @author Akshathkumar Shetty
 * @since 1.3
 */
public class ClientThread extends Thread {

    private static final Logger logger = Logger.getLogger(ClientThread.class.getName());

    private ClientPool clientPool;

    private boolean ready = false;

    private boolean running = true;

    private Runnable client;

    public ClientThread(ClientPool clientPool) {
        this.clientPool = clientPool;
        setDaemon(true);
        start();
    }

    public void run() {
        while (running) {
            try {
                synchronized (this) {
                    ready = true;
                    wait();
                }
                client = clientPool.getClient();
                if (client != null) {
                    client.run();
                }
            } catch (InterruptedException e) {
                logger.warning("Interrupted: " + e);
            } catch (Exception e) {
                logger.warning("Error in ClientThread: " + e);
            } finally {
                clientPool.returnObject(this);
            }
        }
    }

    public boolean isReady() {
        return ready;
    }

    public void close() {
        running = false;
        interrupt();
    }
}

// QSObjectPool.java
/*
 * This file is part of the QuickServer library 
 * Copyright (C) QuickServer.org
 *
 * Use, modification, copying and distribution of this software is subject to
 * the terms and conditions of the GNU Lesser General Public License. 
 * You should have received a copy of the GNU LGP License along with this 
 * library; if not, you can download a copy from <http://www.quickserver.org/>.
 *
 * For questions, suggestions, bug-reports, enhancement-requests etc.
 * visit http://www.quickserver.org
 *
 */
package org.quickserver.util.pool;

import java.util.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.PoolConfig;
import java.util.logging.*;

/**
 * This is a class for managing the pool of objects.
 * @author Akshathkumar Shetty
 * @since 1.3
 */
public class QSObjectPool implements ObjectPool {

    private static final Logger logger = Logger.getLogger(QSObjectPool.class.getName());

    private ObjectPool pool;

    private PoolConfig poolConfig;

    private Object objectToSynchronize;

    public QSObjectPool(PoolConfig poolConfig) {
        this.poolConfig = poolConfig;
        pool = new StackObjectPool(new QSObjectPoolFactory(poolConfig), poolConfig.getMaxActive(), poolConfig.getWhenExhaustedAction(), poolConfig.getMaxWait(), poolConfig.getMaxIdle(), poolConfig.getMinIdle(), poolConfig.isTestOnBorrow(), poolConfig.isTestOnReturn(), poolConfig.getTimeBetweenEvictionRunsMillis(), poolConfig.getNumTestsPerEvictionRun(), poolConfig.getMinEvictableIdleTimeMillis(), poolConfig.isTestWhileIdle());
    }

    public ObjectPool getObjectPool() {
        return pool;
    }

    public Object borrowObject() throws Exception {
        return pool.borrowObject();
    }

    public void returnObject(Object object) throws Exception {
        pool.returnObject(object);
    }

    public void invalidateObject(Object object) throws Exception {
        pool.invalidateObject(object);
    }

    public void addObject() throws Exception {
        pool.addObject();
    }

    public int getNumIdle() throws UnsupportedOperationException {
        return pool.getNumIdle();
    }

    public int getNumActive() throws UnsupportedOperationException {
        return pool.getNumActive();
    }

    public void clear() throws Exception, UnsupportedOperationException {
        pool.clear();
    }

    public void close() throws Exception {
        pool.close();
    }

    /**
     * Returns iterator containing all the active
     * objects.
     * @since 1.3.1
     */
    public final Iterator getAllActiveObjects() {
        return ((StackObjectPool) pool).getAllObjects();
    }

    /**
     * Returns the object to synchronize on.
     * @since 1.4.1
     */
    public Object getObjectToSynchronize() {
        if (objectToSynchronize == null) {
            objectToSynchronize = new Object();
        }
        return objectToSynchronize;
    }
}

// QSObjectPoolFactory.java
/*
 * This file is part of the QuickServer library 
 * Copyright (C) QuickServer.org
 *
 * Use, modification, copying and distribution of this software is subject to
 * the terms and conditions of the GNU Lesser General Public License. 
 * You should have received a copy of the GNU LGP License along with this 
 * library; if not, you can download a copy from <http://www.quickserver.org/>.
 *
 * For questions, suggestions, bug-reports, enhancement-requests etc.
 * visit http://www.quickserver.org
 *
 */
package org.quickserver.util.pool;

import java.util.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.PoolConfig;
import java.util.logging.*;

/**
 * This is a class for creating objects for the pool.
 * @author Akshathkumar Shetty
 * @since 1.3
 */
public class QSObjectPoolFactory implements PoolableObjectFactory {

    private static final Logger logger = Logger.getLogger(QSObjectPoolFactory.class.getName());

    private PoolConfig poolConfig;

    public QSObjectPoolFactory(PoolConfig poolConfig) {
        this.poolConfig = poolConfig;
    }

    public Object makeObject() throws Exception {
        return new ClientThread(poolConfig.getClientPool());
    }

    public void destroyObject(Object object) throws Exception {
        ((ClientThread) object).close();
    }

    public boolean validateObject(Object object) {
        return true;
    }

    public void activateObject(Object object) throws Exception {
    }

    public void passivateObject(Object object) throws Exception {
    }
}

// PoolConfig.java
/*
 * This file is part of the QuickServer library 
 * Copyright (C) QuickServer.org
 *
 * Use, modification, copying and distribution of this software is subject to
 * the terms and conditions of the GNU Lesser General Public License. 
 * You should have received a copy of the GNU LGP License along with this 
 * library; if not, you can download a copy from <http://www.quickserver.org/>.
 *
 * For questions, suggestions, bug-reports, enhancement-requests etc.
 * visit http://www.quickserver.org
 *
 */
package org.quickserver.util.xmlreader;

import java.util.*;
import org.quickserver.util.pool.*;
import org.apache.commons.pool.*;
import org.quickserver.net.server.*;
import java.util.logging.*;

/**
 * This class holds the pool configuration.
 * @author Akshathkumar Shetty
 * @since 1.3
 */
public class PoolConfig {

    private static final Logger logger = Logger.getLogger(PoolConfig.class.getName());

    private int maxActive = 8;

    private byte whenExhaustedAction = GenericObjectPool.WHEN_EXHAUSTED_BLOCK;

    private long maxWait = -1;

    private int maxIdle = 8;

    private int minIdle = 0;

    private boolean testOnBorrow = false;

    private boolean testOnReturn = false;

    private long timeBetweenEvictionRunsMillis = -1;

    private int numTestsPerEvictionRun = 3;

    private long minEvictableIdleTimeMillis = 1000 * 60 * 30;

    private boolean testWhileIdle = false;

    private ClientPool clientPool;

    public PoolConfig() {
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public byte getWhenExhaustedAction() {
        return whenExhaustedAction;
    }

    public void setWhenExhaustedAction(byte whenExhaustedAction) {
        this.whenExhaustedAction = whenExhaustedAction;
    }

    public long getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(long maxWait) {
        this.maxWait = maxWait;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public boolean isTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    public long getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    public void setTimeBetweenEvictionRunsMillis(long timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    public int getNumTestsPerEvictionRun() {
        return numTestsPerEvictionRun;
    }

    public void setNumTestsPerEvictionRun(int numTestsPerEvictionRun) {
        this.numTestsPerEvictionRun = numTestsPerEvictionRun;
    }

    public long getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    public void setMinEvictableIdleTimeMillis(long minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }

    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhile