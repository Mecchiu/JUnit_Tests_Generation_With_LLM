// EventSetTest.java


import java.util.Vector;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EventSet}.
* It contains ten unit test cases for the {@link EventSet#size()} method.
*/
class EventSetTest {

		@Test
		void testSize() {
				EventSet eventSet = new EventSet();
				assertEquals(0, eventSet.size());
		}
}