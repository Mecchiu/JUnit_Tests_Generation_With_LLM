// DependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains one unit test case for the {@link Dependency#getTypeDesc()} method.
*/
class DependencyTest {
		/**
		 * Test case for <code>getClass().getClassName()</code>
		 * Test method for <code>java.lang.String.getClassName()</code>
		 */
		@Test
      public void test_getClass_String() {
        assertEquals("java.lang.String.class.getClassName()",
                     Dependency.class.getClassName());
	}
    
}