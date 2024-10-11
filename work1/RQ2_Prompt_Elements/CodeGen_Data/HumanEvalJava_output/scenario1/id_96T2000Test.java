// CountUpToTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains one unit test case for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {
// test cases
		public static final class TestCase {
			private final Integer base;
			private final Integer counter;
			public TestCase(Integer base, Integer counter) {
				this.base = base;
				this.counter = counter;
			}
			public Integer getBase() {
				return base;
			}
			public Integer getCounter() {
				return counter;
			}
		}

		public String getName() {
			return "CountUpToTest";
		}

		/**
		* Constructor: Constructs a instance of {@link CountUpToTest} with a given
		* base and counter value.
		* It uses reference counters to test cases to increase test coverage.
		*/
		public TestCase one(int n) {
			return new TestCase(n, n);
		} 
		
		@Test
		public void test1() {
			Integer base = new Integer(1);
			Integer counter = new Integer(2);
			test(new TestCase(base, counter));
		}
		
		@Test
		public void test0() {
			Integer base = null;
			Integer counter = new Integer(4);
			test(new TestCase(base, counter));
		}

		@Test
		public void test2() {
			Integer base = new Integer(1);
			Integer counter = new Integer(4);
			test(new TestCase(base, counter));
		}

		
		@Test
		public void test3() {
			Integer base = new Integer(10);
			Integer counter = new Integer(15);
			test(new TestCase(base, counter));
		}

		private void test(TestCase test) {
			List<Integer> result = countUpTo(test.getBase());
			List<Integer> expectedResult = new ArrayList<Integer>();
			List<Integer> resultOfCounter = countUpTo(test.getCounter());
			if (!resultOfCounter.equals(expectedResult)) {
				throw new RuntimeException("Error while countUpTo for " +
						test.getCounter().intValue() + "." +
						" Expected " + expectedResult.
						toString() + " but got " + resultOfCounter.
						toString() + " for " + test.getCounter().intValue());
			}
		}
	}

// CountUpTo.java
