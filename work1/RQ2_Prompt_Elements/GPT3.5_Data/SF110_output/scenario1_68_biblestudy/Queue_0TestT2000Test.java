// Here's an example of how you can test the dequeue() method of the Queue class:

class Queue_0Test {
    
    @Test
    void testDequeueEmptyQueue() {
        Queue queue = new Queue();
        assertNull(queue.dequeue());
    }
    
    @Test
    void testDequeueOneItem() {
        Queue queue = new Queue();
        queue.enqueue("item");
        assertEquals("item", queue.dequeue());
        assertTrue(queue.isEmpty());
    }
    
    @Test
    void testDequeueMultipleItems() {
        Queue queue = new Queue();
        queue.enqueue("item1");
        queue.enqueue("item2");
        queue.enqueue("item3");
        assertEquals("item1", queue.dequeue());
        assertEquals("item2", queue.dequeue());
        assertEquals("item3", queue.dequeue());
        assertTrue(queue.isEmpty());
    }
    
    @Test
    void testDequeueAfterEnqueue() {
        Queue queue = new Queue();
        queue.enqueue("item1");
        assertEquals("item1", queue.dequeue());
        queue.enqueue("item2");
        assertEquals("item2", queue.dequeue());
        assertTrue(queue.isEmpty());
    }
    
    @Test
    void testDequeueNullItem() {
        Queue queue = new Queue();
        queue.enqueue(null);
        assertNull(queue.dequeue());
        assertTrue(queue.isEmpty());
    }
    
    @Test
    void testDequeueMixedItems() {
        Queue queue = new Queue();
        queue.enqueue("item1");
        queue.enqueue(null);
        queue.enqueue(123);
        assertEquals("item1", queue.dequeue());
        assertNull(queue.dequeue());
        assertEquals(123, queue.dequeue());
        assertTrue(queue.isEmpty());
    }
    
    @Test
    void testDequeueEmptyQueueTwice() {
        Queue queue = new Queue();
        assertNull(queue.dequeue());
        assertNull(queue.dequeue());
        assertTrue(queue.isEmpty());
    }
    
    @Test
    void testDequeueAfterClear() {
        Queue queue = new Queue();
        queue.enqueue("item1");
        queue.enqueue("item2");
        queue.clear();
        assertNull(queue.dequeue());
        assertTrue(queue.isEmpty());
    }
    
    @Test
    void testDequeueAfterEnqueueAndClear() {
        Queue queue = new Queue();
        queue.enqueue("item1");
        queue.clear();
        queue.enqueue("item2");
        assertEquals("item2", queue.dequeue());
        assertTrue(queue.isEmpty());
    }
    
    @Test
    void testDequeueConcurrentAccess() {
        Queue queue = new Queue();
        queue.enqueue("item1");
        queue.enqueue("item2");
        Thread t1 = new Thread(() -> {
            assertEquals("item1", queue.dequeue());
        });
        Thread t2 = new Thread(() -> {
            assertEquals("item2", queue.dequeue());
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(queue.isEmpty());
    }
}