// _AvailableJobsTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains one unit test case for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobsTest {
		private String desc = null;
		private int desc_size = null;
		protected static final String UNKNOW_TEST = "Unknow";

		byte[] unknown_bytes = null;
		long unknown_value = -1234L;
		
		/**
		* Constructors of TestClass.
		*/
		_AvailableJobsTest() {
			desc = UNKNOW_TEST;
			desc_size = UNKNOW_TEST.length();
			unknown_bytes = null;
			unknown_value = UNKNOW_TEST.length();
		}
}