```java
import static org.junit.jupiter.api.Assertions.assertEquals;

class HTMLFilterTest {

    @Test
    void testFilter_NullInput() {
        assertEquals(null, HTMLFilter.filter(null));
    }

    @Test
    void testFilter_EmptyInput() {
        assertEquals("", HTMLFilter.filter(""));
    }

    @Test
    void testFilter_NoSpecialCharacters() {
        assertEquals("Hello World", HTMLFilter.filter("Hello World"));
    }

    @Test
    void testFilter_LessThanSign() {
        assertEquals("&lt;script&gt;", HTMLFilter.filter("<script>"));
    }

    @Test
    void testFilter_GreaterThanSign() {
        assertEquals("&gt;script&lt;", HTMLFilter.filter(">script<"));
    }

    @Test
    void testFilter_Ampersand() {
        assertEquals("AT&amp;T", HTMLFilter.filter("AT&T"));
    }

    @Test
    void testFilter_DoubleQuotes() {
        assertEquals("&quot;Hello&quot;", HTMLFilter.filter("\"Hello\""));
    }

    @Test
    void testFilter_MixedInput() {
        assertEquals("&lt;Hello&gt; &amp; &quot;World&quot;", HTMLFilter.filter("<Hello> & \"World\""));
    }

    @Test
    void testFilter_SpecialCharactersOnly() {
        assertEquals("&lt;&gt;&amp;&quot;", HTMLFilter.filter("<>&\""));
    }
}
```
