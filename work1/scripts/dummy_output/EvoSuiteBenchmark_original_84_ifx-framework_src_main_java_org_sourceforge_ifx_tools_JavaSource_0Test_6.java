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
     * Tests method hasInterface().
     */
    String toString() {
        return 
        "   <value name=\"packageName\">javaSource</value>\n" + 
        "   <value name=\"classId\">org.sourceforge.ifx-java</value>\n" + 
        "   <value name=\"superClass\">javaSource</value>\n" + 
        "   <value name=\"memberVariablesArray\">\n<value value=\"[{0}\" type=\"array\"><value value=\"javaSource\" type=\"string\" /></value>\n</value>\n</value>\n" + 
        "</value>";
    }
    
    @Test
    void JavaSource_hasInterface() {
        assertEquals("org.sourceforge.ifx-java", JavaSource.getPackageName());
        assertEquals("javaSource", JavaSource.getClassName());
        assertEquals("javaSource", JavaSource.getSuperClass());
        assertTrue(JavaSource.hasInterface());
    }
	
    @Test
    void JavaSource_hasSuperClass() {	
        assertNull(JavaSource.getSuperClass());
        assertEquals("javaSource", JavaSource.getClassName());
        assertFalse(JavaSource.hasSuperClass());
    }
	
    @Test
    void JavaSource_addMemberVariable() {
        final String cName1 = "javaSource";
        final String cName2 = "javaSource";
        final String cName3 = "org.sourceforge.ifx";
        StringTokenizer t1 = new StringTokenizer(getClassName(), ".");
        List<String> varNames = new ArrayList<>();
        Iterator<String> i1 = t1.iterator();
        Iterator<String> i2 = t1.iterator();
        Iterator<String> i3 = t1.iterator();
        t1.next();
        t1.next();
        t1.next();
        final String mVar1Name = t1.next();
        t1.next();
        t1.next();
        t1.next();
        final String mVar2Name = t1.next();
        t1.next();
        final String mVar3Name = t1.next();
        final String mVar4Name = t1.next();
        varNames.add(mVar1Name);
        varNames.add(mVar2Name);
        varNames.add(mVar3Name);

        final List mVarNames = new ArrayList<>();
        mVarNames.add(mVar1Name);
        mVarNames.add(mVar2Name);
        mVarNames.add(mVar3Name);

        final ArrayList<String> expected = new ArrayList<>();
        expected.add(cName1);
        expected.add(cName2);
        expected.add(cName3);

        List<String> varNamesInJavaSource = new ArrayList<>();
        for (String mVarName : varNames) {
            varNamesInJavaSource.add(createJavaSource(mVarName, mVarNames, expected));
        }

        assertEquals("org.sourceforge.ifxJava", JavaSource.getPackageName());
        assertEquals(expected.toArray(), varNamesInJavaSource.toArray());
        assertTrue(JavaSource.hasSuperClass());
    }
	
    @Test
    		@Ignore
    		public void JavaSource_memberVariable_1() {
            // Member variables get a name of Class, not StringType because
            // it needs to be converted to type JavaSourceClassReference.
            // We can't use a single String for all of the member variables:
            List<String> varNames = new ArrayList<>();
}
}