// LagoonProcessorTest.java
package nu.staldal.lagoon.core;

import java.io.*;
import java.util.*;
import nu.staldal.xtree.*;
import nu.staldal.util.Utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LagoonProcessor}.
* It contains one unit test case for the {@link LagoonProcessor#build(boolean)} method.
*/
class LagoonProcessorTest {

    /** The source dir. */
    private static final File DIR = new File("/usr/share/xml");

    /** The target storage URL. */
    private static final File STORE = new File("/etc/httpd/sbin");

    /** The processor context. */
    private final LagoonContext lagoonContext;

    /**
     * Constructs the test-class. Builds the test-context. Synchronous
     * to make sure all tests is executed in a single thread (since
     * all tests are executed at the same thread).
     * @param ttTestCase is the test case.
     */
    LagoonProcessorTest(final TestCase ttTestCase) {
        lagoonContext = new LagoonContext(DIR, STORE);
    }


    /**
     * Initializes the test-context from the sitemap.
     * It is not expected to concurrently call this by an invocation
     * for a different thread from the first one.
     */
    void init() {
        lagoonContext.init();
    }

    /**
     * Test method for {@link LagoonContext#build(boolean)}
     * If the operation returns false, the test-context has to be destroyed.
     */
    @Test
    public void testBuildSync() {
        boolean result = build(true);
        if (!result) {
            throw new RuntimeException("Test failed.");
        }
    }

    /**
     * Test method for {@link LagoonContext#build(boolean)}
     * If the operation returns false, the test-context has to be destroyed.
     */
    @Test
    public void testBuildAsync() {
        init();
        boolean result = build(true);
        if (result) {
            destroy();
            throw new NullPointerException("build returned false.");
        }
    }

    @Test
    public void testNonUniquePath() {
        lagoonContext.init();
        TestCase.checkNotEquals(this, lagoonContext);
        TestCase test = TestCase.create();
        lagoonContext.setTargetStorageURL(test.getStorageURL());
        init();
        result = test.run();
        assertFalse(result);
        destroy();
        lagoonContext.init();
        File target = lagoonContext.getTargetStorageURL();
        assertEquals(target, this);
    }

    @Test
    public void testSinglePath() throws IOException {
        lagoonContext.init();
        TestCase.checkNotEquals(this, lagoonContext);
        TestCase test = TestCase.create();
        lagoonContext.setTargetStorageURL(test.getStorageURL());
        init();
        boolean result = test.run();
        assertTrue(result);
        destroy();
        lagoonContext.init();
        File target = lagoonContext.getTargetStorageURL();
        assertEquals(target, this);
    }


    // ------------------------------------------------------------------ Tests

    /**
     * Returns a string containing the path of the target storage URL.
     * This path can have a wildcard (e.g. /usr/www/html) of the form :
     * $URL:$storage_url/foo.png, which can happen for some cases where
     * some source storage URLs are broken during the test-case.
     * This is why the path must be unique to the test-case.
     */
    public String getStorageURL() {
        final List<File> list = Utils.findAll(DIR, FileTypes.FOLDERS_AND_DIRS, Pattern.compile(":*.*"));
        fileFilter = new FilenameFilter() {
            public boolean accept(java.io.File file, String name) {
                return StringUtils.containsAny(name, list.toArray(new String[list.size()]));
            }
        };
        StringBuilder sb = new StringBuilder();
        for (File f : list) {
            sb.append(file.isDirectory()? "/" : ":";
            sb.append(f.getName()).append(":").append(f.getPath());
            sb.append(FileTypes.MULTILINE.getPattern()).append(' ');
            sb.append(f.getName()).append(":").append(f.getPath());
            sb.append(FileTypes.MULTILINE.getPattern()).append(' ');
        }
        return sb.toString();
    }

    private static final FileFilter fileFilter = new FileFilter() {
        public boolean accept(java.io.File pathname) {
            if (pathname.isDirectory()) {
                if (pathname.getName().equals("html")) {
                    if (pathname.getName().equals("html")) {
                        if (pathname.getName().equals("css")) {
                            return true;
                        }
                    } else {
                        if (pathname.getName().equals("css")) {
                            return true;
                        }
                    }
                } else {
                    if (pathname.getName().equals("css")) {
                        return true;
                    }
                }
            }
            return false;
        }
    };

    private void destroy() {
        lagoonContext.destroy();
    }

}
