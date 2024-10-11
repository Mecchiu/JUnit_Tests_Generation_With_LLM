// SpecialfilterTest.java
package scenario1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Specialfilter}.
* It contains one unit test case for the {@link Specialfilter#specialfilter(List)} method.
*/
class SpecialfilterTest {
private static final int[][] nums = { {0}, {0, 1} };
		private static final int[] odd_digits = {1, 1, 2, 2, 4};
		private static final int[] nums_not_odd = {0, 3};

        //Test cases
        static int test_case_1_case(List<Object> nums_not_odd) {
            Set special_filter_set = new HashSet<Integer>(Arrays.<Object>asList(3));
            special_filter_set.addAll(Arrays.asList(nums_not_odd));
            int case_1 = Specialfilter.specialfilter(special_filter_set);
            return case_1;
        }

        static int test_case_2_case(List<Object> nums_not_odd) {
            Set special_filter_set = new HashSet<Integer>(Arrays.<Object>asList(1));
            special_filter_set.addAll(Arrays.asList(nums_not_odd));
            int case_2 = Specialfilter.specialfilter(special_filter_set);
            return case_2;
        }

        //Test cases
        static int test_case_1() {
            List<Object> nums_odd_not_odd = Arrays.asList(0)
                   .add(1)
                   .add(2)
                   .add(3)
                   .add(4)
                   .add(0)
                   .add(1)
                   .add(2)
                   .add(4)
                   .add(5)
                   .add(7)
                   .add(9);

            List<Object> nums_odd = Arrays.asList(0)
                   .add(2)
                   .add(3)
                   .add(4)
                   .add(0)
                   .add(1)
                   .add(2)
                   .add(3)
                   .add(4)
                   .add(5)
                   .add(7)
                   .add(9);

            assertEquals("specialfilter", Specialfilter.specialfilter(nums_odd_not_odd), Specialfilter.specialfilter(nums_not_odd));
            assertTrue("specialfilter", Specialfilter.specialfilter(nums_odd_not_odd) == Specialfilter.specialfilter(nums_not_odd));
            assertEquals("specialfilter(list)", Specialfilter.specialfilter(nums), Specialfilter.specialfilter(nums_not_odd));
            assertEquals("specialfilter(list) + set", Specialfilter.specialfilter(nums_not_odd), Specialfilter.specialfilter(nums));
        }

		@Test
		public void test_case_1() {
			//Test cases
			List<Object> nums_odd_not_odd = Arrays.asList(0)
					.add(1)
					.add(2)
					.add(3)
					.add(4)
					.add(0)
					.add(1)
					.add(2)
					.add(3)
					.add(4)
					.add(5)
					.add(7)
					.add(9);

			List<Object> nums_odd = Arrays.asList(0)
					.add(2)
					.add(3)
					.add(4)
					.add(0)
					.add(1)
					.add(2)
					.add(3)
					.add(4)
					.add(5)
					.add(7)
					.add(9);

			List<List<Integer>> special_filter = Arrays.asList(nums_odd_not_odd, nums_odd, nums_not_odd, nums);
			//Specialfilter.java
			assertEquals("specialfilter(list)", Specialfilter.specialfilter(nums), Specialfilter.specialfilter(special_filter));
			assertEquals("specialfilter(list) + set", Specialfilter.specialfilter(nums), Specialfilter.specialfilter(special_filter));
			assertTrue("specialfilter(list)", Specialfilter.specialfilter(special_filter) == Specialfilter.specialfilter(nums));
			assertTrue("specialfilter(list) + set", Specialfilter.specialfilter(special_filter) == Specialfilter.specialfilter(nums));
		}
}
 