// LocalFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains one unit test case for the {@link LocalFileStorage#fileLastModified(String)} method.
*/
class LocalFileStorageTest {
 /**
		  * Test of fileLastModified method.
		  */
		 @Test
		    public void testFileLastModified() {
		     LocalFileStorage s = new LocalFileStorage();
		     File f = new File("testing");
		     System.out.println("f   : " + f.getAbsolutePath());
		     assertEquals(0, s.fileLastModified(f.getAbsolutePath()));
		     f.createNewFile();
		     assertEquals(f.getAbsolutePath(), s.fileLastModified(f.getAbsolutePath()));
		     try {
			     assertNull(s.fileLastModified(f.getAbsolutePath()));
		     } catch (FileNotFoundException ignored) {
		     }
		     f.delete();
		     assertNull(s.fileLastModified(f.getAbsolutePath()));
		     
		    }
		}

