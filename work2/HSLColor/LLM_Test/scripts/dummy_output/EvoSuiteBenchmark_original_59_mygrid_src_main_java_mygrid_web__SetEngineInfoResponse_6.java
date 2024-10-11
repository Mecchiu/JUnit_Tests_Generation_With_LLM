// _SetEngineInfoResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfoResponse}.
* It contains one unit test case for the {@link _SetEngineInfoResponse#getTypeDesc()} method.
*/
class _SetEngineInfoResponseTest {
		
	/**
	* Test of the method setTypeDesc() of class _SetEngineInfoResponse.
	*/
	@Test
	public void testSetTypeDesc() throws Exception {
	mygrid.cao.cao._SetEngineInfoResponse obj = null;
	String output = "";
	obj = new _SetEngineInfoResponse();
	java.lang.Integer jj = null;
	
	boolean areEqual = false;
	
	

	// getValue()
	output = org.apache.axis.jaxws.test.utils.VarSubstitutionUtils.getValue(obj, "getValue()");
	
	assertTrue(isEqual(aString, obj.getGetValue()));
	assertEqual("get_value", output);
	
	// setValue()
	jj = null;
			
	obj = new _SetEngineInfoResponse();
	output = org.apache.axis.jaxws.test.utils.VarSubstitutionUtils.setValue(obj, "getValue()", "");
	
	assertTrue(isEqual(aString, obj.getGetValue()));
	
}
}