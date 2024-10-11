// FTPClient_1Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#store(String, boolean)} method.
*/
class FTPClient_1Test {
		/**
		 * Test store method using {@link FTPClient#createNewFile(String,boolean)}.
		*/
	@Test
	void createNewFile(Path path) throws IOException, FTPException {
		OutputStream output = new FTPClient().store(path.toString(), false);
		copyFile(path,"./target/file1");
		assertEquals(null, output);
	}

	/**
	 * Test {@link #store(String, boolean)}.
	 */
	@Test
	void store(Path path) throws IOException, FTPException {
		String pathname = path.toString();
		OutputStream output = new FTPClient().store(pathname, false);
		copyFile(path,"./target/file1");
		assertNotNull(output);
		closeStream(output);
	}

	/**
	 * Copy the file at {@code file} from local file system to target location,
	 * and then delete it.
	 */
	@Test
	void copyFile(Path file) throws IOException, FTPException {
		String path=file.toString();
		InputStream is=new StreamSource(new File(path));
		new FTPClient().store(path,true);
		assertTrue(is.available());
		assertTrue(is.flush());
		assertTrue(file.delete());
	}
        @Test
	void deleteFile (Path file) throws IOException, FTPException {
		String path=file.toString();
		InputStream is=new StreamSource(new File(path));
		new FTPClient().store(path,false);
		assertTrue(is.available());
		assertTrue(is.flush());
		assertTrue(file.delete());
	}

	/**
	 * Test {@link #createNewFile(String,boolean[])}.
	 */
	@Test
	void createNewFile (String pathname, boolean[] last) throws IOException, FTPException {
		OutputStream output=new FTPClient().createNewFile(pathname);
		copyFile(pathname,"./target/file1");
		assertNull(output);
		assertEquals(null, output);
		assertTrue(new FTPClient().store(pathname,false).available());
	}

	/**
     * Test {@link #store(String,boolean,String,int)}.
     * Use only for testing {@link #store(String,String[])}
     */
	@Test
    void storeUsingLastPassWithDirectory(String pathname) throws IOException, FTPException {
        OutputStream output = new FTPClient().store(pathname,false,"./mydestination/test");
        copyFile(pathname,"./target/file1");
        assertEquals(null, output);
        return;
    },
	/**
	 * Test {@link #store(String,String,String,int,boolean[])}.
	 */
	@Test
    void storeUsingLastPassWithoutDirectory(String pathname) throws IOException, FTPException {
		OutputStream output = new FTPClient().store(pathname,false,"./test");
		copyFile(pathname,"./target/file1");
		assertEquals(null, output);
		return;
    },
	/**
	 * Test {@link #store(String,boolean[],String,String[],int)}.
	 */
	@Test
    void storeUsingLastPassWithFileName(String pathname) throws IOException, FTPException {
		OutputStream output = new FTPClient().store(pathname,false,"./test/testfile");
		copyFile(pathname,"./target/file1");
		assertEquals(null, output);
		return;
    },
	/**
	 * Test {@link #store(String,String,String,int,boolean[],boolean[])}.
	 */
	@Test
    void storeUsingLastPassWithFileNameAndFileName(String pathname) throws IOException, FTPException {
        FileOutputStream fos=new FileOutputStream("../src/test/resources/tests/data/tests.com/ftptest1.txt");
        OutputStream output = new FTPClient().store(pathname,false,"./test/testfile");
		copyFile(pathname,"./target/file1");
        assertEquals(null, output);
		closeStream(output);
		fos.close();
	}
        /**
	 * Test {@link #store(String,String,String)}.
	 * Use only for testing {@link #store(String,String[])}
	 */
	@Test
    void storeUsingLastPassNoDirectory(String pathname) throws IOException, FTPException {
        OutputStream output = new FTPClient().store(pathname,false);
        assertEquals(null, output);
        FileUtils.deleteDirectoryFromFileSystem("./target");
		return;
    },
	/**
	 * Test {@link #store(String,String,String)}.
	 * Use only for testing {@link #store(String,String[],String[])}
	 */
	@Test
    void storeUsingLastPassNonFile(String pathname) throws IOException, FTPException {
        OutputStream output=new FTPClient().store(pathname,false,"./test");
        assertEquals(null, output);
		FileUtils.deleteDirectoryFromFileSystem("./target");
		return;
    },
	/**
	 * Test {@link #store(String,String,int)}.
	 */
	@Test
    void storeUsingLastPassNrNr(String pathname) throws IOException, FTPException {
        OutputStream output = new FTPClient().store(pathname,false,"1");
        assertEquals(null, output);
		FileUtils.deleteDirectoryFromFileSystem("./target");
		return;
    }

}