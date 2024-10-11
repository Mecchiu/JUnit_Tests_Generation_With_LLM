// _CompleteTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains one unit test case for the {@link _Complete#getTypeDesc()} method.
*/
class _CompleteTest {
		@Test
		public void getTypeDesc() {
			System.out.println("Getting Complete._Complete.getTypeDesc");
			final _Complete _complete = new _Complete();
			System.out.println("Result of Complete._Complete.getTypeDesc() is " + typeDesc.getValue());
			// check the type descriptor
			assertEquals(typeDesc, _complete.getTypeDesc());
		}
}