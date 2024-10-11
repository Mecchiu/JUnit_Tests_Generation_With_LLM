// _AvailableJobs_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains one unit test case for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobs_1Test {
		/**
		* Test case for {@link _AvailableJobs#getTypeDesc()} method.
		*/
		@Test
		public void testGetTypeDesc() {
			assertEquals(mygrid.web.WebServiceFactory.getServerType(), _AvailableJobs.getTypeDesc());
		}
}