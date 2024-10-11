// ClientHttpRequest_2Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains one unit test case for the {@link ClientHttpRequest#post(Object[])} method.
*/
class ClientHttpRequest_2Test {

    /**
     * It adds a parameter into a string containing the {@link #expectedParameters} field.
     */
	@Test
    void addParamWith() {
    		
    	assertEquals(
    			"parameter=\"first=value\", expected=\"first=value\", expected value:value", 
    			"\"%1$s=first,%2$s=value\", expected=\"first=value,value\"", 
    			createString(expectedParameters)
    				); 
    }
    

    
    // This test case is written to test adding parameters to the '%1$s' pattern.
    String testSetParameter = 
    {
    		"%1$s=first,%2$s=value",
    		"%3$s=first,%4$s=value",
    		"%5$s=first,%6$s=value",
		"%1$s=first,%2$s=value",
    		
    		"%1$s=first,%2$s=value",
    		"%3$s=%1$s,%4$s=%5$s",
    		"%5$s=%3$s,%1$s=%4$s",
    		
    		"%1$s=first,%2$s=value",
    		"%3$s=%1$s,%4$s=%1$s,%5$s",
    		"%5$s=%2$s,%1$s,value",
    		
    		"%1$s=first,%2$s=value",
    		"%3$s=%1$s,%4$s=%1$s,%2$s,%3$s",
    		
    		"%1$s=first,%2$s=value",
    		"%3$s=%1$s,%4$s=%3$s,%2$s,%3$s",
    		
    		"%1$s=first,%1$s=value",
    		
    		"%1$s=first,%2$s=value",
    		
    		"%1$s=%2$s,%3%3$s",
    		
    		"%1$s=%2$s,%3$s",
    		
    		"%1$s=first,%2$s=value",
    		
    		"%1$s=%2$s,%3$s",
    		
    		"%1$s=first,%2$s=value",
    		
    		"%1$s=%2$s,%3$s",
    		
    		"%1$s=first,%2$s=value",
    		
    		"%1$s=%2$s,%3$s",
    		
    		"%1$s=first,%2$s=value",
    		
    		"%1$s=%2$s,%3$s",
    		
    		"%1$s=first,%2$s=value",
    		
    		"%1$s=%2$s,%3$s",
    		
    		"%1$s=first,%2$s=value",
    		
    		"%1$s=%2$s,%3$s",
    		
    		"%1$s=first,%2$s=value",
    		
    		"%1$s=%2$s,%3$s"    
    	};
    public ClientHttpRequest testSetParameter(Object[] param) {
		
		assertEquals(
    			testSetParameter,
    			createString(expectedParameters)
    				);
        createParameters(param);
        return this;
    }
    
    protected Object[] createParameters(Object[] parameter) {
		
    	if (parameter!=null) {
	          Object[] params = new Object[parameter.length];
            	 
	      for (int i=0; i<params.length; i++) {
	            parameters[i] = parameter[i];
	      }
	    } else {
	        params = new Object[0];
	    }
    	
		return params;
    }
    
    protected String createString(Object[] strings) {
    	HashMap <String, Object> parameters = new HashMap<>(strings.length);
    	for (int i = 0; i < strings.length; i++) {
    		parameters.put("parameter name : "+i, strings[i]); 
    	}
    	String string = createString(parameters);
    	return string;
    }
    
    protected String createString(Map<String, Object> map) {
		
		StringBuilder builder = new StringBuilder();
    	builder.append('{');
    	Iterator<String> keys = map.keySet().iterator();
    	while (keys.hasNext()) {
    		String key = keys.next();
     		Object value = map.get(key);  // this is the class name
    		builder.append(createObjectName(key));
    		builder.append('=');
    		builder.append(createObjectValue(value));
    		builder.append(',');
    	}
    	builder.deleteCharAt(builder.length() - 1);
    	builder.append('}');
    	return builder.toString();
    }
   
    protected String createObjectValue(Object value) {
    	if (value instanceof String) {
    		return (String) value;
    	} else if (value instanceof Integer) {
    		return value.toString();
    	} else if (value instanceof Long) {
    		return Long.toString(((Long) value).longValue());
    	}  else if (value instanceof Boolean) {
    		return value.toString();
    	} else if (value instanceof Double) {
    		return value.toString();    			
    	} else if (value instanceof File) {
    		if (!(value instanceof FileInputStream)) {
    			throw new IllegalArgumentException("Can't write " + value.getClass() + " to File.");    			
    		}
    		return new File((File) value).getName();    			
    	} else if (value instanceof InputStream) {
    		return new File((File) value).getName();
    	} else if (value instanceof URL) {
    		return new URL((URL) value).getPath();
    	} else if (value.getClass().isArray()) {
    		Object[] values = (Object