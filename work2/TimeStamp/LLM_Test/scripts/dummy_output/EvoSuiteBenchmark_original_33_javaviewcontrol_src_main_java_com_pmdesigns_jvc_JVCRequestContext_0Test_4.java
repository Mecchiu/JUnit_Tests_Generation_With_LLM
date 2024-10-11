// JVCRequestContext_0Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains one unit test case for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContext_0Test {
		// Test object
    private JVCRequestContext _context;
    
	// Test parameters and the result of the request
    private String _result;
    private Set<String> _params;
    private String[] _resultArr;
    private Map<String, String> _flasher;
    
    JVCRequestContext_0Test() {
    }
    
    /**
     * Executes the request and verifies that a result is stored in the context.
     */
    @Test
    public void run_1() {
        // Run unit test
        _context = new JVCRequestContext();
        _context.setServer("www.mypage.com");
        _context.setUrl("localhost".replace(".", "_"));
      //  _context.setUser("user");
        
        _context.setParams(new HashSet<String>());
        _context.setResult(null);
        _context.setResultArr(new String[] {});
        
        _context.setFlasher(new HashMap<String, String>()); 
        
        _context.addParam("TestParam", "");
        _context.addParam("TestParam", "test");
        _context.addParam("TestParam", "test");
        _context.setResult("TestResult");
        _context.addParam("TestParam", "test");
        _context.addParam("TestParam", "test");
        _context.addParam("TestParam", "test");
        _context.addParam("TestParam", "test");
        _context.addParam("TestParam", "test");
      
        try {
            byte buf[] = new byte[10];
            buf[8] = 'x';
            buf[9] = 'x';
            _context.addParam("TestParam", new String(buf));
            _context.getResultArr()[0] = true;
            byte[] result = _context.getResult().getBytes();
            assertEquals("XSS", new String(result));
            _context.setResult(new String(result, "UTF-8"));
            _context.getResultArr()[1] = new String(result);
            result = _context.getResult().getBytes();
            assertEquals("XSS", new String(result));
            _context.setResult(new String(result, "UTF-8"));
            _context.getResultArr()[2] = new String(result);
            result = _context.getResult().getBytes();
            assertEquals("XSS", new String(result));
            _context.setResult(new String(result, "UTF-8"));
            _context.getResultArr()[3] = new String(result);
            result = _context.getResult().getBytes();
            assertEquals("XSS", new String(result));
            _context.setResult(new String(result, "UTF-8"));
            _context.getResultArr()[4] = new String(result);
            result = _context.getResult().getBytes();
            assertEquals("XSS", new String(result));
            byte data[] = new byte[10];
            _context.addParam("data", data);
            _context.addParam("data", "test");
            _context.setResultArr(new String[] {new String("test")});
          
        } catch (IOException ioe) {
            _context.doLog("IOException thrown by getParam()");
            ioe.printStackTrace();
        } catch (HttpURLConnection.HTTPException ute) {
            _context.doLog("httpURLConnection exception thrown by getParam()");
            ute.printStackTrace();
        }
        _context.setResult(null);
        _context.setResultArr(null);
    }
    
    /**
     * Gets the result of the request.
     * The result can be retrieved from a flash Map by calling
     * get(String) for each parameter, or by calling 
     * getAttribute(String) for each parameter and then passing it to one of get(int,String) and get(int[]) methods.
     * @param i - index of the result to get
     * @return String result of the parameter or null if parameter doesn't exist in flash Map
     */
    public String getResult(int i) {
        return (String)_context.getFlasher().get("result"+i);
    }
	
    /**
     * Gets the result in an array of parameters.  If the parameters don't exist, the result is empty.
     * @return Array of results of all the parameters, null if there are no parameters
     * or a parameter doesn't exist
     */
    public String[] getResultArr() {
        return _context.getResultArr();
    }
    
    /**
     * Adds a set of parameters to this context.
     * The set must include all required parameters.  Any parameters
     * in set will be set in the context.  Useful for test cases
     * where the parameters are added via addParam(String, String) etc.
     * @param set of parameters
     */
    public void addParam(String set[]) {
        set = toArray(set);
        _context.setParams(new HashSet<String>(Arrays.asList(set)));
        _context.setResult(null);
        _context.setResultArr(null);
    }
    
    /**
     * Adds the result of a single parameter to the current
     * context.  If the parameter doesn't exist, the result is null.
     * @param set parameter name
     * @param result parameter value
     */
    public void addParam(String set, Object result) {
        set = set+":"+result;
        
        if (_params.contains(set)) {
            throw new IllegalStateException(
                    "Parameter already added to context. "
                    + "This would result in duplicate set values.");
        }
        _params.add(set);
        _context.setResultArr(new String[] {result.toString()});
        _context.setResult(result);
    }
    
}