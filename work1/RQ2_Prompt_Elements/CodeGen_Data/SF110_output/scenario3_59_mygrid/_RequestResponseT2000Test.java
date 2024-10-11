// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains one unit test case for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponseTest {

	/**
	* Calls the method {@link _RequestResponse#getTypeDesc()} on this object by instantiating a new instance of the type {@link _RequestResponse}.
	*/
	{
		_RequestResponse res = new _RequestResponse();
		assertSame("Object of type _RequestResponse must be the same as the one returned by {@link _RequestResponse#getTypeDesc()}.", res.getTypeDesc(), res.getTypeDesc());
	}
	
}