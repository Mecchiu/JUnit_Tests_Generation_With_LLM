// FTPClient_5Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#storeUnique(String, boolean)} method.
*/
class FTPClient_5Test {
		/**
		 * create a new directory with an unique name.
		 *
		 * @param path path to the directory
		 * @param last close the FTPClient after transferring this directory
		 * @return an OutputStream to write to, close() it when finished
		 * @throws FTPException if any FTP protocol error occurs
		 * @throws IOException if any other IO error occurs
		 */
		public OutputStream createDirectory(String path, boolean last) throws FTPException, IOException {
					if(path.contains("/")){
							return new FTPClient_5Test._write_dir(path);
					}
					return new FTPClient_5Test._write_file(path);
		}
}

/**
* Test class of {@link FTPClient_5Test.createUnique()}.
* It contains one unit test case for the {@link FTPClient_5Test.createUnique()} method.
*/
class FTPClient_5Test_1_5_storeUnique extends FTPClient_5Test {
		/**
		* Creates a new directory with an unique name.
		*
		* @param path path to the directory
		* @param last close the FTPClient after transferring this directory
		* @return an input stream to read from, close() it when finished
		* @throws FTPException if any FTP protocol error occurs
		* @throws IOException if any other IO error occurs
		*/
		public InputStream createUnique(String path, boolean last) throws FTPException, IOException {
				return new FTPClient_5Test_1_5_storeUnique.createDirectory(path, last);
		}
}

/**
* Test class of {@link FTPClient_5Test_1_5_storeUnique.createUnique()}.
* It contains one unit test case for the {@link FTPClient_5Test_1_5_storeUnique.createUnique()} method.
*/
class FTPClient_5Test_1_5_createUnique extends FTPClient_5Test_1_5_storeUnique {
		/**
		* Creates a new file with an unique name.
		*
		* @param path path to the file
		* @param last close the FTPClient after transferring this file
		* @return an OutputStream to write to, close() it when finished
		* @throws FTPException if any FTP protocol error occurs
		* @throws IOException if any other IO error occurs
		*/
		public OutputStream createUnique(String path, boolean last) throws FTPException, IOException {
				String fileName;
				InputStream testData = new FileInputStream(new File(path+"/"+fileName=file.getName()));
				return new FTPClient_5Test_1_5_storeUnique.createUnique(path, last);
		}
}