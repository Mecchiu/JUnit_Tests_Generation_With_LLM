// _AvailableJobs_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains one unit test case for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobs_1Test {
		@Test
		public void test_getTypeDesc0() {
				_AvailableJobs _availableJobs = _AvailableJobs.getInstance();
				assertEquals("getTypeDesc", _availableJobs.getTypeDesc());
		}

		@Test
		public void test_getAvailableJobs0() {
				_AvailableJobs _availableJobs = _AvailableJobs.getInstance();
				_AvailableJobs.setTypeDesc(new java.lang.Object[] {null});
				_AvailableJobs.setAvailableJobs(java.util.Arrays.asList("one", "two"));
				assertEquals("getAvailableJobs", java.util.Arrays.toString(_availableJobs.getAvailableJobs()));
		}

		@Test
		public void test_getAvailableJobsArray0() {
				_AvailableJobs _availableJobs = _AvailableJobs.getInstance();
				_AvailableJobs.setAvailableJobs(new java.util.ArrayList<java.lang.String>[0]);
				assertEquals("getAvailableJobs", java.util.Arrays.toString(_availableJobs.getAvailableJobs()));
		}

		@Test
		public void test_getAvailableJobs1() {
				_AvailableJobs _availableJobs = _AvailableJobs.getInstance();
				java.util.ArrayList<java.lang.String> availableJobs = new java.util.ArrayList<java.lang.String>();
				availableJobs.add("one");
				availableJobs.add("two");
				_availableJobs.setAvailableJobs(availableJobs);
				assertEquals("getAvailableJobs", java.util.Arrays.toString(_availableJobs.getAvailableJobs()));
		}

		@Test
		public void test_getAvailableJobs2() {
				_AvailableJobs _availableJobs = _AvailableJobs.getInstance();
				_AvailableJobs.setAvailableJobs(java.util.Arrays.asList("one1", "two1", "one2"));
				assertEquals("getAvailableJobs", java.util.Arrays.toString(_availableJobs.getAvailableJobs()));
		}
		
}