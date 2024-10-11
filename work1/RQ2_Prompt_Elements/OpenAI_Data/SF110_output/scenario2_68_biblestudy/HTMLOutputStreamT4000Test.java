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
		String contents = hos.reset();
		assertEquals("", contents);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains a single character.
	*/
	@Test
	public void testResetSingleChar() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write(65);
		String contents = hos.reset();
		assertEquals("A", contents);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains a single word.
	*/
	@Test
	public void testResetSingleWord() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write("Hello".getBytes(), 0, 5);
		String contents = hos.reset();
		assertEquals("Hello", contents);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains a single sentence.
	*/
	@Test
	public void testResetSingleSentence() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write("Hello World".getBytes(), 0, 11);
		String contents = hos.reset();
		assertEquals("Hello World", contents);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains a single paragraph.
	*/
	@Test
	public void testResetSingleParagraph() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write("Hello World. This is a test.\n".getBytes(), 0, 31);
		String contents = hos.reset();
		assertEquals("Hello World. This is a test.\n", contents);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains a single paragraph with a newline character.
	*/
	@Test
	public void testResetSingleParagraphNewline() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write("Hello World. This is a test.\n\n".getBytes(), 0, 32);
		String contents = hos.reset();
		assertEquals("Hello World. This is a test.\n\n", contents);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains a single paragraph with a newline character.
	*/
	@Test
	public void testResetSingleParagraphNewline2() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write("Hello World. This is a test.\n\n\n".getBytes(), 0, 33);
		String contents = hos.reset();
		assertEquals("Hello World. This is a test.\n\n\n", contents);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains a single paragraph with a newline character.
	*/
	@Test
	public void testResetSingleParagraphNewline3() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write("Hello World. This is a test.\n\n\n\n".getBytes(), 0, 34);
		String contents = hos.reset();
		assertEquals("Hello World. This is a test.\n\n\n\n", contents);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains a single paragraph with a newline character.
	*/
	@Test
	public void testResetSingleParagraphNewline4() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write("Hello World. This is a test.\n\n\n\n\n".getBytes(), 0, 35);
		String contents = hos.reset();
		assertEquals("Hello World. This is a test.\n\n\n\n\n", contents);
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains a single paragraph with a newline character.
	*/
	@Test
	public void testResetSingleParagraphNewline5() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.baos.write("Hello World. This is a test.\n\n\n\n\n\n".getBytes(), 0, 36);
		String contents = hos.reset();
		assertEquals("Hello World. This is a test.\n\n\n\n\n\n", contents);
	}
}