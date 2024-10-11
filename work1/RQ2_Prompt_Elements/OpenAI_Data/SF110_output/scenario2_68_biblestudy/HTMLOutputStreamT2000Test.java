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
		HTMLOutputStream hos = new HTMLOutputStream();
		String expected = "";
		String actual = hos.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write(1);
		String expected = "1";
		String actual = hos.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty2() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write(1);
		hos.baos.write(2);
		String expected = "12";
		String actual = hos.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty3() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write(1);
		hos.baos.write(2);
		hos.baos.write(3);
		String expected = "123";
		String actual = hos.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty4() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write(1);
		hos.baos.write(2);
		hos.baos.write(3);
		hos.baos.write(4);
		String expected = "1234";
		String actual = hos.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty5() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write(1);
		hos.baos.write(2);
		hos.baos.write(3);
		hos.baos.write(4);
		hos.baos.write(5);
		String expected = "12345";
		String actual = hos.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty6() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write(1);
		hos.baos.write(2);
		hos.baos.write(3);
		hos.baos.write(4);
		hos.baos.write(5);
		hos.baos.write(6);
		String expected = "123456";
		String actual = hos.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty7() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write(1);
		hos.baos.write(2);
		hos.baos.write(3);
		hos.baos.write(4);
		hos.baos.write(5);
		hos.baos.write(6);
		hos.baos.write(7);
		String expected = "1234567";
		String actual = hos.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty8() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write(1);
		hos.baos.write(2);
		hos.baos.write(3);
		hos.baos.write(4);
		hos.baos.write(5);
		hos.baos.write(6);
		hos.baos.write(7);
		hos.baos.write(8);
		String expected = "12345678";
		String actual = hos.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty9() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write(1);
		hos.baos.write(2);
		hos.baos.write(3);
		hos.baos.write(4);
		hos.baos.write(5);
		hos.baos.write(6);
		hos.baos.write(7);
		hos.baos.write(8);
		hos.baos.write(9);
		String expected = "123456789";
		String actual = hos.reset();
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer is not empty.
	*/
	@Test
	public void testResetNotEmpty10() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write(1);
		hos.baos.write(2);
		hos.baos.write(3);
		hos.baos.write(4);
		hos.baos.write(5);
		hos.baos.write(6);
		hos.baos.write(7);
		hos.baos.write(8);
		hos.baos.write(9);
		hos.baos.write(10);
		String expected = "1234567890";
		String actual = hos.reset();
		assertEquals(expected, actual);
	}
}