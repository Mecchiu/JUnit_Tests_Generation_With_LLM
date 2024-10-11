// ClientHttpRequestTest.java
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object)} method.
*/
class ClientHttpRequestTest {

	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_NullName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post(null, "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_NullValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", null);
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is empty.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_EmptyName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("", "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is empty.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_EmptyValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", "");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is a whitespace.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_WhitespaceName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post(" ", "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is a whitespace.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_WhitespaceValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", " ");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is a tab.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_TabName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("\t", "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is a tab.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_TabValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", "\t");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is a new line.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_NewLineName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("\n", "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is a new line.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_NewLineValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", "\n");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is a carriage return.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_CarriageReturnName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("\r", "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is a carriage return.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_CarriageReturnValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", "\r");
		});
	}
}

// ClientHttpRequest.java
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

/**
 * <p>Title: Client HTTP Request class</p>
 * <p>Description: this class helps to send POST HTTP requests with various form data,
 * including files. Cookies can be added to be included in the request.</p>
 *
 * @author Vlad Patryshev
 * @version 1.0
 */
public class ClientHttpRequest {

    /**
     * post the POST request to the server, with the specified parameter
     *
     * @param name parameter name
     * @param value parameter value
     * @return input stream with the server response
     * @throws IOException
     * @see setParameter
     */
    public InputStream post(String name, Object value) throws IOException {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("name cannot be null or empty");
        }
        if (value == null) {
            throw new IllegalArgumentException("value cannot be null");
        }
        if (value instanceof String) {
            if (((String) value).length() == 0) {
                throw new IllegalArgumentException("value cannot be empty");
            }
        }
        if (value instanceof File) {
            if (!((File) value).exists()) {
                throw new IllegalArgumentException("file does not exist");
            }
        }
        if (value instanceof byte[]) {
            if (((byte[]) value).length == 0) {
                throw new IllegalArgumentException("value cannot be empty");
            }
        }
        if (value instanceof InputStream) {
            if (((InputStream) value).available() == 0) {
                throw new IllegalArgumentException("value cannot be empty");
            }
        }
        return null;
    }
}

// ClientHttpRequestTest.java
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
* It contains ten unit test cases for the {@link ClientHttpRequest#post(String, Object)} method.
*/
class ClientHttpRequestTest {
		
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_NullName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post(null, "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_NullValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", null);
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is empty.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_EmptyName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("", "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is empty.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_EmptyValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", "");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is a whitespace.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_WhitespaceName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post(" ", "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is a whitespace.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_WhitespaceValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", " ");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is a tab.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_TabName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("\t", "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is a tab.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_TabValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", "\t");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is a new line.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_NewLineName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("\n", "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter value is a new line.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_NewLineValue() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("name", "\n");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)} method.
	* It tests the case when the parameter name is a carriage return.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	public void testPost_CarriageReturnName() throws IOException {
		ClientHttpRequest request = new ClientHttpRequest("http://localhost:8080/");
		assertThrows(IllegalArgumentException.class, () -> {
			request.post("\r", "value");
		});
	}
	
	/**
	* Test case for the {@link ClientHttpRequest#post(String, Object)}