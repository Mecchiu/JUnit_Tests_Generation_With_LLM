// _Complete_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains one unit test case for the {@link _Complete#getTypeDesc()} method.
*/
class _Complete_1Test {
		/**
		 * @throws Exception
		 */
	@Test
	public final void testGetTypeDesc() throws Exception {
		assertNotNull(new _Complete().getTypeDesc());
		assertEquals(new _Complete().getTypeDesc(), "MyGrid/web:Complete");
	}

	/**
	 * @param  job
	 * @throws java.lang.Exception
	 */
	public final void testJob(mygrid.web.Job job) throws java.lang.Exception {
		assertNotNull(job);
		boolean _equals;
		_equals = true && this.equals(job);
		assertTrue(_equals);
	}

}