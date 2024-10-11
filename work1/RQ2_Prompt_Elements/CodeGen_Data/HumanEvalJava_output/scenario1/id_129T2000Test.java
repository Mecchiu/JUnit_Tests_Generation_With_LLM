// MinpathTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minpath}.
* It contains one unit test case for the {@link Minpath#minpath(List, int)} method.
*/
class MinpathTest {
// Minpath.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Minpath {

    public static List<Integer> minpath(List<List<Integer>> grid, int k) {
        int n = grid.size();
        int val = n * n + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    List<Integer> temp = new ArrayList<>();
                    if (i!= 0) {
                        temp.add(grid.get(i - 1).get(j));
                    }
                    if (j!= 0) {
                        temp.add(grid.get(i).get(j - 1));
                    }
                    if (i!= n - 1) {
                        temp.add(grid.get(i + 1).get(j));
                    }
                    if (j!= n - 1) {
                        temp.add(grid.get(i).get(j + 1));
                    }
                    val = Collections.min(temp);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (i % 2 == 0) {
                ans.add(1);
            } else {
                ans.add(val);
            }
        }
        return ans;
    }
}

// MinpathTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minpath}.
* It contains one unit test case for the {@link Minpath#minpath(List, int)} method.
*/
class MinpathTest {
		
		
	/**
	* Test to check for the valid minimum path through 8-way boundary.
	*/
	@Test
    public void test01() {
		List<List<Integer>> grid = new ArrayList(100);
		grid.add(new ArrayList(100));
		grid.add(new ArrayList(5));
		List<List<Integer>> result = Minpath.minpath(grid, 8);
		checkResult(result, 8, 4, 2);
	}
	
	/**
	* Test to check for the valid minimum path on diagonal.
	*/
	@Test
    public void test02() {
		List<List<Integer>> grid = new ArrayList(100);
		grid.add(new ArrayList(100));
		grid.add(new ArrayList(5));
		List<List<Integer>> result = Minpath.minpath(grid, 7);
		checkResult(result, 7, 4, 2);
	}
	
	/**
	* Test to check for the valid minimum path on diagonal.
	*/
	@Test
    public void test03() {
		List<List<Integer>> grid = new ArrayList(100);
		grid.add(new ArrayList(100));
		grid.add(new ArrayList(5));
		List<List<Integer>> result = Minpath.minpath(grid, 7);
		checkResult(result, 1, 4, 1);
	}
	
	/**
	* Test to check for the valid minimum path on diagonal.
	*/
	@Test
    public void test04() {
		List<List<Integer>> grid = new ArrayList(100);
		grid.add(new ArrayList(100));
		grid.add(new ArrayList(5));
		List<List<Integer>> result = Minpath.minpath(grid, 1);
		checkResult(result, 1, 3, 1);
	}
	
	/**
	* Test to check for the valid minimum path on diagonal.
	*/
	@Test
    public void test05() {
		List<List<Integer>> grid = new ArrayList(100);
		grid.add(new ArrayList(100));
		grid.add(new ArrayList(5));
		List<List<Integer>> result = Minpath.minpath(grid, 1);
		checkResult(result, 1, 3, 2);
	}

}

