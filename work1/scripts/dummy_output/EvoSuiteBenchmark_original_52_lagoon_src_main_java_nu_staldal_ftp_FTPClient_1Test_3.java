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
		 * A client that can store files.
		 */
        private static class FTPClient_1 extends FTPClient {
        	/**
        	 * create a new client
        	 */
        	public FTPClient_1() {
        		super("ftp://ftpserver.test.nu/files");
        	}
			@Override
			protected OutputStream store(String pathname, boolean last) throws FTPException, IOException {
				return new FileOutputStream(pathname);
			}
			@Override
			public InputStream retrieve(String pathname) throws Exception {
				return new FileInputStream(new File("/home/" + pathname));
			}
			@Override
			public InputStream retrieve(File file) throws Exception {
				return new FileInputStream(file);
			}
			@Override
			public OutputStream retrieve(File file, String comment) throws Exception {
				return new FileOutputStream(file, false);
			}
			@Override
			public final OutputStream retrieve(byte[] data, int offset, int len) throws FTPMessageTooLargeException {
				return new ByteArrayOutputStream(data, offset, len);
			}
			@Override
			public final InputStream retrieve(byte[] data, int offset, int len) throws FTPMessageTooLargeException {
				return new ByteArrayInputStream(data, offset, len);
			}
			@Override
			public final InputStream retrieve(InputStream inputStream) throws FileNotFoundException, FTPException {
				return inputStream;
			}
			@Override
			public final InputStream retrieve(long length, boolean binary) throws FTPException {
				return new ByteArrayInputStream((new byte[4096]));
			}
			@Override
			public void disconnect() throws IOException {
			}
			@Override
			public boolean canStore(File file) {
				return true;
			}
			@Override
			public String getPassiveMode(){
				return "";
			}
     }
}