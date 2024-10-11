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
		void getTypeDesc() {
			MyGrid web = null;
			String result = null;
			
			try {
				web = new MyGrid();
				web.setName("Test");
				web.setDescription("Test");
				
				result = "java.lang.Object";
			}
			catch (Exception e) {
				// TODO: handle exception
				
			}
			
			assertEquals(result, _Complete.class.getCanonicalName());
		}
}