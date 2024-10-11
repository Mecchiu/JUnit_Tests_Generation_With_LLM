```java
package original;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HasCloseElementsTest {

    @Test
    void testHasCloseElements() {
        assertFalse(HasCloseElements.hasCloseElements(Arrays.asList(1.0, 2.0, 3.0), 0.5));
        assertTrue(HasCloseElements.hasCloseElements(Arrays.asList(1.0, 2.8, 3.0, 4.0, 5.0, 2.0), 0.3));
        assertTrue(HasCloseElements.hasCloseElements(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2), 0.3));
        assertFalse(HasCloseElements.hasCloseElements(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2), 0.05));
        assertTrue(HasCloseElements.hasCloseElements(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0), 0.95));
        assertFalse(HasCloseElements.hasCloseElements(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0), 0.8));
        assertTrue(HasCloseElements.hasCloseElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0), 0.1));
        assertTrue(HasCloseElements.hasCloseElements(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1), 1.0));
        assertFalse(HasCloseElements.hasCloseElements(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1), 0.5));
    }
}
```
