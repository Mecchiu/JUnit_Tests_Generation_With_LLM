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
	 * Tests null reference case.
	 * @throws Throwable If an unexpected problem occurs.
	 */
	@Test
	void testNullReference() throws Throwable {
		JavaSource s = new JavaSource();
		assertTrue (s.hasInterface());
		List list = s.getMemberVariables();
		assertNotSame (list, null);
		s = null;
		assertTrue (!s.hasInterface());
	}
	
	/**
	 * Tests single member variable case.
	 * It tests three member variable access:
	 * <ul>
	 * <li>{@link JavaSource#getMemberVariable(String)}</li>
	 * <li>{@link JavaSource#getMemberVariable(String, boolean)}</li>
	 * <li>{@link JavaSource#addMemberVariable(String, boolean)}</li>
	 * </ul>
	 * @throws Throwable If an unexpected problem occurs.
	 */
	@Test
	void testSingleMemberVariable() throws Throwable {
		JavaSource s = new JavaSource();
		List list = s.getMemberVariables();
		assertEquals("one", list.get(0));
		list = s.getMemberVariables();
		assertEquals("one", list.get(1));
		list = s.getMemberVariables();
		assertSame (list, s.getMemberVariables());
		list = s.getMemberVariables();
		assertEquals("one", list.get(2));
		list = s.getMemberVariables();
		assertSame (list, s.getMemberVariables());
		list = s.getMemberVariables();
		assertTrue (list.isEmpty());
		list = s.getMemberVariables();
		assertNotSame (list, s.getMemberVariables());
		
		list = s.getMemberVariables();
		assertEquals("two", list.get(0));
		list = s.getMemberVariables();
		assertEquals("two", list.get(1));
		list = s.getMemberVariables();
		assertSame (list, s.getMemberVariables());
		
		list = s.getMemberVariables();
		assertEquals("three", list.get(0));
		list = s.getMemberVariables();
		assertSame (list, s.getMemberVariables());
		
		list = s.getMemberVariables();
		assertEquals("four", list.get(2));
		list = s.getMemberVariables();
		assertSame (list, s.getMemberVariables());

		list = s.getMemberVariables();
		assertSame (list, s.getMemberVariables());
		
		list = s.getMemberVariables();
		assertThat (list, containsInAnyOrder ("one", "two", "three", "four"));

		Collection list2 = new ArrayList(2);
		list2.add("five");
		list2.add("six");
		list2.add("seven");
		list2.add("eight");
		list2.add("nine");
		
		list = new ArrayList(list2);
		assertNotSame (s, s);
		assertNotSame (list, s.getMemberVariables());
		assertTrue ("two", list.isEmpty());
		list = null;
		assertEquals (list, s.getMemberVariables());
		
		assertNotSame (s, s);
		assertNotSame (list, s.getMemberVariables());
		assertEquals ("one", s.getMemberVariable("one"));
		// s can be a Java source itself since 'null' references to member variables and
		// they will be ignored
		s = null;
		assertTrue (s.hasMemberVariable("one"));
}
}