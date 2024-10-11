// CreateMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CreateMetadataAction}.
* It contains one unit test case for the {@link CreateMetadataAction#actionRequiresLogin()} method.
*/
class CreateMetadataActionTest {

/** 
 * @return class to test
 */
    public static class CreateMetadataActionTest {
        
        /** Test method for {@link CreateMetadataAction#actionRequiresLogin()}. */
        @Test
        public void testActionRequiresLogin() {
            // Set up some useful things.
            // Save a couple of items in the session.
            HttpServletRequest request =
                                   new TestAction.SessionAuthenticationServletRequest();
            HttpServletRequest requestOriginal;
            Map<String, String> parameters = new HashMap<String, String>();
            parameters.put(AuthenticationTools.USER_LOOKUP_PARAM, "fred"); // Make sure we get the right user
            // This test will fail if a different database is used.
            parameters.put("dbname", "testing");
            
            // Ensure we are making the action in the wrong database.
            try {
                requestOriginal = request.getRequest();
                Class<?> clazz = request.getClass();
                Method method = clazz.getDeclaredMethod("getClassName2", String.class);

                String returnedClassName = (String)
                                            method.invoke(requestOriginal, "getUserDbName");
                assertEquals("Wrong Class returned.",
                             new String[]{"test-meta-1"},
                             new String[]{returnedClassName});

                // Set session as null so we won't fail out our test.
                RequestDispatcher ncd = request.getRequestDispatcher(null);
                ncd = request.getRequestDispatcher("/home");

            } catch (Exception e) {}
            assertFalse("Missing URL!", request.getCharacterEncoding().equals("UTF-8"));

            String testRequestParameter = System.getProperty("javax.servlet.REQUEST_PATH_INFO");
            String testParameter  = System.getProperty("javax.servlet.request.pathInfo");
            // This test will fail if we are passing a different database.
            assertFalse("Missing request parameter", testRequestParameter == null);
            assertFalse("Missing request parameter", testRequestParameter.equals("/"));
            assertFalse("Missing request parameter", testParameter!= null);
            assertFalse("Missing request parameter", testParameter.startsWith("/"));
        }

        private HttpServletRequest newMockRequest() {
            HttpServletRequest request = new HttpServletRequest() {
                @Override
                public String getCharacterEncoding() { return "UTF-8"; }
                @Override
                public String getParameter(String name) {return null; }
                @Override
                public Object getValue(String name) {
                    if (name.equals("dbname")) {
                        return "testing";
                    }
                    return null;
                }
                @Override
                public Map<String, String> getParameterMap() {
                    return null;
                }
                @Override
                public Enumeration<String> getParameterNames() {
                    return null;
                }
                @Override
                public String getRequestURL() {
                    return null;
                }
                @Override
                public void setCharacterEncoding(String charset) { }
                @Override
                public boolean isUserInRole(String role) { return true; }
                @Override
                public boolean isSecure() { return false; }
                @Override
                public AuthenticationTools.LoginInfo getUser() {
                    return null;
                }
                @Override
                public HttpSession getSession(){return null};
            };
            return request;
        }
        
		
		final TestAction.SessionAuthenticationServletRequest servletRequestOriginal = new TestAction.SessionAuthenticationServletRequest();

		private final TestAction.SessionAuthenticationServletRequest servletRequest = servletRequestOriginal;
		
        public class TestAction {
            public static String ACTION = "test-action";
            public static String DEFAULT_USER = "fred";
            
            public static RequestDispatcher reqdispatcher(String name){
                return null;
            }
            
            public static RequestDispatcher getRequestDispatch(String name){
                return null;
            }
            
            public static String getUserDbName(){
                return "testsubsession";
            }
            
            public static void setUser(String user){
                TestAction.DEFAULT_USER = user;
            }
            
            public static void setSession(HttpSession session){}
            
            public static Boolean isAuthenticated(){
                return null;
            }
        }
        
        public static String actionRequired() {
            return Action.getAction(ACTION).requiresLogin();
        }
        
        private static class TestAction {
            public static Class<?> getActionClass(){
                return new Class<TestAction>() {};
            }
        }
        
        private static class SessionAuthenticationServletRequest extends HttpServletRequest {
            /** A singleton map of the user, by name. */
            private Map<String, Object> user;
            
            @Override
            public void login() {
                setUser(AuthenticationTools.getUserFromSession(servletRequest.getSession()));
            }

            @Override
            public void setUser(Object user) {
                this.user = new HashMap<String, Object>();
                this.user.put("username", (String) user);
            }

            @Override
            public Map<String, Object> getUser(){
                return user;
            }
            
            @Override
            public boolean isUserInRole(String role){
                return false;
            }
        }
    }
}
