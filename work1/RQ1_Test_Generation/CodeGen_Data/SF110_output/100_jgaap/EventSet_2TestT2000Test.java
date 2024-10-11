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
public EventSet_2Test() {
			}
		@Test
	    public void test() {
	        
	        assertEquals("Size of sets should be correctly equal.", new Vector().size(), new EventSet().size());
	    }
}

