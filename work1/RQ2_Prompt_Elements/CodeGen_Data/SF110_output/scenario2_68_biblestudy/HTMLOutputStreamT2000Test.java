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

	@Test
    public void doesNotResetBuffer() throws Exception {
        String contents = baos.toString(); // default value
        String s = "Some text";
        
        HttpServletRequest req = mock(HttpServletRequest.class);
        MockServletConfig sc = new MockServletConfig();
        sc.getServletConfig().setInitParameter("buffer", "1");
        
        // Default buffer
        //DefaultHttpRequestConfigurer p = new DefaultHttpRequestConfigurer("http://localhost:8088/");
        //HttpServletRequest r = p.getServletConfig().getInitParameter("buffer");
        
        HtmlOutputStream stream = new HTMLOutputStream("http://localhost:8088/content", s);
        
        // assert that reset() is not invoked with no value is sent in the buffer
        assertEquals(null, stream.reset());
        // assert that the buffer reset() is not invoked with a value
        assertFalse(stream.reset());
        
        // default value will be sent in the buffer
        // assert that reset() is not invoked with a message sent in the buffer
        assertNotEquals("", contents);
    }

	/** Verify that an error occurs if a request for a buffer size larger than the content size, 
	 * ie. when the buffer is full. **/
	@Test
    public void sendsContentSizeExceededError() throws Exception {
        HtmlOutputStream stream = new HTMLOutputStream("http://localhost:8088/content", "some text");
        assertNotEquals(null, stream.reset());
        assertNotEquals(null, stream.reset());
        assertEquals(null, stream.reset());
        
        try {
            stream.reset();
        } catch (Exception e) {
            assertExceptionOccurred(e);
        }
		
    }
    
    /** Send message content to another location and reset the stream when message is sent **/
    @Test
    public void sendsContent() throws Exception {
        HtmlOutputStream stream = new HTMLOutputStream("http://localhost:8088/content", "some text");
        assertNotEquals(null, stream.reset());
        assertEquals(null, stream.reset());
        
        stream.clear();
        HttpServletRequest req = mock(HttpServletRequest.class);
        MockServletConfig sc = new MockServletConfig();
        sc.getServletConfig().setInitParameter("buffer", "10");
        
        try {
            stream = new HTMLOutputStream("http://localhost:8088/content", "some text", sc);
            stream.reset();
            assertEquals("Some text", stream.getContents());
        } catch (Exception e) {
            fail(e.toString());
        }
		
    }
    
    /** Send a random message, and reset the stream when message is sent **/
    @Test
    public void sendsRandom() throws Exception {
        HtmlOutputStream stream = new HTMLOutputStream("http://localhost:8088/content", "some text");
        assertNotEquals(null, stream.reset());
        assertNotEquals(null, stream.reset());
        assertEquals(null, stream.reset());
        
        stream.clear();
        HttpServletRequest req = mock(HttpServletRequest.class);
        MockServletConfig sc = new MockServletConfig();
        sc.getServletConfig().setInitParameter("buffer", "10");
        
        try {
            stream = new HTMLOutputStream("http://localhost:8088/content", "some text", sc);
            stream.reset();
            assertNotEquals("Some text", stream.getContents());
        } catch (Exception e) {
            fail(e.toString());
        }
		
    }
    
    /** Send a message with a buffer size of 1024 **/
    @Test
    public void setsRandomBufferSize() throws Exception {
        String message = "This is very a message";
        HtmlOutputStream stream = new HTMLOutputStream("http://localhost:8088/content", message);
        assertNotEquals(null, stream.reset());
        assertEquals(null, stream.reset());
        assertEquals(null, stream.reset());
        
        stream.clear();
        HttpServletRequest req = mock(HttpServletRequest.class);
        MockServletConfig sc = new MockServletConfig();
        sc.getServletConfig().setInitParameter("buffer", String.valueOf(1024));
        
        try {
            stream = new HTMLOutputStream("http://localhost:8088/content", message, sc);
            stream.reset();
            assertNotEquals(null, stream.getContents());
        } catch (Exception e) {
            fail(e.toString());
        }
    }
    
    /** Verify that the correct value is sent when a buffer size is not equal to the initial value **/
	@Test
    public void setsCorrectBufferSizeToInitialValue() throws Exception {
        String message = "This is very a message";
        HtmlOutputStream stream = new HTMLOutputStream("http://localhost:8088/content", message);
        assertEquals(null, stream.reset());
        
        assertEquals("This is a message",stream.getContents());
    }
    
    private static void assertExceptionOccurred(Exception e) {
        assertTrue(!"The response contained an unexpected exception"+e.getMessage(), e.getMessage().contains("Unexpected"));
        assertTrue(!"The response contained an unexpected exception"+e.getMessage(), e.getMessage().contains("ContentLength"));
        assertTrue(!"The response contained an unexpected exception"+e.getMessage(), e.getMessage().contains("buffer"));
    }

}