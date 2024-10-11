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
		private String packageName = "Foo";
		private String className = "$Foo";
		private String classJavadocs = "\n"+
		"   public interface Foo\n"+
		"   {\n"+
		"       // This is comment\n"+
		"       /**\n"+
		"            This is the java code.\n"+
		"         */\n"+
		"    }\n";
		
		public static void test() {
		  JavaSource source = new JavaSource();
		}

	/**
     * Tests the hasSuperClass() method.
     */
    @Test
    public void testJavaSourceHasSuperClass() {
                
        assertFalse("Has super class returns false.", source.hasSuperClass());
        source.addMemberVariable(packageName, null, false); // not a condition, but a condition
		assertTrue("Has super class returns true.", source.hasSuperClass());
    }

	/**
     * Tests the hasSuperClass() method.
     */
    @Test
    public void testJavaSourceHasSuperClass2() {

		String oldPackageName = source.getPackageName();
		source.setPackageName("test2");
		source.setPackageName(null);

		assertFalse("Has super class returns false.", source.hasSuperClass());
		source.addMemberVariable(packageName, null, false); // not a condition, but a condition
		assertTrue("Has super class returns true.", source.hasSuperClass());
	}

		/**
     * Tests the hasSuperClass() method.
     */
    @Test
    public void testJavaSourceHasSuperClass3() {

		String oldPackageName = source.getPackageName();
		source.setPackageName(null);
		source.setPackageName("test2");

		assertTrue("Has super class returns false.", source.hasSuperClass());
		source.addMemberVariable(packageName, null, false); // not a condition, but a condition
		assertFalse("Has super class returns true.", source.hasSuperClass());
	}

	/**
     * Tests the hasSuperClass() method.
     */
    @Test
    public void testJavaSourceHasSuperClass4() {

		String oldPackageName = source.getPackageName();
		source.setPackageName(null);
		source.setPackageName("test1");
		source.addMemberVariable(oldPackageName, null, false); // not a condition, but a condition
		source.setPackageName("test2");
			Iterator<String> memberClasses = getIterator();
		Iterator<String> memberVarClasses = source.getMemberVariables().iterator();
		int i = 0;
		while (memberVarClasses.hasNext()) {
			
			source.addMemberVariable(memberClasses.next(), null, false);
			
			if (i == 3) {
				break;
			}
			
			i++;
		}
		assertFalse("Has super class returns false.", source.hasSuperClass());
		source.addMemberVariable(oldPackageName, null, false); // not a condition, but a condition
		assertTrue("Has super class returns true.", source.hasSuperClass());

	}

	private List getIterator() {

		StringTokenizer st = new StringTokenizer(source.getClassJavadocs());
		String tag = st.nextToken();
		while (tag!= null) {
			tag = st.nextToken();
		}

		List iterators = new ArrayList();
		StringTokenizer st2 = new StringTokenizer(tag, ",");
}
}