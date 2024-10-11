// FactorizeTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Factorize}.
* It contains one unit test case for the {@link Factorize#factorize(int)} method.
*/
class FactorizeTest {

    @Test
    public void testFactorize3() {
        List<Integer> list = new ArrayList<Integer>(20);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            count += factorize(list.get(i)) == list.size();
        }

        assertTrue(count == 3);
    }

	@Test
	void testFactorize2() {
		List<Integer> list = new ArrayList<Integer>(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			count += factorize(list.get(i)) == list.size()/2;
		}

		assertTrue(count == 7);
	}

	@Test
	void testFactorize1() {
		List<Integer> list = new ArrayList<Integer>(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			count += factorize(list.get(i)) == list.size() / 2;
		}

		assertTrue(count == 4);
	}

}
