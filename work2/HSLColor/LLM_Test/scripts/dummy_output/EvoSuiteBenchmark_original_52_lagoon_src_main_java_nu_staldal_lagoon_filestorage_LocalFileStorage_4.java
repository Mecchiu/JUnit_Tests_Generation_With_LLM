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
		private String path;

	/**
	 * Constructor of {@link LocalFileStorageTest}.
	 * @param path path of the file
	 */
	public LocalFileStorageTest(String path) {
		assertNotNull(path);
		assertTrue(!nullPointerException.get() );
		this.path = path;
	}

	/**
	 * Testing the code for {@link LocalFileStorage#fileLastModified(String)} method.
	 */
	@Test
	public void testFileLastModified_01() {
/*
         * test the code for the first case, in which both the input and output
         * can be null
         */

		this.path = null;
		long start = System.currentTimeMillis();
		long file = LocalFileStorage.fileLastModified(this.path);
	
		long end = System.currentTimeMillis();
		long millisecond = end - start;
	
		assertNotSame(-1,millisecond);
	}

	/**
	 * Testing the code for {@link FileStorage#open(String, OpenOption)} method.
	 */
	@Test
	public void testOpen_01() {
/*
    * test the code for the second case, the input has to be not null
    * and the output has to be not null
    */

		if( nullPointerException.get() ) {
			return;
		}

		String path = null;

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(this.path);
			fos.close();
		} catch (IOException e) {
			return;
		}

		assertNull(path);
	}

	@Test
	public void testCommit_00() {
/*
    * test the code for the second case, the input is null, the output has to be the same
    */
		//System.out.println( "commit(null) test");

		if( nullPointerException.get() ) {
			return;
		}

		try {
			FileOutputStream fos = null;
			FileOutputStream fos1 = null;
			long bytesWritten = 0;


			FileInputStream fis = new FileInputStream(this.path);
			fos = new FileOutputStream(this.path);

			fis.getChannel().position(0);
			long bytesToReadRead = new java.io.BufferedOutputStream
					(fos).write((byte)0, 0, bytesToRead);
			bytesWritten = new java.io.BufferedInputStream
					(fis).read(new byte[(int) bytesToReadRead]);
			bytesWritten = this.fileLastModified
					(this.path)
					+ "/"
					+ FileStorage.CHANNEL_ENDING
					+ bytesWritten
					+ FileStorage.CHANNEL_END
					+ FileStorage.CHANNEL_START_LINE
					+ FileStorage.CHANNEL_START_COLUMN
					+ FileStorage.CHANNEL_FRAGMENT_START
					+ FileStorage.CHANNEL_FRAGMENT_END
					+ FileStorage.CHANNEL_TEXT
		                + FileStorage.CHANNEL_END_TEXT
					+ FileStorage.CHANNEL_END_POSITION_TEXT
					+ FileStorage.CHANNEL_END_FILECHUNK
					+ FileStorage.CHANNEL_END_COMPOSITION
					+ FileStorage.CHANNEL_END_CONTINUATION
					+ FileStorage.CHANNEL_ENDING);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

//		//System.out.println("BytesWritten = "+bytesWritten);
//		if (bytesWritten < 1000) {
//			System.out.println("bytesWritten = "+bytesWritten);
//			return;
//		}
//		System.out.println("commit(")
//				+ " bytesWritten = "+bytesWritten
//				+ ")";

	}

}