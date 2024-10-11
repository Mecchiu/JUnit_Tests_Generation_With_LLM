// Here's an example of how you can test the maxCapacityExceeded() method of the Queue class:

@Test
void testMaxCapacityExceeded() {
    Queue queue = new Queue();
    queue.setMaxCapacity(5); // set max capacity to 5
    assertFalse(queue.maxCapacityExceeded()); // queue is empty, so max capacity is not exceeded

    // add 5 items to the queue
    for (int i = 0; i < 5; i++) {
        Node node = new Node(i);
        queue.enqueue(node);
    }
    assertFalse(queue.maxCapacityExceeded()); // queue is full, but max capacity is not exceeded

    // add one more item to the queue
    Node node = new Node(6);
    queue.enqueue(node);
    assertTrue(queue.maxCapacityExceeded()); // max capacity is exceeded
}