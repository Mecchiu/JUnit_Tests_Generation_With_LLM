// _FailTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Fail}.
* It contains one unit test case for the {@link _Fail#getTypeDesc()} method.
*/
class _FailTest {
		
	/**
	* test method for {@link mygrid.web.Fail#getTypeDesc()}.
	*/
	@org.junit.jupiter.api.Test
    public void testGetTypeDesc() {
        
        byte[] serialized = _Fail.getSerializedVersion();
        
        org.junit.jupiter.api.Assertions.assertEquals(_Fail.getTypeDesc(), new org.junit.jupiter.api.extracted.ExtractedTestCase() {
        	public boolean execute() throws java.lang.Exception {
        	
        		int extIndex1 = serialized.length - _Fail.getSerializedSize();
        		
        		if (extIndex1 > 0) {
        			String extField = _Fail.getExtField(_Fail.typeToString(serialized[extIndex1-1]));
        			return extField!= null;
        		}
        		return false;
        	}
        }.execute());
    }

}