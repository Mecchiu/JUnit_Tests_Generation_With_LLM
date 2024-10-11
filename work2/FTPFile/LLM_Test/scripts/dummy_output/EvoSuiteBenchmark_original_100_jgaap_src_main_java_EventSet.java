// EventSetTest.java


import java.util.Vector;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EventSet}.
* It contains one unit test case for the {@link EventSet#size()} method.
*/
class EventSetTest {
		private ListEventSet lhs = new ListEventSet();

		public void setUp(){
			lhs.copy(this);
		}

		@Test
		public void test_size(){
			Vector<Event> result = lhs.size();

			assertTrue("Size should be an empty set, " + lhs, result.isEmpty());
		}

		@Test
		public void test_add(){
			lhs.add(new Event("one"));
			lhs.add(new Event("two"));
			lhs.add(new Event("three"));
			lhs.add(new Event("four"));
			assertTrue("List should have been sorted. " + lhs, lhs.isSorted());
		}

}