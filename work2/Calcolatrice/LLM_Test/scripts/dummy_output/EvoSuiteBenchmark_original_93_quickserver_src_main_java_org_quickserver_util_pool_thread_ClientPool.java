package org.quickserver.util.pool.thread;
java
class ClientPoolTest {

    @Test
    void testShouldNioWriteHappen_MaxThreadsZero() {
        ClientPool clientPool = new ClientPool(null, null);
        clientPool.setMaxThreadsForNioWrite(0);
        assertTrue(clientPool.shouldNioWriteHappen());
    }

    @Test
    void testShouldNioWriteHappen_CountLessThanMax() {
        ClientPool clientPool = new ClientPool(null, null);
        clientPool.setMaxThreadsForNioWrite(5);
        clientPool.nioWriteStart();
        assertTrue(clientPool.shouldNioWriteHappen());
    }

    @Test
    void testShouldNioWriteHappen_CountEqualToMax() {
        ClientPool clientPool = new ClientPool(null, null);
        clientPool.setMaxThreadsForNioWrite(5);
        clientPool.nioWriteStart();
        clientPool.nioWriteStart();
        clientPool.nioWriteStart();
        clientPool.nioWriteStart();
        clientPool.nioWriteStart();
        assertFalse(clientPool.shouldNioWriteHappen());
    }

    @Test
    void testShouldNioWriteHappen_CountGreaterThanMax() {
        ClientPool clientPool = new ClientPool(null, null);
        clientPool.setMaxThreadsForNioWrite(5);
        clientPool.nioWriteStart();
        clientPool.nioWriteStart();
        clientPool.nioWriteStart();
        clientPool.nioWriteStart();
        clientPool.nioWriteStart();
        clientPool.nioWriteStart();
        assertFalse(clientPool.shouldNioWriteHappen());
    }

    @Test
    void testShouldNioWriteHappen_MaxThreadsLessThanZero() {
        ClientPool clientPool = new ClientPool(null, null);
        clientPool.setMaxThreadsForNioWrite(-1);
        assertTrue(clientPool.shouldNioWriteHappen());
    }

    @Test
    void testShouldNioWriteHappen_CountZero() {
        ClientPool clientPool = new ClientPool(null, null);
        clientPool.setMaxThreadsForNioWrite(5);
        assertTrue(clientPool.shouldNioWriteHappen());
    }

    @Test
    void testShouldNioWriteHappen_CountNegative() {
        ClientPool clientPool = new ClientPool(null, null);
        clientPool.setMaxThreadsForNioWrite(5);
        clientPool.nioWriteEnd();
        assertFalse(clientPool.shouldNioWriteHappen());
    }

    @Test
    void testShouldNioWriteHappen_MaxThreadsZeroCountZero() {
        ClientPool clientPool = new ClientPool(null, null);
        clientPool.setMaxThreadsForNioWrite(0);
        assertTrue(clientPool.shouldNioWriteHappen());
    }

    @Test
    void testShouldNioWriteHappen_MaxThreadsNegativeCountNegative() {
        ClientPool clientPool = new ClientPool(null, null);
        clientPool.setMaxThreadsForNioWrite(-1);
        clientPool.nioWriteEnd();
        assertTrue(clientPool.shouldNioWriteHappen());
    }
}
