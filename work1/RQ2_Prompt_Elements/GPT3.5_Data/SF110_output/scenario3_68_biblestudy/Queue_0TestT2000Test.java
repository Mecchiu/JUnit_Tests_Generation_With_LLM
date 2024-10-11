// Test case 1: Test dequeue method on an empty queue
@Test
public void testDequeueOnEmptyQueue() {
    Queue queue = new Queue();
    assertNull(queue.dequeue());
}

// Test case 2: Test dequeue method on a queue with one element
@Test
public void testDequeueOnQueueWithOneElement() {
    Queue queue = new Queue();
    Node node = new Node();
    queue.enqueue(node);
    assertEquals(node, queue.dequeue());
}

// Test case 3: Test dequeue method on a queue with multiple elements
@Test
public void testDequeueOnQueueWithMultipleElements() {
    Queue queue = new Queue();
    Node node1 = new Node();
    Node node2 = new Node();
    Node node3 = new Node();
    queue.enqueue(node1);
    queue.enqueue(node2);
    queue.enqueue(node3);
    assertEquals(node1, queue.dequeue());
    assertEquals(node2, queue.dequeue());
    assertEquals(node3, queue.dequeue());
}

// Test case 4: Test dequeue method on a queue with null elements
@Test
public void testDequeueOnQueueWithNullElements() {
    Queue queue = new Queue();
    queue.enqueue(null);
    assertNull(queue.dequeue());
}

// Test case 5: Test dequeue method on a queue with mixed elements
@Test
public void testDequeueOnQueueWithMixedElements() {
    Queue queue = new Queue();
    Node node1 = new Node();
    Node node2 = new Node();
    queue.enqueue(node1);
    queue.enqueue(null);
    queue.enqueue(node2);
    assertEquals(node1, queue.dequeue());
    assertNull(queue.dequeue());
    assertEquals(node2, queue.dequeue());
}

// Test case 6: Test dequeue method on a queue with duplicate elements
@Test
public void testDequeueOnQueueWithDuplicateElements() {
    Queue queue = new Queue();
    Node node1 = new Node();
    queue.enqueue(node1);
    queue.enqueue(node1);
    assertEquals(node1, queue.dequeue());
    assertEquals(node1, queue.dequeue());
}

// Test case 7: Test dequeue method on a queue with different types of elements
@Test
public void testDequeueOnQueueWithDifferentTypesOfElements() {
    Queue queue = new Queue();
    Node node = new Node();
    GameQuestion question = new GameQuestion();
    queue.enqueue(node);
    queue.enqueue(question);
    assertEquals(node, queue.dequeue());
    assertEquals(question, queue.dequeue());
}

// Test case 8: Test dequeue method on a queue with large number of elements
@Test
public void testDequeueOnQueueWithLargeNumberOfElements() {
    Queue queue = new Queue();
    for (int i = 0; i < 100000; i++) {
        Node node = new Node();
        queue.enqueue(node);
    }
    for (int i = 0; i < 100000; i++) {
        assertNotNull(queue.dequeue());
    }
}

// Test case 9: Test dequeue method on a queue with elements added and removed concurrently
@Test
public void testDequeueOnConcurrentQueue() throws InterruptedException {
    Queue queue = new Queue();
    Thread t1 = new Thread(() -> {
        for (int i = 0; i < 10000; i++) {
            Node node = new Node();
            queue.enqueue(node);
        }
    });
    Thread t2 = new Thread(() -> {
        for (int i = 0; i < 10000; i++) {
            queue.dequeue();
        }
    });
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    assertEquals(0, queue.size());
}

// Test case 10: Test dequeue method on a queue with elements added and removed concurrently
@Test
public void testDequeueOnConcurrentQueue2() throws InterruptedException {
    Queue queue = new Queue();
    Thread t1 = new Thread(() -> {
        for (int i = 0; i < 10000; i++) {
            Node node = new Node();
            queue.enqueue(node);
        }
    });
    Thread t2 = new Thread(() -> {
        for (int i = 0; i < 10000; i++) {
            queue.dequeue();
        }
    });
    t2.start();
    t1.start();
    t2.join();
    t1.join();
    assertEquals(0, queue.size());
}
}