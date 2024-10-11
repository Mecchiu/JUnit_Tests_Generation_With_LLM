// _RequestTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains one unit test case for the {@link _Request#getTypeDesc()} method.
*/
class _RequestTest {
		private final mygrid.web.Request _request;
		/**
		* Constructor for mainTestCase1.
		*/
	public _RequestTest(
		java.lang.String testName
			// testName:
			// Description of the file generated.
			)
		{
			try {
						_request= mygrid.web.Request.class.getConstructor(java.lang.String.class).newInstance(testName);
			} catch (org.apache.axis.Exception ex) {
				ex.printStackTrace();
					throw new java.lang.RuntimeException(ex.getMessage());
			}
		}

		// This makes the test deterministic by the way Java class names do match
		// when compiling for Java 9.
		@java.lang.SuppressWarnings({"cast", "rawtypes", "unused_naming"})
		public void testCreateInstance() throws java.lang.Exception {
			
		}

		/**
		* Test method for create instance of {@link _Request#getJob()}.
		*/
		@java.lang.Test
		public void testGetJob_1() throws java.lang.Exception {
			// TODO: implement test for this method.
			System.out.println();
			assertNotNull(job);
		}

		/**
		* Test method for create instance of {@link _Request#getTypeDesc()}.
		*/
		@java.lang.Test
		public void testGetTypeDesc_1() throws java.lang.Exception {
			// TODO: implement test for this method.
			
		}

		/**
		* Test method for {@link _Request#getTypeDesc()}
		*  for a static method.
		*/
		@java.lang.Test
		public void testGetTypeDesc_Static1() throws java.lang.Exception {
			// TODO: implement test for this method.
			
		}

		/**
		* Test method for {@link _Request#setTypeDesc(java.lang.String)}.
		*/
		@java.lang.Test
		public void testSetTypeDesc_2() throws java.lang.Exception {
			// TODO: implement test for this method.
			
		}
}
// _RequestTest