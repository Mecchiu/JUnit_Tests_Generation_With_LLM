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
	    * @throws java.lang.Exception
	    */
	    @Test
		public void testMaxCapacityException() throws Exception{
				Collection c=new ArrayList();
				c.add(new Node(true));
				Node rootN=(Node)c.iterator().next();
				rootN.next=new Node(false);
				rootN.next.next=new Node(false);
				assertEquals(false,rootN.next.getBoolean(true));
				
				List l=new ArrayList();
				l.add(new Node(true));
				l.add(new Node(false));
				l.add(new Node(true));
				l.add(new Node(false));
				Node node=new Node(true);
				while(!node.maxCapacityExceeded()){
					node.delete();		
				}
				assertEquals(true,node.maxCapacityExceeded());
				
				l.remove(l.size()-1);
				l.remove(l.size()-1);
				int x=l.size();
				node=new Node(true);
				node.delete();
				node.delete();		
				node=new Node(true);
				node.delete();
				node=new Node(true);
				assertEquals(true,node.maxCapacityExceeded());
		}
		
		/**
	    * @return {@code false}
	    */
	    @Test
		public void testMaxCapacity1() {
		
		Queue queue=new Queue();
		queue.add(new Node(true));
		queue.add(new Node(true));
		queue.add(new Node(true));
		queue.add(new Node(true));
		
		Node node=queue.remove();
		assertEquals(1,queue.size());
		assertEquals(true,node.getBoolean(true));
		
		node=queue.remove();
		assertEquals(1,queue.size());
		assertEquals(true,node.getBoolean(true));
		
		node=queue.remove();
		assertEquals(1,queue.size());
		assertEquals(true,node.getBoolean(true));
		
		node=queue.remove();
		assertEquals(1,queue.size());
		assertEquals(false,node.getBoolean(true));
		
		queue.add(new Node(true));
		node=queue.remove();
		assertEquals(2,queue.size());
		assertEquals(true,node.getBoolean(true));
		
		node=queue.remove();
		assertEquals(1,queue.size());
		assertEquals(true,node.getBoolean(true));
		
		queue.add(new Node(false));
		assertEquals(1,queue.size());
		assertEquals(true,queue.remove().maxCapacityExceeded());
		assertEquals(false,queue.remove().maxCapacityExceeded());
		
		queue.add(new Node(true));
		queue.add(new Node(true));
		queue.add(new Node(true));
		queue.add(new Node(true));
		assertEquals(2,queue.size());
		
		node=queue.remove();
		assertEquals(2,queue.size());
		assertEquals(true,node.getBoolean(true));
		assertEquals(true,node.getBoolean(false));
		assertEquals(true,node.getBoolean(true));
		assertEquals(false,node.getBoolean(false));
		
		node=queue.remove();
		Queue queue2=new Queue();
		assertEquals(true,queue.add(new Node(true)));
		assertEquals(true,queue2.deleteOn(true, true));
		assertEquals(true,queue.remove());
		assertEquals(0,queue.size());
		
		node=queue.insert(queue2);
		assertEquals(true,queue.remove());
		assertEquals(true,queue.remove());
		assertEquals(true,queue.size());
		assertEquals(false,queue.retain() && queue.contains(null));

	}
}
