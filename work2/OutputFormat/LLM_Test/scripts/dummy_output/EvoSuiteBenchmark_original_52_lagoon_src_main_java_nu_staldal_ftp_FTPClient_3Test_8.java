// FTPClient_3Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#append(String, boolean)} method.
*/
class FTPClient_3Test {
		
        private static final byte[] B0 = {0};
        private static final byte[] B32 = {32};
        private static final int EOF = 32;

        private FtpServer FTP = null;
        private File FTPFile;

        /**
         * Test append().
         *
         * @throws IOException for any other IO error occurs
         * @throws FTPException this exception gets thrown from the connection.
         */
        @Test
        void testAppend() throws IOException, FTPException {
                FTPFile FTPFile = new FTPFile(FTP.FTP_PORT, FTP.FTP_USERNAME, FTP.FTP_PASSWORD, "/");
                FTPFile.open();
		OutputStream FTPOutputStream = FTPFile.getOutputStream();
		FTPOutputStream.write(B0, 0, B0.length);
		OutputStream FTPOutputStream2 = FTPFile.getOutputStream();
                DataInputStream FTPInputStream = new DataInputStream(new BufferedInputStream(FTPFile.getInputStream()));
                byte[] B;
		byte[] B0 = {0};

                B = new byte[B32.length+512];

                int B32_length = 4096*B32.length, B32_length1 = B32.length+(4096-1)*B32.length-1, B64_length = B32_length + B32_length1 +512;
                FTPOutputStream2.write(B, 0, B32_length);
                FTPOutputStream2.write(B32, B32_length, B32_length1);
                FTPOutputStream.write(B0, 0, B32_length);
                FTPOutputStream2.write(B32, B32_length, B32_length1);
                FTPOutputStream.write(B0, 0, B32_length1);
                FTPOutputStream2.write(B32, B32_length1, B32_length);

                B = new byte[64];
                FTPOutputStream2.writeTo(new DataOutputStream(new BufferedOutputStream(new FileOutputStream(FTPFile))));
                FTPOutputStream.writeTo(new DataOutputStream(new BufferedOutputStream(new FileOutputStream(FTPFile))));

                B = new byte[B64_length];
                FTPInputStream.read(B, 0, B64_length);
                FTPOutputStream2.write(B, 0, B64_length);
                FTPOutputStream2.flush();

                assertEquals("B", null, FTPFile.read(), null);
		assertEquals("B", null, FTPOutputStream2.read(B0, 0, EOF), null);

                assertEquals("B", B, FTPFile.read(), null);
		assertEquals("B", B, FTPOutputStream2.read(B0, 0, EOF), null);

        }
}