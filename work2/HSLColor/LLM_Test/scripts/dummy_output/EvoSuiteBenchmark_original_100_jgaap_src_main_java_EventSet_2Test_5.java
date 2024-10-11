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
		
	@Test
    public void Test_size() {
	        
	    EventSet set = new EventSet();
	    assertEquals("invalid", 0,set.size());
	    
	    set.addEvent(new Event("name.e1",null,null));
	    assertEquals("invalid", 0,set.size());
		
	    set.addEvent(new Event("name.e1",null,null));
	    assertEquals("invalid", 1,set.size());
	    set.removeEvent(1);
	    assertEquals("invalid", 0,set.size());
	    
	    set.addEvent(new Event("name","e1",null));
	    assertEquals("invalid", 1,set.size());
	    set.removeEvent(1);
	    assertEquals("invalid", 0,set.size());
}
}