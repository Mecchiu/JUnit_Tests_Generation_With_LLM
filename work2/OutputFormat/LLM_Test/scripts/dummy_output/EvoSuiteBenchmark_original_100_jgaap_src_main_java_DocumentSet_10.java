// DocumentSetTest.java


import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DocumentSet}.
* It contains one unit test case for the {@link DocumentSet#documentCount()} method.
*/
class DocumentSetTest {
		private static boolean DEBUG;
    private static boolean test = true;
    static {
        if (DEBUG) {
            System.err.println("*** set DEBUG (Test Set)!");
        }
    }
    public static void reset() {
        test = false;
    }

    private DocumentSet getSet() {
        DocumentSet set = new DocumentSet();
        Vector<Event> events = new Vector<Event>();
        if (DEBUG) {
            System.err.println("Test Set");
        }
        EventSet eset = new EventSet("EventSet 2");
        set.events = eset;
        set.frequency = new Hashtable();
        set.documents = new Vector();
        set.frequency.put(EventSet.EVENT_SET_GENERATED, 0);
        set.frequency.put(EventSet.EVENT_SET_GENERATED, 1);
        set.frequency.put(EventSet.DOCUMENT_FREQUENCY, 1);
        set.frequency.put(EventSet.FREQUENCY_SUM_EXPORTED_PROPERTIES, 1);

        Document d = new Document("TestDoc");
        set.documents.add(d);

        Event event = new Event(set, eset);
        events.add(event);
        events.add(event);   // this takes one entry, because event set contains one entry

}
}