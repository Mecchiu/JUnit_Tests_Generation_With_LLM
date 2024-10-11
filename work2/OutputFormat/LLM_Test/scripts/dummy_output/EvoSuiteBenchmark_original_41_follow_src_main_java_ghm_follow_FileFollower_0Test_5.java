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
		/**
     * This method adds a file's contents to fileFollower.
     *
     */
    @Test
    void testAddFile() {
		File aFile = new File("a.txt");
		OutputDestination dest1 = new OutputDestination(aFile, true);
		OutputDestination dest2 = new OutputDestination(aFile, true);
		OutputDestination dest3 = new OutputDestination(aFile, true);
		OutputDestination dest4 = new OutputDestination(aFile, true);

        OutputDestination dest5 = new OutputDestination(aFile, true);
        
        System.out.println("This will add the file's contents to the outputDestination object.");
        
        List<String> expected = new ArrayList<String>(5);
        expected.set(7, "Hello World");
        expected.set(12, "Greetings World");
//        expected.set(19, "Hello World");      
        expected.set(20, "hi");
        expected.set(21, "greetings");            
//        expected.set(22, "Hello World");
        expected.set(23, "Hello  World");
//        expected.set(24, "Hello World");            
        expected.set(25, "Hello  Hello World");
        expected.set(2, "Hello \"World\"");                  	
//        expected.set(3, "Hello \"World\"");
        expected.set(4, "hello");
        
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream(aFile));

        byte[] buffer = new byte[4096];
        int bytesRead = -1;
        
        dest1.addFileContents(bytesRead, fis, buffer);
        dest2.addFileContents(bytesRead, fis, buffer);
        dest3.addFileContents(bytesRead, fis, buffer);
        dest4.addFileContents(bytesRead, fis, buffer);
        
        dest1.print();        
        dest2.print();        
        
        bufferedInputStreamTest(fis, buffer);
    }

    void bufferedInputStreamTest(File fis, byte[] buffer) {
        BufferedInputStream fis2 = null;        
        fis2 = new BufferedInputStream(new FileInputStream(fis));
        
        byte[] b = new byte[4096];
        
        int bytesRead = fis2.read(b);

        assertEquals(Integer.valueOf(bytesRead), Double.valueOf(b));
        
        fis2.close();
    }
}