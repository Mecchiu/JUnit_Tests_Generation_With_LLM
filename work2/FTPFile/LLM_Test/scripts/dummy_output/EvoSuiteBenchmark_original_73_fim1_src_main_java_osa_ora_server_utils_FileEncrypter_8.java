// FileEncrypterTest.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.Cipher;
import java.io.IOException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEncrypter}.
* It contains one unit test case for the {@link FileEncrypter#getInstance()} method.
*/
class FileEncrypterTest {
		@Test
		void encrypt_decrypt_file() throws IOException {
			FileInputStream fis = newFileInputStream("src/oa.ora/resources/testdata/testdata.txt");
			FileOutputStream fos = newFileOutputStream("dst.txt");
 
			
			String content = "enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc-enc.txt";
			byte [] content_buf = content.getBytes();
			int content_len = content.length();
			
			fis.write(content_buf,content_len);
			fos.write("dst.txt".getBytes());
			fos.flush();
			
			fis.close();
			fos.close();
		}

		private FileInputStream newFileInputStream(final String filepath)
					throws IOException {
			File f = new File(filepath);
			if (!f.exists()) {
				throw new IOException("File " + filepath+ " not found.");
			}
			return new FileInputStream(f);
		}

		private FileOutputStream newFileOutputStream(final String filepath)
					throws IOException {
			File f = new File(filepath);
			if (!f.exists()) {
				throw new IOException("File " + filepath+ " not found.");
			}
			return new FileOutputStream(f);
		}
}