// JVCRequestContext_1Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains one unit test case for the {@link JVCRequestContext#getParamMap(String)} method.
*/
class JVCRequestContext_1Test {
		
	/**
	* A test servlet for testing getParamMap API
	*/
	@Test
  public void testGetParamMap() {
      
//    String sRequest = "GET / HTTP/1.1\r\n"
//      + "Host: example.com\r\n"
//      + "Connection: Upgrade\r\n"
//      + "Accept: */*\r\n"
//      + "User-Agent: Mozilla/4.0 WHT\r\n"
//      + "Origin: http://demo.bk-labs.com:8080/\r\n"
//      + "Authorization: Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7ImVtYWlsIjoiaGVsbG8gd2FpbiIsImh0dHBzOiJ1clNlY3VyZS5kcmltaXRpZWdleC5jb20udW5rIjoiNiIsInVybCI6IkpXVCJ9.YTJiIixeNX1njd2QH7eN9tVZfKwRf8XnXQ/h/QhSX+XmIkLzqn4vRbOxTb4vqeU0S7gfV6m8+gwP4+k2lU7LXWkI7X0BjH9y+v+6kR7rT4bBZfj5JUj3a4O6h9/0Rx7Z5W8nM+H3+0KF3d3B6O4Nvqn+nF9/0d1P2O0yQ+Ln+Fv5O1Pw3C9mhB5D3n5qpAa4O2Z6H4DzYUfH7hOvYI5QIh7FQ6C2hvD7D3ZDh9YQ/jbw+h4Q/h2YFvQ3Zpz9YZvZsDzQ/d9VvHqf0xOtZVXcB9Q2+/dH4eZnGKfYzZP5e8G+7xC6Y8Q/zPx/F3B4Cbk+6Bp4+5W3DlZ8l4b5WzO3z8+uPz8/dYH+Q+6WV5TZ2eCg3bVVf6b6P6d1Yw+Zt+O1Vz0d4bZ7d2ZyPd7CZ+d9Wt+WmF1Q9b1+dF1kd2Zu1D4Yt1QyT3A+dZQd9Wt+Wv1R3Jk4e4g7zd/W8YH6dI6dDlJf6BjH8J8+q+9T1bv6k/9Q+d9+q+4Ud8Pz+W9b9T9Wt+9Q+dSb7f6t7T9Vf8Ojg7p+dRn+q+1o3r+d6q+dX4r+t1Oz+v+Q+1n/d4t/f4Vf7W5ZQ+Q+zr+f9O8+Q/6Vz+dQ/9Z9O9R1JYV/8j+Y+2/O4R4a+ZGdZaY+W5b6f6P6r+Z8Pq/0sY5z+Hd9H/uT9b9H8n/r+U+tU/Q9Y/0v+O8+q+5Vv5z1Pw4Q+qT9R3g0+Q+0v/vZ+8s9Nv/8Q/nv+8w/8f3Z+8T+v+9d9Mz+4Vf+8T+8Za9d9M5d+nV5d9Rn+nRz+v+1n8n/d5U9W1W4o+Wv5Z+HkS+Zh/o6f6P7Jq+b5GdZaY+T9S3+j8T+2Nv5e7Q+c1V0d1P5c+h9W0Nd+n9YdS9yO0v/8K1Vp+h0Y+1n5v1W8o/n5v1WmO/v1h5Vv1YW5z/0z/F3f+Y8V9h/f9i6F9H/v2W1pG+8o+qT9h8vW9j/r4uH4V5Q9h/wv6q+b5g+h/zP7o/q4Z/4W8O+4w9uZ9T9d+nPb6f6p7Jq6H4Q+b6g+h/qZb6P7Jqv/r4vH/nw8N2o+v+9z+v
}
}