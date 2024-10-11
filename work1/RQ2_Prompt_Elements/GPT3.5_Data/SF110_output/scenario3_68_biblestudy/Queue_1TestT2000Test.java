// Here's an example implementation of the Queue class and its test class

// Queue.java
package bible.util;

import java.util.*;

/**
 * Queue is a storage class to link together <b>Node</b> objects which are
 * stored in a first in first out storage system.
 *
 * @see Node
 * @version 1.0
 * @author LaMoine Zielieke, James Stauffer
 */
public class Queue {

    private int maxSize;
    private LinkedList<Node> queueList;

    /**
     * Constructor for Queue class.
     * @param maxSize the maximum size of the queue
     */
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queueList = new LinkedList<Node>();
    }

    /**
     * Adds a node to the end of the queue.
     * @param node the node to add
     * @throws IllegalStateException if the queue is already at maximum capacity
     */
    public void enqueue(Node node) {
        if (queueList.size() == maxSize) {
            throw new IllegalStateException("Queue is already at maximum capacity");
        }
        queueList.addLast(node);
    }

    /**
     * Removes and returns the first node in the queue.
     * @return the first node in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Node dequeue() {
        if (queueList.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queueList.removeFirst();
    }

    /**
     * Returns true if the queue is at maximum capacity.
     * @return true if the queue is at maximum capacity, false otherwise
     */
    public boolean maxCapacityExceeded() {
        return queueList.size() == maxSize;
    }
}

// Queue_1Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains ten unit test cases for the {@link Queue#maxCapacityExceeded()} method.
*/
class Queue_1Test {

    @Test
    void testMaxCapacityExceeded() {
        Queue queue = new Queue(5);
        assertFalse(queue.maxCapacityExceeded());
        queue.enqueue(new Node(1));
        assertFalse(queue.maxCapacityExceeded());
        queue.enqueue(new Node(2));
        assertFalse(queue.maxCapacityExceeded());
        queue.enqueue(new Node(3));
        assertFalse(queue.maxCapacityExceeded());
        queue.enqueue(new Node(4));
        assertFalse(queue.maxCapacityExceeded());
        queue.enqueue(new Node(5));
        assertTrue(queue.maxCapacityExceeded());
        queue.dequeue();
        assertFalse(queue.maxCapacityExceeded());
        queue.enqueue(new Node(6));
        assertTrue(queue.maxCapacityExceeded());
        queue.dequeue();
        assertFalse(queue.maxCapacityExceeded());
        queue.dequeue();
        assertFalse(queue.maxCapacityExceeded());
        queue.dequeue();
        assertFalse(queue.maxCapacityExceeded());
        queue.dequeue();
        assertFalse(queue.maxCapacityExceeded());
        assertThrows(IllegalStateException.class, () -> queue.enqueue(new Node(7)));
    }
}