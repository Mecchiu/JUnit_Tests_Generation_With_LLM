// FTPFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.*;
import nu.staldal.lagoon.core.*;
import nu.staldal.ftp.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFileStorage}.
* It contains ten unit test cases for the {@link FTPFileStorage#createFile(String)} method.
*/
class FTPFileStorageTest {

	/**
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
	