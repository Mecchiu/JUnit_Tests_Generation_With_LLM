// _ProgressResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains one unit test case for the {@link _ProgressResponse#getTypeDesc()} method.
*/
class _ProgressResponseTest {
		private static java.lang.Integer __completed_1;
		private static java.lang.Integer __completed_2;
		private static java.lang.Integer __progress_1;
		private static java.lang.Integer __progress_2;
		
		/**
		* Test method for {@link _ProgressResponse#getTypeDesc()}.
		* @throws Exception 
		*/
		@Test
		public void testGetTypeDesc() throws Exception {
				// setup test value
				int value = 20;
				
				// get test value
				java.lang.Integer completed = _ProgressResponse._ProgressResponse.getTypeDesc().
								getTypeParameterAtIndex(0).
								getValue().
								intValue();
				
				// assert test result
				assertNotNull(completed);
				assertEquals(value, completed.intValue());
		}
	}