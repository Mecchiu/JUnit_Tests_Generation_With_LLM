// HeaderSettingsTest.java
package httpanalyzer;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeaderSettings}.
* It contains one unit test case for the {@link HeaderSettings#setHeaders()} method.
*/
class HeaderSettingsTest {

     private HeaderSettings settings = null;
     private static HttpGet getRequest = new HttpGet(
             "http://www.google.com");
     private static HttpGet getResponseOne = new HttpGet(
             "http://www.google.com/");
     private static HttpGet getResponseTwo = new HttpGet(
             "http://www.gittwo.com/");
     private static HttpGet getResponseBoth = new HttpGet(
             "http://www.google.com/");
	 private static String responseHeader1 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 "
	     + "Transitional//EN\"\"http://www.w3.org/TR/REC-html40/\">";
	    private static String responseHeader2 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 "
	            + "Transitional//EN\"\"http://www.w3.org/TR/REC-html40/\">";
        private static String responseHeader3 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 "
                 + "Transitional//EN\"\"http://www.w3.org/TR/REC-html40/\">";
//        private static String responseHeader4 = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD "
//             + "HTML 4.01 Transitional//EN\" http://www.w3.org/TR/REC-html40/">";
	 private static String responseHeaderEmpty = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD "
            + "HTML 4.01 Transitional//EN\" http://www.w3.org/TR/REC-html40/\">";
//        private static String responseHeaderOne = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD "
//             + "HTML 4.01 "
//             + "Transitional//EN\" http://www.w3.org/TR/REC-html40/\">";
//        private static String responseHeaderTwo = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD "
//         + "HTML 4.01 "
//         + "Transitional//EN\" http://www.w3.org/TR/REC-html40/\">";

//        private static String headerOne = "<title>headerOne</title>";
//        private static String headerTwo = "<title>headerTwo</title>";

        /**
         * Test the {@link HeaderSettings#setHeaders()} method.
         */
        @Test
        public void testSetHeaders() {
                assertNull(getResponseBoth.getResponseBody());
                Header[] headers = settings.setHeaders(new Header[] {
                									getRequestHeaderOne,
                									getResponseOne
                		});
	  assertEquals(headers, settings.getHeaders());
        }

        /**
         * Test the {@link HeaderSettings#setHeaders(Header[])} method.
         * The method should set all the headers to this object instance.
         */
        @Test
        public void testSetHeadersWithRequestHeaders() {
                Header[] headers = settings.setHeaders(new Header[] {
                        getRequestHeader2, getResponseHeader1,
                });
        assertArrayEquals(headers, new Header[] {
                new Header("Accept", "text/xml"),
                new Header("Accept", "text/javascript"),
                getResponseHeader1
        });
        }

        /**
         * Test the {@link HeaderSettings#setHeaders(Header[])} method.
         * The method should set the header1 for a particular request. And
         * all headers for the request should be added to the result array.
         */
        @Test
        public void testSetHeadersWithResponseHeaders() {
                Header[] headers = settings.setHeaders(new Header[] {
                        getRequestHeader1
                });
        assertArrayEquals(headers, new Header[] {
                getResponseHeader2
        });
        }

        /**
         * Test the {@link HeaderSettings#setHeaders(Header[])} method where
         * the method should fail because of the different header set.
         * The method should return null value and throw an exception.
         */
        @Test
        public void testSetHeadersWithHeaderSetException() {
                Header[] headers = settings.setHeaders(new Header[] {
                        getRequestHeader1
                });
        assertNull(headers);
        }

        private Header getRequestHeaderOne = new Header(getRequest.getURI(),
                getRequest.getMethod() + " " + getRequest.getProtocol(),
				"HTTP/1.0 ", getRequest.getProtocol() + " "
						+ getRequest.getVersion());
        private Header getRequestHeaderBoth = new Header(getRequest.getURI(),
                getRequest.getMethod() + " " + getRequest.getProtocol(),
				"HTTP/1.0 " + getRequest.getVersion());
	 private Header[] getResponseHeaderOne = new Header[2];

        private Header getResponseOne = new Header(getResponseOne.getURI(),
                getResponseOne.getMethod(), getResponseOne.getHeaders(),
                "HTTP/1.0 200 OK\r\n" + responseHeader1
        );
        private Header[] getResponseBoth = new Header[2];

        private Header getResponseHeader2 = new Header(getResponseTwo.getURI(),
                getResponseTwo.getMethod(), getResponseTwo.getHeaders(),
                "HTTP/1.0 200 " + getRequestHeader1.getValue()
        );

	 private Header[] getResponseHeader3 = new Header[2];
	 private Header[] getResponseHeader4 = new Header[2];

	 private Header getResponseHeaderEmpty = new Header(getResponseBoth
	    .getURI(), getResponseBoth.getMethod(), getResponseBoth.getHeaders(),
	     //"HTTP/1.0 200 OK\r\n<title>headerOther</title>"
	     "HTTP/1.0 200 OK\r\n");
		private Header[] getResponseHeaderOne = new Header[3];

	 private Header[] getResponseHeaderTwo = null;

        /**
        * Create a new instance of {@link HeaderSettingsTest}
        */	private HeaderSettingsTest() {
        	settings = getClass().getAnnotation(HeaderSettings.class);
        	assertNotNull("Setting annotation was NULL!", settings);

        }
	 /**
     * Test the {@link HeaderSettings#setHeaders(Header[])} method when
     * the request and response are the same in both sets.
     * @throws Exception Exception expected.
     */
    @Test
    public void testSetHeadersWithSameRequest() throws Exception {

              assertArrayEquals(settings.setHeaders(new Header[] {getRequestHeader1,getResponseHeader1}), new Header[2]);
    }


	/**
	 * Test the {@link HeaderSettings#setHeaders(Header[])} method when
	 * the request and response are different sets.
	 * @throws Exception Exception expected.
	 */
    @Test
    public void testSetHeadersWithDifferentRequestSet() throws Exception {
      Header[] headers = settings.setHeaders(new Header[] {getRequestHeader2,getResponseHeader2});
     assertArrayEquals(headers, new Header[] {getResponseHeader2});
    }
    
    /**
      * Test to test whether the header set is applied to requests.
      * @throws Exception
    */

    @Test
    public void testSetHeadersWithDifferentRequestSet1() throws Exception {
       Header[] headers = settings.setHeaders(new Header[] {get