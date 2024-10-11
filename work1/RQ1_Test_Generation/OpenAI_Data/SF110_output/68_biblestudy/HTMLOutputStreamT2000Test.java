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
* It contains ten unit test cases for the {@link HTMLOutputStream#reset()} method.
*/
class HTMLOutputStreamTest {

	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is empty.
	*/
	@Test
	public void testResetEmpty() {
		HTMLOutputStream hos = new HTMLOutputStream(new HttpServletResponse() {
			public void addCookie(Cookie cookie) {}
			public void addDateHeader(String name, long date) {}
			public void addHeader(String name, String value) {}
			public void addIntHeader(String name, int value) {}
			public boolean containsHeader(String name) {return false;}
			public String encodeRedirectURL(String url) {return null;}
			public String encodeRedirectUrl(String url) {return null;}
			public String encodeURL(String url) {return null;}
			public String encodeUrl(String url) {return null;}
			public void sendError(int sc) throws IOException {}
			public void sendError(int sc, String msg) throws IOException {}
			public void sendRedirect(String location) throws IOException {}
			public void setDateHeader(String name, long date) {}
			public void setHeader(String name, String value) {}
			public void setIntHeader(String name, int value) {}
			public void setStatus(int sc) {}
			public void setStatus(int sc, String sm) {}
			public void flushBuffer() throws IOException {}
			public int getBufferSize() {return 0;}
			public String getCharacterEncoding() {return null;}
			public String getContentType() {return null;}
			public Locale getLocale() {return null;}
			public ServletOutputStream getOutputStream() throws IOException {return null;}
			public PrintWriter getWriter() throws IOException {return null;}
			public boolean isCommitted() {return false;}
			public void reset() {}
			public void resetBuffer() {}
			public void setBufferSize(int size) {}
			public void setCharacterEncoding(String charset) {}
			public void setContentLength(int len) {}
			public void setContentType(String type) {}
			public void setLocale(Locale loc) {}
		});
		assertEquals("", hos.reset());
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty() {
		HTMLOutputStream hos = new HTMLOutputStream(new HttpServletResponse() {
			public void addCookie(Cookie cookie) {}
			public void addDateHeader(String name, long date) {}
			public void addHeader(String name, String value) {}
			public void addIntHeader(String name, int value) {}
			public boolean containsHeader(String name) {return false;}
			public String encodeRedirectURL(String url) {return null;}
			public String encodeRedirectUrl(String url) {return null;}
			public String encodeURL(String url) {return null;}
			public String encodeUrl(String url) {return null;}
			public void sendError(int sc) throws IOException {}
			public void sendError(int sc, String msg) throws IOException {}
			public void sendRedirect(String location) throws IOException {}
			public void setDateHeader(String name, long date) {}
			public void setHeader(String name, String value) {}
			public void setIntHeader(String name, int value) {}
			public void setStatus(int sc) {}
			public void setStatus(int sc, String sm) {}
			public void flushBuffer() throws IOException {}
			public int getBufferSize() {return 0;}
			public String getCharacterEncoding() {return null;}
			public String getContentType() {return null;}
			public Locale getLocale() {return null;}
			public ServletOutputStream getOutputStream() throws IOException {return null;}
			public PrintWriter getWriter() throws IOException {return null;}
			public boolean isCommitted() {return false;}
			public void reset() {}
			public void resetBuffer() {}
			public void setBufferSize(int size) {}
			public void setCharacterEncoding(String charset) {}
			public void setContentLength(int len) {}
			public void setContentType(String type) {}
			public void setLocale(Locale loc) {}
		});
		hos.print("test");
		assertEquals("test", hos.reset());
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty and contains a new line.
	*/
	@Test
	public void testResetNotEmptyNewLine() {
		HTMLOutputStream hos = new HTMLOutputStream(new HttpServletResponse() {
			public void addCookie(Cookie cookie) {}
			public void addDateHeader(String name, long date) {}
			public void addHeader(String name, String value) {}
			public void addIntHeader(String name, int value) {}
			public boolean containsHeader(String name) {return false;}
			public String encodeRedirectURL(String url) {return null;}
			public String encodeRedirectUrl(String url) {return null;}
			public String encodeURL(String url) {return null;}
			public String encodeUrl(String url) {return null;}
			public void sendError(int sc) throws IOException {}
			public void sendError(int sc, String msg) throws IOException {}
			public void sendRedirect(String location) throws IOException {}
			public void setDateHeader(String name, long date) {}
			public void setHeader(String name, String value) {}
			public void setIntHeader(String name, int value) {}
			public void setStatus(int sc) {}
			public void setStatus(int sc, String sm) {}
			public void flushBuffer() throws IOException {}
			public int getBufferSize() {return 0;}
			public String getCharacterEncoding() {return null;}
			public String getContentType() {return null;}
			public Locale getLocale() {return null;}
			public ServletOutputStream getOutputStream() throws IOException {return null;}
			public PrintWriter getWriter() throws IOException {return null;}
			public boolean isCommitted() {return false;}
			public void reset() {}
			public void resetBuffer() {}
			public void setBufferSize(int size) {}
			public void setCharacterEncoding(String charset) {}
			public void setContentLength(int len) {}
			public void setContentType(String type) {}
			public void setLocale(Locale loc) {}
		});
		hos.print("test\n");
		assertEquals("test\n", hos.reset());
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty and contains a new line and a tab.
	*/
	@Test
	public void testResetNotEmptyNewLineTab() {
		HTMLOutputStream hos = new HTMLOutputStream(new HttpServletResponse() {
			public void addCookie(Cookie cookie) {}
			public void addDateHeader(String name, long date) {}
			public void addHeader(String name, String value) {}
			public void addIntHeader(String name, int value) {}
			public boolean containsHeader(String name) {return false;}
			public String encodeRedirectURL(String url) {return null;}
			public String encodeRedirectUrl(