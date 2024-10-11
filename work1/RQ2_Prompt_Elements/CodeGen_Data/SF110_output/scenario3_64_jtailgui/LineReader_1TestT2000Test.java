// LineReader_1Test.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LineReader}.
* It contains one unit test case for the {@link LineReader#readBlock(int, int)} method.
*/
class LineReader_1Test {
@Test
    public void testConstructor() {
		String content;
        
        File file = new File("test-1.txt");
        assertNotNull(file);

        FileIndex fileIndex = FileIndex.loadFromFile(file, JTailLogger.HEADLESS);
        FileIndex.cleanFileIndex(fileIndex);
				
        RandomAccessFile fin;
        File file2;
        try {
            fin = new RandomAccessFile(file, "r");
            fin.seek(fin.length());
            int fromLine, toLine;
            fromLine = fin.readInt();
                        toLine = fin.readInt();

            content = fin.readLine();

            assertNotNull(content);
            assertTrue(!(content.length() > 0));

            if(!content.equals("")) {
                content = content.trim();
                // We can easily have null, but it is only not a problem.
            }
            
            if(fromLine!= fin.readInt())      throw new RuntimeException("Incorrect line");
            
            if(toLine!= fin.readInt())      throw new RuntimeException(null);
        }
        catch(FileNotFoundException e) {
            final List<String> lineList = new ArrayList<String>[2];
            System.err.println("Not found file or error");
            lineList.add("/does/not/exist");
            lineList.add(e.getMessage());
            e.printStackTrace();
            if(lineList.size() == 2) {
                throw new RuntimeException(lineList.get(1));
            }
         }
        
        try {
            fin.close();
        }
        catch(IOException e) {
            fail(e.getMessage());
        }
        
    }
}

// LineReader_2Test.java
