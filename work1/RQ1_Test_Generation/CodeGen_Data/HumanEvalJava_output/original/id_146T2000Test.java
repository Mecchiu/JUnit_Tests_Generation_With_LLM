// SpecialfilterTest.java
package original;

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
/**
		* Test of specialfilter method, of class Specialfilter.
		*/
		@Test
		void test_specialfilter() {
			System.out.println("specialfilter");
			int num = 15;
			List<Object> nums = Arrays.asList(num);
			Set<Integer> output = new HashSet<Integer>(Arrays.asList(55));
			List<Integer> list_of_nums = Arrays.asList(num);
			Set<List<Integer>> set_of_nums = new HashSet<List<Integer>>();
			set_of_nums.add(list_of_nums);
			Set<List<Integer>> set_of_num = new HashSet<List<Integer>>();
			set_of_num.add(list_of_num);


			Set<Integer> res = Specialfilter.specialfilter(nums.iterator(), set_of_nums);
			res = Specialfilter.specialfilter(nums.iterator(), set_of_num);
			assertEquals(set_of_nums, res);
		}
}