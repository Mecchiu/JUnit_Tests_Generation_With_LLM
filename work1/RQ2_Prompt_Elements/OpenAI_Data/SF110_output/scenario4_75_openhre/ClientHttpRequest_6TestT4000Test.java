// ClientHttpRequest_6Test.java
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object, String, Object)} method.
*/
class ClientHttpRequest_6Test {

	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* Test case for the <i>first parameter name</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_1() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = null;
		Object value1 = new Object();
		String name2 = "name2";
		Object value2 = new Object();
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* Test case for the <i>first parameter value</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_2() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = "name1";
		Object value1 = null;
		String name2 = "name2";
		Object value2 = new Object();
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* Test case for the <i>second parameter name</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_3() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = "name1";
		Object value1 = new Object();
		String name2 = null;
		Object value2 = new Object();
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* Test case for the <i>second parameter value</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_4() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = "name1";
		Object value1 = new Object();
		String name2 = "name2";
		Object value2 = null;
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* Test case for the <i>first parameter name</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_5() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = null;
		Object value1 = new Object();
		String name2 = "name2";
		Object value2 = new Object();
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* Test case for the <i>first parameter value</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_6() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = "name1";
		Object value1 = null;
		String name2 = "name2";
		Object value2 = new Object();
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* Test case for the <i>second parameter name</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_7() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = "name1";
		Object value1 = new Object();
		String name2 = null;
		Object value2 = new Object();
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* Test case for the <i>second parameter value</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_8() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = "name1";
		Object value1 = new Object();
		String name2 = "name2";
		Object value2 = null;
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* Test case for the <i>first parameter name</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_9() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = null;
		Object value1 = new Object();
		String name2 = "name2";
		Object value2 = new Object();
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object)} method.
	* Test case for the <i>first parameter value</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_10() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = "name1";
		Object value1 = null;
		String name2 = "name2";
		Object value2 = new Object();
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2);
		});
	}
}

// ClientHttpRequest_7Test.java
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_7Test {
		
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* Test case for the <i>first parameter name</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_1() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = null;
		Object value1 = new Object();
		String name2 = "name2";
		Object value2 = new Object();
		String name3 = "name3";
		Object value3 = new Object();
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2, name3, value3);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* Test case for the <i>first parameter value</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_2() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = "name1";
		Object value1 = null;
		String name2 = "name2";
		Object value2 = new Object();
		String name3 = "name3";
		Object value3 = new Object();
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2, name3, value3);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* Test case for the <i>second parameter name</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_3() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = "name1";
		Object value1 = new Object();
		String name2 = null;
		Object value2 = new Object();
		String name3 = "name3";
		Object value3 = new Object();
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2, name3, value3);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* Test case for the <i>second parameter value</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_4() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = "name1";
		Object value1 = new Object();
		String name2 = "name2";
		Object value2 = null;
		String name3 = "name3";
		Object value3 = new Object();
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2, name3, value3);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* Test case for the <i>third parameter name</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_5() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = "name1";
		Object value1 = new Object();
		String name2 = "name2";
		Object value2 = new Object();
		String name3 = null;
		Object value3 = new Object();
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2, name3, value3);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* Test case for the <i>third parameter value</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_6() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = "name1";
		Object value1 = new Object();
		String name2 = "name2";
		Object value2 = new Object();
		String name3 = "name3";
		Object value3 = null;
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2, name3, value3);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* Test case for the <i>first parameter name</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_7() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = null;
		Object value1 = new Object();
		String name2 = "name2";
		Object value2 = new Object();
		String name3 = "name3";
		Object value3 = new Object();
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2, name3, value3);
		});
	}
	
	/**
	* Test case for {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
	* Test case for the <i>first parameter value</i> argument.
	* The argument is {@code null}.
	* Expected {@link NullPointerException}.
	*/
	@Test
	void testPost_8() throws IOException {
		URL url = new URL("http://localhost:8080/");
		String name1 = "name1";
		Object value1 = null;
		String name2 = "name2";
		Object value2 = new Object();
		String name3 = "name3";
		Object value3 = new Object();
		assertThrows(NullPointerException.class, () -> {
			ClientHttpRequest.post(url, name1, value1, name2, value2, name3, value3);
		});
	}
	