package nu.staldal.xtree;
java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import nu.staldal.xtree.TreeBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.xml.sax.InputSource;

class TreeBuilder_0Test {

    @Test
    void testFileToInputSource_FileExists() throws FileNotFoundException, IOException {
        File file = new File("test.xml");
        InputSource inputSource = TreeBuilder.fileToInputSource(file);
        assertNotNull(inputSource);
    }

    @Test
    void testFileToInputSource_FileDoesNotExist() {
        File file = new File("nonexistent.xml");
        assertThrows(FileNotFoundException.class, () -> TreeBuilder.fileToInputSource(file));
    }

    @Test
    void testFileToInputSource_IOError() {
        File file = new File("invalid.xml");
        assertThrows(IOException.class, () -> TreeBuilder.fileToInputSource(file));
    }
}
