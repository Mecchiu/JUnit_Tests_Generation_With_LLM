// MakeAPileTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakeAPile}.
* It contains one unit test case for the {@link MakeAPile#makeAPile(int)} method.
*/
class MakeAPileTest {

	// Given a positive integer n, you have to make a pile of n steps of steps.
	// The last element of the list in one level is the previous step (starting from the
	// first element) with the first element at index 0.
    // The number of steps in the next level is:
    // - n
    // - n
    // - n
    // - 1
    // - n
    // - n
    // - n
    // - n
	@Test
	public void testmakeAPile_p1() {
		List<Integer> listofSteps = null;
		for (int i = 1; i <= 3; i++) {
			if (i % 2 == 0) {
				listofSteps = listofSteps.get(i - 2);
			} else {
				listofSteps = listofSteps.get(i - 2) + 2;
			}
		}
		List<Integer> listofSteppa = null;
		List<Integer> listofPiPossibilites = null;
		for (int i = 1; i <= 3; i++) {
			if (i % 2 == 0) {
				listofSteppa = listofSteppa.get(i - 2);
				listofPiPossibilites = listofPiPossibilites.get(i - 1);
			} else {
				listofSteppa = listofSteppa.get(i - 2) + 2;
				listofPiPossibilites = listofPiPossibilites.get(i - 1);
			}
		}

		String result = makeAPile(listofSteps.size());

		assertEquals(result, listofSteps.toString());

		assertEquals(result, listofPsPr.toString());

		assertFalse(listofPiPossibilites.isEmpty());

		assertEquals(8, listofPsPr.size());

		result = makeAPile(listofSteps.size() - 1);

		assertNotEquals(result, "");

		assertNotEquals(result, listofPsPr.toString());

		assertNotEquals(result, listofPsPr.toString());

		assertFalse(listofPiPossibilites.isEmpty());
		assertFalse(listofPsPr.isEmpty());
		assertTrue(listofPiPossibilites.toString().startsWith("3"));
	}

	@Test
	public void testmakeAPile_p2() {
		List<Integer> listofSteps = null;
		for (int i = 1; i <= 3; i++) {
			if (i % 2 == 0) {
				listofSteps = listofSteps.get(i - 2);
			} else {
				listofSteps = listofSteps.get(i - 2) + 2;
			}
		}

		String result = makeAPile(listofSteps.size());

		assertEquals(result, listofSteps.toString());
	}

	@Test
	public void testmakeAPile_o3() {
		List<Integer> listofSteps = null;
		for (int i = 1; i <= 3; i++) {
			int next = 0;
			if (i % 2 == 0) {
				next = 1;
			} else {
				next = 0;
			}
			if (i > 1) {
				listofSteps = listofSteps.get(i - 2) + next;
			} else {
				listofSteps = listofSteps.get(i - 2);
			}
		}

		String result = makeAPile(listofSteps.size());

		assertEquals(result, listofSteps.toString());
	}

	String makeAPile(int n) {
		String result = "";
		result += n + "n";

		List<Integer> listofSteps = null;
		for (int i = 1; i <= n; i++) {
			int next = 0;
			if (i % 2 == 0) {
				next = 1;
			} else {
				next = 0;
			}
			if (i > 1) {
				listofSteps = listofSteps.get(i - 2) + next;
			} else {
				listofSteps = listofSteps.get(i - 2);
			}
		}
		result += "n";

		result += listofSteps.toString();

		return result;
	}
	@Test
    /**
     * Test class of {@link MakeAPile}.
	*
	*/
	public void testMakeAPileTest() {
        final int n = 40000;
		List<Integer> listofSteps = null;
		for (int i = 1; i <= n; i++) {
			int next = 0;
			if (i % 2 == 0) {
				next = 1;
			} else {
				next = 0;
			}
			if (i > 1) {
				listofSteps = listofSteps.get(i - 2) + next;
			} else {
				listofSteps = listofSteps.get(i - 2);
			}
		}
		String result = makeAPile(listofSteps.size());

		assertEquals(result, listofSteps.toString());
	}
}
