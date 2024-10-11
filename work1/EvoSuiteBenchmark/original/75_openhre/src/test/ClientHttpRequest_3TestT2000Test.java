```java
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ClientHttpRequest_3Test {

    @Test
    void testPostWithParameters() {
        try {
            URL url = new URL("http://example.com");
            Map<String, Object> cookies = new HashMap<>();
            cookies.put("session", "123456");
            Map<String, Object> parameters = new HashMap<>();
            parameters.put("name", "John Doe");
            parameters.put("age", 30);

            InputStream response = ClientHttpRequest.post(url, cookies, parameters);

            assertNotNull(response);
        } catch (IOException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    void testPostWithCookiesAndParameters() {
        try {
            URL url = new URL("http://example.com");
            String[] cookies = {"session", "123456"};
            Object[] parameters = {"name", "John Doe", "age", 30};

            InputStream response = ClientHttpRequest.post(url, cookies, parameters);

            assertNotNull(response);
        } catch (IOException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    // Add more test cases for different scenarios

}
```
```