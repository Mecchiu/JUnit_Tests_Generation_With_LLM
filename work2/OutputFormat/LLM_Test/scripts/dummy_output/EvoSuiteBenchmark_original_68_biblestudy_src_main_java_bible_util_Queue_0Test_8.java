// Queue_0Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains one unit test case for the {@link Queue#dequeue()} method.
*/
class Queue_0Test {
		
	/**
	 * This method creates an object of type {@link StudentStudentBean}and
	 * inserts it as the last element of the queue.
	 */
	@Test
	void test() {
        StudentStudentBean bean = new StudentStudentBean();
        //System.out.println(bean + ":test" );

        StudentStudentBean bean2 = new StudentStudentBean();
        bean2.setId(6162);
        //	System.out.println(bean2.getId()+"  :test");

        QueuedObject queue = new QueuedObject(bean, bean2);

        //System.out.println(queue + ", " + queue.dequeue());

        Object object = queue.remove();
        //System.out.println( "remove of a object :" + object  + " => " );
        assertNotNull("should have a value", object);
        System.out.println( "value : " + object );
        assertEquals ("should have only one element","6162", object);
        //System.out.println( "deque of all objects :");
        Iterator it = queue.getObjects();
        Object anObject;
        while((anObject=it.next())!=null)
        	{
        	//System.out.println( anObject + ", " );
        	}
    }
}