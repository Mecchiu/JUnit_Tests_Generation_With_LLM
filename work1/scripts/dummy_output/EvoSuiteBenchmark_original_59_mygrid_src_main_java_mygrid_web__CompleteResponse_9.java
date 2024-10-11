// _CompleteResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains one unit test case for the {@link _CompleteResponse#getTypeDesc()} method.
*/
class _CompleteResponseTest {
		
    final static java.lang.Class cls = mygrid.web._CompleteResponse.class;
transient java.lang.Object __equalsCalc = null;

    static boolean __hashCodeCalc = false;


    static synchronized boolean __hashCode() {
        final int prime = 31;
        __hashCodeCalc = true;
        return _hashCodeCalc;
    }

    void test() {
        java.lang.System.out.println("test");
        _CompleteResponse completeResponse;
        int count;
		
		try {
                   _CompleteResponse _0= _CompleteRequest.complete(this);
			
             completeResponse = _0.getTypeDesc();
			
           count = completeResponse.size();
           assertTrue(count==1);
        }
		catch (java.lang.Exception e) {
                	
                        throw new Error(e);
                    	
                }
    }
	}