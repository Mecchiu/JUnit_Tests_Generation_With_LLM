// _AvailableJobsTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains one unit test case for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobsTest {
		
	
	private final static _AvailableJobs _instance = new _AvailableJobs();
	   private static final java.lang.AutoCloseable _closeableInstance = new java.lang.AutoCloseable() {
	        public void close() throws java.io.IOException {
	            _instance.close();
	        }
	    };
	   
	    /**
	    * Test of getTypeDesc method, of class mygrid.web._AvailableJobs.
	    */
	@Test
	public void test__getTypeDesc() {
	
		
	    final byte[] bytes = _instance.getTypeDesc();
	       assertEquals(200, bytes.length);
	       
	}
	
	/**
* The nested class _AvailableJobs.
*/
}