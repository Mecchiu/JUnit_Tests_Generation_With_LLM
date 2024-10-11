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
		
    private static String url;
	
    /**
     * Test method for {@link HeaderSettings#HeaderSettings(String)}.
     */
    @Test
    public void testHeaderSettings() {
        HeaderSettings settings = new HeaderSettings("Mozilla/5.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1;.NET CLR 1.1.4322;.NET CLR 2.0.50727)", "application/msword", "") ;
        assertEquals(new String[]{"Mozilla/5.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1;.NET CLR 1.1.4322;.NET CLR 2.0.50727)", "application/msword", ""}, ArrayUtils.toArray(settings.getHeaders())) ;
    }

    /**
    * Test method for {@link HeaderSettings#setUserAgent(String[])}.
    */
    @Test
    public void testSetsUserAgent() {
    	setUserAgent = "Mozilla/5.0 (compatible; MSIE 8.0; Windows NT 6.0; Trident/" ;
    	HeaderSettings settings = new HeaderSettings("Mozilla/5.0 (compatible; MSIE 8.0; Windows NT 6.0; Trident/3.0; Info.Net.CachedBinary)", "application/octet-stream", "") ;
    	assertEquals(new String[]{"Mozilla/5.0 (compatible; MSIE 8.0; Windows NT 6.0; Trident/3.0; Info.Net.CachedBinary)", "application/octet-stream", ""}, ArrayUtils.toArray(settings.getHeaders())) ;
    }

    /**
    * Test method for {@link HeaderSettings#loadHeader(String)}.
    */
    @Test
    public void testLoadHeader() {
    	initializeTestCase() ;
    	String[] headers = new String[] { "User-Agent", "Accept-Encoding", "Accept-Language" };
    	loadHeader(headers) ;
    	assertEquals(headers, ArrayUtils.toArray(settings.getHeaders())) ;
    }

    /**
    * Test method for {@link HeaderSettings#loadHeader(Header[])}.
    */
    @Test
    public void testLoadHeaderArray() {
    	initializeTestCase() ;
        String[] headers = new String[] { "User-AGet", "Accept-Encoding", "Accept-Language" };
        loadHeader(headers) ;
    	assertArrayEquals(headers, new String[] { "User-AGet", "Accept-Encoding", "Accept-Language" }) ;
    }

    /**
    * Test method for {@link HeaderSettings#getHeaders()}.
    */
    @Test
    public void testGetHeaders() {
    	initHeaders(FIREFOX, null) ;
    	HeaderSettings settings = new HeaderSettings("Mozilla/5.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1;.NET CLR 1.1.4322;.NET CLR 2.0.50727)", "application/msword", "") ;
    	assertEquals(settings.getHeaders().length, 1) ;
    	assertEquals(settings.getHeaders()[0].getName(), "Cache-Control") ;
    	
    	settings = new HeaderSettings("Mozilla/5.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1;.NET CLR 1.1.4322;.NET CLR 2.0.50727)", "application/msword", "") ;
    	assertEquals(settings.getHeaders().length, 0) ;
    }

    /**
    * Test method for {@link HeaderSettings#showHeaders(Header)}.
    */
    @Test
    public void testShowHeaders() {
    	initializeTestCase() ;
        String[] headers = new String[] { "Cache-Control", "User-Agent", "Accept-Encoding", "Accept-Language" } ;
        showHeaders(headers) ;
    	assertEquals(headers[0], new String[] {"Cache-Control", "User-Agent", "Accept-Encoding", "Accept-Language"}) ;
    	assertEquals(headers[1], new String[] {"User-Agent", "Accept-Encoding", "Accept-Language"}) ;
    	assertTrue(ArrayUtils.containsAll(ArrayUtils.toArray(settings.getHeaders()), headers)) ;
    }

    /**
    * Test method for {@link HeaderSettings#showHeaders(Header[])}.
    */
    @Test
    public void testShowHeadersArray() {
    	initializeTestCase() ;
        String[] headers = new String[] { "User-Agent", "Accept-Encoding", "Accept-Language" } ;
        assertArrayEquals(headers, ArrayUtils.toArray(settings.getHeaders())) ;
    }

    /**
    * Initialize the test case.
    */
    public static void initializeTestCase() {
        url = "http://test/test/test/test/test/test/" ;
}
}