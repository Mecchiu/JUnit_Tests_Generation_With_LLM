// Queue_0Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains ten unit test cases for the {@link Queue#dequeue()} method.
*/
class Queue_0Test {

	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue is empty.
	*/
	@Test
	void testDequeue_0() {
		Queue queue = new Queue();
		assertNull(queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has one element.
	*/
	@Test
	void testDequeue_1() {
		Queue queue = new Queue();
		queue.enqueue(new Object());
		assertNotNull(queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has two elements.
	*/
	@Test
	void testDequeue_2() {
		Queue queue = new Queue();
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertNotNull(queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has three elements.
	*/
	@Test
	void testDequeue_3() {
		Queue queue = new Queue();
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertNotNull(queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has four elements.
	*/
	@Test
	void testDequeue_4() {
		Queue queue = new Queue();
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertNotNull(queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has five elements.
	*/
	@Test
	void testDequeue_5() {
		Queue queue = new Queue();
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertNotNull(queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has six elements.
	*/
	@Test
	void testDequeue_6() {
		Queue queue = new Queue();
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertNotNull(queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has seven elements.
	*/
	@Test
	void testDequeue_7() {
		Queue queue = new Queue();
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertNotNull(queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has eight elements.
	*/
	@Test
	void testDequeue_8() {
		Queue queue = new Queue();
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertNotNull(queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#dequeue()} method.
	* It tests the case when the queue has nine elements.
	*/
	@Test
	void testDequeue_9() {
		Queue queue = new Queue();
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertNotNull(queue.dequeue());
	}
	
}

// Queue_1Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains ten unit test cases for the {@link Queue#enqueue(Object)} method.
*/
class Queue_1Test {
		
	/**
	* Test case for {@link Queue#enqueue(Object)} method.
	* It tests the case when the queue is empty.
	*/
	@Test
	void testEnqueue_0() {
		Queue queue = new Queue();
		queue.enqueue(new Object());
		assertNotNull(queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#enqueue(Object)} method.
	* It tests the case when the queue has one element.
	*/
	@Test
	void testEnqueue_1() {
		Queue queue = new Queue();
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertNotNull(queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#enqueue(Object)} method.
	* It tests the case when the queue has two elements.
	*/
	@Test
	void testEnqueue_2() {
		Queue queue = new Queue();
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertNotNull(queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#enqueue(Object)} method.
	* It tests the case when the queue has three elements.
	*/
	@Test
	void testEnqueue_3() {
		Queue queue = new Queue();
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertNotNull(queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#enqueue(Object)} method.
	* It tests the case when the queue has four elements.
	*/
	@Test
	void testEnqueue_4() {
		Queue queue = new Queue();
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		queue.enqueue(new Object());
		assertNotNull(queue.dequeue());
	}
	
	/**
	* Test case for {@link Queue#enqueue(Object)} method.
	* It tests the case when the queue has five elements.
	*/
	@Test
	