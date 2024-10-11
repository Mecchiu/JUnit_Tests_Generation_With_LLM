I can help you write the source code for the `ParamsUrlTools` class and its test class `ParamsUrlToolsTest`. However, the `getPairParams` method in the `ParamsUrlTools` class is incomplete. Can you provide more details on how you want to transform the long string line with parameters to a list of key-value pairs?

Here's a basic template for the `ParamsUrlTools` class:

```java
package httpanalyzer;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class ParamsUrlTools {

    /**
     * Transform long String line with parameters
     * to List (key, value)
     *
     * @param params String
     * @return List<NameValuePair>
     */
    public List<NameValuePair> getPairParams(String params) {
        // TODO: Implement method
    }
}
```

And here's a basic template for the `ParamsUrlToolsTest` class:

```java
package httpanalyzer;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParamsUrlToolsTest {

    @Test
    void testGetPairParams() {
        // TODO: Implement test cases
    }
}
```