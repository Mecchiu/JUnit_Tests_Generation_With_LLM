// FileFollower_0Test.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollower}.
* It contains one unit test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
*/
class FileFollower_0Test {
static final String TEXT =
        "Hello!\n" +
        "This is a message.\n";
    boolean caughtException;
    private static Logger logger = Logger.getLogger(FileFollower_0Test.class.getName());

    @Test
    public void testAddOutputDestination() {
        final File f = new File("targetDir/FileFollower_0Test.txt");
        final OutputDestination outputDestination = new OutputDestination(f);
        assertTrue(outputDestination.isSet());

        assertTrue(f.exists());
        assertTrue(f.exists());

        assertTrue(f.isFile());
        assertTrue(f.isFile());
        assertFalse(f.isDirectory());
    }

    @Test
    public void testAddOutputDestinationFail() {
        final FileFollower lf = new FileFollower("/path/to/file");
        try {
            lf.addOutputDestination(getOutputDestination());
            fail("Adding a non-existing OutputDestination should not succeed.");
        }
        catch (IllegalArgumentException e) {
            assertTrue(true);
        }

        try {
            lf.addOutputDestination(null);
            fail("Adding a null OutputDestination should not succeed.");
        }
        catch (NullPointerException e) {
            assertTrue(true);
        }

    }

    private void write(FileOutputStream fos) throws IOException {
        fos.write(TEXT.getBytes());
    }

    @Test
    public void testReadOutputsThroughFile() throws IOException, Exception {
        final FileInputStream fis = new BufferedInputStream(new FileInputStream("file"));
        final BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src"));
        final List<String> lines;

        final File f = new File("targetDir2/textFile.txt");
        final FileInputStream fis2 = new FileInputStream(f);
        final int[] outputLines = new int[1];
        if (FileFollower_0Test.caughtException == false) {
            bis.read(new byte[1024]);
        }
        fis2.read(new byte[1024]);

        final StringBuilder sb = new StringBuilder();
        while (true) {
            final int len = bis.read();
            if (len == -1) break;
            sb.append((char) len);
        }

        lines = sb.toString().split("\n");

        assertEquals("File is not right!", "Hello!\n", lines.get(0));

        final List<String> newLines;
        newLines = new ArrayList<String>(lines.size());
        for (String line : lines) {
            newLines.add(line);
        }

        write(fis2);
        write(fis);

        assertSame(lines, newLines);

        write(fos);
        write(fis2);
    }
	private OutputDestination getOutputDestination() {
		final String pattern = "^FileFollower_0Test.py[.\\/]{0,9}[.]?Test [.\\/].*$";
		final String text = "";

		final File tmpDir = File.createTempFile("targetDir", "txt");
		tmpDir.delete();

		final InputDestination fd = new TestInputDestination(tmpDir);
		return new OutputDestination(fd);
	}

}
