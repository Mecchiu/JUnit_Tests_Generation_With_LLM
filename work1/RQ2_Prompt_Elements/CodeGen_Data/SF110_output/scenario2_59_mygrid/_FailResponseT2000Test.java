// _FailResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains one unit test case for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponseTest {

	@Test
	public void testGetTypeDesc(){
		assertEquals( "MyGridExceptionResponse_type", _FailResponse.getTypeDesc().toXML());
	}}
