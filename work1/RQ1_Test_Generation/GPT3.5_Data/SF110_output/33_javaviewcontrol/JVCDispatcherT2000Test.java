```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JVCDispatcherTest {

    @Test
    void testGetRCReturnsNull() {
        assertNull(JVCDispatcher.getRC());
    }

    @Test
    void testGetRCReturnsNonNullAfterSetting() {
        JVCRequestContext rc = new JVCRequestContext(null, null, null, null, null, null);
        JVCDispatcher.ctxHolder.set(rc);
        assertEquals(rc, JVCDispatcher.getRC());
    }

    @Test
    void testGetRCReturnsNullAfterRemoving() {
        JVCRequestContext rc = new JVCRequestContext(null, null, null, null, null, null);
        JVCDispatcher.ctxHolder.set(rc);
        JVCDispatcher.ctxHolder.remove();
        assertNull(JVCDispatcher.getRC());
    }

    @Test
    void testGetRCReturnsNullInitially() {
        assertNull(JVCDispatcher.getRC());
    }

    @Test
    void testGetRCReturnsNonNullAfterSettingAgain() {
        JVCRequestContext rc = new JVCRequestContext(null, null, null, null, null, null);
        JVCDispatcher.ctxHolder.set(rc);
        assertEquals(rc, JVCDispatcher.getRC());
    }

    @Test
    void testGetRCReturnsNullAfterRemovingAgain() {
        JVCRequestContext rc = new JVCRequestContext(null, null, null, null, null, null);
        JVCDispatcher.ctxHolder.set(rc);
        JVCDispatcher.ctxHolder.remove();
        assertNull(JVCDispatcher.getRC());
    }

    @Test
    void testGetRCReturnsNullAtStart() {
        assertNull(JVCDispatcher.getRC());
    }

    @Test
    void testGetRCReturnsNonNullAfterSettingOnceMore() {
        JVCRequestContext rc = new JVCRequestContext(null, null, null, null, null, null);
        JVCDispatcher.ctxHolder.set(rc);
        assertEquals(rc, JVCDispatcher.getRC());
    }

    @Test
    void testGetRCReturnsNullAfterRemovingOnceMore() {
        JVCRequestContext rc = new JVCRequestContext(null, null, null, null, null, null);
        JVCDispatcher.ctxHolder.set(rc);
        JVCDispatcher.ctxHolder.remove();
        assertNull(JVCDispatcher.getRC());
    }
}
```
```