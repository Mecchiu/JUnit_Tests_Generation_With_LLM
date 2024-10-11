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

	/** Vector of all events.*/
	private Vector events = null;
	
	/** Test Constructor Constructor.*/
	public EventSetTest() {
		events = new Vector();
		events.add(Events.INSERT);
		events.add(Events.INSERT);
		events.add(Events.INSERT);
		events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
		events.add(Events.INSERT);
        events.add(Events.INSERT);
		events.add(Events.INSERT);
		events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
		events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
		events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
        events.add(Events.INSERT);
	}

	/**
	* It adds a new Event to the EventSet.
*/
	protected void addElement(Events event) {
        events.addElement(event);
    }

	/**
	* It return the Event from the EventSet.
	* @return the Event
	*/
	protected Events getElement () {
		return (Events) events.elementAt(0);
	}	

	/**
	* It tests if the EventSet contains an Event.
	*/
	protected boolean containsElement (Events event) {
        return events.contains(event);
    }
	

	/**
	* It tests if the EventSet contains a given event.
	* @param event the event to test.
	* @return <code>true</code> if the EventSet contains the given event, <code>false</code> otherwise.
	*/
	protected boolean contains (Events event) {
        return events.contains(event);
    }
	
	/**
	* It returns a Vector of all events in the EventSet.
	* @return the vector of all events.
	*/
	protected Vector getEvents () {
		return events;
	}
}
