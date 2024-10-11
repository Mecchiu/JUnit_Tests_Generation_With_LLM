// Test cases for Queue.maxCapacityExceeded() method
class Queue_1Test {
    
    // Test case 1: Test when maxCapacity is NO_MAXIMUM
    @Test
    void testMaxCapacityExceeded_NoMaximum() {
        Queue queue = new Queue();
        queue.numItems = 10;
        queue.maxCapacity = Queue.NO_MAXIMUM;
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 2: Test when numItems is less than maxCapacity
    @Test
    void testMaxCapacityExceeded_LessThanMax() {
        Queue queue = new Queue();
        queue.numItems = 10;
        queue.maxCapacity = 20;
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 3: Test when numItems is equal to maxCapacity
    @Test
    void testMaxCapacityExceeded_EqualToMax() {
        Queue queue = new Queue();
        queue.numItems = 10;
        queue.maxCapacity = 10;
        assertTrue(queue.maxCapacityExceeded());
    }
    
    // Test case 4: Test when numItems is greater than maxCapacity
    @Test
    void testMaxCapacityExceeded_GreaterThanMax() {
        Queue queue = new Queue();
        queue.numItems = 20;
        queue.maxCapacity = 10;
        assertTrue(queue.maxCapacityExceeded());
    }
    
    // Test case 5: Test when maxCapacity is negative
    @Test
    void testMaxCapacityExceeded_NegativeMax() {
        Queue queue = new Queue();
        queue.numItems = 10;
        queue.maxCapacity = -1;
        assertTrue(queue.maxCapacityExceeded());
    }
    
    // Test case 6: Test when numItems is zero and maxCapacity is zero
    @Test
    void testMaxCapacityExceeded_ZeroItemsAndMax() {
        Queue queue = new Queue();
        queue.numItems = 0;
        queue.maxCapacity = 0;
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 7: Test when numItems is zero and maxCapacity is positive
    @Test
    void testMaxCapacityExceeded_ZeroItemsPositiveMax() {
        Queue queue = new Queue();
        queue.numItems = 0;
        queue.maxCapacity = 10;
        assertFalse(queue.maxCapacityExceeded());
    }
    
    // Test case 8: Test when numItems is positive and maxCapacity is zero
    @Test
    void testMaxCapacityExceeded_PositiveItemsZeroMax() {
        Queue queue = new Queue();
        queue.numItems = 10;
        queue.maxCapacity = 0;
        assertTrue(queue.maxCapacityExceeded());
    }
    
    // Test case 9: Test when numItems is negative and maxCapacity is positive
    @Test
    void testMaxCapacityExceeded_NegativeItemsPositiveMax() {
        Queue queue = new Queue();
        queue.numItems = -10;
        queue.maxCapacity = 20;
        assertTrue(queue.maxCapacityExceeded());
    }
    
    // Test case 10: Test when numItems is positive and maxCapacity is negative
    @Test
    void testMaxCapacityExceeded_PositiveItemsNegativeMax() {
        Queue queue = new Queue();
        queue.numItems = 10;
        queue.maxCapacity = -1;
        assertTrue(queue.maxCapacityExceeded());
    }
}