// JniInchiStructure_3Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getAtom(int)} method.
*/
class JniInchiStructure_3Test {
		/**
		 * This tests an invalid input.
		 */
    @Test
	public void test1() {
		try {
			JniInchiStructure.getAtom(3);
			fail("A correct input was not made");
		} catch (final IllegalArgumentException e) {
		}
		test2();
	}
		/**
		 * This tests an empty list.
		 */
    @Test
	public void test2() {
		List<Integer> results = new ArrayList<Integer>();
		try {
			results.add(null);
			results.add(3);
		} catch (final IllegalArgumentException e) {
		}
		assertNotNull(results);
		assertEquals("Correct count", 1, results.size());
		assertEquals("Correct value", 4, results.get(0));
	}
	/**
	* This tests a list of entries.
	*/
	void test2() {
		List<Integer> results = new ArrayList<Integer>();
		results.add(null);
		results.add(5);
		results.add(3);
		results.add(1);
		results.add(new Integer(0));
		results.add(new Integer(1));
		results.add(new Integer(2));
		results.add(new Integer(3));
		List<Object> s = new ArrayList<Object>();
		s.add(results);
		List<Object> ss = JniInchiStructure.getAtom(s);
		assertNotNull("Correct atom", ss);
		assertEquals("Correct elements in results", 2, results.size());
		assertEquals("Correct elements in result 2", new Integer(5), results.get(0));
		assertEquals("Correct elements in result 2", new Integer(3), results.get(1));
	}
}