// FTPClient_6Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#deleteFile(String)} method.
*/
class FTPClient_6Test {
		/** The server address the FTP client tries to connect to. */
		private static final String SERVER_ADDRESS = "127.0.0.1";

		/** A buffer containing the ftp data received from the server. */
		private static final byte[] FROZEN_BUFFER = {
            (byte) 0xFF, (byte) 0xFE, (byte) 0x00, (byte) 0x00, // Connection ID
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, // Transfer type
            (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, // Transfer mode
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, // Version
            (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, // Transfer size

       };// END OF STRUCTURE

		/** An input stream for reading the ftp data. */
		private static final InputStream FROZEN_INPUT_STREAM = new ByteArrayInputStream(FROZEN_BUFFER);

		/** A test user. */
        private User user;

		/** Dummy constructor. */
		public FTPClient_6Test() {
			user = null;
		}

		/** The connection test case.
		*
		* @throws IOException on wrong file or server
		*/
		@Test
		public void testConnection() throws IOException {
			String[] filenames = this.parseFileNames("user-1.txt");
			FTPReply testReply = new FTPReply(FTPCmd.USER);
			user = new User("testUser1", "passwd1", this.servername());


        // Send the new FTP command.
			testReply.resetOutput(this.servername());
			testReply.setCommand("USER");
			testReply.setPassword("passwd1");
			testReply.setFile(filenames[0]);
			this.servername(testReply);

			checkReply(testReply, user);

            // Send the test command. This should send back an error code plus an optional message.

//    // Check for errors.
//        throw this.testCompleteFailure(); // If here, it should never happen

        // Check for good reply.
			checkReply(testReply, user);

            // Check the content of the reply.
			assertEquals("Reply message", "Passwd1", testReply.getReply());
        }

        /** Parses a list of file name. */
    private String[] parseFileNames(String fileToParse) throws IOException {
        // Send the 'TYPE LIST' command.
        String[] filenames = new String[2];
        String filename = fileToParse;
        int delimiterIndex = filename.indexOf(' ');
        int commandIndex;
        if (delimiterIndex == -1) {
            filename += " ";
            commandIndex = filename.length();
        } else {
            commandIndex = delimiterIndex;
        }

        filenames[0] = filename.substring(0, commandIndex);
        filename = filename.substring(commandIndex);

        filenames[1] = filename.substring(delimiterIndex);

			for (int i = 0; i < filenames.length; i++) {
				String fileName = this.getFileName(filenames[i]);
            if (i == 0) {
            testReply = new FTPReply(FTPCmd.LIST);
            user = new User(userName, password, this.servername());
                checkReply(testReply, user);
            }

            testReply.resetOutput(this.servername());
            testReply.setUid(user.uid());
            testReply.setGid(user.gid());

                testReply.setFiletype(FTPCmd.LIST);
    		// Send the command (filetype LIST).
            this.servername();
            testReply.write(FROZEN_INPUT_STREAM, this.servername());
            checkReply(testReply, user);

            // Check it returns list of files.
            String line;
            InputStream fin = testReply.getInputStream();
            if (!fin.markSupported()) {
                this.servername();
                checkReply(testReply, user);
            }
            do {
                line = fin.readLine();
            } while (line == null); // Avoid empty lines.
            if (!this.parseFilenames(line)) {
                fin.close();
                throw new IOException("invalid list response");
            }
            fin.close();
            testReply.resetOutput("");
        }

        return filenames;
    }

    /** Parse one file name. */
    private String testFileName(String line) {
        String[] filenames = this.parseFileNames(line);
        return (filenames[0] + ")" + filenames[1];
    }
}