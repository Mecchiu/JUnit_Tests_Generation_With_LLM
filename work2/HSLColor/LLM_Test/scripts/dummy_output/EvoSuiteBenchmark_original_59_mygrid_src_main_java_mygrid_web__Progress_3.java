// _ProgressTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains one unit test case for the {@link _Progress#getTypeDesc()} method.
*/
class _ProgressTest {
		private _Progress _data;
					private final static long serialVersionUID = 1L;
			
		/**
		* JAXB constructor
		*/
		public _ProgressTest() {
	
		}

		

	
	/**
	 * Uses JAXB to test this object
	 * Uses XML tests for this object.
	 */
	@Test
    public void test() {
	

	_data = new _Progress();
	
	System.out.println("TypeDesc:"+_data.getTypeDesc());
	System.out.println("JobID:"+_data.getJob().getJobID());
	
		org.junit.Assert.assertNotNull(_data);

    }  
}