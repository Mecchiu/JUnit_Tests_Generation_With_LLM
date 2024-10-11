// IntersectionTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersection}.
* It contains one unit test case for the {@link Intersection#intersection(List, List)} method.
*/
class IntersectionTest {
@Test
		public void test() {
			List<Integer> intervals1 = getListOfIntervalsFromString(
					"1, 2");
			List<Integer> intervals2 = getListOfIntervalsFromString(
					"2, 1");

            assertEquals("1",intervals1.get(0).toString());
            assertEquals("1",intervals1.get(1).toString());
            assertEquals("2",intervals2.get(0).toString());
            assertEquals("1",intervals2.get(1).toString());
		}

		private List<Integer> getListOfIntervalsFromString(String inputString) {
			List<Integer> intervalList = new Intersection().intersection(getListOfIntervals(inputString));
			return intervalList;
		}

		private int getNumberFromString(String string) {
			int result = 0;
			for (int i = 1; i <= string.length(); i++) {
				if (string.charAt(i - 1) == '1') {
					result += 2;
				}
				if (string.charAt(i - 1) == '2') {
					result += 2;
				}
			}
			return result;
		}
}

// IntersectionTest2.java
import java.util.List;

public class IntersectionTest3 {
	
	public static void main(String args[]) throws Exception {

        List<Integer> intervals1 = getListOfIntervals("1 2", "2 1 2", "1 2 4", "4 1");
        List<Integer> intervals2 = getListOfIntervals("1 2", "1 2 1", "1 2 4", "1 2 6");
        List<Integer> intervalResultList = new Intersection().intersection(intervals1, intervals1);
        List<Integer> intervalResultList2 = new Intersection().intersection(intervals2, intervals1);
        
        assertEquals(intervals1,intervals2);
        assertEquals(2,getNumberFromString("2 1 2 1 2 1 2 1 1"));
        assertEquals(6,getNumberFromString("1 1 4 1 1 1 1 1 1 1 6"));
		}

		private static List<Integer> getListOfIntervals(String inputString, String beginEndString, String intervalString) {
			List<Integer> intervalList = new Intersection().intersection(getListOfIntervals(inputString), getListOfIntervals(startOf(beginEndString), beginEndString, intervalString));
			return intervalList;
		}

		private static Integer startOf(String beginEndString) {
			return new Intersection().startOf(beginEndString);
		}

		private static Integer endOf(String beginEndString) {
			return new Intersection().endOf(beginEndString);
		}

	}

