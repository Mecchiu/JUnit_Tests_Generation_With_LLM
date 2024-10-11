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
		assertEquals("", hos.reset());
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains a single character.
	*/
	@Test
	public void testResetSingleChar() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.print("a");
		assertEquals("a", hos.reset());
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains a single integer.
	*/
	@Test
	public void testResetSingleInt() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.print(1);
		assertEquals("1", hos.reset());
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains a single string.
	*/
	@Test
	public void testResetSingleString() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.println("a");
		assertEquals("a\n", hos.reset());
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains a single integer.
	*/
	@Test
	public void testResetSingleIntln() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.println(1);
		assertEquals("1\n", hos.reset());
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains multiple characters.
	*/
	@Test
	public void testResetMultipleChars() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.print("abc");
		assertEquals("abc", hos.reset());
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains multiple integers.
	*/
	@Test
	public void testResetMultipleInts() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.print(123);
		assertEquals("123", hos.reset());
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains multiple strings.
	*/
	@Test
	public void testResetMultipleStrings() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.println("abc");
		hos.println("def");
		assertEquals("abc\ndef\n", hos.reset());
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains multiple integers.
	*/
	@Test
	public void testResetMultipleIntsln() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.println(123);
		hos.println(456);
		assertEquals("123\n456\n", hos.reset());
	}
	
	/**
	* Test case for {@link HTMLOutputStream#reset()} method.
	* It tests the case when the buffer contains a mixture of characters, integers, and strings.
	*/
	@Test
	public void testResetMixed() {
		HTMLOutputStream hos = new HTMLOutputStream();
		hos.print("abc");
		hos.println(123);
		hos.print("def");
		hos.println(456);
		assertEquals("abc123\ndef456\n", hos.reset());
	}
}