// JVCRequestContext_9Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getFlash(String)} method.
*/
class JVCRequestContext_9Test {
		
	private static final String[] NO_KEY_VALUES = {
					"",
					"0",
					"0 0",
					"0 3",
					"a 3 3",
					"a 0 0"
					};

	
	/**
	* Test that the 'flash' property of an HttpRequest/Response is the
	* contents of an HttpServletRequest or HttpServletResponse.
	*/
	@Test
	public void testGetFlash(){
		for (int index = 0;index < NO_KEY_VALUES.length;index++) {
			JVCRequestContext.setFlash(NO_KEY_VALUES[index]);
			//System.out.println("\n\n"+JVCRequestContext.getFlash());
			assertTrue(JVCRequestContext.getFlash().length()>0 && JVCRequestContext.getFlash().endsWith(NO_KEY_VALUES[index]));
		}
		String xpath ="//*[contains(concat('/', @attribute(@class)) = 'key-key1'), contains(concat('/', @attribute(@class)) = 'key0'), contains(concat('/', @attribute(@class)) = 'key-key2')]";

		HashMap<String,String> x = new HashMap<String,String>();

		//System.out.println("Testing "+xpath);
		for(Map.Entry<String,String> entry: JVCRequestContext.getFlash()){
			//System.out.println("\n\n" + entry.toString());
			x.clear();
			x.put(entry.getKey(), entry.getValue());
			if(xpath.equals(entry.toString())){
				System.out.println("Success! " + entry.getKey() + " = "+ entry.getValue());
				break;
			}
			else{
				//System.out.println("\n\n" + entry.toString() +"\nequals " + entry.getValue());
			}
		}
	}}