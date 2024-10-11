// RescaleToUnitTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains one unit test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {

	@Test
	void test() {
		List<Double> list = new ArrayList<>();
		rescaleToUnit(list);
    	assertNotNull(list);
    	if (list.size() > 0) {
    		assertEquals(1.0, list.get(0), 1e-4); // All values are 0 unless any is less/equal, at least
    	}
		for (int i = 1; i < list.size(); i++) {
    		if (list.get(i) > list.get(i - 1)) {
    			fail("The sum of the elements is bigger than the sum of the first "+i+" and it");
    		}
    		if (list.get(i) > list.get(i - 1)) {
    			fail("The sum of the elements is bigger than the sum of the first "+i+" and it");
    		}
			if ((i == list.size() - 1) || (list.get(i) + list.get(i - 1) >= list.get(i + 1))) {
    			fail("The sum of the elements is bigger than the sum of the last "+i+" and it");
    		}
			if (list.get(i) > list.get(i - 1) || (list.get(i) + list.get(i - 1) > list.get(i + 1))) {
    			fail("The sum of the elements is bigger than the sum of the last "+i+" and it");
    		}
    	}
	}
}