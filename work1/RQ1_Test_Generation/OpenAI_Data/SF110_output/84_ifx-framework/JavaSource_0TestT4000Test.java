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
* It contains ten unit test cases for the {@link JavaSource#hasInterface()} method.
*/
class JavaSource_0Test {

	/**
	* Test case for {@link JavaSource#hasInterface()}.
	* This test case tests the method with a null interface.
	*/
	@Test
	void testHasInterface_0() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(null);
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()}.
	* This test case tests the method with an empty interface.
	*/
	@Test
	void testHasInterface_1() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("");
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()}.
	* This test case tests the method with a non-empty interface.
	*/
	@Test
	void testHasInterface_2() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("java.lang.Runnable");
		assertTrue(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()}.
	* This test case tests the method with a null interface.
	*/
	@Test
	void testHasInterface_3() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(null);
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()}.
	* This test case tests the method with an empty interface.
	*/
	@Test
	void testHasInterface_4() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("");
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()}.
	* This test case tests the method with a non-empty interface.
	*/
	@Test
	void testHasInterface_5() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("java.lang.Runnable");
		assertTrue(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()}.
	* This test case tests the method with a null interface.
	*/
	@Test
	void testHasInterface_6() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(null);
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()}.
	* This test case tests the method with an empty interface.
	*/
	@Test
	void testHasInterface_7() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("");
		assertFalse(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()}.
	* This test case tests the method with a non-empty interface.
	*/
	@Test
	void testHasInterface_8() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface("java.lang.Runnable");
		assertTrue(javaSource.hasInterface());
	}
	
	/**
	* Test case for {@link JavaSource#hasInterface()}.
	* This test case tests the method with a null interface.
	*/
	@Test
	void testHasInterface_9() {
		JavaSource javaSource = new JavaSource();
		javaSource.setInterface(null);
		assertFalse(javaSource.hasInterface());
	}
	
}

// JavaSource_1Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasSuperClass()} method.
*/
class JavaSource_1Test {
		
	/**
	* Test case for {@link JavaSource#hasSuperClass()}.
	* This test case tests the method with a null superclass.
	*/
	@Test
	void testHasSuperClass_0() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass(null);
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for {@link JavaSource#hasSuperClass()}.
	* This test case tests the method with an empty superclass.
	*/
	@Test
	void testHasSuperClass_1() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("");
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for {@link JavaSource#hasSuperClass()}.
	* This test case tests the method with a non-empty superclass.
	*/
	@Test
	void testHasSuperClass_2() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("java.lang.Object");
		assertTrue(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for {@link JavaSource#hasSuperClass()}.
	* This test case tests the method with a null superclass.
	*/
	@Test
	void testHasSuperClass_3() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass(null);
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for {@link JavaSource#hasSuperClass()}.
	* This test case tests the method with an empty superclass.
	*/
	@Test
	void testHasSuperClass_4() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("");
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for {@link JavaSource#hasSuperClass()}.
	* This test case tests the method with a non-empty superclass.
	*/
	@Test
	void testHasSuperClass_5() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("java.lang.Object");
		assertTrue(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for {@link JavaSource#hasSuperClass()}.
	* This test case tests the method with a null superclass.
	*/
	@Test
	void testHasSuperClass_6() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass(null);
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for {@link JavaSource#hasSuperClass()}.
	* This test case tests the method with an empty superclass.
	*/
	@Test
	void testHasSuperClass_7() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("");
		assertFalse(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for {@link JavaSource#hasSuperClass()}.
	* This test case tests the method with a non-empty superclass.
	*/
	@Test
	void testHasSuperClass_8() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass("java.lang.Object");
		assertTrue(javaSource.hasSuperClass());
	}
	
	/**
	* Test case for {@link JavaSource#hasSuperClass()}.
	* This test case tests the method with a null superclass.
	*/
	@Test
	void testHasSuperClass_9() {
		JavaSource javaSource = new JavaSource();
		javaSource.setSuperClass(null);
		assertFalse(javaSource.hasSuperClass());
	}
	
}

// JavaSource_2Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#getNumberOfMemberVariables()} method.
*/
class JavaSource_2Test {
		
	/**
	* Test case for {@link JavaSource#getNumberOfMemberVariables()}.
	* This test case tests the method with an empty list of member variables.
	*/
	@Test
	void testGetNumberOfMemberVariables_0() {
		JavaSource javaSource = new JavaSource();
		javaSource.setMemberVariables(new ArrayList());
		assertEquals(0, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for {@link JavaSource#getNumberOfMemberVariables()}.
	* This test case tests the method with a non-empty list of member variables.
	*/
	@Test
	void testGetNumberOfMemberVariables_1() {
		JavaSource javaSource = new JavaSource();
		List memberVariables = new ArrayList();
		memberVariables.add(new MemberVariable("name", "java.lang.String", false));
		javaSource.setMemberVariables(memberVariables);
		assertEquals(1, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for {@link JavaSource#getNumberOfMemberVariables()}.
	* This test case tests the method with an empty list of member variables.
	*/
	@Test
	void testGetNumberOfMemberVariables_2() {
		JavaSource javaSource = new JavaSource();
		javaSource.setMemberVariables(new ArrayList());
		assertEquals(0, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for {@link JavaSource#getNumberOfMemberVariables()}.
	* This test case tests the method with a non-empty list of member variables.
	*/
	@Test
	void testGetNumberOfMemberVariables_3() {
		JavaSource javaSource = new JavaSource();
		List memberVariables = new ArrayList();
		memberVariables.add(new MemberVariable("name", "java.lang.String", false));
		javaSource.setMemberVariables(memberVariables);
		assertEquals(1, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for {@link JavaSource#getNumberOfMemberVariables()}.
	* This test case tests the method with an empty list of member variables.
	*/
	@Test
	void testGetNumberOfMemberVariables_4() {
		JavaSource javaSource = new JavaSource();
		javaSource.setMemberVariables(new ArrayList());
		assertEquals(0, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for {@link JavaSource#getNumberOfMemberVariables()}.
	* This test case tests the method with a non-empty list of member variables.
	*/
	@Test
	void testGetNumberOfMemberVariables_5() {
		JavaSource javaSource = new JavaSource();
		List memberVariables = new ArrayList();
		memberVariables.add(new MemberVariable("name", "java.lang.String", false));
		javaSource.setMemberVariables(memberVariables);
		assertEquals(1, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for {@link JavaSource#getNumberOfMemberVariables()}.
	* This test case tests the method with an empty list of member variables.
	*/
	@Test
	void testGetNumberOfMemberVariables_6() {
		JavaSource javaSource = new JavaSource();
		javaSource.setMemberVariables(new ArrayList());
		assertEquals(0, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for {@link JavaSource#getNumberOfMemberVariables()}.
	* This test case tests the method with a non-empty list of member variables.
	*/
	@Test
	void testGetNumberOfMemberVariables_7() {
		JavaSource javaSource = new JavaSource();
		List memberVariables = new ArrayList();
		memberVariables.add(new MemberVariable("name", "java.lang.String", false));
		javaSource.setMemberVariables(memberVariables);
		assertEquals(1, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for {@link JavaSource#getNumberOfMemberVariables()}.
	* This test case tests the method with an empty list of member variables.
	*/
	@Test
	void testGetNumberOfMemberVariables_8() {
		JavaSource javaSource = new JavaSource();
		javaSource.setMemberVariables(new ArrayList());
		assertEquals(0, javaSource.getNumberOfMemberVariables());
	}
	
	/**
	* Test case for {@link JavaSource#getNumberOfMemberVariables()}.
	* This test case tests the method with a non-empty list of member variables.
	*/
	@Test
	void testGetNumberOfMemberVariables_9() {
		JavaSource javaSource = new JavaSource();
		List memberVariables = new ArrayList();
		memberVariables.add(new MemberVariable("name", "java.lang.String", false));
		javaSource.setMemberVariables(memberVariables);
		assertEquals(1, javaSource.getNumberOfMemberVariables());
	}
	
}

// JavaSource_3Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#getMemberVariables()} method.
*/
class JavaSource_3Test {
		
	/**
	* Test case for {@link JavaSource#getMemberVariables()}.
	* This test case tests the method with an empty list of member variables.
	*/
	@Test
	void testGetMemberVariables_0() {
		JavaSource javaSource = new JavaSource();
		javaSource.setMemberVariables(new ArrayList());
		assertEquals(0, javaSource.getMemberVariables().size());
	}
	
	/**
	* Test case for {@link JavaSource#getMemberVariables()}.
	* This test case tests the method with a non-empty list of member variables.
	*/
	@Test
	void testGetMemberVariables_1() {
		JavaSource javaSource = new JavaSource();
		List memberVariables = new ArrayList();
		memberVariables.add(new MemberVariable("name", "java.lang.String", false));
		javaSource.setMemberVariables(memberVariables);
		assertEquals(1, javaSource.getMemberVariables().size());
	}
	
	/**
	* Test case for {@link JavaSource#getMemberVariables()}.
	* This test case tests the method with an empty list of member variables.
	*/
	@Test
	void testGetMemberVariables_2() {
		JavaSource javaSource = new JavaSource();
		javaSource.setMemberVariables(new ArrayList());
		assertEquals(0, javaSource.getMemberVariables().size());
	}
	
	/**
	* Test case for {@link