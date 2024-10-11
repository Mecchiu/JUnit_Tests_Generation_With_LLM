// SearchTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains one unit test case for the {@link Search#search(List)} method.
*/
class SearchTest {

	/**
	 * Run this test case.
	 * @throws Exception to throw an exception, if an error occurs.
	*/
	@Test
    void testSearch() throws Exception {
		List<Integer> resultList = new Search().search(
				new Integer[]{4, 1, 2, 2, 3, 1});
		assertEquals(4, resultList.get(0));
		assertEquals(5, resultList.get(1));
		assertEquals(2, resultList.get(2));
		assertEquals(3, resultList.get(3));
		assertEquals(1, resultList.get(4));
    }

}
