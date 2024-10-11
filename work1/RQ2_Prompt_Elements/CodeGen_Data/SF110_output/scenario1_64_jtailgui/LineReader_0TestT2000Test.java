// LineReader_0Test.java
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
* It contains one unit test case for the {@link LineReader#readLine(int)} method.
*/
class LineReader_0Test {
 
	private final FileIndex index = FileIndex.getIndex(1);

	String s1 = "louie";
	String s2 = "coucoun";
	String s3 = "LOUIE";
	String s4 = "COOUR";
	String s5 = "LOU\x00";
	
	/**
	* Tests readLine(int) method of the {@link LineReader}.
	*/

	@Test
    public void testReadLine_1() throws FileNotFoundException, IOException, Exception {
		//Test
        File f = new File("samples/files_0");
        f.mkdir();
        assertTrue(f.isDirectory());
        File targetFile = new File("samples/files_1");
        assertTrue(targetFile.isDirectory());
        initTargetFile(targetFile);
        try {
            List<String> res1 = new ArrayList<>();
            JTailLogger.getLogger().setLevel(JTailLogger.LOG_LEVEL_ENUM.ERROR);
            List<String> res2 = LineReader.readTargetFile(f, this.index);
            assertEquals(res1, res2);
        } catch (Exception e) {
            fail(e.getMessage());

        } finally {
            JTailLogger.getLogger().setLevel(JTailLogger.LOG_LEVEL_ENUM.DEFAULT);
            f.setOwnerOnly();
            f.delete();
        }


    }
    
    /**
    * Test of initTargetFile to initialize the directory and input file.
    */

	@Test
    public void testInitTargetFile_0() throws FileNotFoundException, IOException, Exception {
		//Test
        File f = new File("samples/files_0");
        f.mkdir();
        assertTrue(f.isDirectory());
        File targetFile = new File("samples/files_1");
        assertTrue(targetFile.isDirectory());
        initTargetFile(targetFile);
        try {
            List<String> res1 = new ArrayList<>();
            JTailLogger.getLogger().setLevel(JTailLogger.LOG_LEVEL_ENUM.ERROR);
            List<String> res2 = LineReader.readTargetFile(f, this.index);
            assertEquals(res1, res2);
        } catch (Exception e) {
            fail(e.getMessage());

        } finally {
            JTailLogger.getLogger().setLevel(JTailLogger.LOG_LEVEL_ENUM.DEFAULT);
            f.setOwnerOnly();
            f.delete();
        }
        
    }

    private void initTargetFile(File targetFile) throws FileNotFoundException, IOException, Exception {
        targetFile.createNewFile();
        targetFile.setOwnerOnly();
        targetFile.deleteOnExit();
    }
	
    private void assertTargetFileIsExist(File file) {
        assertTrue(file.exists() || file.isDirectory());
    }
}
