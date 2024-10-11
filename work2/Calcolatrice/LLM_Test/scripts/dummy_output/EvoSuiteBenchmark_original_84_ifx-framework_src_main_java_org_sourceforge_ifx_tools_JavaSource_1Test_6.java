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
* It contains one unit test case for the {@link JavaSource#hasSuperClass()} method.
*/
class JavaSource_1Test {
		/**
* Initializes the class with a list of member variables.
* @param members the list of member variables.
*/
void constructor(List members) {
		this.memberVariables = members;
}

/**
* Checks if the superclass is set correctly.
* @see JavaSource#hasSuperClass()
* @see JavaSource#hasInterface()
*/
@Test
void hasSuperClass() {
    JavaSource testee = new JavaSource(null, null);
    assertTrue(testee.hasSuperClass()==true);
}

/**
* Checks if the superclass is set correctly.
* @see JavaSource#hasSuperClass()
* @see JavaSource#hasInterface()
*/
@Test()
void hasSuperClass_1() {
    JavaSource testee = new JavaSource(null, null);
    assertTrue(testee.hasSuperClass()==false);
}

/**
* Checks if the superclass is set correctly.
* @see JavaSource#getSuperClass()
*/
@Test
void getSuperClass() {
    JavaSource testee = new JavaSource(null, null);
    assertTrue(testee.getSuperClass()==null);
}

/**
 * Returns the list of member variables found in this class.
 * @return list of member variables.
 * @see JavaSource#memberVariables
*/
@Test
void getMemberVariables_1() {
	JavaSource testee = new JavaSource(null, null);
	List members = testee.memberVariables;
    assertNotNull(members);
	Iterator it = members.iterator();
	assertNotNull(it);
	assertTrue(it.hasNext());
	MemberVar element = (MemberVar)it.next();
	assertNotNull(element);
	assertTrue(element.isArray());
	assertTrue(element.getFullType().equals("java.lang.String"));
}

/**
 * Checks if a variable exists in the list.
 * @see JavaSource#hasMemberVariable(String)
*/
@Test
void hasMemberVariable_1() {
        JavaSource testee = new JavaSource(null, null);
        assertTrue(testee.hasMemberVariable("MV").equals(false)==true);
}

/**
 * Checks if a variable exists in the list.
 * @see JavaSource#hasMemberVariable(String)
*/
@Test(expected= NoSuchElementException.class)
void hasNoMemberVariable_1() {
        JavaSource testee = new JavaSource(null, null);
        testee.memberVariables.remove(new MemberVar("MV"));
}

/**
 * Checks if a variable exists in the list.
 * @see JavaSource#addMemberVariable(String, String, boolean)
*/
@Test
void addMemberVariable_1() {
	JavaSource testee = new JavaSource(null, null);
	assertTrue(testee.addMemberVariable("MV"));
}


/**
 * Checks if a variable exists in the list.
 * @see JavaSource#addMemberVariable(String, String, boolean)
*/
@Test(expected= NoSuchElementException.class)
void addNoMemberVariable_1() {
        JavaSource testee = new JavaSource(null, null);
        testee.addMemberVariable("MV");
}

/**
 * Checks if a variable exists in the list.
 * @see JavaSource#addMemberVariable(String, String, boolean)
*/
@Test(expected= NoSuchElementException.class)
void addMemberVariable_2() {
        JavaSource testee = new JavaSource(null, null);
        StringTokenizer tok = new StringTokenizer("MV", " ");
        String keyword = tok.nextToken();
}
}