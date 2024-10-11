// ClientHttpRequest_6Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
*/
class ClientHttpRequest_6Test {
		  ClientHttpRequest clientHttpRequest;

		  /**
		      * constructor of test class.
		      */
		  public ClientHttpRequest_6Test(){
		    super(false);
		    String baseURL = null;

		    String[] params = null;
		    HashMap<String, String> query = new HashMap<>();
		    query.put("param0", "value1");
		    query.put("param1", "value2");
		    params = new String[5];
		    params[0] = "string";
		    params[1] = "value1";
		    params[2] = "value2";
		    params[3] = "string";
		    params[4] = "value3";
		    System.out.println("params "+params);
		    String name = null;
		    String value = null;
		    while(params.length>0){
		      if(params[0].charAt(0)=='$'){
			System.out.println("Param "+params[0]);
		      }
		      else{
			System.out.println("Param "+params[0]+"; "+(i<params.length-1?params[i+1]:"null"));
		      }
		      i++;
		      query.put(params[0], params[i]);
		    }

		    clientHttpRequest = new ClientHttpRequest();
		    try {
		      if(query!= null &&!query.isEmpty()){
		        clientHttpRequest.post(baseURL, query, "test4",value);
		      }
		      else{
		        clientHttpRequest.post(baseURL, query, "test4",value);
		      }
		    } catch(Exception e) {
		      e.printStackTrace();
		    }
		  }

		  @Test
		void test(){
		    String name = null;
		    String value = null;
		    System.out.println("baseUrl : "+baseURL);
		    try {
		      int i = 0;
		      while(i<100){
			  i = Random.nextInt(5)+1;
		      }
		      name = clientHttpRequest.post(baseURL, null, null, null);
		      value = clientHttpRequest.getParamValue(name);
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
		    assertNotNull("Parameter is null",name);
		    assertNotNull("Value for param : "+name);
		    assertEquals("Value for param"+name+" is not equal to value2",value,value1);
		  }

		  static ClientHttpRequest setParameter(ClientHttpRequest request,String name,Object value)  throws IOException{
			  request.setParameter(name,value);
			  return request;
		  }
}