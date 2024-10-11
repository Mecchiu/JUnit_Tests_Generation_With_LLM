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
		
    final static String EVENT_0 = "V";
    final static String EVENT_1 = "X";
    final static String EVENT_2 = "W";
    final static String EVENT_3 = "E";

    private int counter = 0;

    // Note: test code goes here
	@Test
    public void test() {
		// TODO: Should this be an array like TestUtils.arrayOf() would do?
		
		Vector<String> evstr = new Vector<String>();

		String[] vec1 = new String[] {
	               EVENT_0 + Character.toString(Counter++),
	               EVENT_1 + Character.toString(Counter++),
	               EVENT_2 + Character.toString(Counter++),
	               EVENT_3 + Character.toString(Counter++),
	                };

		for (int i = 0; i < vec1.length; i++) {
            evstr.add(EVENT_0 + vec1[i].charAt(0));
            evstr.add(EVENT_1 + vec1[i].charAt(1));
            evstr.add(EVENT_2 + vec1[i].charAt(2));
            evstr.add(EVENT_3 + vec1[i].charAt(3));
		}

		Vector<String> expected = new Vector<String>();
		expected.add("EventSetTest.test()");
		expected.add("test()");
		expected.add("test()");
		expected.add("test()");

		boolean pass = true;
		for (int i = 0; i < expected.size() && pass == true; i++) {
			assertEquals("Wrong size for each test ", i, expected.size());
			assertEquals("Wrong return value for each test ", expected.elementAt(i).length(), evstr.get(i).length());

			for (int j = 0; j < evstr.elementAt(i).length(); j++) {
				pass = pass && evstr.elementAt(i).charAt(j) == evstr.get(i).charAt(j);
			}
			System.out.println(j);
		}

		assertTrue("Check for each test code", pass);

        	System.out.println("\n---");
    }
}