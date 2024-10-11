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
		 * Test method for
		 * {@link Queue#maxCapacityExceeded()}.
		 */
		@Test (expected = IllegalStateException.class)
		public void test() {

    Queue queue = new Queue(Queue_1.NODE_CAPACITY_DELETE.intValue()
                        + Queue_1.QUESTION_COUNT_MAXIMUM.intValue());

    }
}

/**
 * Class to encapsulate the code in {@link Queue$1}.
 */
class Queue_1 extends Queue_1Base {

    public int numberOfItems=0;

    public synchronized void add(Object object) {
            newArrayList.add(object);
            ++numberOfItems;
    }

    public synchronized Object get( int itemNumber) {
            return newArrayList.get(itemNumber);
    }

    public synchronized void refreshElement( Object element) {
            newArrayList.set(0,element);
            ++numberOfItems;
    }

    public static class QuestionNumber extends ArrayList<Integer> {
            int[][] arrayToBeAdded;
            int currentQuestion;

        public QuestionNumber() {
            super();
        }

        public QuestionNumber( ArrayList<Integer> list ) {
            super( list );
        }

        public synchronized Integer get( int itemNumber) {
            return super.get(itemNumber);
        }

        protected int getLastIndex(int itemNumber) {
            return super.size() - 1;
        }
    }

}

class Queue_1$1 extends Queue_1Base {
        public Queue_1$1( int maxSize) {
                super( maxSize);
        }
    }