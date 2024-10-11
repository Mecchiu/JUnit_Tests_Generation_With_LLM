// EventSet_2Test.java


import java.util.Vector;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EventSet}.
* It contains one unit test case for the {@link EventSet#size()} method.
*/
class EventSet_2Test {
		private final static String TITLE = "EventSet_2Test: ";

		@Test
		public void test1() {
			final EventSet set = new EventSet();
			assertTrue(set.size() == 0);
			set.add(new Event("a"));
			assertTrue(set.size() == 1);
			set.add(new Event("b"));
			assertTrue(set.size() == 2);
		}

		@Test
		public void test2() {
			final Vector<EventSet> set = new Vector<EventSet>();
			final EventSet a = new EventSet();
			set.add(a);
			final EventSet b = new EventSet();
			set.add(b);
			assertTrue(set.size() == 1);
			a.add(new Event("a"));
			b.add(new Event("b"));
			assertTrue(set.size() == 2);
		}

		@Test
		public void test3() {
			final EventSet set = new EventSet();
			final EventSet a1 = new EventSet();
			final EventSet a2 = new EventSet();
			final EventSet a3 = new EventSet();
			set.add(a1);
			set.add(a2);
			set.add(a3);
			System.out.println(TITLE + set.toString());
			assertTrue(set.size() == 3);
		}


		@Test
		public void test4() {
			final EventSet set = new EventSet();
			final EventSet a1 = new EventSet();
			final EventSet a2 = new EventSet();
			final EventSet a3 = new EventSet();
			set.add(a1);
			set.add(a2);
			set.add(a3);
			set.remove(a2);
			set.remove(a1);
			System.out.println(TITLE + set.toString());
			assertTrue(set.size() == 3);
		}

}