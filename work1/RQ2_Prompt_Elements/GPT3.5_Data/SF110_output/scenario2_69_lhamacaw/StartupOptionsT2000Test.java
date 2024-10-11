Here's an example implementation of the StartupOptionsTest class with ten unit test cases for the useDemo() method:

```
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StartupOptionsTest {

    @Test
    void testUseDemoReturnsTrue() {
        StartupOptions options = new StartupOptions();
        assertTrue(options.useDemo());
    }

    @Test
    void testUseDemoReturnsFalse() {
        StartupOptions options = new StartupOptions();
        assertFalse(options.useDemo());
    }

    @Test
    void testUseDemoReturnsTrueAfterSettingTrue() {
        StartupOptions options = new StartupOptions();
        options.setUseDemo(true);
        assertTrue(options.useDemo());
    }

    @Test
    void testUseDemoReturnsFalseAfterSettingFalse() {
        StartupOptions options = new StartupOptions();
        options.setUseDemo(false);
        assertFalse(options.useDemo());
    }

    @Test
    void testUseDemoReturnsFalseAfterSettingTrueThenFalse() {
        StartupOptions options = new StartupOptions();
        options.setUseDemo(true);
        options.setUseDemo(false);
        assertFalse(options.useDemo());
    }

    @Test
    void testUseDemoReturnsTrueAfterSettingFalseThenTrue() {
        StartupOptions options = new StartupOptions();
        options.setUseDemo(false);
        options.setUseDemo(true);
        assertTrue(options.useDemo());
    }

    @Test
    void testUseDemoReturnsFalseAfterSettingNull() {
        StartupOptions options = new StartupOptions();
        options.setUseDemo(null);
        assertFalse(options.useDemo());
    }

    @Test
    void testUseDemoReturnsTrueAfterSettingTrueWithConstructor() {
        StartupOptions options = new StartupOptions(true);
        assertTrue(options.useDemo());
    }

    @Test
    void testUseDemoReturnsFalseAfterSettingFalseWithConstructor() {
        StartupOptions options = new StartupOptions(false);
        assertFalse(options.useDemo());
    }

    @Test
    void testUseDemoReturnsFalseAfterSettingNullWithConstructor() {
        StartupOptions options = new StartupOptions(null);
        assertFalse(options.useDemo());
    }
}
```

Note that the setUseDemo() method is not included in the StartupOptions class, so it would need to be added in order for these tests to compile and run.