// LongestTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains one unit test case for the {@link Longest#longest(List)} method.
*/
class LongestTest {
public long longest(List<?> strings) {
			return strings.size();
		}
	}

// StringMaxLengthWithStringLengthThreeTest.java
class StringMaxLengthWithStringLengthThreeTest extends  LongestImpl {

	@Override
	void test(List<?> strings) {
		assertEquals(1, longest(strings));
	}
}

// StringMaxLengthWithStringLengthFiveTest.java
class StringMaxLengthWithStringLengthFiveTest extends LongestImpl {

	@Override
	void test(List<?> strings) {
		assertEquals(5, longest(strings));
	}
}

// StringMaxLengthWithStringLengthSixTest.java
class StringMaxLengthWithStringLengthSixTest extends LongestImpl {

	@Override
	void test(List<?> strings) {
		assertEquals(6, longest(strings));
	}
}

// StringMaxLengthWithStringLengthSevenTest.java
class StringMaxLengthWithStringLengthSevenTest extends LongestImpl {

	@Override
	void test(List<?> strings) {
		assertEquals(7, longest(strings));
	}
}


// StringMaxLengthWithStringLengthEightTest.java
class StringMaxLengthWithStringLengthEightTest extends LongestImpl {
	final int stringMaxLength = 8;

	@Override
	int longest(List<?> strings) {
		int maxLength = 1;
		for (Object o : strings) {
			maxLength = Math.max(maxLength, getStringLength(o));
		}
		return maxLength;
	}
}

// LongestTest.java
class LongestTest {
		public static int longest(List<?> str) {
			int max = -1;
			for (Object o : str) {
				max = Math.max(max, getStringLength(o));
			}
			return max;
		}
	}

// LongestWithMaxLength.java
class LongestWithMaxLength {

		public static void main(String[] args) {

//			final String longest(List<?> a) {
//				return Integer.toString(a.size());
//			}

			@Test
			public void test() {
				final List<Object> str1 = new Vector<>();
//				StringMaxLengthWithStringLengthOneTest.test(str1);

				StringMaxLengthWithStringLengthOneTest.test(str1);

				final List<Integer> test = new Vector<>();
				IntMaxElementComparator comparator = IntMaxElementComparator.DEFAULT;
				TestCase.exec(new ListA(), str1, test, comparator);
				TestCase.exec(new ListB(), str1, test, comparator);

				final List<List<Long>> lists = new RandomRotation<>().next().asLists(8, 1000).asRandom();

				TestCase.exec(new ListR(), str1, test, comparator);

				if (lists.get(0) instanceof RandomRotation) {
//					final List<Long> test = new Vector<>();
//					IntMaxElementComparator comparator = IntMaxElementComparator.DEFAULT;
//					TestCase.exec(new ListA(), lists.get(0), test, comparator);
//					TestCase.exec(new ListB(), lists.get(0), test, comparator);

					final List<List<Long>> test2 = new RandomRotation<>().next().asLists(8, 1000).asRandom();


//					ListA listaA = listA.asList();
//					ListA listaB = listB.asList();
//					ListB listbA = listaA.get(0);
//					ListB listbB = listbA.get(0);
//					ListA listcD = test2.get(0);
//					ListA listcA = test2.get(1);
//					ListA listcB = test2.get(2);
//				}

				final List<List<Long>> test3 = new RandomRotation<>().next().asLists(8, 1000).asRandom();
				TestCase.exec(new RandomList(test3), str1, test3, comparator);

				final IntMaxElementComparator comparator2 = IntMaxElementComparator.DEFAULT;
				final List<List<Long>> test4 = new RandomRotation<>().next().asLists(8, 1000).asRandom();
//				final List<Vector<Double>> test5 = new RandomList<>(test3).asRandom2();
//				final List<List<IntMaxElementComparator>> test6 = new RandomList<>(test3).asRandom2();

			}
}