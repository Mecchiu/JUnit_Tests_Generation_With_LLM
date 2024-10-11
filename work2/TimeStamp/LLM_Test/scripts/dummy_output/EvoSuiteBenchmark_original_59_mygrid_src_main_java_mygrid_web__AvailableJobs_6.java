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
		public void testGetTypeDesc(){
				java.lang.Boolean isValid = org.apache.axis.description.Enum.isValid(java.lang.Boolean.class, "isValid");
				assertSame("Returns 'true'", true, isValid);
		}
}