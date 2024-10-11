```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Main_3Test {

    @Test
    void testGetWindowNotNull() {
        assertNotNull(Main.getWindow());
    }

    @Test
    void testGetWindowInstance() {
        assertTrue(Main.getWindow() instanceof JFrame);
    }

    @Test
    void testGetWindowVisibility() {
        assertTrue(Main.getWindow().isVisible());
    }

    @Test
    void testGetWindowTitle() {
        assertEquals(Resources.getString("app.title"), Main.getWindow().getTitle());
    }

    @Test
    void testGetWindowWidth() {
        assertEquals(1000, Main.getWindow().getWidth());
    }

    @Test
    void testGetWindowHeight() {
        assertEquals(700, Main.getWindow().getHeight());
    }

    @Test
    void testGetWindowCloseOperation() {
        assertEquals(JFrame.DO_NOTHING_ON_CLOSE, Main.getWindow().getDefaultCloseOperation());
    }

    @Test
    void testGetWindowIcon() {
        assertNotNull(Main.getWindow().getIconImage());
    }

    @Test
    void testGetWindowLayout() {
        assertTrue(Main.getWindow().getLayout() instanceof BorderLayout);
    }

    @Test
    void testGetWindowContentPane() {
        assertNotNull(Main.getWindow().getContentPane());
    }
}
```