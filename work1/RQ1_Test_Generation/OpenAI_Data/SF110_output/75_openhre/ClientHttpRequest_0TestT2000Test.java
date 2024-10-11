// ClientHttpRequest_0Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains ten unit test cases for the {@link ClientHttpRequest#post()} method.
*/
class ClientHttpRequest_0Test {

	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#connection} field is null.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void test_post_0() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		clientHttpRequest.connection = null;
		try {
			clientHttpRequest.post();
			fail("NullPointerException expected");
		} catch (NullPointerException e) {
			// nothing to do
		} catch (IOException e) {
			fail("NullPointerException expected");
		}
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#connection} field is not null.
	* Expected {@link IOException}.
	*/
	@Test
	void test_post_1() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		clientHttpRequest.connection = new URLConnection(new URL("http://www.google.com")) {
			public void connect() throws IOException {
				throw new IOException();
			}
		};
		try {
			clientHttpRequest.post();
			fail("IOException expected");
		} catch (IOException e) {
			// nothing to do
		}
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#connection} field is not null.
	* Expected {@link IOException}.
	*/
	@Test
	void test_post_2() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		clientHttpRequest.connection = new URLConnection(new URL("http://www.google.com")) {
			public void connect() throws IOException {
				throw new IOException();
			}
		};
		try {
			clientHttpRequest.post();
			fail("IOException expected");
		} catch (IOException e) {
			// nothing to do
		}
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#connection} field is not null.
	* Expected {@link IOException}.
	*/
	@Test
	void test_post_3() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		clientHttpRequest.connection = new URLConnection(new URL("http://www.google.com")) {
			public void connect() throws IOException {
				throw new IOException();
			}
		};
		try {
			clientHttpRequest.post();
			fail("IOException expected");
		} catch (IOException e) {
			// nothing to do
		}
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#connection} field is not null.
	* Expected {@link IOException}.
	*/
	@Test
	void test_post_4() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		clientHttpRequest.connection = new URLConnection(new URL("http://www.google.com")) {
			public void connect() throws IOException {
				throw new IOException();
			}
		};
		try {
			clientHttpRequest.post();
			fail("IOException expected");
		} catch (IOException e) {
			// nothing to do
		}
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#connection} field is not null.
	* Expected {@link IOException}.
	*/
	@Test
	void test_post_5() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		clientHttpRequest.connection = new URLConnection(new URL("http://www.google.com")) {
			public void connect() throws IOException {
				throw new IOException();
			}
		};
		try {
			clientHttpRequest.post();
			fail("IOException expected");
		} catch (IOException e) {
			// nothing to do
		}
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#connection} field is not null.
	* Expected {@link IOException}.
	*/
	@Test
	void test_post_6() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		clientHttpRequest.connection = new URLConnection(new URL("http://www.google.com")) {
			public void connect() throws IOException {
				throw new IOException();
			}
		};
		try {
			clientHttpRequest.post();
			fail("IOException expected");
		} catch (IOException e) {
			// nothing to do
		}
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#connection} field is not null.
	* Expected {@link IOException}.
	*/
	@Test
	void test_post_7() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		clientHttpRequest.connection = new URLConnection(new URL("http://www.google.com")) {
			public void connect() throws IOException {
				throw new IOException();
			}
		};
		try {
			clientHttpRequest.post();
			fail("IOException expected");
		} catch (IOException e) {
			// nothing to do
		}
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#connection} field is not null.
	* Expected {@link IOException}.
	*/
	@Test
	void test_post_8() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		clientHttpRequest.connection = new URLConnection(new URL("http://www.google.com")) {
			public void connect() throws IOException {
				throw new IOException();
			}
		};
		try {
			clientHttpRequest.post();
			fail("IOException expected");
		} catch (IOException e) {
			// nothing to do
		}
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post()} method.
	* It tests the case when the {@link ClientHttpRequest#post()} method is called and the {@link ClientHttpRequest#connection} field is not null.
	* Expected {@link IOException}.
	*/
	@Test
	void test_post_9() {
		ClientHttpRequest clientHttpRequest = new ClientHttpRequest();
		clientHttpRequest