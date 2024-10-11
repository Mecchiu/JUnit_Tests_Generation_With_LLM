// JavaSource_0Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains one unit test case for the {@link JavaSource#hasInterface()} method.
*/
class JavaSource_0Test {
		/**
	     * {@link JavaSource#hasInterface()} should throw an exception when the 
	     * {@link JavaSource#hasSuperClass()} method finds an empty element.
	     * @throws Exception an exception that should never be thrown.
	     */
	@Test
	public void testHasSuperClassException1() throws Exception {
		new JavaSource();
		assertThrows(VetoException.class, () -> new JavaSource().hasSuperClass());
	}


		/**
	     * {@link JavaSource#hasSuperClass()} should throw an exception when the 
	     * {@link JavaSource#hasInterface()} method finds an empty element.
	     * @throws Exception an exception that should never be thrown.
	     */
	@Test
	public void testHasSuperClassException2() throws Exception {
		new JavaSource();
		assertThrows(VetoException.class, () -> new JavaSource().hasSuperClass());
	}

	
		/**
	     * {@link JavaSource#hasInterface()} should throw an exception when the 
	     * {@link JavaSource#hasSuperClass()} method finds a null element.
	     * @throws Exception an exception that should never be thrown.
	     */
	@Test
	public void testHasInterfaceException1() throws Exception {
		new JavaSource();
		assertThrows(NullPointerException.class, () -> new JavaSource().hasInterface());
	}


		/**
	     * {@link JavaSource#hasInterface()} should throw an exception when the 
	     * {@link JavaSource#hasSuperClass()} method finds an null element.
	     * @throws Exception an exception that should never be thrown.
	     */
	@Test
	public void testHasInterfaceException2() throws Exception {
		new JavaSource();
		assertThrows(NullPointerException.class, () -> new JavaSource().hasInterface());
	}


		/**
	     * Returns the first non-null element from the {@link JavaSource#memberVariables}.
	     * @return the first non-null element from the {@link JavaSource#memberVariables}.
	     */
	@Test
	public void testMemberVariableCount() throws Exception {
		new JavaSource();
		assertEquals(2, new JavaSource().memberVariables.size());	
		List result = new ArrayList<List>();
		Iterator it = new JavaSource().memberVariables.iterator();
		while (it.hasNext()) {
			result.add(it.next());
		}
		assertTrue(result.size() > 0);
	}


		/**
	     * Sets the number of members variables to 0 and returns an exception.
	     * @throws Exception an exception that should never be thrown.
	     */
	@Test
	public void testMemberVariableCountException() throws Exception {
		new JavaSource();
		assertThrows(VetoException.class, () -> new JavaSource().memberVariables.size());
	}

	/**
	 * Gets the first non-null element from the {@link JavaSource#memberVariables}.
	 * @return the first non-null element from the {@link JavaSource#memberVariables}.
	 */
	@Test
	public void testMemberVariableIndex() throws Exception {
		JavaSource j = new JavaSource();
		j.addMemberVariable("aVar", "value1", false);
		j.addMemberVariable("bVar", "value2", false);
		j.addMemberVariable("cVar", "value3", false);
		j.addMemberVariable("dVar", "value4", false);
		
		List result = new ArrayList<List>();
		Iterator it = new JavaSource().memberVariables.iterator();
}
}