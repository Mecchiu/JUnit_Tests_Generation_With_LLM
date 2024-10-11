// JobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Job}.
* It contains one unit test case for the {@link Job#getTypeDesc()} method.
*/
class JobTest {
		/**
		 * Test method for {@link Job#getTypeDesc()}.
		 */
		@Test
		public void testGetTypeDesc() {
				Job job;

				job = new Job();
				job.setDiscriminators(null);
				job.setDependencies(null);
				job.setContext(null);
				job.setContent(null);
				job.setDisplayName("test");
                job.setId(null);
                job.setName("");
                job.setProgress(0);
                job.setStatus(mygrid.web.GridJobStatus.Ready);
                job.setTypeDesc(null);
				checkTypeDesc(job);

		}
}