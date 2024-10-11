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
				maxThreadsForNioWrite = 0;
				countNioWriteThreads = 11;
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
				maxThreadsForNioWrite = -1;
				countNioWriteThreads = 11;
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
				maxThreadsForNioWrite = -10;
				countNioWriteThreads = 11;
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

    private boolean stop = false;

    private boolean isRunning = false;

    private boolean isNioWrite = false;

    private boolean isNioWriteEnd = false;

    private boolean isNioWriteStart = false;

    private boolean isNioWriteStarted = false;

    private boolean isNioWriteEnded = false;

    private boolean isNioWriteStartedEnded = false;

    private boolean isNioWriteEndedStarted = false;

    private boolean isNioWriteEndedEnded = false;

    private boolean isNioWriteStartedStarted = false;

    private boolean isNioWriteStartedStartedEnded = false;

    private boolean isNioWriteStartedEndedStarted = false;

    private boolean isNioWriteStartedEndedEnded = false;

    private boolean isNioWriteEndedStartedStarted = false;

    private boolean isNioWriteEndedStartedEnded = false;

    private boolean isNioWriteEndedEndedStarted = false;

    private boolean isNioWriteEndedEndedEnded = false;

    private boolean isNioWriteStartedStartedStarted = false;

    private boolean isNioWriteStartedStartedStartedEnded = false;

    private boolean isNioWriteStartedStartedEndedStarted = false;

    private boolean isNioWriteStartedStartedEndedEnded = false;

    private boolean isNioWriteStartedEndedStartedStarted = false;

    private boolean isNioWriteStartedEndedStartedEnded = false