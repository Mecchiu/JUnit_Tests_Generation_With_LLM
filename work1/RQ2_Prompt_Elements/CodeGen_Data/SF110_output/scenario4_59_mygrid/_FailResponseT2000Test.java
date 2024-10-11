// _FailResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains one unit test case for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponseTest {
/**
		* Get Test Type Descriptor.
		*/
	@Test
	public void testGetTypeDesc(){
		assertNotNull(org.apache.axis.encoding.Deserializer.getDeserializer(org.apache.axis.encoding.Serializer.class));
	}
	/**
	* Test of the constructor 
	*/
	@Test
	public void testFaultConstructor() {
		long reason = 1;
		org.apache.axis.async.AsyncResponse _asyncResponse = null;
		mygrid.web.FailResponse _instance = new mygrid.web.FailResponse();
		_asyncResponse = _instance.getAsyncResponse();
	}
	/**
	* Test of the constructor
	*/
	@Test
	public void testUnmarshallerException_Fault() {
		java.lang.Long reason = null;
		org.apache.axis.async.AsyncResponse _asyncResponse = null;
		mygrid.web.FailResponse _instance = new mygrid.web.FailResponse();
		_asyncResponse = _instance.getAsyncResponse();
		assertNull("_asyncResponse was not null", _asyncResponse);
		_instance = null;
	}
	/**
	* Test of the constructor 
	*/
	@Test
	public void testUnmarshallerException_FaultString() {
		java.lang.String reason = null;
		org.apache.axis.async.AsyncResponse _asyncResponse = null;
		mygrid.web.FailResponse _instance = new mygrid.web.FailResponse();
		_asyncResponse = _instance.getAsyncResponse();
		assertNull("_asyncResponse was not null", _asyncResponse);
		_instance = null;
	}
	/**
	* Test of the constructor 
	*/
	@Test
	public void testUnmarshallerException_Response() {
		java.lang.String reason = null;
		org.apache.axis.async.AsyncResponse _asyncResponse = null;
		mygrid.web.FailResponse _instance = new mygrid.web.FailResponse();
		_asyncResponse = _instance.getAsyncResponse();
		assertNotNull("_asyncResponse was not null", _asyncResponse);
		_instance = null;
		assertNull("asyncResponse was not null", _asyncResponse.getException());
	}
}
