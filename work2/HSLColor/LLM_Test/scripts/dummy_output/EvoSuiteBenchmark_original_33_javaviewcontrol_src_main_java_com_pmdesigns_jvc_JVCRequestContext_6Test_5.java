// JVCRequestContext_6Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#absPath(String)} method.
*/
class JVCRequestContext_6Test {
		private final static Integer PARENT_REQUEST = 1;
		private final static String FLASH_TYPE = "jsf";
		private final static Integer PARENT_REQUEST_INT = 1;
		private final static Integer PARENT_REQUEST_INT_FINAL = 2;
		
	private Integer integerParam;
 	private final static RequestContext reqContext = new RequestContext(PARENT_REQUEST);
	
	private Integer integerParamFinal;
	private String s;
	private String strUrl;
   
	private Map<String,String> flash;
	
	private static final File tempFile;
	
    /**
     * Loads an input stream from the resource folder named by the given directory path,
     * which is assumed to reside under the JVCRequestContext_ directory.
     */
    File getResourceFile(String path)
    {
        InputStream resource = JVCRequestContext.class.getResourceAsStream(path);
        try{
            String rd = Streams.toString(resource);

            // strip the starting resource path
            int iStart = rd.indexOf(path);
            if (iStart!= -1) {
                rd = rd.substring(iStart+path.length());
            }     

        	return new File(new URI(rd).getPath());
        }
        

        catch (URISyntaxException ue)
        {
            throw new RuntimeException(ue.getMessage(), ue);
        }
        
        catch (Exception e)
        {
            throw new RuntimeException("Error loading resource " + path, e);
        }
    }

    /**
     * Creates a temp file at the given path that is used for storing a request result
     */
    void createTempFile(String path) throws Exception
    {
        // create a temp file using the temp folder set during JVCRequestContext creation
        tempFile = File.createTempFile(path, "log");
        tempFile = new File(tempFile);
    }
   
    /**
     * Prepends the context path onto a servlet path
     *
     * @param url a servlet path
     * @return the context path
     * @see java.lang.StringBuffer#append(java.lang.String)
     */
    String absPath(String url)
    {
        // build the url we will add to, in this case being the /jvc request
        StringBuffer sBuf = new StringBuffer(url); sBuf.append("temp");

        // append the temp folder if it exists
        sBuf.append(File.separator).append("jvc");

        return sBuf.toString();
    }

    /**
     * Prepends the context path onto a path we have set during the instantiation
     * of the JVCRequestContext.
     *
     * @param name the servlet path we are processing
     * @return the context path
     */
    String absPath(String name)
    {
        // prepend the current context path
        NameValuePair[] params = new NameValuePair[1];
        params[0] = new NameValuePair("jvc", name);

        // add the parameters to the parameters StringBuffer
        StringBuffer sBuf = new StringBuffer(name);
        Streams.forEach((String s, String s2) -> sBuf.append("&").append(s2));
        sBuf.append("temp");

        // put the parameters to the parameters StringBuffer
        NameValuePair[] params2 = new NameValuePair[1];
        params2[0] = sBuf.toString();
        
        return reqContext.param() + sBuf;
    }

    /**
     * Gets the temporary directory used for a temporary file
     */
    File getTempDir()
    {
        return tempFile;
    }
      
    /**
     * Tests HttpServletRequest.
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println("****JVC RequestContext Test**");
        
        ServletContext sc = new JVCRequestContext().getServletContext();
        for(Enumeration e=sc.getInitParameterNames();e.hasMoreElements(); )
        {
            String key = (String)e.nextElement();
            System.out.println(key+ " = "+sc.getInitParameter(key));
        }
        
        String path = (String)sc.getInitParameter("test.servletpath");
        System.out.println("Test servlet path is: "+path);
        
        JVCRequestContext jvcRequestContext = new JVCRequestContext();
        String basePath = jvcRequestContext.absPath(path);
        System.out.println("Base Servlet path is: "+basePath);
        
        // prepend the context path
        jvcRequestContext.absPath(basePath);
        
        // create a temp file at the given path
        // that is used for storing a request result from within the test
        jvcRequestContext.createTempFile(basePath);
        System.out.println(jvcRequestContext.absPath(basePath) + " / " +jvcRequestContext.getTempFile());
        
        ArrayList<File> list = new ArrayList<File>(4);
        jvcRequestContext.getTempFile().listFiles(list);
        
        Collections.sort(list);
        
        jvcRequestContext.testRequest();   
    }
}