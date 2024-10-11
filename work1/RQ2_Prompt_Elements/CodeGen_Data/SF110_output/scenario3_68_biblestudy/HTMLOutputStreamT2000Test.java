// HTMLOutputStreamTest.java
package bible.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLOutputStream}.
* It contains one unit test case for the {@link HTMLOutputStream#reset()} method.
*/
class HTMLOutputStreamTest {

    /**
     * HTTP POST
     * @throws IOException
     *
     */
    @Test
    public void postStream() throws IOException{
        URL url = new URL("http://www.bible-it.org/v1.1/bible/#/book/42/book");

        String result = (String) HttpGet(url).getAsString();
		assertEquals("/V1.1/bible/#/book/42/book", result);
	}

	/**
	* HTTP GET
	* @throws IOException
	*
	*/
	@Test
	public void getStream() throws IOException {
		URL url = new URL("http://www.bible-it.org/v1.1/bible/#/book/");
		
		HttpGet request = new HttpGet(url);
		HttpResponse response = HttpGet(url);
		assertEquals(200, response.getStatusLine().getStatusCode());
		
		String responseString = HttpUtils.inputStreamToString(response.getEntity());
		System.out.println(responseString);
		assertNotNull(responseString);
		
	}
	
    /**
     * HTTP DELETE
     */
    @Test
    public void deleteStream() throws IOException{
		HttpDelete request = new HttpDelete(new URL("https://www.bible-it.org/v1.1/bible/#/book/"));
		HttpResponse response = HttpGet(new URL("https://www.bible-it.org/V1.1/bible/#/book/"));
		assertEquals(410, response.getStatusLine().getStatusCode());
    }

	/**
	 * HTTP PUT, POST
	 * @throws IOException 
	 * 
	 * @author James Stauffer
	 */
    @Test
    public void putStream() throws IOException{
        URL url = new URL("http://www.bible-it.org/v1.1/bible/#/book/");

        HttpPut request = new HttpPut(url);
        HttpResponse response = HttpGet(url);
        assertEquals(200, response.getStatusLine().getStatusCode());

        String responseString = HttpUtils.inputStreamToString(response.getEntity());
        System.out.println(responseString);
        assertNotNull(responseString);
    }
}