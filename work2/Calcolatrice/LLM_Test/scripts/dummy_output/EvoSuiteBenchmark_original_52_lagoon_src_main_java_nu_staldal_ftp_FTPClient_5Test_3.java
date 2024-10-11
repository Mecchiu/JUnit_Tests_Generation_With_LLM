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
	 * Create a new folder (without existing files).
	 * Will create directories as nessesary.
	 *
	 * @param path path to the folder, must end with '/' or be empty
	 * @param last close the FTPClient after transferring this folder
	 * @return an OutputStream to write to, close() it when finished
	 * @throws FTPException if any FTP protocol error occurs
	 * @throws IllegalStateException if directory structure changed.
	 * @throws IOException if any other IO error occurs
	 */
	static OutputStream createUniqueFolder (String path, boolean last) throws FTPException, IOException {
		URI uri = new URI("file://" + path);
		String host = uri.getHost();
		String pathWithPath = uri.getPath();
		String absPath = pathWithPath.isEmpty()? path : "/" + pathInAbsolutePath(pathWithPath);
		if(host!= null) {
			if(!last) {
				ArrayList<URI> tmpHostList = new ArrayList<URI>();
				tmpHostList.add(uri);
				URI[] tmpPathList = new URI[tmpHostList.size()];
				tmpPathList = tmpHostList.toArray(tmpPathList);
				return FTPClientUtils.storeUnique(absPath, true).getInputStream();
			} else
				return createUnique(uri, path, true);
		} else
			return createUnique(uri, path, false);
	}

	/**
	 * Create a new file (without existing files).
	 * Will create directories as nessesary.
	 *
	 * @param path path to the file, must end with '/' or be empty
	 * @param last close the FTPClient after transferring this file
	 * @return an OutputStream to write to, close() it when finished
	 * @throws FTPException if any FTP protocol error occurs
	 * @throws IllegalStateException if file structure changed.
	 * @throws IOException if any other IO error occurs
	 */
	static OutputStream createUnique (String path, boolean last) throws FTPException, IOException {
		File dirFile = new File(path);
		if(!last)
		FileUtils.delete(dirFile);
		dirFile.mkdirs();
		ArrayList<Path> tmpPathList = new ArrayList<Path>();
		tmpPathList.add(Paths.get(dirFile.getCanonicalPath()));
		return FTPClientUtils.storeUnique(path.replace('/', File.separatorChar), true).getInputStream();
	}

	//-----------------------------------------------------------------------

	/**
	 * Create a new folder.
	 * Will create directories as nessesary.
	 *
	 * @param path path to the new folder, must be qualified by ending '/' or be empty
	 * @param last close the FTPClient after the folder creation
	 * @return an InputStream to try to create the folder
	 * @throws FTPException if any FTP protocol error occurs
	 * @throws IOException if any other IO error occurs
	 */
	static InputStream createFolder (String path, boolean last) throws FTPException, IOException {
		Path path2 = Paths.get(path.replace('/', File.separatorChar));
		if(!last) {
			ArrayList<Path> tmpPathList = new ArrayList<Path>();
			tmpPathList.add(path2);
			return FTPClientUtils.storeUnique("/", true).getInputStream();
		} else
			return createUnique(path, true).getInputStream();
	}

	//-----------------------------------------------------------------------

	/**
	 * Close a FTP client.
	 *
	 * @param fs the current FTP client
	 */
	static void closeFTPClient (FTPClient fs) {
		fs.close();
	}

	//-----------------------------------------------------------------------

}