// _Progress_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains one unit test case for the {@link _Progress#getTypeDesc()} method.
*/
class _Progress_1Test {
		private _Progress _progress1;
		/**
		 * Constructor 
		 */
		public _Progress_1Test() {
				this._progress1 = new _Progress();
				this._progress1.setJob("job");
		}
		/**
		 * 
		 * @return the return value from the method
		*/
		public java.lang.Object getJob() {
			return _progress1.getJob();
		}
		/**
		 * Test method for get the field 'job'
		* @throws java.lang.Exception 
		*/
		@Test
		public void testGetJob() throws java.lang.Exception {
			java.lang.String foo = null;
			java.lang.String bar = this._progress1.getJob();
			

			assertEquals("job", foo);
			
		}
	}