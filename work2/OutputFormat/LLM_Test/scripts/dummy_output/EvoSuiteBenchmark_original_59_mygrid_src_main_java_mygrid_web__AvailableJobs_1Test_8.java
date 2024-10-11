// _AvailableJobs_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains one unit test case for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobs_1Test {
		
	private final String _xmlString = "<AvailableJobs><jobType>Test</jobType>\r\n";
	
	/**
	 * Test matching of XML to JSON.
	 * @throws org.junit.jupiter.api.AssertionError - if the XML is invalid.
	 */
	@Test
    public void testMarshallUnmarshall() throws org.junit.jupiter.api.AssertionError {
        final java.util.List<test.mygrid.jaxb.dto.Job> result = new test.mygrid.jaxb.dto.JobList();
		final test.mygrid.jaxb.dto.Job _job = test.mygrid.jaxb.dto.Job.Factory.newInstance();
        _job.setType("Test");
        result.add(_job);
        StringWriter stringWriter = new StringWriter();
        JSONWriter jsonWriter = new JSONWriter(stringWriter);
        jsonWriter.object();
        jsonWriter.key("jobType");
        jsonWriter.value(_job.getType());
        jsonWriter.endObject();
        String utils = stringWriter.toString();
        // Verify that the XML and JSON are equal.
        assertEquals("XML and JSON are not equal [" + utils + "]", _xmlString, utils);
	}
	
	/**
	 * Test of the getTypeNam() method, of class _AvailableJobs.
	 */
	@Test
    public void testGetTypeNam() {
        System.out.println("getTypeNam");
        java.util.List<test.mygrid.jaxb.dto.Job> result = null;
		//set up the mock
		com.ibm.test.extension.web.mock.TestExtension mock = mock_Extension.setResponse(result);
		mock.initialize(result,type("AvailableJobs"),true);
		//invoke the method
		test.mygrid.jaxb.dto.Job.getTypeNam();
        //there should be no exception
        mock.invoke();
        //make sure that it is called with the correct args
        verifyAll();
	}
}