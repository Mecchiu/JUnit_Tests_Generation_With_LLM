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
		* Test the <code>hasSuperClass()</code> method.
		*/
	@Test
		public void testHasSuperClassImpl() {
			TestClass _tc = new TestClass();
			_tc.setSuperClass("Foo");
			assertEquals("Foo", _tc.getSuperClass());
			_tc.setSuperClass("Bar");
			assertEquals("Foo", _tc.getSuperClass());
		}
	}


class TestClass {
	public String getSuperClass() {return superClass;}
	public void setSuperClass(String s) {superClass = s;}
	public String getPackageName() {return packageName;}
	public void setPackageName(String s) {packageName = s;}
	public String getClassName() {return className;}
	public void setClassName(String s) {className = s;}
	public String getClassJavadocs() { return classJavadocs;}
	public void setClassJavadocs(String s) { classJavadocs = s;}
	public String getSuperClass() {return superClass;}
	public void setSuperClass(String s) {superClass = s;}
	public String getName() {return className;}
	public void setName(String s) {className = s;}
	public boolean hasSuperClass() {return hasSuperClass;}
	public void setHasSuperClass(boolean s) {hasSuperClass = s;}
	public boolean hasSuperClass() {return hasSuperClass;}
	public List getMemberVariables() {return memberVariables;}
	public void setMemberVariables(List l) {memberVariables = l;}
	public List getMemberVariables() {return memberVariables;}
	public void addMemberVariable(String mv) {memberVariables.add(mv);}
	public void addMemberVariable(String mv, String s) {memberVariables.add(mv);}
	public void addMemberVariable(String mv, int i) {memberVariables.add(mv);}
}