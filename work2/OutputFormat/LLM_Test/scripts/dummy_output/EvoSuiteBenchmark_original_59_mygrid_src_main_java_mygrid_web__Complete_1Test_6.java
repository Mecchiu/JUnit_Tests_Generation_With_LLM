// _Complete_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains one unit test case for the {@link _Complete#getTypeDesc()} method.
*/
class _Complete_1Test {
		
		@Test
    public final void testgetTypeDesc() {
		
                Complete.1TypeDesc result = new Complete.1TypeDesc();
	        
	        // setUp - test setup - empty test.
	        Complete _complete = null;
	        result.setJob(null);
	        assertSame("Null job ref.", null, result.getJob());
	        
	        // test create instance.
	        _complete = new Complete.1TypeDesc();
	        assertSame("Same job ref.", result.getJob(), _complete);
	        
	        // test equals.
	        _complete.setTypeDesc(null);
	    	result.setTypeDesc(null);
	    	assertFalse("Different job ref.", _complete.equals(result));
	        result.setTypeDesc(new mygrid.web.Job());
	    	assertEquals("Different job ref.", _complete, result);
	}

    }