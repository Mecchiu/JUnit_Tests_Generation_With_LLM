```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JVCRequestContext_1Test {

    @Test
    void testGetParamMap() {
        // Test case 1
        JVCRequestContext requestContext = createRequestContext("foo[bar1]=baz1&foo[bar2]=baz2");
        Map<String, String> paramMap = requestContext.getParamMap("foo");
        assertEquals(2, paramMap.size());
        assertEquals("baz1", paramMap.get("bar1"));
        assertEquals("baz2", paramMap.get("bar2");

        // Test case 2
        requestContext = createRequestContext("foo[bar1]=baz1&foo[bar2]=baz2&foo[bar3]=baz3");
        paramMap = requestContext.getParamMap("foo");
        assertEquals(3, paramMap.size());
        assertEquals("baz1", paramMap.get("bar1"));
        assertEquals("baz2", paramMap.get("bar2"));
        assertEquals("baz3", paramMap.get("bar3"));
    }

    private JVCRequestContext createRequestContext(String queryString) {
        // Mock HttpServletRequest and HttpServletResponse
        HttpServletRequest request = new MockHttpServletRequest(queryString);
        HttpServletResponse response = new MockHttpServletResponse();
        HttpServlet servlet = new HttpServlet();
        Map<String, String> flash = new HashMap<>();
        String controller = "TestController";
        String action = "testAction";

        try {
            return new JVCRequestContext(request, response, servlet, flash, controller, action);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
```
```java
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

class MockHttpServletRequest implements HttpServletRequest {
    private final String queryString;

    public MockHttpServletRequest(String queryString) {
        this.queryString = queryString;
    }

    @Override
    public String getQueryString() {
        return queryString;
    }

    // Implement other methods of HttpServletRequest interface
}

class MockHttpServletResponse implements HttpServletResponse {
    // Implement methods of HttpServletResponse interface
}
```