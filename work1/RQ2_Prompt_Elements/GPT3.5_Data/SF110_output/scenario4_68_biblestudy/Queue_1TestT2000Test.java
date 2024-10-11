// Test case for Queue.maxCapacityExceeded() method
class Queue_1Test {
    
    // Test case 1: Test when maxCapacity is NO_MAXIMUM
    @Test
    void testMaxCapacityExceeded_NoMaximum() {
        Queue queue = new Queue();
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 2: Test when maxCapacity is greater than number of items in queue
    @Test
    void testMaxCapacityExceeded_LessThanMax() {
        Queue queue = new Queue(5);
        queue.enqueue("item1");
        queue.enqueue("item2");
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 3: Test when maxCapacity is equal to number of items in queue
    @Test
    void testMaxCapacityExceeded_EqualToMax() {
        Queue queue = new Queue(2);
        queue.enqueue("item1");
        queue.enqueue("item2");
        assertTrue(queue.maxCapacityExceeded());
    }
    
    // Test case 4: Test when maxCapacity is less than number of items in queue
    @Test
    void testMaxCapacityExceeded_GreaterThanMax() {
        Queue queue = new Queue(2);
        queue.enqueue("item1");
        queue.enqueue("item2");
        queue.enqueue("item3");
        assertTrue(queue.maxCapacityExceeded());
    }
    
    // Test case 5: Test when maxCapacity is zero
    @Test
    void testMaxCapacityExceeded_Zero() {
        Queue queue = new Queue(0);
        assertTrue(queue.maxCapacityExceeded());
    }
    
    // Test case 6: Test when queue is empty
    @Test
    void testMaxCapacityExceeded_EmptyQueue() {
        Queue queue = new Queue(5);
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 7: Test when maxCapacity is negative
    @Test
    void testMaxCapacityExceeded_Negative() {
        Queue queue = new Queue(-5);
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 8: Test when maxCapacity is greater than Integer.MAX_VALUE
    @Test
    void testMaxCapacityExceeded_MaxValue() {
        Queue queue = new Queue(Integer.MAX_VALUE + 1);
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 9: Test when maxCapacity is equal to Integer.MAX_VALUE
    @Test
    void testMaxCapacityExceeded_EqualToMaxValue() {
        Queue queue = new Queue(Integer.MAX_VALUE);
        queue.enqueue("item1");
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 10: Test when maxCapacity is less than Integer.MAX_VALUE
    @Test
    void testMaxCapacityExceeded_LessThanMaxValue() {
        Queue queue = new Queue(Integer.MAX_VALUE - 1);
        queue.enqueue("item1");
        assertFalse(queue.maxCapacityExceeded());
    }
}