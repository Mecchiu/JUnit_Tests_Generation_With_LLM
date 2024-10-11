// CompareTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Compare}.
* It contains one unit test case for the {@link Compare#compare(List, List)} method.
*/
class CompareTest {
private CompareTest() {}
		// A Test cases for {@link Compare#compare(List, List)}
		@Test
		void compare_one_guess() {
			List<Integer> initialGuess = new ArrayList<>();
			initialGuess.add(0);   // the first guess in initial match is 0, not 1
			initialGuess.add(1);   // the second guessed match is 1, not 2
			List<Integer> secondMatchResult = new ArrayList<>();
			secondMatchResult.add(0);
			secondMatchResult.add(-2);
			List<Integer> matchGuess = new ArrayList<>();
			matchGuess.add(1);
			matchGuess.add(0);

			List<Integer> compareResultGuess = new ArrayList<>();
			compareResultGuess.add(-1);
			compareResultGuess.add(-1);
			List<Integer> compareResultMatch = new ArrayList<>();
			compareResultMatch.add(-2);

			List<Integer> result = Compare.compare(initialGuess, secondMatchResult);
			assertSame(compareResultGuess, result);
			assertSame(compareResultMatch, secondMatchResult);
		}

		// A Test cases for {@link Compare#compare(ArrayList, ArrayList)}
		@Test
		void compare_guesses() {

			ArrayList<Integer> initialGuess = new ArrayList<>();
			initialGuess.add(0);   // the first guess in initial match is 0, not 1
			initialGuess.add(1);   // the second guessed match is 1, not 2
			List<Integer> secondMatchResult = new ArrayList<>();
			secondMatchResult.add(0);
			secondMatchResult.add(-2);
			List<Integer> matchGuess = new ArrayList<>();
			matchGuess.add(1);
			matchGuess.add(0);

			ArrayList<Integer> compareResultGuess = new ArrayList<>();
			compareResultGuess.add(-1);
			compareResultGuess.add(-1);
			List<Integer> compareResultMatch = new ArrayList<>();
			compareResultMatch.add(-2);

			List<Integer> result = Compare.compare(initialGuess, secondMatchResult);
			assertNotSame(compareResultGuess, result);
			assertNotSame(compareResultMatch, result);
			assertSame(compareResultMatch, secondMatchResult);
		}
}

// A Test case for test methods in the class {@link CompareTest}.
// This test case only provides a few assertions that are not important in the real world.
// You can extend this test case with extra assertions, as desired.
class CompareTest2 extends ComparableTest {
	// This test case can only be used as a unit test.
	public static void compare_one_guess() {
		List<Integer> initialGuess = new ArrayList<>();
		initialGuess.add(0);   // the first guess in initial match is 0, not 1
		initialGuess.add(1);   // the second guessed match is 1, not 2
		List<Integer> secondMatchResult = new ArrayList<>();
		secondMatchResult.add(0);
		secondMatchResult.add(-2);
		List<Integer> matchGuess = new ArrayList<>();
		matchGuess.add(1);
		matchGuess.add(0);

		List<Integer> compareResultGuess = new ArrayList<>();
		compareResultGuess.add(-1);
		compareResultGuess.add(-1);
		List<Integer> compareResultMatch = new ArrayList<>();
		compareResultMatch.add(-2);

		List<Integer> result = Compare.compare(initialGuess, secondMatchResult);
		assertNonSame(compareResultGuess);
		assertNonSame(result);
	}

}

// A Test cases for {@link CompareTest2} and {@link CompareTest#compare(List, List)}.
// The test case can only be used as a unit test.
class CompareTest2_1 extends ComparableTest {
	@Test
	void compare_guesses() {

		List<Integer> initialGuess = new ArrayList<>();
		initialGuess.add(0);   // the first guess in initial match is 0, not 1
		initialGuess.add(1);   // the second guessed match is 1, not 2
		List<Integer> secondMatchResult = new ArrayList<>();
		secondMatchResult.add(0);
		secondMatchResult.add(-2);
		List<Integer> matchGuess = new ArrayList<>();
		matchGuess.add(1);
		matchGuess.add(0);

		List<Integer> compareResultGuess = new ArrayList<>();
		compareResultGuess.add(-1);
		compareResultGuess.add(-1);
		List<Integer> compareResultMatch = new ArrayList<>();
		compareResultMatch.add(-2);

		List<Integer> result = CompareTest2.compare(initialGuess, secondMatchResult);
		assertSame(compareResultGuess, result);
		assertSame(compareResultMatch, secondMatchResult);
	}
}
