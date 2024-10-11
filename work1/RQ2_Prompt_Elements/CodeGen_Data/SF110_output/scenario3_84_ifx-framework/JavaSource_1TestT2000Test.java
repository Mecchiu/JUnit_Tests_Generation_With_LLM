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
	 * Test method for
   * {@link org.sourceforge.ifx.tools.JavaSource#getClassName(java.lang.Class)}.
   * Expects superclass to be present.
   */
	@Test
    void classNameIsSuperclassOfClass() {
		assertTrue( "HasSuperClass", JavaSource.hasSuperClass() );
	}

	/**
	 * Test method for
   * {@link org.sourceforge.ifx.tools.JavaSource#getClassName(java.lang.Class)}.
   * Expects superclasses to not be present.
   */
	@Test
    void classNameNotHasSuperClass() {
		assertFalse( "HasSuperClass", JavaSource.hasSuperClass() );
	}

	/**
	 * Test method for
   * {@link org.sourceforge.ifx.tools.JavaSource#getSubstitutedClassFileName(java.lang.Class)}.
   * Expects the first substitution to be present.
   */
	@Test
    void substItselfToThisClass() {
		assertEquals( "To this class",
		                 NewClass.substitutedClassFileName(OldClass) );
	}

	/**
	 * Test method for
   * {@link org.sourceforge.ifx.tools.JavaSource#getSubstitutedClassFileName(java.lang.Class)}.
   * Expects an instance of {@link NewClass}.
   */
	@Test
    void findSubstitutedClassFileName() {
		assertNotNull( "To this class",
		               NewClass.substitutedClassFileName(OldClass) );
		
		// Test substitutions, if applicable
		String substClassName = NewAssociation.substitutedClassName(OldClass);
		assertNotNull( "To this class",
		               Util.substitute( substClassName, OldClass ) );
	}

}
