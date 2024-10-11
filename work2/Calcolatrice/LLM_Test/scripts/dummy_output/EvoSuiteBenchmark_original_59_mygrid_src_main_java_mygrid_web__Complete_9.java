// _CompleteTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains one unit test case for the {@link _Complete#getTypeDesc()} method.
*/
class _CompleteTest {
		/**
		 * Unit test method for {@link _Complete#getTypeDesc()}.
		 */
		@Test
		public void testTest(){
			assertEquals(java.lang.Comparable.class, _Complete.class.getMethod("getTypeDesc", null).getReturnType());
		}

	}