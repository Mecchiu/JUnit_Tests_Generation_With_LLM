// JVCRequestContext_1Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParamMap(String)} method.
*/
class JVCRequestContext_1Test {
		private final List<String> uploadList; 
		
	/**
	 * Instantiate a test for this class using the following
	 * parameters:
	 * <ul>
	 * <li> the request's file to be processed </li>
	 * <li> the request's file type (jpeg|gif) </li>
	 * <li> the request's key prefix for the flash map </li>
     * </ul>
	 * It runs successfully.
	 */
	private void runTest() throws FileNotFoundException{
	
		RequestContext rc = new RequestContext();
		rc.parseString(rc.getRequest().getRequestURL());
		rc.setRequest(new HttpServletRequestWrapper(rc
			.getRequest()));
		rc.parseString(rc.getResponse().getRequestURL());
		rc.setResponse(new HttpServletResponseWrapper(rc
			.getResponse()));

		// Get a list of the parameters' names.
		Iterator<Map.Entry<String, String>> iter = rc.getParamMap().entrySet()
			.iterator(); 
		
		while(iter.hasNext()){
			Map.Entry<String,String> entry = iter.next();
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
		assertEquals("Params do not match", uploadList, Arrays.asList(rc
			.getRequest().getParameterValues("upload")));
		assertNotNull("Params can be null.  Request: " +
			rc.getRequest(), rc.getRequest());
		assertNotNull("Params can be null. Response: " +
			rc.getResponse(), rc.getResponse());
		
	}
	
	/**
	 * Main method for testing the {@link JVCRequestContext} class
	 */
	@Test
	public void test1() throws Exception{
		runTest(); // no need to explicitly run tests.
	}

    /**
   * This class contains state information for processing an http request.
   * It wraps the standard HttpServletRequest, HttpServletResponse and HttpServlet
   * objects and provides convenience methods for accessing them.
   * <p>
   * It also contains some convenience methods for forming links and absolute paths.
   * @author mike dooley
   */
	private static final class RequestContext {

	        // this is passed into the constructor
		private HttpServletRequest   request;
		
        public RequestContext(){
                  request = new HttpServletRequest();
          }

	        // constructor for testing
		RequestContext(final HttpServletRequest r)    {
            request = r;
	        }

	        // getParam method to get all the parameters available
		public Map<String,String> getParamMap() {
				String[] files = getRequest().getParameterValues("upload");
				
			Map<String,String>   params = new HashMap<String,String>(); 
            String delimiter;
            
            for (int i=0; i<files.length; i++) {
	            String file = files[i];
	            String[] split = file.split("\\?");
	
	            if (split.length==1) {
	                try {
							if (split.length==2)
	                    	delimiter = getRequest().getParameter(split[0]);
		                    if (delimiter == null || delimiter.trim().equals(""))
	                            delimiter="?";
	            		File f = new File( split[0] );
	            		Reader rd = new FileReader( f );        
	            		params.put(split[0], Files.readAllText(f.toPath()) );
	            	} catch (Exception ex) {
	            		System.err.println("Unable to establish path!");
	        			System.out.println(ex.getMessage());
	            	}
	            } else if (split.length==3) {
	                    //this needs to be modified as the delimiter isn't always used.
	                    delimiter = split[2];
	            } else {
	                System.err.println("Parms can be none or one?");
	                System.out.println(split[2]);
	            }
	
	            params.put(split[1], (split[2] == null)? (delimiter=null):(split[2]).trim());
            }
            
			return params;
        }

        public List<String> getParamValues(String requestParamName) {
            // check that the request parameter doesn't already exist in the map for this
            // parameter
            Map<String,String> p = getParamMap();
            if (p == null)
                return Collections.EMPTY_LIST;

            return Arrays.asList(p.get(requestParamName));
        }

        public String getUrl(String requestParamName) {
            String value = request.getParameter(requestParamName);
            
            if (value == null)
                return request.getRequestURL().substring(request.getRequestURL()
                   .indexOf("?") + 1);  //adds an additional '?' to the end of the URL.
            else
                return request.getRequestURL().split("(?<=&|$)=".split(value)[0]);
        }

        // request parameters  to use as params
        public HttpServletRequest getRequest() {
            return request;
        }

	}


}