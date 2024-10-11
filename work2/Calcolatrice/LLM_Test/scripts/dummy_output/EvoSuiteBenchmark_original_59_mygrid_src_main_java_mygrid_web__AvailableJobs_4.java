// _AvailableJobsTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains one unit test case for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobsTest {
		/**
		* Test a {@link _AvailableJobs#getTypeDesc()} method
		*/
	@Test
	void getTypeDesc(){
		//test method
		org.apache.axis.description.TypeDesc resultType = _AvailableJobs.getTypeDesc();
		
		assertNotNull("resultType should not be null.", resultType);
	}

		/**
		* Test a {@link _AvailableJobs#getTypeDesc(javax.xml.namespace.QName)} method
		*/
	@Test
	public void getTypeDescWithName(){
		//test method
		org.apache.axis.description.TypeDesc resultType = _AvailableJobs.getTypeDesc(new javax.xml.namespace.QName("", "_AvailableJobs.type"));
		
		assertNotNull("resultType should not be null.", resultType);
	}

		/**
		* Test a {@link _AvailableJobs#getTypeDesc(javax.xml.namespace.QName)} method
		* for a case where the provided type is incorrect.
		* (the _AvailableJobs.type.xml xmlns attribute value is empty string)
		*/
	@Test
	public void getTypeDescBadNamespace(){
		//test method
		org.apache.axis.description.TypeDesc resultType = _AvailableJobs.getTypeDesc(new javax.xml.namespace.QName("", "_Unknown._AvailableJobs._type"));
		
		assertNotNull("resultType should not be null.", resultType);
	}


}