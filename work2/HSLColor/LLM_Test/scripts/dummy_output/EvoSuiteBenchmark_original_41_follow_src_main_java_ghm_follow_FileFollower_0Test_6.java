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
		
    // FileFollower_0Follower_1_0Test.java
        @Test
        public void test1_0() throws IOException {
            try {
                 
                File dest = new File("dest");
                File src = new File("src");
             
                try(OutputDestination fo1 = outputDestination()) {
                    // the dest is deleted when after invoking the method addOutputDestination()
                    File newFile = new File(dest, "newFile");

                    fo1.add(newFile);
                    fo1.add(src);

                    assertNotNull(dest.getParentFile());

                    assertThat(dest.getAbsolutePath()).hasSameValueAs(newFile.getAbsolutePath());
                    assertTrue(newFile.getAbsolutePath().startsWith(dest.getAbsolutePath()));
                }
              
            } catch (IOException ioe) {
                assertThat(ioe.toString()).contains("File is already a directory; cannot access");
            }
        }

         
        @Test
        public void test1_0_addNullOutputDestination() throws Exception {
            OutputDestination dest = outputDestination();

            File newDir = File.createTempFile("dest", "newDirWithSpaces", new File("dest"));

            if (dest!= null) {
                dest.add(newDir);
            }

            assertNotNull(dest);

            assertThat(newDir.getAbsolutePath()).hasSameValueAs("dest");
            assertTrue(newDir.getAbsolutePath().startsWith(dest.getAbsolutePath()));
            assertTrue(newDir.isDirectory());
            assertTrue(dest.isDirectory());
        }
}

// ClassFileSuffixTest.java

class ClassFileSuffixTest {
    // Instance of this class
    public static volatile boolean flag = false;

    /**
     * Add another OutputDestination to which the followed file's contents
     * should be printed.
     *
     * @param outputDestination OutputDestination to be added
     */
    public boolean addOutputDestination(OutputDestination outputDestination) {
        if (!flag) {

            try {
        
                File dest = new File("dest");
    
                System.out.println("Printing 'dest' contents in class file...");

                OutputDestination fo = outputDestination();

                fo.add(dest);

                System.out.println("Printing 'dest' contents complete in class file. Printing output contents for all files of type: " + dest.getName());

                flag = true;
                return true;
            } catch (IOException ioe) {
                assertThat(ioe.toString()).contains("Printing 'dest' contents in class file");
            }
        }

        return false;
    }
}

// FileSuffixTest_0Test.java

class FileSuffixTest_0Test {
        
    @Test
    public void test0() throws Exception {
        assertTrue(ClassFileSuffixTest.addOutputDestination(new File("dest")));
        ClassFileSuffixTest.addOutputDestination(new File("src"));
    }
}