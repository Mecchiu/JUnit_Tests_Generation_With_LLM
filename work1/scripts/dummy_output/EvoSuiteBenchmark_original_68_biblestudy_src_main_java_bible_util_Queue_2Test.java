package bible.util;
java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Queue_2Test {

    @Test
    void testMaxCapacityExceededWhenNumItemsLessThanMaxCapacity() {
        Queue queue = new Queue(10);
        queue.enqueue("item1");
        assertFalse(queue.maxCapacityExceeded());
    }

    @Test
    void testMaxCapacityExceededWhenNumItemsEqualToMaxCapacity() {
        Queue queue = new Queue(2);
        queue.enqueue("item1");
        queue.enqueue("item2");
        assertTrue(queue.maxCapacityExceeded());
    }

    @Test
    void testMaxCapacityExceededWhenNumItemsGreaterThanMaxCapacity() {
        Queue queue = new Queue(2);
        queue.enqueue("item1");
        queue.enqueue("item2");
        queue.enqueue("item3");
        assertTrue(queue.maxCapacityExceeded());
    }

    @Test
    void testMaxCapacityExceededWithNoMaximum() {
        Queue queue = new Queue();
        assertFalse(queue.maxCapacityExceeded());
    }

    @Test
    void testMaxCapacityExceededWithNegativeMaximum() {
        Queue queue = new Queue(-1);
        assertFalse(queue.maxCapacityExceeded());
    }

    @Test
    void testMaxCapacityExceededWithZeroMaximum() {
        Queue queue = new Queue(0);
        assertTrue(queue.maxCapacityExceeded());
    }

    @Test
    void testMaxCapacityExceededWithNegativeNumItems() {
        Queue queue = new Queue(5);
        queue.dequeue();
        assertTrue(queue.maxCapacityExceeded());
    }

    @Test
    void testMaxCapacityExceededWithMaxCapacityZero() {
        Queue queue = new Queue(0);
        assertTrue(queue.maxCapacityExceeded());
    }

    @Test
    void testMaxCapacityExceededWithMaxCapacityNegative() {
        Queue queue = new Queue(-5);
        assertFalse(queue.maxCapacityExceeded());
    }

    @Test
    void testMaxCapacityExceededWithMaxCapacityGreaterThanNumItems() {
        Queue queue = new Queue(5);
        queue.enqueue("item1");
        assertFalse(queue.maxCapacityExceeded());
    }
}
