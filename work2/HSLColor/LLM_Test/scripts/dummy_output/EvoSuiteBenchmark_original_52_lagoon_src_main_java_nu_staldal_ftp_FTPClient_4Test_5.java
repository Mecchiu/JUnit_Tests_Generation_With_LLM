// FTPClient_4Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#storeUnique(String)} method.
*/
class FTPClient_4Test {
		// Test cases

		private final String testData = "This is a test file.\n";

        private final FtpsServer sender = new FtpsServer(Paths.get("/"), false);

		@SuppressWarnings("unchecked")
public final void testStoreUnique(String name) throws Exception {
		byte[] data = testData.getBytes();
        try (
                OutputStream os = sender.openOutputStream(),
                InputStream is = sender.openInputStream()
        ) {
			byte[] buf = new byte[1024];
			int read = 0;

			for (int i = 0; i < data.length; i++)
				buf[i] = (byte) ((data[i] / 256) % 2);

			is.write(buf);
			is.write(testData.getBytes());

			os.write(buf);
            os.flush();

			File f = new File("/tmp");
			f.delete();

			if (f.exists()) {
				f.delete();
				throw new IllegalStateException();
			}

			File f1 = new File(System.getProperty("java.io.tmpdir"), name);
			f1.createNewFile();

			os = sender.createOutputStream(f1);

			is = sender.createInputStream(f1);

            os.write(testData.getBytes());

			os.flush();
            assertEquals(testData, read, os.read(buf));
            os.close();
            is.close();
        }
	}

        // JUnit utils
        static final String Paths = System.getProperty("test.path", "");
}