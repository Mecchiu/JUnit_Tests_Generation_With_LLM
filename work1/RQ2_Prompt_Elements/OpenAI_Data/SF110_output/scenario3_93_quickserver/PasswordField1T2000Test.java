// PasswordFieldTest.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains ten unit test cases for the {@link PasswordField#getPassword(InputStream, String)} method.
*/
class PasswordFieldTest {

	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is null.
	*/
	@Test
	public void testGetPassword_NullInputStream() {
		try {
			PasswordField.getPassword(null, "prompt");
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// expected
		} catch (IOException e) {
			fail("NullPointerException expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the prompt is null.
	*/
	@Test
	public void testGetPassword_NullPrompt() {
		try {
			PasswordField.getPassword(System.in, null);
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// expected
		} catch (IOException e) {
			fail("NullPointerException expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the prompt is empty.
	*/
	@Test
	public void testGetPassword_EmptyPrompt() {
		try {
			PasswordField.getPassword(System.in, "");
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
			// expected
		} catch (IOException e) {
			fail("IllegalArgumentException expected");
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is closed.
	*/
	@Test
	public void testGetPassword_ClosedInputStream() {
		try {
			InputStream in = new ByteArrayInputStream(new byte[0]);
			in.close();
			PasswordField.getPassword(in, "prompt");
			fail("IOException expected");
		} catch (IOException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not readable.
	*/
	@Test
	public void testGetPassword_NotReadableInputStream() {
		try {
			InputStream in = new ByteArrayInputStream(new byte[0]) {
				public int read() throws IOException {
					throw new IOException();
				}
			};
			PasswordField.getPassword(in, "prompt");
			fail("IOException expected");
		} catch (IOException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not writable.
	*/
	@Test
	public void testGetPassword_NotWritableInputStream() {
		try {
			InputStream in = new ByteArrayInputStream(new byte[0]) {
				public void write(int b) throws IOException {
					throw new IOException();
				}
			};
			PasswordField.getPassword(in, "prompt");
			fail("IOException expected");
		} catch (IOException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not flushable.
	*/
	@Test
	public void testGetPassword_NotFlushableInputStream() {
		try {
			InputStream in = new ByteArrayInputStream(new byte[0]) {
				public void flush() throws IOException {
					throw new IOException();
				}
			};
			PasswordField.getPassword(in, "prompt");
			fail("IOException expected");
		} catch (IOException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not closeable.
	*/
	@Test
	public void testGetPassword_NotCloseableInputStream() {
		try {
			InputStream in = new ByteArrayInputStream(new byte[0]) {
				public void close() throws IOException {
					throw new IOException();
				}
			};
			PasswordField.getPassword(in, "prompt");
			fail("IOException expected");
		} catch (IOException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not markable.
	*/
	@Test
	public void testGetPassword_NotMarkableInputStream() {
		try {
			InputStream in = new ByteArrayInputStream(new byte[0]) {
				public boolean markSupported() {
					return false;
				}
			};
			PasswordField.getPassword(in, "prompt");
			fail("IOException expected");
		} catch (IOException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not markable.
	*/
	@Test
	public void testGetPassword_NotResetableInputStream() {
		try {
			InputStream in = new ByteArrayInputStream(new byte[0]) {
				public void reset() throws IOException {
					throw new IOException();
				}
			};
			PasswordField.getPassword(in, "prompt");
			fail("IOException expected");
		} catch (IOException e) {
			// expected
		}
	}
	
	/**
	* Test case for {@link PasswordField#getPassword(InputStream, String)} method.
	* It tests the case when the input stream is not skippable.
	*/
	@Test
	public void testGetPassword_NotSkippableInputStream() {
		try {
			InputStream in = new ByteArrayInputStream(new byte[0]) {
				public long skip(long n) throws IOException {
					throw new IOException();
				}
			};
			PasswordField.getPassword(in, "prompt");
			fail("IOException expected");
		} catch (IOException e) {
			// expected
		}
	}
}