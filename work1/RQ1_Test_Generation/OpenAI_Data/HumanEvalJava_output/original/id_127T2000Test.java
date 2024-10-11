// IntersectionTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersection}.
* It contains ten unit test cases for the {@link Intersection#intersection(List, List)} method.
*/
class IntersectionTest {
	@Test
			void test1() {
				List<Integer> interval1 = List.of(1, 2);
				List<Integer> interval2 = List.of(2, 3);
				assertEquals("NO", Intersection.intersection(interval1, interval2));
			}

			@Test
			void test2() {
				List<Integer> interval1 = List.of(-1, 1);
				List<Integer> interval2 = List.of(0, 4);
				assertEquals("NO", Intersection.intersection(interval1, interval2));
			}

			@Test
			void test3() {
				List<Integer> interval1 = List.of(-3, -1);
				List<Integer> interval2 = List.of(-5, 5);
				assertEquals("YES", Intersection.intersection(interval1, interval2));
			}

			@Test
			void test4() {
				List<Integer> interval1 = List.of(-2, 2);
				List<Integer> interval2 = List.of(-4, 0);
				assertEquals("YES", Intersection.intersection(interval1, interval2));
			}

			@Test
			void test5() {
				List<Integer> interval1 = List.of(-11, 2);
				List<Integer> interval2 = List.of(-1, -1);
				assertEquals("NO", Intersection.intersection(interval1, interval2));
			}

			@Test
			void test6() {
				List<Integer> interval1 = List.of(1, 2);
				List<Integer> interval2 = List.of(3, 5);
				assertEquals("NO", Intersection.intersection(interval1, interval2));
			}

			@Test
			void test7() {
				List<Integer> interval1 = List.of(1, 2);
				List<Integer> interval2 = List.of(1, 2);
				assertEquals("NO", Intersection.intersection(interval1, interval2));
			}

			@Test
			void test8() {
				List<Integer> interval1 = List.of(-2, -2);
				List<Integer> interval2 = List.of(-3, -2);
				assertEquals("NO", Intersection.intersection(interval1, interval2));
			}

			@Test
			void test9() {
				List<Integer> interval1 = List.of(1, 3);
				List<Integer> interval2 = List.of(2, 4);
				assertEquals("NO", Intersection.intersection(interval1, interval2));
			}

			@Test
			void test10() {
				List<Integer> interval1 = List.of(1, 3);
				List<Integer> interval2 = List.of(2, 3);
				assertEquals("YES", Intersection.intersection(interval1, interval2));
			}
}
