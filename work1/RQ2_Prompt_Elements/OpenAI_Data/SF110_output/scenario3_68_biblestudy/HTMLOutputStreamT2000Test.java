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
		HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
		String expected = "";
		String actual = htmlOutputStream.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty() {
		HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
		htmlOutputStream.write("Hello World!");
		String expected = "Hello World!";
		String actual = htmlOutputStream.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty2() {
		HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		String expected = "Hello World!Hello World!";
		String actual = htmlOutputStream.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty3() {
		HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		String expected = "Hello World!Hello World!Hello World!";
		String actual = htmlOutputStream.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty4() {
		HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		String expected = "Hello World!Hello World!Hello World!Hello World!";
		String actual = htmlOutputStream.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty5() {
		HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		String expected = "Hello World!Hello World!Hello World!Hello World!Hello World!";
		String actual = htmlOutputStream.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty6() {
		HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		String expected = "Hello World!Hello World!Hello World!Hello World!Hello World!Hello World!";
		String actual = htmlOutputStream.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty7() {
		HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		String expected = "Hello World!Hello World!Hello World!Hello World!Hello World!Hello World!Hello World!";
		String actual = htmlOutputStream.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty8() {
		HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		String expected = "Hello World!Hello World!Hello World!Hello World!Hello World!Hello World!Hello World!Hello World!";
		String actual = htmlOutputStream.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty9() {
		HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		String expected = "Hello World!Hello World!Hello World!Hello World!Hello World!Hello World!Hello World!Hello World!Hello World!";
		String actual = htmlOutputStream.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty10() {
		HTMLOutputStream htmlOutputStream = new HTMLOutputStream();
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		htmlOutputStream.write("Hello World!");
		String expected = "Hello World!Hello World!Hello World!Hello World!Hello World!Hello World!Hello World!Hello World!Hello World!Hello