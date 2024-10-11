// FTPClientTest.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#storeUnique(String, boolean)} method.
*/
class FTPClientTest {

	/**
	* Test case for {@link FTPClient#storeUnique(String, boolean)} method.
	* This test case tests the functionality of the method when the path is empty.
	* The expected result is that the method should return an output stream.
	*/
	@Test
	public void testStoreUnique_PathEmpty() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.storeUnique("", true);
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#storeUnique(String, boolean)} method.
	* This test case tests the functionality of the method when the path is null.
	* The expected result is that the method should throw a NullPointerException.
	*/
	@Test
	public void testStoreUnique_PathNull() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		assertThrows(NullPointerException.class, () -> {
			ftpClient.storeUnique(null, true);
		});
	}
	
	/**
	* Test case for {@link FTPClient#storeUnique(String, boolean)} method.
	* This test case tests the functionality of the method when the path is not empty and not null.
	* The expected result is that the method should return an output stream.
	*/
	@Test
	public void testStoreUnique_PathNotEmptyNotNull() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.storeUnique("/", true);
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#storeUnique(String, boolean)} method.
	* This test case tests the functionality of the method when the path is not empty and not null.
	* The expected result is that the method should return an output stream.
	*/
	@Test
	public void testStoreUnique_PathNotEmptyNotNull2() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.storeUnique("/test", true);
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#storeUnique(String, boolean)} method.
	* This test case tests the functionality of the method when the path is not empty and not null.
	* The expected result is that the method should return an output stream.
	*/
	@Test
	public void testStoreUnique_PathNotEmptyNotNull3() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.storeUnique("/test/", true);
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#storeUnique(String, boolean)} method.
	* This test case tests the functionality of the method when the path is not empty and not null.
	* The expected result is that the method should return an output stream.
	*/
	@Test
	public void testStoreUnique_PathNotEmptyNotNull4() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.storeUnique("/test/test", true);
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#storeUnique(String, boolean)} method.
	* This test case tests the functionality of the method when the path is not empty and not null.
	* The expected result is that the method should return an output stream.
	*/
	@Test
	public void testStoreUnique_PathNotEmptyNotNull5() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.storeUnique("/test/test/", true);
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#storeUnique(String, boolean)} method.
	* This test case tests the functionality of the method when the path is not empty and not null.
	* The expected result is that the method should return an output stream.
	*/
	@Test
	public void testStoreUnique_PathNotEmptyNotNull6() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.storeUnique("/test/test/test", true);
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#storeUnique(String, boolean)} method.
	* This test case tests the functionality of the method when the path is not empty and not null.
	* The expected result is that the method should return an output stream.
	*/
	@Test
	public void testStoreUnique_PathNotEmptyNotNull7() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.storeUnique("/test/test/test/", true);
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#storeUnique(String, boolean)} method.
	* This test case tests the functionality of the method when the path is not empty and not null.
	* The expected result is that the method should return an output stream.
	*/
	@Test
	public void testStoreUnique_PathNotEmptyNotNull8() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.storeUnique("/test/test/test/test", true);
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#storeUnique(String, boolean)} method.
	* This test case tests the functionality of the method when the path is not empty and not null.
	* The expected result is that the method should return an output stream.
	*/
	@Test
	public void testStoreUnique_PathNotEmptyNotNull9() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.storeUnique("/test/test/test/test/", true);
		assertNotNull(outputStream);
	}
	
	/**
	* Test case for {@link FTPClient#storeUnique(String, boolean)} method.
	* This test case tests the functionality of the method when the path is not empty and not null.
	* The expected result is that the method should return an output stream.
	*/
	@Test
	public void testStoreUnique_PathNotEmptyNotNull10() throws FTPException, IOException {
		FTPClient ftpClient = new FTPClient();
		OutputStream outputStream = ftpClient.storeUnique("/test/test/test/test/test", true);
		assertNotNull(outputStream);
	}
}