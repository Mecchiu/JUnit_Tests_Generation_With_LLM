// Login_1Test.java
package com.browsersoft.aacs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import com.browsersoft.aacs.xacml.PDPadapter;
import com.browsersoft.aacs.xacml.RequestBuilder;
import com.sun.xacml.Indenter;
import com.sun.xacml.ctx.RequestCtx;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Login}.
* It contains one unit test case for the {@link Login#getProps()} method.
*/
class Login_1Test {
		
	

//	Method {@link #getProps()} with a setter should give the empty string.
	@Test
    public void getProps_Set() throws LoginException, ParseException {
		
        String value = getProps().getProperty("test.key");
		
        if(value == null) {
		    System.out.println("PASSED setTestProperty: set " + testName + " to null");
		    
            return;
        }
        
        if(value == null) {
		    System.out.println("PASSED getTestProperty: get " + testName);
		    
            return;
        }
        
        //System.out.println("PASSED setTestProperty to " + value);
        
    }
		
//	1. Test for a null request
    @Test
    public void getProps_NPE_Null() throws LoginException, ParseException {
		
        String value = getProps().getProperty("test.key");
        
        if(value == null) {
            System.out.println("PASSED getTestProperty: get " + testName + " to null");
            
            return;
        }
        
        if(value == null) {
            System.out.println("PASSED getTestProperty: get " + testName);
            
            return;
        }
        
        //System.out.println("PASSED getTestProperty to " + value);
        
    }
		
//	2. Test for an empty string
    @Test
    public void testLogin_Empty() throws LoginException, ParseException {
		
        String response = (String) RequestBuilder.makeReq("");
		
        try {
			
			getProps().stringToPassword(response);
			
			//System.out.println( response );
			
			fail("Should throw a ParameterExpressionException!");
			
		} catch (ParameterExpressionException pex) {
			//Expected this
		} catch (Exception e) {
			fail("Error when trying to convert the empty string into a Password!");
		}

    }
		
//	3. Test for a non encrypted MD5
    @Test
    public void testLogin_MD5() throws LoginException, ParseException {
		
        String response = (String) RequestBuilder.makeReq("");
		
        Object val2 = RequestBuilder.makeReq("/loginRequest.sax", "/login/passwd.sax", "/");
		
        String value = "";
		
        value = (String) RequestBuilder.replaceQuotes((String)val2);
		
        HashSet<String> nonEncryptedString = new HashSet<>(2);
		
        nonEncryptedString.add(value);
		
        String nonEncryptedValue = (String) RequestBuilder.makeReq("/loginRequest.sax", "/login/passwd.sax", "/");
		
        String nonEncryptedValue2 = (String) RequestBuilder.replaceQuotes("/loginRequest.sax", "/login/passwd.sax", "/");
		
        boolean val3 = true;
		
        val3 = RequestBuilder.replaceSubst((String) val3);
		
			
        if(response.length()!= 0) {
        	
            //System.out.println( response + " for " + testName );
        	
            try {
				
				getProps().stringToPassword(response);
				
				//System.out.println( response );
				
				fail("Should throw a ParameterExpressionException!");
				
			} catch (LoginException le) {
			    //Expected this
				
			} catch (Exception e) {
				
				fail("Error when trying to convert the empty string into a Password!");
				
			}
            
        } else {
        	
            //System.out.println( response + " for " + testName );
        	
            val3 = RequestBuilder.replaceSubst((String) val3);
			
			if(val3 == true) {
			    
				Object val4 = RequestBuilder.makeReq("/loginRequest.sax", "/test/login/passwd.sax", "/");
				
				String value2 = (String) RequestBuilder.replaceQuotes((String)val4);
				
				
				if(value2.length()!= 4) {
					
					//System.out.println( "value : " + value + "  value2 : " + value2 );
					
					//System.out.println("PASSED getTestProperty: get " + testName + " : nonEncryptedString : " + nonEncryptedString + 
					//        " : nonEncryptedValue : " + nonEncryptedValue );
					
					//System.out.println("PASSED getTestProperty: get " + testName + " : nonEncryptedString : " + nonEncryptedValue2 + 
					//        " : nonEncryptedString : " + nonEncryptedString);
					
					fail("String is  incorrect size.");
					
					return;
				} else if(! nonEncryptedString.contains(nonEncryptedValue) ) {
					//System.out.println( "value is invalid " + value2 );
					//System.out.println( "nonEncryptedString" + nonEncryptedString );
					fail("String not enc. encoded " + nonEncryptedValue );
					
					return;
				}
				
			}
        } 

        Properties props = new Properties();

        //getTestProperty(testName, "nonEncryptedValue", "", false);
        
        props.put(testName, nonEncryptedValue);

}
}