// JVCRequestContext_3Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContext_3Test {
		
    private static final String PATH = "path";
    private static final String SOURCE_ATT = "souceAtt";
    private static final String SOURCE_BOOLEAN = "sourceBoolean";
    private static final String FLASH = "flash";
    private static final String REQUEST_ATTR_NAME = "requestAttrName";
    private static final String REQUEST_HOST_NAME = "requestHostName";
    private static final int CONTENT_LENGTH = 10;
    private static final String CONTENT_DISPOSITION = "contentDisposition";
    private static final String CONTENT_TYPE = "contentType";

    /**
     * Method to get the state of a request attribute.
     *
     * @param requestRequestContext which contains the parameters to be checked.
     * @return null if there is no attribute matching the requestRequestContext parameter.
     * If the attribute correspond to a file upload field then the value will be a byte array 
     */
    Object getAttribute(RequestRequestContext requestContext) {
        String attrName = requestContext.getRequestAttribute(REQUEST_ATTR_NAME);
        
        if (attrName == null || "".equals(attrName)) 
            return null;
        
        Object valueOrNull = requestContext.getAttribute(REQUEST_ATTR_NAME);
        
        return (valueOrNull!= null)? valueOrNull : getAttribute(attrName);
    }
    
    /**
     * Method to get the URI of a request with a parameter.
     *
     * @param requestContext which contains the parameters to be checked.
     * @param parameterName which name to be checked.
     * @return the URI of the associated parameter.
     * If the parameter correspond to a file upload field then the value will be the absolute path of the file upload field.
     */
    String getRequestUri(RequestRequestContext requestContext, String parameterName) {
        return (requestContext.getRequestUri(parameterName));
    }
    
    /**
     * Method to get whether the request has a parameter and check it, or any value if the request has no.
     *
     * @param requestContext which contains the parameters to be checked.
     * @param parameterName parameter which was checked.
     * @return if the parameter exists or the value of the associated parameter.
     * If the parameter correspond to a file upload field then the value will be true.
     * If the parameter does not exist then it will return false.
     */
    boolean hasParameter(RequestRequestContext requestContext, String parameterName) {
        return (requestContext.containsParameter(parameterName));
    }
    
    /**
     * Method to get the path of the associated file.
     *
     * @param requestContext which contains the parameters to be checked.
     * @return the file URI of the associated file.
     * If the associated file is a file upload field then the value will be the URI of the associated file.
     */
    File getSourceFile(RequestRequestContext requestContext) {
        return (File)getFileResource((requestContext.getRequestUri(FLASH)).getFile());
    }
    
    /**
     * Method to get the path of the associated file.
     *
     * @return path of the associated file.
     */
    String[] getSourceFileListingPaths(){
        String[] fileListing = (String[])getFileResource("").property("fileListingPath");
        Arrays.sort(fileListing);
        return fileListing;
    }
    
    /**
     * Method to get the path of the associated resource.
     *
     * @return the path of the associated resource.
     */
    String getSourceFileName() {
        return (String)getFileResource("").property("fileName");
    }
    
    /**
     * Method to get the path of the associated resource.
     *
     * @return the path of the associated resource.
     */
    String[] getSourceFilePaths(){
        String[] filePaths = (String[])getFileResource("").property("filePaths");
        Arrays.sort(filePaths);
        Vector fileListing = new Vector();
        for (int i = 0; i < filePaths.length; i++){
            FileResource fl = (FileResource)getFileResource(filePaths[i]);
            fileListing.addElement(fl.getName());
        }
        return (String[])fileListing.toArray(new String[1]);
    }
    
    /**
     * Method to get the path of the associated resource.
     *
     * @return the path of the associated resource.
     */
    File[] getSourceFilePaths() {
        Vector v = (Vector)getFileResource("").property("filePaths");
        return (File[])v.toArray(new File[1]);
    }
    
    /**
     * Method to get the path of the associated resource.
     *
     * @return the path of the associated resource.
     */
    File[] getSourceFilePathsForLocation(File f) {
        Vector v = (Vector)getFileResource("").property("filePaths");
        if (v!= null) {
            Iterator it = v.iterator();
            int i = 0;
            while (it.hasNext() && i < 1) {
                FileResource fl = (FileResource)it.next();
                if (fl.getName().equalsIgnoreCase(f.getPath())) {
                    if (!f.getParentFile().exists()) {
                        f.getParentFile().mkdirs();
                    }
                    return (File[])v.toArray(new File[2]);
                }else i++;
            }
            return (File[])v.toArray(new File[1]);
        }
        return (File[])v.toArray(new File[1]);
    }
    
    /**
     * Method to return the associated file for the supplied URI.
     *
     * @param uri which associated file to return.
     * @return the associated file.
     */
    File getFileResource(String uri) {
        File resource;
}
}