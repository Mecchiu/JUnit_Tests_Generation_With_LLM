```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchResult_1Test {

    @Test
    void testGetTypeDesc() {
        // Test case 1
        org.apache.axis.description.TypeDesc typeDesc = org.merlot.fedsearch.type.SearchResult.getTypeDesc();
        assertNotNull(typeDesc);

        // Add more test cases here
    }
}
```
```