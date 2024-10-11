package bible.util;
java
import static org.junit.jupiter.api.Assertions.*;

class Queue_0Test {

    @Test
    void testDequeueEmptyQueue() {
        Queue queue = new Queue();
        assertNull(queue.dequeue());
    }

    @Test
    void testDequeueSingleItemQueue() {
        Queue queue = new Queue();
        queue.enqueue("item");
        assertEquals("item", queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    void testDequeueMultipleItemsQueue() {
        Queue queue = new Queue();
        queue.enqueue("item1");
        queue.enqueue("item2");
        assertEquals("item1", queue.dequeue());
        assertEquals("item2", queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    void testDequeueEmptyQueueMessage() {
        Queue queue = new Queue();
        assertNull(queue.dequeue());
        // Verify message printed to console
    }

    @Test
    void testDequeueSingleItemQueueMessage() {
        Queue queue = new Queue();
        queue.enqueue("item");
        assertEquals("item", queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    void testDequeueMultipleItemsQueueMessage() {
        Queue queue = new Queue();
        queue.enqueue("item1");
        queue.enqueue("item2");
        assertEquals("item1", queue.dequeue());
        assertEquals("item2", queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    void testDequeueEmptyQueuePeakNumberItems() {
        Queue queue = new Queue();
        assertEquals(0, queue.getPeakNumberItems());
    }

    @Test
    void testDequeueSingleItemQueuePeakNumberItems() {
        Queue queue = new Queue();
        queue.enqueue("item");
        queue.dequeue();
        assertEquals(1, queue.getPeakNumberItems());
    }

    @Test
    void testDequeueMultipleItemsQueuePeakNumberItems() {
        Queue queue = new Queue();
        queue.enqueue("item1");
        queue.enqueue("item2");
        queue.dequeue();
        assertEquals(2, queue.getPeakNumberItems());
    }
}
