// LargestSmallestIntegersTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains one unit test case for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {
final static List<Integer> INTEGER_LISTVALUES = new ArrayList<>();
		{
				INTEGER_LISTVALUES.add(0);
				INTEGER_LISTVALUES.add(1);
				INTEGER_LISTVALUES.add(2);
				INTEGER_LISTVALUES.add(3);
				INTEGER_LISTVALUES.add(4);
				INTEGER_LISTVALUES.add(5);
				INTEGER_LISTVALUES.add(6);
				INTEGER_LISTVALUES.add(7);
				INTEGER_LISTVALUES.add(8);
				INTEGER_LISTVALUES.add(9);
				INTEGER_LISTVALUES.add(10);
				INTEGER_LISTVALUES.add(11);
				INTEGER_LISTVALUES.add(12);
				INTEGER_LISTVALUES.add(13);
				INTEGER_LISTVALUES.add(14);
				INTEGER_LISTVALUES.add(15);
				INTEGER_LISTVALUES.add(16);
				INTEGER_LISTVALUES.add(17);
				INTEGER_LISTVALUES.add(18);
				INTEGER_LISTVALUES.add(19);
				INTEGER_LISTVALUES.add(20);
				INTEGER_LISTVALUES.add(21);
				INTEGER_LISTVALUES.add(22);
				INTEGER_LISTVALUES.add(23);
				INTEGER_LISTVALUES.add(24);
				INTEGER_LISTVALUES.add(25);
				INTEGER_LISTVALUES.add(26);
				INTEGER_LISTVALUES.add(27);
				INTEGER_LISTVALUES.add(28);
				INTEGER_LISTVALUES.add(29);
				INTEGER_LISTVALUES.add(30);
				INTEGER_LISTVALUES.add(31);
		}

	@Test
	public void testCase1(){
		/*assertNotNull(Integer.MIN_VALUE);
 		assertNotNull(Integer.MAX_VALUE);
 		assertNotNull(LargestSmallestIntegers.largestSmallestIntegers(LIMSTARTEND));
 		assertNotNull(LargestSmallestIntegers.largestSmallestIntegers(LARGEFUN));
 		assertNotNull(LargestSmallestIntegers.largestSmallestIntegers(LARGEFUN));
 		assertNotNull(LargestSmallestIntegers.largestSmallestIntegers(1));*/
		assertEquals(0,(LargestSmallestIntegers.largestSmallestIntegers(INTEGER_LISTVALUES).get(0)));
 		assertEquals(1,(LargestSmallestIntegers.largestSmallestIntegers(INTEGER_LISTVALUES)).get(0));
 		assertEquals(2,(LargestSmallestIntegers.largestSmallestIntegers(INTEGER_LISTVALUES)).get(0));
 		assertEquals(Integer.MAX_VALUE,(LargestSmallestIntegers.largestSmallestIntegers(INTEGER_LISTVALUES)).get(3));
 		assertEquals(Integer.MIN_VALUE,(LargestSmallestIntegers.largestSmallestIntegers(INTEGER_LISTVALUES)).get(2));
 		assertEquals(1, (LargestSmallestIntegers.largestSmallestIntegers(INTEGER_LISTVALUES).get(4)).intValue());
 		assertEquals(1,(LargestSmallestIntegers.largestSmallestIntegers(INTEGER_LISTVALUES).get(5)).intValue());
 		assertEquals(1,(LargestSmallestIntegers.largestSmallestIntegers(INTEGER_LISTVALUES).get(6)).intValue());
 		assertFalse(LargestSmallestIntegers.largestSmallestIntegers(INTEGER_LISTVALUES).hasNull());
 		assertEquals(1,(LargestSmallestIntegers.largestSmallestIntegers(INTEGER_LISTVALUES).get(7)).intValue());
 		
 		List<Integer> firstList = new ArrayList<>(LargestSmallestIntegers.largestSmallestIntegers(INTEGER_LISTVALUES));
 		assertNotNull(firstList.get(0));
 		int result = (firstList.get(0)).intValue();
 		assertEquals(Integer.MAX_VALUE, result);
        assertTrue(firstList.hasNull());
	}

}
