// _AvailableJobsTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains one unit test case for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobsTest {
		
	@Test
	public void testGetTypeDesc() {
		assertEquals((java.lang.Class) _AvailableJobs.getTypeDesc(), ((java.lang.Object) java.lang.String.class), "getTypeDesc");
		assertEquals((java.lang.Class) _AvailableJobs.getTypeDesc(), ((java.lang.Object) java.lang.String.class), "getTypeDesc");
		assertEquals((java.lang.Class) _AvailableJobs.getTypeDesc(), ((java.lang.Object) java.lang.String.class), "getTypeDesc");
	}

}