// NextSmallestTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains one unit test case for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {

	/**
	 *
	* @param lst list of integers
	* @return number of smallest element
	*/
	public static Integer nextSmallest(List<Object> lst) {
		return lst.get(1);
	}
}


class Case1 {  // test case (1)
	public static void main(String[] args) {
		T t = new T("t", "");  // The first argument indicates the first character of a string.
		Integer next = NextSmallest.nextSmallest(t);  // the second argument indicates the target of the next call.
		t.a = next;                  // the input is modified.
		Integer nextResult = NextSmallest.nextSmallest(t);
		assertEquals(next, nextResult);  // assert the result equals to the result after the call.
	}

}


class Case2 {  // test case (2)
	public static void main(String[] args) {
		Integer firstInput = Integer.valueOf(-1);  // input is an integer 1
		Integer secondInput = new Integer(Integer.valueOf(101)); // input is a natural-language object.
		Integer expected = Integer.valueOf(101);  // the second argument indicates the expected value, after the call.
		Integer next = NextSmallest.nextSmallest(secondInput, firstInput);
		assertEquals(expected, next);  // assert the result equals to the result after the call.
	}
}