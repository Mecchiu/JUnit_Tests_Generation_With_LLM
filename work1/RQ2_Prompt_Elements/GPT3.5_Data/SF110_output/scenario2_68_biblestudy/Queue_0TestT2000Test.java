// Test case 1: Test dequeue method on an empty queue
@Test
public void testDequeueOnEmptyQueue() {
    Queue queue = new Queue();
    assertNull(queue.dequeue());
}

// Test case 2: Test dequeue method on a queue with one item
@Test
public void testDequeueOnQueueWithOneItem() {
    Queue queue = new Queue();
    queue.enqueue("item1");
    assertEquals("item1", queue.dequeue());
}

// Test case 3: Test dequeue method on a queue with multiple items
@Test
public void testDequeueOnQueueWithMultipleItems() {
    Queue queue = new Queue();
    queue.enqueue("item1");
    queue.enqueue("item2");
    queue.enqueue("item3");
    assertEquals("item1", queue.dequeue());
    assertEquals("item2", queue.dequeue());
    assertEquals("item3", queue.dequeue());
}

// Test case 4: Test dequeue method on a queue with null values
@Test
public void testDequeueOnQueueWithNullValues() {
    Queue queue = new Queue();
    queue.enqueue(null);
    queue.enqueue("item1");
    queue.enqueue(null);
    assertEquals(null, queue.dequeue());
    assertEquals("item1", queue.dequeue());
    assertEquals(null, queue.dequeue());
}

// Test case 5: Test dequeue method on a queue with mixed data types
@Test
public void testDequeueOnQueueWithMixedDataTypes() {
    Queue queue = new Queue();
    queue.enqueue("item1");
    queue.enqueue(2);
    queue.enqueue(3.5);
    assertEquals("item1", queue.dequeue());
    assertEquals(2, queue.dequeue());
    assertEquals(3.5, queue.dequeue());
}

// Test case 6: Test dequeue method on a queue with objects
@Test
public void testDequeueOnQueueWithObjects() {
    Queue queue = new Queue();
    GameQuestion question1 = new GameQuestion("What is the capital of France?", "Paris");
    GameQuestion question2 = new GameQuestion("What is the largest country in the world?", "Russia");
    queue.enqueue(question1);
    queue.enqueue(question2);
    assertEquals(question1, queue.dequeue());
    assertEquals(question2, queue.dequeue());
}

// Test case 7: Test dequeue method on a queue with duplicate items
@Test
public void testDequeueOnQueueWithDuplicateItems() {
    Queue queue = new Queue();
    queue.enqueue("item1");
    queue.enqueue("item2");
    queue.enqueue("item1");
    assertEquals("item1", queue.dequeue());
    assertEquals("item2", queue.dequeue());
    assertEquals("item1", queue.dequeue());
}

// Test case 8: Test dequeue method on a queue with a large number of items
@Test
public void testDequeueOnQueueWithLargeNumberOfItems() {
    Queue queue = new Queue();
    for (int i = 0; i < 100000; i++) {
        queue.enqueue("item" + i);
    }
    for (int i = 0; i < 100000; i++) {
        assertEquals("item" + i, queue.dequeue());
    }
}

// Test case 9: Test dequeue method on a queue with non-string items
@Test
public void testDequeueOnQueueWithNonStringItems() {
    Queue queue = new Queue();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    assertEquals(1, queue.dequeue());
    assertEquals(2, queue.dequeue());
    assertEquals(3, queue.dequeue());
}

// Test case 10: Test dequeue method on a queue with a mix of null and non-null items
@Test
public void testDequeueOnQueueWithMixOfNullAndNonNullItems() {
    Queue queue = new Queue();
    queue.enqueue(null);
    queue.enqueue("item1");
    queue.enqueue(null);
    queue.enqueue("item2");
    assertEquals(null, queue.dequeue());
    assertEquals("item1", queue.dequeue());
    assertEquals(null, queue.dequeue());
    assertEquals("item2", queue.dequeue());
}
}