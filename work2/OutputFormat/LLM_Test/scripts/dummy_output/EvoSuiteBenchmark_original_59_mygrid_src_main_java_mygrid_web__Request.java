// _RequestTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains one unit test case for the {@link _Request#getTypeDesc()} method.
*/
class _RequestTest {
		/**
		 * Test method for {@link mygrid.web.Request#getTypeDesc()}.
		 *
		 */
		@Test
		public void testGetTypeDesc() {
			mygrid.web.Job job = null;

		     job = mygrid.web.Job.getJob();
		     assertNotNull("mygrid.web.Job is null", job);
		}

}