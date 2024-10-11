// MessageFormatter_2Test.java
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFormatter}.
* It contains one unit test case for the {@link MessageFormatter#evaluateArguments(String, Object[])} method.
*/
class MessageFormatter_2Test {

    /*
     * If one instance of the test case is created, the first argument to this constructor is a
	   	String (a valid Pattern) which should be checked in {@link MessageFormatter#evaluateArguments(String, Object[])}
	   	before to {@link Set} for the actual arguments is created.
      */
    @Test
    public void testConstructor1() {
    	new MessageFormatter_2Test();
    }

		
    /*
     * The second argument in this test is a boolean variable, which should contain <b>true</b> or <b>false</b> or any {@link java.lang.Throwable}
     * argument as String.
      */
    @Test
    public void testConstructor2() {
    	new MessageFormatter_2Test();
    }

		
	@Test
	public void testToArray() {
        final MessageFormatter testee = new MessageFormatter();
		
		MessageFormatter_2Test testee2 = new MessageFormatter_2Test();
		
        assertArrayEquals(testee.toArray(), testee2.toArray());
	    
		testee.clear();
		final int[] intArray = testee.toArray();
		
		assertArrayEquals(intArray, new int[0]);
        
		assertThrows(NullPointerException.class, () -> testee.toArray(new Object()));
    }
	
	@Test
	public void testConvertToString() {
		final MessageFormatter testee = new MessageFormatter();
		testee.clear();

		// Simple string conversion
		if (null!= testee.toString("SimpleString")) {
			fail("toString(): Wrong result.");
		}
	}
	@Test
	public void testEquals() {
		assertTrue(Arrays.equals(new Object[] { "1st", "2nd", "3rd", "4th", "5th" }, new Object[] { "1st", "2nd", "3rd", "4th", "5th" }));
		
		assertFalse(Arrays.equals(new Object[] { "1st", "2nd", "3rd", "4th", "5th" }, new Object[] {}));
		
		assertTrue(Arrays.equals(new Integer[] { 1, 2, 3, 4, 5 }, new Integer[] { 1, 2, 3, 4, 3 }));
		assertFalse(Arrays.equals(new Integer[] { 1, 2, 3, 4, 3 }, new Integer[] { 1, 2, 3, 4, 3 }) );
		
		assertFalse(Arrays.equals(new Integer[] { }, new Integer[] { 1, 2, 3, }));
		assertFalse(Arrays.equals(new Integer[] { 1, 2, 3 }, new Integer[] { 1, 2, 3 }));
		assertTrue(Arrays.equals(new Integer[] { 1, 5 }, new Integer[] { 1, 2, 3 }));
		assertFalse(Arrays.equals(new Integer[] { 1, 3, 4 }, new Integer[] { 1, 2, 3 }));
	}

	@Test
	public void simpleTest() {
        
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = new Date();
		Time time = new Time();
		TimeStamp time1 = new TimeStamp(simple, simple, simple, simple, simple);
		String ts = new String(time1.getTimeString());
		SimpleDateFormat simpleOne = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat simpleTwo = new SimpleDateFormat("yyyy-MM-ddTHH:mm");
		SimpleDateFormat simpleThree = new SimpleDateFormat("yyyy-MM-ddTHH:mm:S");
//		SimpleDateFormat simpleFour = new SimpleDateFormat("HH:mm:ss");
		
		Set<String> timeSet = new HashSet<>(Arrays.asList(timeOne.getTimeString(), timeTwo.getTimeString(), simpleThree.getTimeString()));
		assertEquals(date.hashCode(), new Date(simpleOne.parse(ts).getTime()).hashCode());
		assertEquals(time.hashCode(), ts.hashCode());
		assertFalse(simpleOne.equals(simpleTwo));
		assertFalse(time1.equals(timeTwo));
		assertSame(time1, timeSet.iterator().next());
		assertThrows(NullPointerException.class, () -> new Date(timeOne.getTime()));
		assertEquals(time1, timeSet.iterator().next());
	}
}
