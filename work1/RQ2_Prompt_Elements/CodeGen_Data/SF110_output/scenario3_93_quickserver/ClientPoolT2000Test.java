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

    // Class under test
    private Pool<List<String>> clientPool = new ClientPool<List<String>>();

    /**
	 * This method tests {@link ClientPool#shouldNioWriteHappen()} method for each
	 * of the following cases :
    * case 1, -: client can't nio write data
    * case 2, :: client can't send nio write data
    * case 3, <: allocating a new client would exceed allocated size
    * case 4, >: the client pool is exhausted
    * case 5, the client pool is full
    *
	 */

    @Test
    void test1() {
        List<String> clientList = new ArrayList<String>();
        clientList.add("Client 1");
        clientList.add("Client 2");
        clientList.add("Client 3");
        clientPool.put(clientList); // Client 1
        assertTrue(clientPool.shouldNioWriteHappen());
    }

    @Test
    void test2() {
        clientPool.put("1", "Client 1");
        assertTrue(clientPool.shouldNioWriteHappen());
    }
    
    @Test
    void test3() {
        clientPool.put("1", "Client 2");
        assertTrue(clientPool.shouldNioWriteHappen());
    }

    @Test
    void test4() {
        List<String> clientList = new ArrayList<String>();
        clientList.add("1");
        clientList.add("Client 2");
        clientList.add("2");
        clientPool.put(clientList); // Client 2
        assertTrue(clientPool.shouldNioWriteHappen());
    }

    @Test
    void test5() {
        clientPool.put("1", "Client 2");
        assertTrue(clientPool.shouldNioWriteHappen());
    }

    @Test
    void test6() {
        clientPool.put("1", "Client 2");
        clientPool.put("1", "Client 3");
        assertTrue(clientPool.shouldNioWriteHappen());
    }

    @Test
    void test7() {
        List<String> clientList = new ArrayList<String>();
        clientList.add("1");
        clientList.add("Client 3");
        clientList.add("2");
        clientPool.put(clientList); // Client 3
        assertTrue(clientPool.shouldNioWriteHappen());
    }

    @Test
    void test8() {
        clientPool.put("1", "Client 3");
        assertTrue(clientPool.shouldNioWriteHappen());
    }
    
	@Test
    void test9() {
        int size = clientPool.getPool().size();
        clientPool.put("1", "Client 3");
        assertTrue(clientPool.shouldNioWriteHappen());
        clientPool.put("1", "Client 2");
        assertTrue(clientPool.shouldNioWriteHappen());
    }
}

