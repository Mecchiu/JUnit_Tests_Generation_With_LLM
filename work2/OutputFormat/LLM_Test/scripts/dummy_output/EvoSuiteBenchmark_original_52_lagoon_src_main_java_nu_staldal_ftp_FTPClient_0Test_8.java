// FTPClient_0Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#store(String)} method.
*/
class FTPClient_0Test {
		OutputStream store = null;

		/**
		 * Unit test for the store() method.
		 *
		 * @throws IOException thrown if any FTP protocol errors occur
		 */
		@Test
		void store() throws IOException {
			// create test connection object
			// we don't know how to test these connections are so make a temporary
			// connection instead
			if(!store.getClass().getName().equals("IO")) {
                FTPClient client = new FTPClient();
                int status = client.getDefaultPort();
                switch (client.getDefaultPort()) {
                    case 23:
                        doTest(client);
                        break;
                    default:
                        fail();
                }
                // we didn't get any file
                fail();
			}
		}

		/**
		 * Tests if it has the right directory and file separator setting.
		 * The test will be executed on Unix systems and NT-like systems.
		 */
		private void doTest(FTPClient client) throws IOException {
			System.out.println("connecting to " + client.getDefaultPort() +
                                    " on host " + client.getDefaultHost() + "...");

			InputStream in = client.store("/tmp");

			String content = "Hallo ich ich ich!";

			// copy file to temporary place
			byte[] buf = new byte[content.length()];
            in.read(buf);
            byte[] res = client.readBytes();
            String str = new String(buf);
            String filepath = "/home/k/tmp/";
            if(str.indexOf("c:/") < 0
           || str.indexOf("./") < 0) str += File.separatorChar;
            File newfile = new File(new String(filepath+str));

			// open/write to new connection
			client.enterLocalPassiveMode();

			InputStream buff = new ByteArrayInputStream(str.getBytes());

			client.getSession().setCurrentHost(client.getDefaultHost());
			client.setFileName(newfile.getName(), buff, res);
			client.setFileSize(0l, buff);

			// close connection to remote machine
			client.exitLocalPassiveMode();

			// start new connection to remote machine
			client.connect();

			// verify if we can open
			in.read(buf, 0, content.length());
			client.setFileStatus("/tmp");
			if(!client.isFileKnown(newfile.getName()))  fail();
			assertEquals("hallo", new String(buf));
			assertEquals("Hallo ich ich ich!", new String(res));

			// verify that file and content match
			ContentChecks ch = new ContentChecks();
			ch.readLineAndTestCanceled();
			String expectedC = System.getProperty("java.io.tmpdir");
			System.out.println("the given tmp dir: " + expectedC);
			assertTrue(ch.isTestOk(-1, expectedC));
		}
		
		class ContentChecks extends ContentChanger {
			boolean readLine;
			long lineLength;
			int length;
	        public void checkCanceled() throws IOException {
	            readLine = false;
	        }
	        public boolean isEmptyBefore(long position) throws IOException {
	            return length <= position;
	        }
	        public void checkOk() throws IOException {
	            readLine = true;
	        }
	        public void checkStartPosition(long position) throws IOException {
	            this.position = position;
	        }
	        public void setReadPosition(long position) throws IOException {
	            this.position = position;
	            readLine = (position-lineLength > 0);
	        }
	        protected void setLineLength(long length) throws IOException {
	            this.lineLength = length;
	            readLine = (length > lineLength);
	        }
	        public void readLine() throws IOException {
	            if(readLine) {
	                System.out.println("read starting at " + position);
	            }
		}
		private ContentChecks() {
			long position = 0;
			readLine = false;
			lineLength = 0;
		}
	}
}