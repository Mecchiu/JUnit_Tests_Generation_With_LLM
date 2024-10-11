// JobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Job}.
* It contains one unit test case for the {@link Job#getTypeDesc()} method.
*/
class JobTest {
		
	static java.lang.Object binder = null;
	static java.lang.Class _javaType;
	
	static {
		binder = mygrid.web.job.BindingRequest.createJavaBindable(Job.class);
		_javaType = binder.getClass().getSuperclass();
			}

	/**
	* Test method for {@link Job#getTypeDesc()}.
	*/
	@Test
	public void testGetTypeDesc() {
		_javaType = Job.class;
		assertEquals(_javaType, Job.class.getSuperclass());
	}

}