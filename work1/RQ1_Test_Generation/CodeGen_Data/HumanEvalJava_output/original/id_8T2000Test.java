// SumProductTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains one unit test case for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {
private static final String DESCRIPTION = "\n\n";
		private static final List<Integer> REPAIRED = new ArrayList<>();
		private static final List<Integer> REMOVED = new ArrayList<>();

		public static void cleanRepaint(){
    		REPAIRED.clear();
    		removed.clear();
    	}
		public static void removeAndRepaintAll(List<Integer> numbers){
    		REPAIRED.addAll(numbers);
    		removed.addAll(numbers);
    	}

		@Test
		void test_remove() {
    		List<Integer> numbers = new ArrayList<>();
    		ReplaceTest.addToList(numbers, 10);
			List<Integer> testNumbers = new ArrayList<>();
    		SumProduct.sumProduct(testNumbers);
    		assertEquals(testNumbers, numbers);
    		cleanRepaint();
		}

		@Test
		void test_add() {
    		List<Integer> numbers = new ArrayList<>();
    		AddTest.addToList(numbers, 10);
			List<Integer> testNumbers = new ArrayList<>();
    		SumProduct.sumProduct(testNumbers);
    		assertFalse(testNumbers.isEmpty());
    		cleanRepaint();
		}

		@Test
		void test_replacedToRepaintAll() {
			List<Integer> numbers = new ArrayList<>();
    		AddTest.addToList(numbers, 10);
			AddTest.addToList(DELETABLE_NUBERS, 0);
			List<Integer> testNumbers = new ArrayList<>();
    		SumProduct.sumProduct(testNumbers);
    		assertFalse(testNumbers.isEmpty());
    		cleanRepaint();
		}

    	public static void removeAndRepaintAll(List<Integer> numbers) {
			List<Integer> testNumbers = REMOVED;
    		SumProduct.sumProduct(testNumbers);
    		assertFalse(testNumbers.isEmpty());
    		cleanRepaint();
		}

		@Test
		void test_removedRemoved() {
    		List<Integer> numbers = new ArrayList<>();
    		replacedDELETED.addAll(numbers);
			List<Integer> testNumbers = new ArrayList<>();
    		ADDED[10]=1;
    		List<Integer> testNumbers2 = new ArrayList<>();
    		ADDED[20]=2;
    		SumProduct.sumProduct(testNumbers);
    		assertTrue(REMOVED.contains(ADDED));
    		assertEquals(REMAINED, testNumbers);
    		assertFalse(testNumbers.isEmpty());
    		cleanRepaint();
		}

		@Test
		void test_replacedToRepaintAll() {
			List<Integer> numbers = new ArrayList<>();
    		replacedDELETED.addAll(numbers);
			List<Integer> testNumbers = new ArrayList<>();
    		List<Integer> testRepaintNumbers = new ArrayList<>();
    		ADDED[10]=1;
    		REPAIRED.addAll(ADDED);
    		SumProduct.sumProduct(testNumbers);
    		assertTrue(testRepaintNumbers.size() > 3);
    		addRemainingNumbers(ADDED, testRepaintNumbers);
    		assertEquals(testNums, testRepaintNumbers);
    		assertEquals(testNums, testNums);
    		cleanRepaint();
		}

		private static void addRemainingNumbers(List<Integer> NUMOBERS, List<Integer> NUMOBERSTXT) {
			int x = NUMOBERS.size();
			while (x!= 0) {
				ADDED[x]++;
				x--;
			}
    		if (!NUMOBERS.isEmpty()) {
    			NUMOBERS.addAll(NUMOBERS);
    			NUMOBERS.remove(0);
    		} else {
    			for (int j = 0; j < NUMOBERS.size() - 1; j ++) {
    				NUMOBERS.add(0);
    			}
    		}
    		if (!NUMOBERS.isEmpty()) {
    			for (int j : REMOVED) {
    				NUMOBERS.remove(0);
    			}
    		} else {
    			for (int j : REMOVED) {
    				for (int j2: j) {
    					NUMOBERS.remove(j2);
    				}
    			}
    		}
    		SumProduct.sumProduct(NUMOBERS);
    		testNums = NUMOBERS;
    		testNumsTxt = NUMOBERSTXT;
    	}

		@Test
		void test_removed() {
    		List<Integer> testNums = new ArrayList<>();
    		testNums.addAll(REMAINED);
    		testNumsTxt.addAll(REMAINEDTXT);
    		SumProduct.sumProduct(testNums);
    		assertTrue(testNumsTxt.isEmpty());
    		cleanRepaint();
    	}
}
