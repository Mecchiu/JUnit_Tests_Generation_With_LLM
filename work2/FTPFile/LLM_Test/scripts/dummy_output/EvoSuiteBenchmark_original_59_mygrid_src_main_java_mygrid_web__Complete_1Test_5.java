// _Complete_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains one unit test case for the {@link _Complete#getTypeDesc()} method.
*/
class _Complete_1Test {
		
		private final String _test = "JaxbAssimp2SoapSerialization";
		@Test
		public void test() {
			assertEquals(true, _Complete.getTypeDesc().equals(new mygrid.web.Complete()));
		}
}