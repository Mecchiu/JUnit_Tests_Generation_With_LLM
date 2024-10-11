// JVCRequestContext_4Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContext_4Test {
		private static Map flash_;
         private static String flash_a;
         private static String flash_b;
         
        /**
         * JVCRequestContext
         * @throws Exception
         */
        @Test
        void Test() throws Exception {
            flash_ = new HashMap();
            // set some attributes
            flash_.put("myField_1", "myAttribute_1");
            flash_.put("myField_2", "myAttribute_2");
            flash_.put("myField_3", "myAttribute_3");
            
            // get session attributes
            JVCRequestContext.setSessionAttr("myField");
            assertNull(JVCRequestContext.getSessionAttr("myField_1"));
            
            // set the flash variable
            JVCRequestContext.setFlashVar("myField_1");
            assertEquals("myField_1", (Object)JVCRequestContext.getSessionAttr("myField"));
            
            // set a more specific flash variable with multiple values
            flash_.put("myField_2", "A different value");
            assertEquals("A different value", (Object)JVCRequestContext.getSessionAttr("myField_1"));
            assertEquals("myField", (Object)JVCRequestContext.getSessionAttr("myField_2"));
        }
        
        /**
         * Test method for {@link JVCRequestContext#setSessionAttr(String)}.
         * @throws IOException
         * @throws ServletException
         */
        @Test
        void Test_1() throws IOException, ServletException {
         
            InputStream in = ClassLoader.getSystemResourceAsStream("jvcrequestcontext_var_1.txt");
            
            // set the attribute
            HttpServletRequest req = new HttpServletRequestWrapper(new HttpServletRequest(){
                public String getParameter(String p0) {
                    return "myAttribute_1";
                }
            }) {
                public String getParameter(String p0, String p1) {
                    return "myAttribute_2";
                }
            };
            
            JVCRequestContext.setSessionAttr("myField_1");
            req.getSession().setAttribute("myAttribute", "myAttribute_2");
            assertEquals("myAttribute_2", (Object)req.getSession().getAttribute("myAttribute"));
            
            // set the flash variable
            HttpURLConnection connection = (HttpURLConnection)req.openConnection();
            try {
                connection.setRequestProperty("MyStringHeader", "myValue");
            }
            catch (Exception ex) {
                System.out.println(ex);
            }
            
            // do a get that should get us the flash variable and do not
            // get back an unset attribute
            assertEquals("myValue", (String)JVCRequestContext.getSessionAttr("myField_1"));
            
            // try a get with a valid value and an unset attribute
            try {
                connection.setRequestProperty("MyStringHeader", "myValue");
            }
            catch (Exception ex) {
                assertTrue(false);
            }
            
            // check the session variable is no set
            JVCRequestContext.setSessionAttr("myField");
            assertTrue(JVCRequestContext.getSessionAttr("myField_1") == null);
            
        }
		
		/**
		 * Test method for {@link JVCRequestContext#setFlashVar(String)}.
		 * @throws IOException
		 * @throws ServletException
		 */
		@Test
		void Test_2() throws IOException, ServletException {
		
			try {
				ServletFileUpload uploadToServer = new ServletFileUpload();
				try (BufferedInputStream inputStream =
						Streams.newInputStreamBufferFrom(new FileInputStream(new File("/etc/default/jvc_default.txt")))){
					
					uploadToServer.setFileSizeLimit(Long.MAX_VALUE);
					uploadToServer.setInput(inputStream, "text/plain");
					
					List validFiles = uploadToServer.parseForm(new File("/etc/default/jvc_default.txt"));
					assertNotNull(validFiles);
					assertEquals(1, validFiles.size()); // make up 1 so there is a flash attribute to check
					String flashAttr = (String)JVCRequestContext.getSessionAttr("flash");
					assertNotNull(flashAttr);
					assertEquals("myAttribute_1", flashAttr);
					
				}
				
			}
			catch (FileUploadException ex) {
				assertEquals("400 Error", ex.getResponse().getStatusLine().getStatusCode());
			}
		}
		
		/**
		 * Test method for {@link JVCRequestContext#getSessionAttr(String)}.
		 * @throws IOException
		 * @throws ServletException
		 */
		@Test
		void Test_3() throws IOException, ServletException {
				
			ServletFileUpload uploadToServer = new ServletFileUpload();
			try (BufferedInputStream inputStream =
					Streams.newInputStreamBufferFrom(new FileInputStream(new File("/etc/default/jvc_default.txt")))){
				
				uploadToServer.setFileSizeLimit(Long.MAX_VALUE);
				uploadToServer.setInput(inputStream, "text/plain");
				
				List validFiles = uploadToServer.parseForm(new File("/etc/default/jvc_default.txt"));
				assertNotNull(validFiles);
				assertEquals(1, validFiles.size()); // make up 1 so there is a flash attribute to check
				String flashAttr = (String)JVCRequestContext.getSessionAttr("flash");
				assertNotNull(flashAttr);
				assertEquals("myAttribute_1", flashAttr);
				
			}
			catch (FileUploadException ex) {
				assertEquals("400 Error", ex.getResponse().getStatusLine().getStatusCode());
			}
		}
		
}