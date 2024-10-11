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
		
    @Test
    public void testSet() {
        EventSet a = new EventSet();
        assertTrue(a.size() == 0);
        assertTrue(a.subset(0,1).size() == 0);
        a.addEvent(10);
        assertTrue(a.size() == 1);
        assertTrue(a.subset(0,2).size() == 1);
    }

    @Test
    public void testSubset() {
        EventSet a = new EventSet();
        a.addEvent(10);
        a.addEvent(20);
        a.addEvent(30);
        assertTrue(a.subset(0,4).size() == 0);
    }

    @Test
    public void testSize() {
        EventSet a = new EventSet();
        a.addEvent(10);
        a.addEvent(20);
        a.addEvent(30);
        assertTrue(a.size() == 2);
    }

    @Test
    public void testAt() throws Exception {
    	EventSet a;
        a = new EventSet();
        a.addEvent(210);
        a.addEvent(220);
        a.addEvent(230);
        a.addEvent(220);
        a.addEvent(0);
        assertTrue(a.eventAt(5).size() == 7);
    }

    @Test
    public void testToString() throws Exception {
        assertSame("EventSet Test", "EventSet [events=0]", EventSet.toString());
    }
}