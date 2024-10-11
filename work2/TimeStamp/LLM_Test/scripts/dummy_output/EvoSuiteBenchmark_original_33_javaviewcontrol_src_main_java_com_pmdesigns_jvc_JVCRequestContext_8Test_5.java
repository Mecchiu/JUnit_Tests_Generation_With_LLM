// JVCRequestContext_8Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
*/
class JVCRequestContext_8Test {
		private static final String FILE_NAME="file.txt";
    private HttpServletRequest httpServletRequest;
    private HttpServletResponse httpServletResponse;
    private String fileContent = null;
    private List<String> flash = new ArrayList<String>();
    
    /**
    * test for the constructor with one argument
    * @param args the test path/content parameters
    * @throws ServletException the test for failure
    * @throws IOException the test for failure
    */
    @Test
    public final void makeLink (final Object[] args) throws ServletException, IOException {
        String testPath = "";
        String testContent = "";
        int argsCount = 1;
        
        final int firstArg = 0;
        final int secondArg = 1;
        final boolean mustHaveContent = true;
        final boolean oneArg = true;
        boolean done = false;
        
        // call constructor with the first argument
        testPath = args[firstArg];
        if (oneArg) {
            testContent = args[secondArg];
        } else {
            testContent = "";
        }
                        
        // call the method to generate the link
        done = makeLink(testPath, testContent, (String)args[++argsCount]);
        assertTrue ("No error expected for invalid file or path supplied to makeLink", done);
        
        // now check that the file contents match what the test expects
        if (mustHaveContent) {
            checkFileContent(testPath, testContent);
        }
    }
    
    /**
     * Check for a new link to create the flash Map
     */
    private void checkFileContent (String testPath, String testContent) {
        Document doc = null;
        Element e = null;
                    
        try {
            // create doc object
            InputStream fis = new FileInputStream(FILE_NAME);
            doc = JVCServletUtils.readXML(fis, null);
            InputStreamReader isr  = new InputStreamReader(doc.getContent());
            e = doc.getDocumentElement();
            
            // construct the file object to contain data read via reader
            fileContent = JVCServletUtils.createStringObject(isr);
                    
            assertNotNull("Error with creation of fileContent object", fileContent!= null);
            File file = new File(testPath);
            assertNotNull("Error with file.getParentFile", file);
            assertEquals("Error with testPath", file.getParentFile(), testPath);
            assertTrue(
                "Error checking flash",
               !"".equals(fileContent) && 
               !"".equals(file.length()) && 
                fileContent == Files.toString(new File(testPath), null));
            
            assertTrue(
                "Unexpected flash",
                flash.isEmpty() && 
                flash == null &&
                testPath.equals(file.getName()));
            
        } catch (Throwable t) {
            System.out.println("Error checking flash: " + t);
            t.printStackTrace();
        } finally {
            if (doc!= null) {
                doc.getDocumentElement().getFirstChild().getNextSibling().getPreviousSibling().getFirstChild().getLastChild().remove();
                doc.getDocumentElement().getFirstChild().remove();
            }
            XMLUtil.releaseDom(e);
            XMLUtil.releaseDom(doc);
        }
                    
    }
    
    
    /**
     * Ensure that flash values can be accessed by the following
     * function which will return the first string which is
     * not null.
     * If the flash value is null, this function will return '',
     * which will trigger the return null from the method.
     * @param testPath the path where the link will be created
     * @param expected the expected data value
     * @return the Flash value as a string
     */
    private String assertExpectedFlash (String testPath, String expected) {
        String value = flash.get(0);
        if (expected.equals("")) {
            return "";
        }
        if (value == null) {
            return null;
        }
        if (!expected.equals(value)) {
            return null;
        }
        return value;
    }
    
    /**
     * Builds a link object for a link
     * @param test path/content parameter. this is either one of: 
     *    <path> a valid path
     *    <path> a "relative" path which does not start with a "/" character
     *    <filename> a path to a file
     *    <files> a path to multiple files
     * @param content the actual content of the link.  If this is null then the string
     * content of the link will be the name of the file object from which the content will be retrieved.
     * @return the path to the link
     */
    private String makeLink(String testPath, String content) {
        Document doc = null;
        Element e = null;
                    
        if (content == null) {
            content = testPath;
        }
        
        // create doc object
        InputStream fis = new FileInputStream(FILE_NAME);
        doc = JVCServletUtils.readXML(fis, null);
        InputStreamReader isr  = new InputStreamReader(doc.getContent());
        e = doc.getDocumentElement();
       
        // convert content to string
        String fileContent = JVCServletUtils.createStringObject(isr);
        assertNotNull("Error with conversion of content to string", fileContent!= null);
        
        // check for empty file.  This allows to check that 
        // the file content is ""
        if ((content.length() == 0) || (fileContent.length() == 0)) {
            
            fileContent = content;
        }
        
        // make the link
        return "/" + content + "/" + testPath;
    }
    
}