// SortThirdTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains one unit test case for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {

	@Test
	  void test() {
		  List<Integer> l = makeList();
		  List<Integer> result = SortThird.sortThird(l);
		  assertTrue(equalList(result, new ArrayList()));
	  }

	private List<Integer> makeList() {
		return new ArrayList();
	}

	private boolean equalList(List<Integer> l, List<Integer> o) {
		if (l.size()!= o.size()) {
			return false;
		}
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i)!= o.get(i)) {
				return false;
			}
		}
		return true;
	}
}
