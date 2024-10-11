// TotalMatchTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TotalMatch}.
* It contains one unit test case for the {@link TotalMatch#totalMatch(List, List)} method.
*/
class TotalMatchTest {
/**
		* Tests the totalMatch(..) function with lists.
		*/
		@Test
		public void testTotalMatch() {
				List<Object> list1 = new ArrayList();
				list1.add("hi");
				list1.add("admin");
				list1.add("project");
				list1.add("4");
				list1.add("1");
				list1.add("2");
				list1.add("3");
				list1.add("4");

				List<Object> list2 = new ArrayList();
				list2.add("hi");
				list2.add("admin");
				list2.add("project");
				list2.add("4");
				list2.add("1");
				list2.add("2");
				list2.add("3");
				list2.add("4");

				List<Object> result = TotalMatch.totalMatch(list1, list2);
				List<Object> inputList = new ArrayList();
				inputList.add("hi");
				inputList.add("admin");
				inputList.add("project");
				inputList.add("4");
				inputList.add("1");
				inputList.add("2");
				inputList.add("3");
				inputList.add("4");
				assertEquals(inputList, result);
				
				double sum = 0;
				sum = TotalMatch.totalMatch(list1, list2).size();
				assertTrue(sum >= 0);
				
				sum = TotalMatch.totalMatch(list2, list1).size();
				assertEquals(0, sum);
				
				sum = TotalMatch.totalMatch(list1, list2).size();
				sum = 0;
				for (Object object : list1) {
					sum += ((String) object).length();
				}
				assertTrue(sum >= 0 && sum <= 100 * 100);
		}
}
