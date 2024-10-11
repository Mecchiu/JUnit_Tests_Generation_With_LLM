// JVCDispatcherTest.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import com.pmdesigns.jvc.tools.Base64Coder;
import com.pmdesigns.jvc.tools.JVCGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCDispatcher}.
* It contains one unit test case for the {@link JVCDispatcher#getRC()} method.
*/
class JVCDispatcherTest {
		
    /**
     * Test calling {@link JVCDispatcher#getRC()} of an {@link HttpServlet} class.
     */
    @Test
    void HttpServlet() throws Exception {
        final ArrayList<Cookie> cookies = new ArrayList<>();
        final ArrayList<String> queries = new ArrayList<>();
        final ArrayList<String> methods = new ArrayList<>();
        for (Class<? extends HttpServletRequest> clazz :
            Arrays.asList(WebApp.class, ServletRequest.class)) {
            Method[] methodsDeclaringTester
                = clazz.getMethods();
            System.out.printf("%s methods containing tester classes: %s%n",
                clazz.getName(), Arrays.asList(clazz.getDeclaredMethods()));
            final Method methodExistingTester
                = clazz.getDeclaredMethod("getRequestAndCookies");
            // Methods not declaring the tester
	     for (int i = 0; i < methodsDeclaringTester.length; i++) {
                 methods.add(methodDeclaringTester[i].getName());
			if (methodExistingTester.getName().charAt(0)!='_' &&
                methodExistingTester.getName().charAt(0)!='T') {
                 methods.add(clazz.getMethod(methodExistingTester).getName());
			}
	     }
            //
            List<String> queriesDeclaringTester =
                Arrays.asList(clazz.getDeclaredMethod(
                    "getQueriesForTester").invoke(clazz).toString());
            System.out.printf("Tester Queries: %s%n",
                queriesDeclaringTester);
            List<String> queriesDeclaringTesterCookie =
                Arrays.asList(clazz.getDeclaredMethod("getCookiesForTester").invoke(clazz).toString());
            System.out.printf("Tester Cookies: %s%n",queriesDeclaringTesterCookie);
            for (int i = 0; i < methodsDeclaringTester.length; i++) {
                cookies.add(new Cookie(methodsDeclaringTester[i],
                    queriesDeclaringTesterCookie.get(i)));
            }
        }
            HTTPConnection.setCookie(cookies.toArray(
                new Cookie[cookies.size()]));
            byte[] data = Base64Coder.encode("This and this".getBytes());

            final HttpServletRequest request = new MockHttpServletRequest();
            request.setCookies(cookies, null);
            request.setData(data);

            final HttpServletResponse response = new MockHttpServletResponse();
            response.setData(data);

            final HttpURLConnection urlConnection
                = ((HttpURLConnection) request.getConnection()).addHeader("Echo", "Hello");

			// Do a query against a servlet
            urlConnection.connect();
            InputStream inputStream = getInputStream(request);
            assertEquals(200, urlConnection.getResponseCode());
			assertEquals("Hello", new String(Base64Coder.decode(inputStream)));

            // do a more realistic query of a servlet
            try(
                InputStream input = ((WebApp)request.getContext()).getServletContext().getRealPath("/META-INF/META-INF");
            InputStream input = getInputStream(
                ((WebApp)request.getContext()).getServletContext().getRealPath("/META-INF"))
            ) {
            assertEquals("META-INF", new String(input));
            } catch(ServletException e) {
                System.out.println("No META-INF found, not a Servlet?");
                throw e; // rethrowing and failing
            } catch(IOException e) {
                org.junit.jupiter.api.Assertions.fail("Couldn't read META-INF!");
            } catch(ClassNotFoundException e) {
                org.junit.jupiter.api.Assertions.fail("Couldn't load a servlet!");
            }

            // Do a query against a servlet
		URL url = ((WebApp)request.getContext()).createContext(
            new MimeType("text/html", "UTF-8")).createContextPath("/META-INF")
           .getContext().getContext(0);
    }
    
	/**
	 * @return the input stream to use for a GET call.
	 * Note that all the code is copied verbatim from
	 * {@link WebApp#getServletContext()}
	 * which should be the primary way to read any
	 * data that a web application may need.
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
    private InputStream getInputStream(HttpServletRequest request){
            try{
             return request.getInputStream();
            } catch( ServletException se ){
            throw se;
            } catch(IOException ioe ){
                throw ioe;
            }
    }

}

// End HTML_DISPATCHERTest.java