// QueueTest.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains ten unit test cases for the {@link Queue#dequeue()} method.
*/
class QueueTest {

	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue is empty.
	*/
	@Test
	void testDequeue_EmptyQueue() {
		Queue queue = new Queue();
		assertNull(queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has one item.
	*/
	@Test
	void testDequeue_OneItem() {
		Queue queue = new Queue();
		queue.enqueue(1);
		assertEquals(1, queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has two items.
	*/
	@Test
	void testDequeue_TwoItems() {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		assertEquals(1, queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has three items.
	*/
	@Test
	void testDequeue_ThreeItems() {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		assertEquals(1, queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has four items.
	*/
	@Test
	void testDequeue_FourItems() {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		assertEquals(1, queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has five items.
	*/
	@Test
	void testDequeue_FiveItems() {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		assertEquals(1, queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has six items.
	*/
	@Test
	void testDequeue_SixItems() {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		assertEquals(1, queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has seven items.
	*/
	@Test
	void testDequeue_SevenItems() {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		assertEquals(1, queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has eight items.
	*/
	@Test
	void testDequeue_EightItems() {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		assertEquals(1, queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has nine items.
	*/
	@Test
	void testDequeue_NineItems() {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		assertEquals(1, queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has ten items.
	*/
	@Test
	void testDequeue_TenItems() {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		queue.enqueue(10);
		assertEquals(1, queue.dequeue());
	}
}