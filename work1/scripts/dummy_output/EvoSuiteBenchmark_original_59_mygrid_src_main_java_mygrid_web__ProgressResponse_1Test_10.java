// _ProgressResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains one unit test case for the {@link _ProgressResponse#getTypeDesc()} method.
*/
class _ProgressResponse_1Test {
		
		@Test
	      public void testGetTypeDesc() {
		assertEquals(mygrid.web.ProgressResponse.class.getName(), 
		   ((java.lang.String)
			this.getClass().getField("getTypeDesc").get(new java.lang.Object((java.lang.Object[]) new java.lang.Object[] { new java.lang.String("1") })).get(new java.lang.Object("1")).toString()).substring(0, 17));
		}
}