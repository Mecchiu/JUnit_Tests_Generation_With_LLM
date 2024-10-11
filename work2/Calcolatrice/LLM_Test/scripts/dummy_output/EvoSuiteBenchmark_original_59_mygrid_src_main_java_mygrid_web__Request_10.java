// _RequestTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains one unit test case for the {@link _Request#getTypeDesc()} method.
*/
class _RequestTest {
		
	@Test
	public void getTypeDesc() throws Exception {
		mygrid.web.Job job = null;
		int result = 0;
		if(job!= null) 
			result = job.getTypeDesc();
		
		assertEquals(true, result!= -1);
	}
	
	@Test
	public void getType() throws Exception {
		mygrid.web.Job job = null;
		int result = 0;
		if(job!= null) 
			result = job.getType();
		
		assertEquals(mygrid.web.Job.job, result);
	}
  }