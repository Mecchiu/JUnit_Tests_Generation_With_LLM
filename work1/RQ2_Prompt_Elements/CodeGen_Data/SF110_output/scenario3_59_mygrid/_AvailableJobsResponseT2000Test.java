// _AvailableJobsResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains one unit test case for the {@link _AvailableJobsResponse#getTypeDesc()} method.
*/
class _AvailableJobsResponseTest {

	   private static final class TypeDesc implements java.io.Serializable {
	        private static final long serialVersionUID = 1L;
	        public java.lang.String value;

	        public TypeDesc(String val) { value = val; }

	        public TypeDesc() {};
	    }
	    
	    @Test
	    public void testWriteRead() {
	    	_AvailableJobsResponse av = new _AvailableJobsResponse();
	    	assertEquals("TypeDesc", av.getTypeDesc());
	    	
	        av.setTypeDesc(new TypeDesc("TypeDesc"));
	        
	        assertEquals("TypeDesc", av.getTypeDesc().value);
	        String val = av.getTypeDesc().toString();
	        
	        av.setTypeDesc(new TypeDesc());
	        av.setTypeDesc(new TypeDesc("TypeDesc"));
	        
	        assertEquals("\"TypeDesc?\",\"" + val + "\"", av.toString());
	    }

}
