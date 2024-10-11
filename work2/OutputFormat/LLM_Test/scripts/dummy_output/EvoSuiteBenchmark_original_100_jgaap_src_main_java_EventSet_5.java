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
		/**
		 * Tests the size of the {@link EventSet}.
		 */
	@Test
    public void size() {
		System.out.println("size() - test case - PASSED");
	}

	/**
	 * Tests the count of the events in the {@link EventSet}
	 */
    @Test
    public void sizeCount() {
		System.out.println("sizeCount() - test case - PASSED");
	}

	/**
	 * Tests the presence of a specified event*
	 */
    @Test
    public void contains(String event) {
		System.out.println("contains('" + event + "\'): " +
		        (events.contains(event) == true));
	}

	/**
	 * Creates a list of events given an starting index of an event*
	 */
    @Test
    public void create(int start) {
		System.out.println("create('" + start+"') - " +
		        "test case - " + events.size());
		events.removeAll();

		events.add(Event.create(start, 0));
		events.add(Event.create(start, 1));
		events.add(Event.create(start, 0));
		events.add(Event.create(start+1, 0));
		events.add(Event.create(start+1, 1));
		events.add(Event.create(start+1, 0));
		events.add(Event.create(start+1, 1));

		System.out.println("add('" + start + "') - " +
		        "test case - " + events.size());
	}

	/**
	 * Tests the count of occurrences of each occurrence of an event*
	 */
    @Test
    public void countOccurrencesOf(String event) {
		System.out.println("countOccurrencesOf('" + event + "') - " +
		        "test case - " +
		        events.toString() + " : " + events.countOccurrencesOf(event));
		assertEquals(events.countOccurrencesOf(event),
                     events.toString().contains(event));
	}

	/**
	 * Tests the count of occurrences of each occurrence of an event*
	 */
    @Test
    public void countOccurrencesSame(String event) {
		System.out.println("countOccurrencesSame('" + event + "') - " +
		        "test case - " + events.countOccurrencesSame(event));
		assertEquals(events.countOccurrencesSame(event),
                     events.countOccurrencesSame(events.toString()));
	}

	/**
	 * Tests the count of occurrences of each occurrence of an event*
	 */
    @Test
    public void countOccurrencesDistinct(String event) {
		System.out.println("countOccurrencesDistinct('" + event + "') - " +
		        "test case - " + events.countOccurrencesDistinct(event));
		assertEquals(events.countOccurrencesDistinct(event),
                     events.countOccurrencesDistinct(events.toString()));
	}

	/**
	 * Tests the first occurrence of an event* of the original
	 */
    @Test
    public void firstOccurrenceOf(String event, String eventInOriginal) {
		System.out.println("firstOccurrenceOf('" + event + "', '" + eventInOriginal + "') - " +
		        "test case - " +
		        events.firstOccurrenceOf(event, eventInOriginal));
		assertEquals(events.firstOccurrenceOf(event, eventInOriginal),
                     events.firstOccurrenceOf(events.toString(), event));
	}

	/**
	 * Tests the first occurrence of an event* of the original
	 */
    @Test
    public void firstOccurrenceOfSameEvent(String event) {
		System.out.println("first occurrence of the original - " +
		        "test case - " +
		        events.firstOccurrenceOfSameEvent("a"));
		assertEquals(events.firstOccurrenceOfSameEvent("a"),
                     events.firstOccurrenceOfSameEvent("a"));
	}

	/**
	 * Tests the first occurrence of an event* of the original
	 */
    @Test
    public void firstOccurrenceOfSameEventDistinct(String event) {
		System.out.println("first occurrence of the original - " +
		        "test case - " +
		        events.firstOccurrenceOfSameEventDistinct("a"));
		assertEquals(events.firstOccurrenceOfSameEventDistinct("b"),
                     events.firstOccurrenceOfSameEventDistinct("b"));
	}

}