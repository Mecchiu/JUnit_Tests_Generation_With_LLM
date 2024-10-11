// Queue_1Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains one unit test case for the {@link Queue#maxCapacityExceeded()} method.
*/
class Queue_1Test {
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

    /**
     *  Returns true if the first should be removed.
     */
    public boolean maxCapacityExceeded() {
        return (numItems > (maxCapacity - 1)) && (maxCapacity!= NO_MAXIMUM);
    }
}

// Queue_1Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains one unit test case for the {@link Queue#maxCapacityExceeded()} method.
*/
class Queue_1Test {
		/**
	 *  Constructor of Queue.
	 */
    public Queue_1Test() {}

	/**
	 *  Returns true if the queue can have items.
	 */
    @Test
    public void maxCapacityExceededItemReturned() {
        for (int i = 0; i <= maxItem; i++) {
            assert (i <= maxItem);
        }
        assert (maxItem <= maxItem);
    }

        /**
	 *  Creates a new queue with a capacity of one item.
	 */
    @Test
    public void createOneItemInt() {
        Queue one = new Queue_1();
        one.numItems = 1;
        assert (one.numItems <= 1);
    }

        /**
	 *  Creates a new queue with some capacity.
	 */
    @Test
    public void createSomeCapacityInt() {
        Queue aList = new ArrayDeque(maxItem);
        Queue bList = new ArrayDeque(2 * maxItem);
        aList.addLast(1);
        bList.addLast(2);
        aList.addLast(3);
        bList.addLast(4);
    }

	/**
	 *  Creates a new queue with a capacity of two items.
	 */
    @Test
    public void createTwoItemsInt() {
        Queue one = new Queue_1();
        one.numItems = 2;
        assert (one.numItems <= 2);
    }

        /**
	 *  Creates a new empty Queue.
	 */
    @Test
    public void createEmptyQueue() {
        Queue one = new Queue_1();
        assert (one.numItems == 0);
    }

        /**
	 *  Add a new node to a Queue.
	 *  It can keep the old node in a list.
	 */
    @Test
    public void addNodeInt() {
        Queue aList = new ArrayDeque(2 * maxItem + 1);
        assert (aList.getFirst(); > 0);
        assert (aList.getFirst() == aList.getLast());

        aList.addLast(1);
        aList.addLast(2);
        aList.addLast(3);
        aList.addLast(4);
        assert (aList.getLast() > 0);
        assert (aList.getFirst() == 2);
    }

        /**
	 *  Return an iterator on a Queue.
	 */
    @Test
    public void returnIteratorInt() {
        Queue aList = new ArrayDeque(2 * maxItem + 1);
        assert (aList.iterator().next() == 2);
    }

        /**
	 *  Remove one item from a Queue.
	 */
    @Test
    public void removeOneItemInt() {
        Queue aList = new ArrayDeque(2 * maxItem + 1);
        aList.addLast(1);
        aList.addLast(1);
        aList.addLast(1);
        aList.addLast(1);
        aList.addLast(1);
        assert (aList.size() <= maxItem);
	Iterator<Node> it = aList.iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assert (aList.size() <= maxItem);
	assertFalse(it.hasNext());
    }

        /**
	 *  Remove several items from a Queue.
	 */
    @Test
    public void removeSeveralItemsInt() {
        Queue aList = new ArrayDeque(maxItem + 1);
        for (int j = 0; j < maxItem; j++) {
            aList.addLast(j);
        }
        assert (aList.size() <= maxItem);
        Iterator<Node> it = aList.iterator();
        it.next();
        it.next();
        it.next();
        it.remove();
        assert (aList.size() <= maxItem);
        assert (it.hasNext());
        Node n = it.next();
        assert (n!= null);
        assert (n.getItem() % maxItem == j);
        n.recycle(n.getItem());
        assert (n.getItem() % maxItem == j);
        n.recycle(n.getItem());
    }

    /**
	 *  Add an iterator to a Queue.
	 */
    @Test
    public void iteratorInt() {
        Queue aList = new ArrayDeque(maxItem + 1);
        Iterator<Node> it = aList.iterator();
        it.next();
        it.next();
        it.next();
        it.next();
        it.next();
        it.remove();
        aList.addLast(1);
        aList.addLast(2);
        aList.addLast(3);
        aList.addLast(4);
        Iterator<Node> listIt = aList.iterator();
        assert (listIt.next()!= null);
        assert (listIt.size() <= maxItem);
        assert (listIt.hasNext());
        Node node = listIt.next();
        assert (node!= null);
        assert (listIt.hasNext() || listIt.hasNext());
    }
}
